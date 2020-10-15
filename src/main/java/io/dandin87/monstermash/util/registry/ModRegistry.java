package io.dandin87.monstermash.util.registry;

import io.dandin87.monstermash.util.ModSoundEvents;

public class ModRegistry {

	public static ModSoundEvents SOUNDS;
	public static MonsterMashItems ITEMS;
	public static MobEntityRegister MOBS;

	public static void init() {

		ITEMS = new MonsterMashItems();
		SOUNDS = new ModSoundEvents();
		MOBS = new MobEntityRegister();

	}
}