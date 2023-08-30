
package net.mcreator.moremetals.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.moremetals.init.MoremetalsModTabs;
import net.mcreator.moremetals.init.MoremetalsModItems;

public abstract class TungstenArmorItem extends ArmorItem {
	public TungstenArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{3, 5, 6, 3}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 10;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(MoremetalsModItems.TUNGSTEN.get()));
			}

			@Override
			public String getName() {
				return "tungsten_armor";
			}

			@Override
			public float getToughness() {
				return 0.1f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends TungstenArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MoremetalsModTabs.TAB_MORE_METALS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moremetals:textures/models/armor/tungsten_layer_1.png";
		}
	}

	public static class Chestplate extends TungstenArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MoremetalsModTabs.TAB_MORE_METALS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moremetals:textures/models/armor/tungsten_layer_1.png";
		}
	}

	public static class Leggings extends TungstenArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MoremetalsModTabs.TAB_MORE_METALS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moremetals:textures/models/armor/tungsten_layer_2.png";
		}
	}

	public static class Boots extends TungstenArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MoremetalsModTabs.TAB_MORE_METALS));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "moremetals:textures/models/armor/tungsten_layer_1.png";
		}
	}
}
