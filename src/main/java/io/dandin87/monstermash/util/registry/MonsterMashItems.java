package io.dandin87.monstermash.util.registry;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.item.eggs.ExampleSpawnEgg;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MonsterMashItems {

	// Spawn Eggs
	public static ExampleSpawnEgg MUNCH_MUNCH_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.MUNCHMUNCH),
			"munch_munch_spawn_egg");
	public static ExampleSpawnEgg MINI_WARDEN_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.MINIWARDEN),
			"mini_warden_spawn_egg");
	public static ExampleSpawnEgg Pumpkin_Carves_You_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.PUMPKINCARVESYOU),
			"pumpkin_carves_you_spawn_egg");
	public static ExampleSpawnEgg Two_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.TWO),
			"two_spawn_egg");
	public static ExampleSpawnEgg Three_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.THREE),
			"three_spawn_egg");
	public static ExampleSpawnEgg Four_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.FOUR),
			"four_spawn_egg");
	public static ExampleSpawnEgg Five_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.FIVE),
			"five_spawn_egg");
	public static ExampleSpawnEgg Six_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.SIX),
			"six_spawn_egg");
	public static ExampleSpawnEgg Seven_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.SEVEN),
			"seven_spawn_egg");
	public static ExampleSpawnEgg Eight_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.EIGHT),
			"eight_spawn_egg");
	public static ExampleSpawnEgg Nine_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.NINE),
			"nine_spawn_egg");
	public static ExampleSpawnEgg Ten_SPAWN_EGG = item(new ExampleSpawnEgg(MobEntityRegister.TEN),
			"ten_spawn_egg");

	static <T extends Item> T item(T c, String id) {
		Registry.register(Registry.ITEM, new Identifier(MonsterMash.MODID, id), c);
		return c;
	}

	static <T extends Item> T item(String id, T c) {
		Registry.register(Registry.ITEM, new Identifier(MonsterMash.MODID, id), c);
		return c;
	}
}