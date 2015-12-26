package net.kloudspace.hg18.util;

import net.minecraft.entity.player.EntityPlayer;

public interface IBuffHandler {
	
    public abstract void applyPlayerBuffs(EntityPlayer player);

    public abstract void removePlayerBuffs(EntityPlayer player);

}
