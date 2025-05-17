package net.frogenet.frogetech.datagen;

import net.frogenet.frogetech.Frogetech;
import net.frogenet.frogetech.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Frogetech.MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlockWithItem(ModBlocks.SOLID_GUNK.get(), cubeAll(ModBlocks.SOLID_GUNK.get()));
    }



//    private void blockWithItem(DeferredBlock<?> deferredBlock){
//        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
//    }
}
