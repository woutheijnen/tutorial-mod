package com.woutheijnen.tutorialmod.init;

import com.woutheijnen.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(TutorialMod.MOD_ID)
@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit
{
    public static final Block example_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry()
                .register(new Block(Block.Properties.create(Material.IRON)
                        .hardnessAndResistance(0.5f, 15.0f)
                        .sound(SoundType.METAL)).setRegistryName("example_block"));
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry()
                .register(new BlockItem(example_block, new Item.Properties().maxStackSize(16)
                        .group(ItemGroup.BUILDING_BLOCKS)).setRegistryName("example_block"));
    }
}
