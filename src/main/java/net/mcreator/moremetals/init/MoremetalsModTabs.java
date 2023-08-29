
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moremetals.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MoremetalsModTabs {
	public static CreativeModeTab TAB_MORE_METALS;

	public static void load() {
		TAB_MORE_METALS = new CreativeModeTab("tabmore_metals") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MoremetalsModItems.TUNGSTEN.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
