package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.NineModel;
import io.dandin87.monstermash.entity.NineEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class NineRender extends MobEntityRenderer<NineEntity, NineModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/nine_texture.png");
	}

	public NineRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new NineModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(NineEntity entity) {
		return TEXTURE;
	}

}