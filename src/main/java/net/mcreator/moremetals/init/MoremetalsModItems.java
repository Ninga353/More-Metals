
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moremetals.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.moremetals.item.TungstenItem;
import net.mcreator.moremetals.MoremetalsMod;

public class MoremetalsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MoremetalsMod.MODID);
	public static final RegistryObject<Item> TUNGSTEN = REGISTRY.register("tungsten", () -> new TungstenItem());
}
