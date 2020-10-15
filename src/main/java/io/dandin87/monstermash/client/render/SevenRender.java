package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.client.models.SevenModel;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import io.dandin87.monstermash.entity.SevenEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class SevenRender extends MobEntityRenderer<SevenEntity, SevenModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/seven_texture.png");
	}

	public SevenRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new SevenModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(SevenEntity entity) {
		return TEXTURE;
	}

}