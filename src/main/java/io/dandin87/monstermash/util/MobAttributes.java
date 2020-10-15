package io.dandin87.monstermash.util;

import io.dandin87.monstermash.entity.PumpkinCarvesYouEntity;
import io.dandin87.monstermash.util.registry.MobEntityRegister;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import io.dandin87.monstermash.entity.MiniWardenEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class MobAttributes {

	public static void init() {
		FabricDefaultAttributeRegistry.register(MobEntityRegister.MUNCHMUNCH, MunchMunchEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.PUMPKINCARVESYOU, PumpkinCarvesYouEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.MINIWARDEN, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.TWO, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.THREE, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.FOUR, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.FIVE, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.SIX, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.SEVEN, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.EIGHT, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.NINE, MiniWardenEntity.createMobAttributes());
		FabricDefaultAttributeRegistry.register(MobEntityRegister.TEN, MiniWardenEntity.createMobAttributes());
	}
}