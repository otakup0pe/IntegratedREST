package org.cyclops.integratedrest.http.request.handler;

import com.google.gson.JsonObject;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import org.cyclops.integratedrest.json.JsonUtil;

/**
 * Request handler for registry/block requests.
 * @author rubensworks
 */
public class RegistryBlockRequestHandler extends RegistryNamespacedRequestHandler<Block> {

    @Override
    protected RegistryNamespaced<ResourceLocation, Block> getRegistry() {
        return Block.REGISTRY;
    }

    @Override
    protected void handleElement(Block element, JsonObject jsonObject) {
        JsonUtil.addBlockInfo(jsonObject, element);
    }

    @Override
    protected String getElementsName() {
        return "blocks";
    }
}
