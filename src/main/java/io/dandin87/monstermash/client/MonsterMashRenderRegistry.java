package io.dandin87.monstermash.client;

import io.dandin87.monstermash.client.render.*;
import io.dandin87.monstermash.util.registry.MobEntityRegister;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;

public class MonsterMashRenderRegistry {

	public static void init() {
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.MUNCHMUNCH, (dispatcher, context) -> new MunchMunchRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.PUMPKINCARVESYOU, (dispatcher, context) -> new PumpkinCarvesYouRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.MINIWARDEN, (dispatcher, context) -> new MiniWardenRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.TWO, (dispatcher, context) -> new TwoRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.THREE, (dispatcher, context) -> new ThreeRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.FOUR, (dispatcher, context) -> new FourRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.FIVE, (dispatcher, context) -> new FiveRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.SIX, (dispatcher, context) -> new SixRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.SEVEN, (dispatcher, context) -> new SevenRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.EIGHT, (dispatcher, context) -> new EightRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.NINE, (dispatcher, context) -> new NineRender(dispatcher));
		EntityRendererRegistry.INSTANCE.register(MobEntityRegister.TEN, (dispatcher, context) -> new TenRender(dispatcher));
	}
}