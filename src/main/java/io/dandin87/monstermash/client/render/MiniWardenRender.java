package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.MiniWardenModel;
import io.dandin87.monstermash.entity.MiniWardenEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class MiniWardenRender extends MobEntityRenderer<MiniWardenEntity, MiniWardenModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/mini_warden_texture.png");
	}

	public MiniWardenRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new MiniWardenModel(), 1.2F);
	}

	@Override
	public Identifier getTexture(MiniWardenEntity entity) {
		return TEXTURE;
	}

}