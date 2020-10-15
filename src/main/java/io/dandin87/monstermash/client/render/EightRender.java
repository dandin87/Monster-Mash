package io.dandin87.monstermash.client.render;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.client.models.EightModel;
import io.dandin87.monstermash.client.models.MunchMunchModel;
import io.dandin87.monstermash.entity.EightEntity;
import io.dandin87.monstermash.entity.FiveEntity;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class EightRender extends MobEntityRenderer<EightEntity, EightModel> {

	protected static final Identifier TEXTURE;

	static {
		TEXTURE = new Identifier(MonsterMash.MODID, "texture/entity/eight_texture.png");
	}

	public EightRender(EntityRenderDispatcher renderManagerIn) {
		super(renderManagerIn, new EightModel(), 0.5F);
	}

	@Override
	public Identifier getTexture(EightEntity entity) {
		return TEXTURE;
	}

}