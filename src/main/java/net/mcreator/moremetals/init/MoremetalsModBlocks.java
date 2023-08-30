
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moremetals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.moremetals.block.TungstenoreBlock;
import net.mcreator.moremetals.block.TungstenBlockBlock;
import net.mcreator.moremetals.block.RedPowerCrystalOreBlock;
import net.mcreator.moremetals.block.RedPowerCrystalBlockBlock;
import net.mcreator.moremetals.MoremetalsMod;

public class MoremetalsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MoremetalsMod.MODID);
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	public static final RegistryObject<Block> TUNGSTEN_BLOCK = REGISTRY.register("tungsten_block", () -> new TungstenBlockBlock());
	public static final RegistryObject<Block> RED_POWER_CRYSTAL_ORE = REGISTRY.register("red_power_crystal_ore", () -> new RedPowerCrystalOreBlock());
	public static final RegistryObject<Block> RED_POWER_CRYSTAL_BLOCK = REGISTRY.register("red_power_crystal_block",
			() -> new RedPowerCrystalBlockBlock());
}
