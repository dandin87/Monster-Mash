package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.client.models.ThreeModel;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import io.dandin87.monstermash.entity.ThreeEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class ThreeRender extends MobEntityRenderer<ThreeEntity, ThreeModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/three_texture.png");
	}

	public ThreeRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new ThreeModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(ThreeEntity entity) {
		return TEXTURE;
	}

}