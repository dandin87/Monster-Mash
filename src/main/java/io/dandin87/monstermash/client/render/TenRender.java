package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.TenModel;
import io.dandin87.monstermash.entity.TenEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class TenRender extends MobEntityRenderer<TenEntity, TenModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/ten_texture.png");
	}

	public TenRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new TenModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(TenEntity entity) {
		return TEXTURE;
	}

}