
package net.mcreator.moremetals.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.moremetals.init.MoremetalsModTabs;
import net.mcreator.moremetals.init.MoremetalsModItems;

public class TungstennShovelItem extends ShovelItem {
	public TungstennShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 1561;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoremetalsModItems.TUNGSTEN.get()));
			}
		}, 1, -2.5999999999999999f, new Item.Properties().tab(MoremetalsModTabs.TAB_MORE_METALS));
	}
}
