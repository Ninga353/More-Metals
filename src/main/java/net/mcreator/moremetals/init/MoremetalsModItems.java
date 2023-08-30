
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moremetals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.moremetals.item.TungstenItem;
import net.mcreator.moremetals.MoremetalsMod;

public class MoremetalsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoremetalsMod.MODID);
	public static final RegistryObject<Item> TUNGSTEN = REGISTRY.register("tungsten", () -> new TungstenItem());
	public static final RegistryObject<Item> TUNGSTENORE = block(MoremetalsModBlocks.TUNGSTENORE, MoremetalsModTabs.TAB_MORE_METALS);
	public static final RegistryObject<Item> TUNGSTEN_BLOCK = block(MoremetalsModBlocks.TUNGSTEN_BLOCK, MoremetalsModTabs.TAB_MORE_METALS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
