package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.client.models.SixModel;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import io.dandin87.monstermash.entity.SixEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SixRender extends MobEntityRenderer<SixEntity, SixModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/six_texture.png");
	}

	public SixRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new SixModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(SixEntity entity) {
		return TEXTURE;
	}

}