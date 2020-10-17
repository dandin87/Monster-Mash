package io.dandin87.monstermash.util.registry;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.item.eggs.MonsterMashSpawnEgg;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MonsterMashItems {

	// Spawn Eggs
	public static MonsterMashSpawnEgg MUNCH_MUNCH_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.MUNCHMUNCH), "munch_munch_spawn_egg");
	public static MonsterMashSpawnEgg MINI_WARDEN_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.MINIWARDEN), "mini_warden_spawn_egg");
	public static MonsterMashSpawnEgg Pumpkin_Carves_You_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.PUMPKINCARVESYOU), "pumpkin_carves_you_spawn_egg");
	public static MonsterMashSpawnEgg Two_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.TWO), "two_spawn_egg");
	public static MonsterMashSpawnEgg Three_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.THREE), "three_spawn_egg");
	public static MonsterMashSpawnEgg Four_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.FOUR), "four_spawn_egg");
	public static MonsterMashSpawnEgg Five_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.FIVE), "five_spawn_egg");
	public static MonsterMashSpawnEgg Six_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.SIX), "six_spawn_egg");
	public static MonsterMashSpawnEgg Seven_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.SEVEN), "seven_spawn_egg");
	public static MonsterMashSpawnEgg Eight_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.EIGHT), "eight_spawn_egg");
	public static MonsterMashSpawnEgg Nine_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.NINE), "nine_spawn_egg");
	public static MonsterMashSpawnEgg Ten_SPAWN_EGG = item(new MonsterMashSpawnEgg(MobEntityRegister.TEN), "ten_spawn_egg");

	static <T extends Item> T item(T c, String id) {
		Registry.register(Registry.ITEM, new Identifier(MonsterMash.MODID, id), c);
		return c;
	}

	static <T extends Item> T item(String id, T c) {
		Registry.register(Registry.ITEM, new Identifier(MonsterMash.MODID, id), c);
		return c;
	}
}