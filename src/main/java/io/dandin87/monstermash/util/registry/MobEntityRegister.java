package io.dandin87.monstermash.util.registry;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.entity.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MobEntityRegister {

	public static final EntityType<MunchMunchEntity> MUNCHMUNCH = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "arachnotron"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MunchMunchEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<MiniWardenEntity> MINIWARDEN = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "miniwarden"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MiniWardenEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<PumpkinCarvesYouEntity> PUMPKINCARVESYOU = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "pumpkincarvesyou"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, PumpkinCarvesYouEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<TwoEntity> TWO = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "two"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TwoEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<ThreeEntity> THREE = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "three"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, ThreeEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<FourEntity> FOUR = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "four"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FourEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<FiveEntity> FIVE = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "five"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, FiveEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<SixEntity> SIX = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "six"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SixEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<SevenEntity> SEVEN = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "seven"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SevenEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<EightEntity> EIGHT = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "eight"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EightEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<NineEntity> NINE = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "nine"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, NineEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

	public static final EntityType<TenEntity> TEN = Registry.register(Registry.ENTITY_TYPE,
			new Identifier(MonsterMash.MODID, "ten"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, TenEntity::new)
					.dimensions(EntityDimensions.fixed(1.0F, 1.0F)).fireImmune().trackRangeBlocks(90)
					.trackedUpdateRate(4).build());

}