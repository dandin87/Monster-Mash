package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.FiveModel;
import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.entity.FiveEntity;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FiveRender extends MobEntityRenderer<FiveEntity, FiveModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/five_texture.png");
	}

	public FiveRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new FiveModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(FiveEntity entity) {
		return TEXTURE;
	}

}