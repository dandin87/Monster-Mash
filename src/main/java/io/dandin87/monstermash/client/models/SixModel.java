package io.dandin87.monstermash.client.models;

import io.dandin87.monstermash.MonsterMash;
import io.dandin87.monstermash.entity.MunchMunchEntity;
import io.dandin87.monstermash.entity.SixEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class SixModel extends AnimatedEntityModel<SixEntity> {

	private final AnimatedModelRenderer All;
	private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer LARM;
	private final AnimatedModelRenderer Mouth;
	private final AnimatedModelRenderer RARM;
	private final AnimatedModelRenderer RLEG;
	private final AnimatedModelRenderer RFOOT;
	private final AnimatedModelRenderer LLEG;
	private final AnimatedModelRenderer LFOOT;
	private final AnimatedModelRenderer Mouth2;

    public SixModel()
	{
		textureWidth = 256;
		textureHeight = 256;
		All = new AnimatedModelRenderer(this);
		All.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(All, 0.0F, -1.5708F, 0.0F);

		All.setModelRendererName("All");
		this.registerModelRenderer(All);

		Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(0.0F, -40.0F, 0.0F);
		All.addChild(Body);
		setRotationAngle(Body, 0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(80, 20).addBox(0.0F, 0.0F, -20.0F, 20.0F, 20.0F, 40.0F, 0.0F, false);
		Body.setTextureOffset(80, 80).addBox(0.0F, -20.0F, -20.0F, 20.0F, 20.0F, 40.0F, 0.0F, false);
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		LARM = new AnimatedModelRenderer(this);
		LARM.setRotationPoint(9.0F, -7.0F, -21.0F);
		Body.addChild(LARM);
		LARM.setTextureOffset(0, 60).addBox(-7.0F, -4.0F, -9.0F, 10.0F, 20.0F, 10.0F, 0.0F, false);
		LARM.setModelRendererName("LARM");
		this.registerModelRenderer(LARM);

		Mouth = new AnimatedModelRenderer(this);
		Mouth.setRotationPoint(0.0F, 0.0F, -1.0F);
		Body.addChild(Mouth);
		Mouth.setTextureOffset(0, 60).addBox(-20.0F, -20.0F, -19.0F, 20.0F, 20.0F, 40.0F, 0.0F, false);
		Mouth.setModelRendererName("Mouth");
		this.registerModelRenderer(Mouth);

		RARM = new AnimatedModelRenderer(this);
		RARM.setRotationPoint(7.0F, -7.0F, 20.0F);
		Body.addChild(RARM);
		RARM.setTextureOffset(0, 0).addBox(-5.0F, -4.0F, 0.0F, 10.0F, 20.0F, 10.0F, 0.0F, false);
		RARM.setModelRendererName("RARM");
		this.registerModelRenderer(RARM);

		RLEG = new AnimatedModelRenderer(this);
		RLEG.setRotationPoint(8.0F, -10.0F, 15.0F);
		All.addChild(RLEG);
		RLEG.setTextureOffset(80, 80).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		RLEG.setModelRendererName("RLEG");
		this.registerModelRenderer(RLEG);

		RFOOT = new AnimatedModelRenderer(this);
		RFOOT.setRotationPoint(0.0F, 0.0F, 0.0F);
		RLEG.addChild(RFOOT);
		RFOOT.setTextureOffset(80, 0).addBox(-15.0F, 0.0F, -5.0F, 20.0F, 10.0F, 10.0F, 0.0F, false);
		RFOOT.setModelRendererName("RFOOT");
		this.registerModelRenderer(RFOOT);

		LLEG = new AnimatedModelRenderer(this);
		LLEG.setRotationPoint(7.0F, -19.0F, -15.0F);
		All.addChild(LLEG);
		LLEG.setTextureOffset(80, 20).addBox(-4.0F, -1.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		LLEG.setModelRendererName("LLEG");
		this.registerModelRenderer(LLEG);

		LFOOT = new AnimatedModelRenderer(this);
		LFOOT.setRotationPoint(2.0F, 8.0F, 0.0F);
		LLEG.addChild(LFOOT);
		LFOOT.setTextureOffset(0, 120).addBox(-16.0F, 1.0F, -5.0F, 20.0F, 10.0F, 10.0F, 0.0F, false);
		LFOOT.setModelRendererName("LFOOT");
		this.registerModelRenderer(LFOOT);

		Mouth2 = new AnimatedModelRenderer(this);
		Mouth2.setRotationPoint(19.0F, -40.0F, 0.0F);
		All.addChild(Mouth2);
		Mouth2.setTextureOffset(0, 0).addBox(-39.0F, 0.0F, -20.0F, 20.0F, 20.0F, 40.0F, 0.0F, false);
		Mouth2.setModelRendererName("Mouth2");
		this.registerModelRenderer(Mouth2);

		this.rootBones.add(All);
	}


	@Override
	public Identifier getAnimationFileLocation() {
		return new Identifier(MonsterMash.MODID, "animations/munch_munch_walking.json");
	}
}