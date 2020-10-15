package io.dandin87.monstermash;

import io.dandin87.monstermash.util.MobAttributes;
import io.dandin87.monstermash.util.MobSpawn;
import io.dandin87.monstermash.util.ModSoundEvents;
import io.dandin87.monstermash.util.registry.MonsterMashItems;
import io.dandin87.monstermash.util.registry.MobEntityRegister;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MonsterMash implements ModInitializer {

	public static MonsterMashItems ITEMS;
	public static ModSoundEvents SOUNDS;
	public static MobEntityRegister MOBS;
	public static final String MODID = "monstermash";
	public static final ItemGroup ExampleEggItemGroup = FabricItemGroupBuilder.create(new Identifier(MODID, "eggs"))
			.icon(() -> new ItemStack(MonsterMashItems.MUNCH_MUNCH_SPAWN_EGG)).build();

	@Override
	public void onInitialize() {

		ITEMS = new MonsterMashItems();
		SOUNDS = new ModSoundEvents();
		MOBS = new MobEntityRegister();
		MobSpawn.addSpawnEntries();
		MobAttributes.init();
		System.out.println("Monster Mash Loaded!");
	}
}
