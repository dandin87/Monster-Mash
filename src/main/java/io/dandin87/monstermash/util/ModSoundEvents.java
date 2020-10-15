package io.dandin87.monstermash.util;

import io.dandin87.monstermash.MonsterMash;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSoundEvents {

	public static SoundEvent MUNCH_MUNCH_AMBIENT = of("example.sounds.munch_munch_idle");
	public static SoundEvent MUNCH_MUNCH_DEATH = of("example.sounds.munch_munch_death");
	public static SoundEvent MUNCH_MUNCH_HURT = of("example.sounds.munch_munch_hurt");

	static SoundEvent of(String id) {
		SoundEvent sound = new SoundEvent(new Identifier(MonsterMash.MODID, id));
		Registry.register(Registry.SOUND_EVENT, new Identifier(MonsterMash.MODID, id), sound);
		return sound;
	}

}