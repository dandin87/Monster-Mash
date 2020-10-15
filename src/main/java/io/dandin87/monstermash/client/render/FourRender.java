package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.FourModel;
import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.entity.FourEntity;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FourRender extends MobEntityRenderer<FourEntity, FourModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/four_texture.png");
	}

	public FourRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new FourModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(FourEntity entity) {
		return TEXTURE;
	}

}