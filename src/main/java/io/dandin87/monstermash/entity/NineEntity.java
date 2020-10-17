package io.dandin87.monstermash.entity;

import io.dandin87.monstermash.util.ModSoundEvents;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

import java.util.Random;

@SuppressWarnings("ALL")
public class NineEntity extends PiglinEntity implements IAnimatedEntity {

	private final SimpleInventory inventory = new SimpleInventory(8);

	EntityAnimationManager manager = new EntityAnimationManager();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	EntityAnimationController controller = new EntityAnimationController(this, "walkController", 5,
			this::animationPredicate);

	public NineEntity(EntityType<NineEntity> entityType, World worldIn) {
		super(entityType, worldIn);
		manager.addAnimationController(controller);
	}

	private <E extends Entity> boolean animationPredicate(AnimationTestEvent<E> event) {
		if (this.isAttacking()) {
			controller.setAnimation(new AnimationBuilder().addAnimation("walk"));
			return true;
		}
		else {
			controller.setAnimation(new AnimationBuilder().addAnimation("walk"));
			return true;
		}
	}

	@Override
	public EntityAnimationManager getAnimationManager() {
		return manager;
	}

	@Override
	protected void initGoals() {
		this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
		this.goalSelector.add(6, new LookAroundGoal(this));
		this.goalSelector.add(5, new WanderAroundFarGoal(this, 0.8D));
		this.goalSelector.add(6, new AttackGoal(this));
		this.targetSelector.add(1, new RevengeGoal(this, new Class[0]));
		this.targetSelector.add(2, new FollowTargetGoal<>(this, PlayerEntity.class, true));
		this.targetSelector.add(3, new FollowTargetGoal<>(this, HostileEntity.class, true));
		this.targetSelector.add(3, new FollowTargetGoal<>(this, MobEntity.class, true));
	}

	public static DefaultAttributeContainer.Builder createMobAttributes() {
		return LivingEntity.createLivingAttributes().add(EntityAttributes.GENERIC_FOLLOW_RANGE, 50.0D)
				.add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.5D).add(EntityAttributes.GENERIC_MAX_HEALTH, 5.0D)
				.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0D).add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 1.0D);
	}

	public static boolean spawning(EntityType<NineEntity> p_223337_0_, World p_223337_1_, SpawnReason reason,
                                   BlockPos p_223337_3_, Random p_223337_4_) {
		return p_223337_1_.getDifficulty() != Difficulty.PEACEFUL;
	}

	public void readCustomDataFromTag(CompoundTag tag) {
		super.readCustomDataFromTag(tag);
		this.inventory.readTags(tag.getList("Inventory", 10));
	}

	public boolean shouldZombify() {
		return false;
	}

	public void writeCustomDataToTag(CompoundTag tag) {
		super.writeCustomDataToTag(tag);
		tag.putBoolean("IsImmuneToZombification", true);
		tag.put("Inventory", this.inventory.getTags());
	}

	protected ItemStack addItem(ItemStack stack) {
		return this.inventory.addStack(stack);
	}
	protected boolean canInsertIntoInventory(ItemStack stack) {
		return this.inventory.canInsert(stack);
	}

	@Override
	protected float getActiveEyeHeight(EntityPose pose, EntityDimensions dimensions) {
		return 1.0F;
	}

	protected boolean shouldDrown() {
		return false;
	}

	protected boolean shouldBurnInDay() {
		return false;
	}

	@Override
	protected SoundEvent getAmbientSound() {
		return ModSoundEvents.MUNCH_MUNCH_AMBIENT;
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		return ModSoundEvents.MUNCH_MUNCH_HURT;
	}

	@Override
	protected SoundEvent getDeathSound() {
		return ModSoundEvents.MUNCH_MUNCH_DEATH;
	}

	protected SoundEvent getStepSound() {
		return ModSoundEvents.MUNCH_MUNCH_AMBIENT;
	}

	@Override
	protected void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(this.getStepSound(), 0.15F, 1.0F);
	}
}