
package net.mcreator.moremetals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.moremetals.init.MoremetalsModTabs;

public class RedPowerCrystalItem extends Item {
	public RedPowerCrystalItem() {
		super(new Item.Properties().tab(MoremetalsModTabs.TAB_MORE_METALS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
