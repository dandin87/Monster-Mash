package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MunchMunchRender extends MobEntityRenderer<MunchMunchEntity, MunchMunchModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/munch_munch_texture.png");
	}

	public MunchMunchRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new MunchMunchModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(MunchMunchEntity entity) {
		return TEXTURE;
	}

}