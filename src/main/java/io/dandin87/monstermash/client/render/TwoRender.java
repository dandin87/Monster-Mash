package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.client.models.TwoModel;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import io.dandin87.monstermash.entity.TwoEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TwoRender extends MobEntityRenderer<TwoEntity, TwoModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/two_texture.png");
	}

	public TwoRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new TwoModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(TwoEntity entity) {
		return TEXTURE;
	}

}