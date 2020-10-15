package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.entity.PumpkinCarvesYouEntity;
import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.PumpkinCarvesYouModel;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class PumpkinCarvesYouRender extends MobEntityRenderer<PumpkinCarvesYouEntity, PumpkinCarvesYouModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/pumpkin_carves_you_texture.png");
	}

	public PumpkinCarvesYouRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new PumpkinCarvesYouModel(), 1.0F);
	}

	@Override
	public Identifier getTexture(PumpkinCarvesYouEntity entity) {
		return TEXTURE;
	}

}