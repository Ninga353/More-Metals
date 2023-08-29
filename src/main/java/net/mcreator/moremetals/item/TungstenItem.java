
package net.mcreator.moremetals.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.moremetals.init.MoremetalsModTabs;

public class TungstenItem extends Item {
	public TungstenItem() {
		super(new Item.Properties().tab(MoremetalsModTabs.TAB_MORE_METALS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
