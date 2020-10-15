// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package io.dandin87.monstermash.client.models;

import io.dandin87.monstermash.entity.MiniWardenEntity;
import io.dandin87.monstermash.MonsterMash;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class MiniWardenModel extends AnimatedEntityModel<MiniWardenEntity> {

    private final AnimatedModelRenderer Body;
	private final AnimatedModelRenderer Chest;
	private final AnimatedModelRenderer Head;
	private final AnimatedModelRenderer Horns;
	private final AnimatedModelRenderer RightEar;
	private final AnimatedModelRenderer LeftEar;
	private final AnimatedModelRenderer Legs;
	private final AnimatedModelRenderer rightL;
	private final AnimatedModelRenderer leftL;
	private final AnimatedModelRenderer Arms;
	private final AnimatedModelRenderer rightA;
	private final AnimatedModelRenderer leftA;

    public MiniWardenModel()
    {
    textureWidth = 16;
    textureHeight = 16;
    Body = new AnimatedModelRenderer(this);
		Body.setRotationPoint(-0.5F, 20.5F, -0.5F);
		
		Body.setModelRendererName("Body");
		this.registerModelRenderer(Body);

		Chest = new AnimatedModelRenderer(this);
		Chest.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(Chest);
		Chest.setTextureOffset(0, 0).addBox(-1.6057F, -1.7734F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		Chest.setModelRendererName("Chest");
		this.registerModelRenderer(Chest);

		Head = new AnimatedModelRenderer(this);
		Head.setRotationPoint(-0.5F, -1.5F, 0.0F);
		Body.addChild(Head);
		Head.setTextureOffset(0, 6).addBox(-2.0152F, -2.3264F, -1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Head.setModelRendererName("Head");
		this.registerModelRenderer(Head);

		Horns = new AnimatedModelRenderer(this);
		Horns.setRotationPoint(-1.0F, -1.5F, 0.0F);
		Head.addChild(Horns);
		
		Horns.setModelRendererName("Horns");
		this.registerModelRenderer(Horns);

		RightEar = new AnimatedModelRenderer(this);
		RightEar.setRotationPoint(0.0F, 0.25F, 1.25F);
		Horns.addChild(RightEar);
		RightEar.setTextureOffset(2, 4).addBox(0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RightEar.setTextureOffset(2, 4).addBox(0.0F, -0.75F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RightEar.setTextureOffset(2, 4).addBox(0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		RightEar.setModelRendererName("RightEar");
		this.registerModelRenderer(RightEar);

		LeftEar = new AnimatedModelRenderer(this);
		LeftEar.setRotationPoint(0.0F, 0.25F, -1.25F);
		Horns.addChild(LeftEar);
		LeftEar.setTextureOffset(2, 4).addBox(0.0F, -0.75F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LeftEar.setTextureOffset(2, 4).addBox(0.0F, -0.25F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LeftEar.setTextureOffset(2, 4).addBox(0.0F, 0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LeftEar.setTextureOffset(2, 4).addBox(0.0F, -0.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, false);
		LeftEar.setModelRendererName("LeftEar");
		this.registerModelRenderer(LeftEar);

		Legs = new AnimatedModelRenderer(this);
		Legs.setRotationPoint(0.25F, 1.0F, 0.0F);
		Body.addChild(Legs);
		
		Legs.setModelRendererName("Legs");
		this.registerModelRenderer(Legs);

		rightL = new AnimatedModelRenderer(this);
		rightL.setRotationPoint(-0.25F, -1.0F, 0.0F);
		Legs.addChild(rightL);
		rightL.setTextureOffset(9, 5).addBox(-0.25F, 1.0F, 0.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		rightL.setModelRendererName("rightL");
		this.registerModelRenderer(rightL);

		leftL = new AnimatedModelRenderer(this);
		leftL.setRotationPoint(-0.25F, -1.0F, 0.0F);
		Legs.addChild(leftL);
		leftL.setTextureOffset(7, 0).addBox(-0.25F, 1.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		leftL.setModelRendererName("leftL");
		this.registerModelRenderer(leftL);

		Arms = new AnimatedModelRenderer(this);
		Arms.setRotationPoint(-1.0F, -0.5F, 0.0F);
		Body.addChild(Arms);
		
		Arms.setModelRendererName("Arms");
		this.registerModelRenderer(Arms);

		rightA = new AnimatedModelRenderer(this);
		rightA.setRotationPoint(1.0F, 0.5F, 0.0F);
		Arms.addChild(rightA);
		rightA.setTextureOffset(0, 10).addBox(-1.4132F, -1.0076F, 1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		rightA.setModelRendererName("rightA");
		this.registerModelRenderer(rightA);

		leftA = new AnimatedModelRenderer(this);
		leftA.setRotationPoint(1.0F, 0.5F, 0.0F);
		Arms.addChild(leftA);
		leftA.setTextureOffset(8, 8).addBox(-1.4132F, -1.0076F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		leftA.setModelRendererName("leftA");
		this.registerModelRenderer(leftA);

    this.rootBones.add(Body);
  }


    @Override
	public Identifier getAnimationFileLocation()
    {
		return new Identifier(MonsterMash.MODID, "animations/mini_warden_walking.json");
    }
}