package io.dandin87.monstermash.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.google.common.collect.ImmutableMap;

import io.dandin87.monstermash.util.registry.MobEntityRegister;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.SpawnSettings;

public class MobSpawn {
	public static void addSpawnEntries() {
		for (Biome biome : BuiltinRegistries.BIOME) {
			if (biome.getCategory().equals(Biome.Category.NETHER)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER,
						new SpawnSettings.SpawnEntry(MobEntityRegister.MUNCHMUNCH, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.PUMPKINCARVESYOU, 40, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.MINIWARDEN, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.TWO, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.THREE, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.FOUR, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.FIVE, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.SIX, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.SEVEN, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.EIGHT, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.NINE, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.TEN, 30, 1, 1));
			}
		}

		for (Biome biome : BuiltinRegistries.BIOME) {
			if (biome.getCategory().equals(Biome.Category.THEEND)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER,
						new SpawnSettings.SpawnEntry(MobEntityRegister.MUNCHMUNCH, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.PUMPKINCARVESYOU, 40, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.MINIWARDEN, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.TWO, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.THREE, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.FOUR, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.FIVE, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.SIX, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.SEVEN, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.EIGHT, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.NINE, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.TEN, 30, 1, 1));
			}
		}

		for (Biome biome : BuiltinRegistries.BIOME) {
			if (biome.getCategory().equals(Biome.Category.NONE)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER,
						new SpawnSettings.SpawnEntry(MobEntityRegister.MUNCHMUNCH, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.PUMPKINCARVESYOU, 40, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.MINIWARDEN, 30, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.TWO, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.THREE, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.FOUR, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.FIVE, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.SIX, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.SEVEN, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.EIGHT, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.NINE, 30, 1, 1),
				new SpawnSettings.SpawnEntry(MobEntityRegister.TEN, 30, 1, 1));
			}
		}
	}

	public static void addMobSpawnToBiome(Biome biome, SpawnGroup classification,
			SpawnSettings.SpawnEntry... spawnInfos) {
		convertImmutableSpawners(biome);
		List<SpawnSettings.SpawnEntry> spawnersList = new ArrayList<>(
				biome.getSpawnSettings().spawners.get(classification));
		spawnersList.addAll(Arrays.asList(spawnInfos));
		biome.getSpawnSettings().spawners.put(classification, spawnersList);
	}

	private static void convertImmutableSpawners(Biome biome) {
		if (biome.getSpawnSettings().spawners instanceof ImmutableMap) {
			biome.getSpawnSettings().spawners = new HashMap<>(biome.getSpawnSettings().spawners);
		}
	}

}