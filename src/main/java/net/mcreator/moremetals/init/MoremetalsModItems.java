
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

import net.mcreator.moremetals.item.TungstennSwordItem;
import net.mcreator.moremetals.item.TungstennShovelItem;
import net.mcreator.moremetals.item.TungstennPickaxeItem;
import net.mcreator.moremetals.item.TungstennHoeItem;
import net.mcreator.moremetals.item.TungstennAxeItem;
import net.mcreator.moremetals.item.TungstenStaffRedItem;
import net.mcreator.moremetals.item.TungstenItem;
import net.mcreator.moremetals.item.TungstenArmorItem;
import net.mcreator.moremetals.item.RedPowerCrystalItem;
import net.mcreator.moremetals.MoremetalsMod;

public class MoremetalsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoremetalsMod.MODID);
	public static final RegistryObject<Item> TUNGSTEN = REGISTRY.register("tungsten", () -> new TungstenItem());
	public static final RegistryObject<Item> TUNGSTENORE = block(MoremetalsModBlocks.TUNGSTENORE, MoremetalsModTabs.TAB_MORE_METALS);
	public static final RegistryObject<Item> TUNGSTEN_BLOCK = block(MoremetalsModBlocks.TUNGSTEN_BLOCK, MoremetalsModTabs.TAB_MORE_METALS);
	public static final RegistryObject<Item> TUNGSTENN_PICKAXE = REGISTRY.register("tungstenn_pickaxe", () -> new TungstennPickaxeItem());
	public static final RegistryObject<Item> TUNGSTENN_AXE = REGISTRY.register("tungstenn_axe", () -> new TungstennAxeItem());
	public static final RegistryObject<Item> TUNGSTENN_SWORD = REGISTRY.register("tungstenn_sword", () -> new TungstennSwordItem());
	public static final RegistryObject<Item> TUNGSTENN_SHOVEL = REGISTRY.register("tungstenn_shovel", () -> new TungstennShovelItem());
	public static final RegistryObject<Item> TUNGSTENN_HOE = REGISTRY.register("tungstenn_hoe", () -> new TungstennHoeItem());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_HELMET = REGISTRY.register("tungsten_armor_helmet", () -> new TungstenArmorItem.Helmet());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_CHESTPLATE = REGISTRY.register("tungsten_armor_chestplate",
			() -> new TungstenArmorItem.Chestplate());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_LEGGINGS = REGISTRY.register("tungsten_armor_leggings",
			() -> new TungstenArmorItem.Leggings());
	public static final RegistryObject<Item> TUNGSTEN_ARMOR_BOOTS = REGISTRY.register("tungsten_armor_boots", () -> new TungstenArmorItem.Boots());
	public static final RegistryObject<Item> RED_POWER_CRYSTAL = REGISTRY.register("red_power_crystal", () -> new RedPowerCrystalItem());
	public static final RegistryObject<Item> RED_POWER_CRYSTAL_ORE = block(MoremetalsModBlocks.RED_POWER_CRYSTAL_ORE,
			MoremetalsModTabs.TAB_MORE_METALS);
	public static final RegistryObject<Item> TUNGSTEN_STAFF_RED = REGISTRY.register("tungsten_staff_red", () -> new TungstenStaffRedItem());
	public static final RegistryObject<Item> RED_POWER_CRYSTAL_BLOCK = block(MoremetalsModBlocks.RED_POWER_CRYSTAL_BLOCK,
			MoremetalsModTabs.TAB_MORE_METALS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
