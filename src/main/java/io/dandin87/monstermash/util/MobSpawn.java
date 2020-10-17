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
						new SpawnSettings.SpawnEntry(MobEntityRegister.MUNCHMUNCH, 8, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.PUMPKINCARVESYOU, 4, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.MINIWARDEN, 4, 1, 1),
						new SpawnSettings.SpawnEntry(MobEntityRegister.FIVE, 8, 1, 1));
			}

			if (biome.getCategory().equals(Biome.Category.BEACH)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.MUNCHMUNCH, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.DESERT)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.TWO, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.EXTREME_HILLS)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.THREE, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.FOREST)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.FOUR, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.ICY)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.FIVE, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.JUNGLE)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.SIX, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.MESA)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.SEVEN, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.PLAINS)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.PUMPKINCARVESYOU, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.RIVER)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.EIGHT, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.SAVANNA)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.NINE, 8, 1, 1)); }

			if (biome.getCategory().equals(Biome.Category.SWAMP)) {
				addMobSpawnToBiome(biome, SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(MobEntityRegister.TEN, 8, 1, 1)); }

		} // End of for (Biome biome : BuiltinRegistries.BIOME){
	} //End of AddSpawnEntries(){

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