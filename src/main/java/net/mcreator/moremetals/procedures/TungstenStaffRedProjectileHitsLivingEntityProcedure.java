package net.mcreator.moremetals.procedures;

import net.minecraft.world.entity.Entity;

public class TungstenStaffRedProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
