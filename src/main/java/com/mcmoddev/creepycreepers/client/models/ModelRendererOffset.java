package com.mcmoddev.creepycreepers.client.models;

import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelRenderer;

public class ModelRendererOffset extends ModelRenderer {

	public float offsetX, offsetY, offsetZ;

	public ModelRendererOffset(Model model) {
		super(model);
	}

	public ModelRendererOffset(Model model, int texOffX, int texOffY) {
		super(model, texOffX, texOffY);
	}

	public ModelRendererOffset(int textureWidthIn, int textureHeightIn, int textureOffsetXIn, int textureOffsetYIn) {
		super(textureWidthIn, textureHeightIn, textureOffsetXIn, textureOffsetYIn);
	}

	@Override
	public void translateRotate(MatrixStack matrixStackIn) {
		matrixStackIn.translate(this.offsetX, this.offsetY, this.offsetZ);
		super.translateRotate(matrixStackIn);
	}
}
