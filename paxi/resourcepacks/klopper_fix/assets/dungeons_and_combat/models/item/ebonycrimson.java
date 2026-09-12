// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class ebonycrimson<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "ebonycrimson"), "main");
	private final ModelPart head;
	private final ModelPart body;
	private final ModelPart left_shoe;
	private final ModelPart right_shoe;
	private final ModelPart left_arm;
	private final ModelPart right_arm;
	private final ModelPart right_leg;
	private final ModelPart left_leg;

	public ebonycrimson(ModelPart root) {
		this.head = root.getChild("head");
		this.body = root.getChild("body");
		this.left_shoe = root.getChild("left_shoe");
		this.right_shoe = root.getChild("right_shoe");
		this.left_arm = root.getChild("left_arm");
		this.right_arm = root.getChild("right_arm");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1", CubeListBuilder.create().texOffs(10, 58).mirror().addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(9.8727F, -10.8102F, 3.5013F, -0.0959F, -0.291F, -1.0727F));

		PartDefinition head_r2 = head.addOrReplaceChild("head_r2", CubeListBuilder.create().texOffs(9, 57).mirror().addBox(-5.0591F, 0.6881F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(7.4043F, -7.9891F, 1.5F, -0.5334F, -0.3133F, -0.3501F));

		PartDefinition head_r3 = head.addOrReplaceChild("head_r3", CubeListBuilder.create().texOffs(10, 57).mirror().addBox(-2.2722F, 0.5576F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(8.4043F, -7.9891F, 1.5F, -0.5655F, -0.2448F, -0.234F));

		PartDefinition head_r4 = head.addOrReplaceChild("head_r4", CubeListBuilder.create().texOffs(8, 57).mirror().addBox(-2.1386F, 0.1697F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(7.4043F, -7.9891F, 1.5F, 0.061F, -0.6082F, -1.5463F));

		PartDefinition head_r5 = head.addOrReplaceChild("head_r5", CubeListBuilder.create().texOffs(94, 24).addBox(-6.0F, -5.0F, -2.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 1.3963F, 0.0F, 0.0F));

		PartDefinition head_r6 = head.addOrReplaceChild("head_r6", CubeListBuilder.create().texOffs(64, 6).addBox(-6.0F, -5.0F, 0.0F, 12.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -11.0F, 0.0F, 1.309F, 0.0F, 0.0F));

		PartDefinition head_r7 = head.addOrReplaceChild("head_r7", CubeListBuilder.create().texOffs(10, 58).addBox(-2.0F, -1.0F, -1.5F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.8727F, -10.8102F, 3.5013F, -0.0959F, 0.291F, 1.0727F));

		PartDefinition head_r8 = head.addOrReplaceChild("head_r8", CubeListBuilder.create().texOffs(8, 57).addBox(-2.8614F, 0.1697F, -1.5F, 5.0F, 3.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-7.4043F, -7.9891F, 1.5F, 0.061F, 0.6082F, 1.5463F));

		PartDefinition head_r9 = head.addOrReplaceChild("head_r9", CubeListBuilder.create().texOffs(10, 57).addBox(-1.7278F, 0.5576F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.4043F, -7.9891F, 1.5F, -0.5655F, 0.2448F, 0.234F));

		PartDefinition head_r10 = head.addOrReplaceChild("head_r10", CubeListBuilder.create().texOffs(9, 57).addBox(1.0591F, 0.6881F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-7.4043F, -7.9891F, 1.5F, -0.5334F, 0.3133F, 0.3501F));

		PartDefinition head_r11 = head.addOrReplaceChild("head_r11", CubeListBuilder.create().texOffs(70, 49).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.0F, -5.0F, -2.0F, 0.5151F, -0.7519F, -0.3622F));

		PartDefinition head_r12 = head.addOrReplaceChild("head_r12", CubeListBuilder.create().texOffs(71, 35).addBox(-4.0F, -3.0F, -4.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(1.0F)), PartPose.offsetAndRotation(0.0F, -5.0F, -2.0F, 0.2657F, -0.8044F, -0.1941F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(7, 75).mirror().addBox(-2.0F, -0.5F, -0.5F, 4.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, 0.5F, 3.5F, 0.1731F, -0.0227F, 0.1289F));

		PartDefinition body_r2 = body.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(20, 35).addBox(-2.0F, -5.5F, -0.5F, 4.0F, 11.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 15.5F, -3.5F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body_r3 = body.addOrReplaceChild("body_r3", CubeListBuilder.create().texOffs(7, 75).addBox(-2.0F, -0.5F, -0.5F, 4.0F, 23.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 0.5F, 3.5F, 0.1731F, 0.0227F, -0.1289F));

		PartDefinition body_r4 = body.addOrReplaceChild("body_r4", CubeListBuilder.create().texOffs(88, 12).addBox(-10.0F, -10.0F, 0.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 7.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition body_r5 = body.addOrReplaceChild("body_r5", CubeListBuilder.create().texOffs(88, 0).addBox(-10.0F, -10.0F, 0.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 9.0F, 0.4363F, 0.0F, -3.1416F));

		PartDefinition body_r6 = body.addOrReplaceChild("body_r6", CubeListBuilder.create().texOffs(88, 0).addBox(-10.0F, -10.0F, 0.0F, 20.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, 8.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition left_shoe = partdefinition.addOrReplaceChild("left_shoe", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition right_shoe = partdefinition.addOrReplaceChild("right_shoe", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F)).mirror(false)
		.texOffs(56, 16).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)).mirror(false), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition left_arm_r1 = left_arm.addOrReplaceChild("left_arm_r1", CubeListBuilder.create().texOffs(38, 36).mirror().addBox(-1.8566F, -1.6167F, -2.5246F, 7.0F, 4.0F, 6.0F, new CubeDeformation(0.2F)).mirror(false), PartPose.offsetAndRotation(1.9207F, -1.5946F, -0.4754F, 0.0F, 0.0F, 0.2182F));

		PartDefinition bone3_r1 = left_arm.addOrReplaceChild("bone3_r1", CubeListBuilder.create().texOffs(64, 65).addBox(-0.2664F, 5.298F, -11.5408F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9207F, -1.5946F, -0.4754F, -1.2124F, -1.4923F, 2.0462F));

		PartDefinition bone2_r1 = left_arm.addOrReplaceChild("bone2_r1", CubeListBuilder.create().texOffs(57, 65).addBox(2.084F, -7.8689F, -8.2686F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9207F, -1.5946F, -0.4754F, 0.3981F, -1.2485F, 1.6635F));

		PartDefinition bone_r1 = left_arm.addOrReplaceChild("bone_r1", CubeListBuilder.create().texOffs(57, 60).addBox(-1.7432F, -5.0586F, -8.3596F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9207F, -1.5946F, -0.4754F, 2.7417F, -1.4176F, -1.1364F));

		PartDefinition lengua_r1 = left_arm.addOrReplaceChild("lengua_r1", CubeListBuilder.create().texOffs(69, 74).addBox(-1.4975F, -2.376F, -6.8191F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9207F, -1.5946F, -0.4754F, -0.5052F, -1.4778F, 1.5107F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.75F))
		.texOffs(56, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(1.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition right_arm_r1 = right_arm.addOrReplaceChild("right_arm_r1", CubeListBuilder.create().texOffs(33, 57).addBox(-3.5F, -1.5F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-3.5F, 1.5F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition right_arm_r2 = right_arm.addOrReplaceChild("right_arm_r2", CubeListBuilder.create().texOffs(35, 48).addBox(-2.5F, -1.5F, -3.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-2.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(34, 84).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg_r1 = right_leg.addOrReplaceChild("left_leg_r1", CubeListBuilder.create().texOffs(68, 87).mirror().addBox(-2.1F, 1.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.8F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.0F, 0.0F, 3.1416F, 0.0F, -2.9234F));

		PartDefinition left_leg_r2 = right_leg.addOrReplaceChild("left_leg_r2", CubeListBuilder.create().texOffs(84, 87).mirror().addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(1.2F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -2.0F, 0.0F, 3.1267F, -0.041F, -2.7922F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(34, 84).mirror().addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.5F)).mirror(false), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition right_leg_r1 = left_leg.addOrReplaceChild("right_leg_r1", CubeListBuilder.create().texOffs(68, 87).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 9.0F, 4.0F, new CubeDeformation(0.8F)), PartPose.offsetAndRotation(1.1F, -2.0F, 0.0F, 3.1416F, 0.0F, 2.9234F));

		PartDefinition right_leg_r2 = left_leg.addOrReplaceChild("right_leg_r2", CubeListBuilder.create().texOffs(84, 87).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(1.2F)), PartPose.offsetAndRotation(1.1F, -2.0F, 0.0F, 3.1267F, 0.041F, 2.7922F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_shoe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}