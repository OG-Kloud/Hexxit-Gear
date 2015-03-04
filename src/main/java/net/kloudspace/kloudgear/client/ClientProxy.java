/*
 * HexxitGear
 * Copyright (C) 2013  Ryan Cohen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.kloudspace.kloudgear.client;

import net.kloudspace.kloudgear.CommonProxy;
import net.kloudspace.kloudgear.model.ModelHoodHelmet;
import net.kloudspace.kloudgear.model.ModelScaleHelmet;
import net.kloudspace.kloudgear.model.ModelSkullHelmet;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	private static final ModelScaleHelmet scaleHelm = new ModelScaleHelmet();
	private static final ModelHoodHelmet thiefHelm = new ModelHoodHelmet();
	private static final ModelSkullHelmet tribalHelm = new ModelSkullHelmet();
	
    @Override 
    public ModelBiped getArmorModel(int id){ 
    	switch(id) {
    	case 1:
    		return scaleHelm;
    	case 3: 
    			return thiefHelm;
    	case 5:
    		return tribalHelm;
    			default: break;
    	}
    	return scaleHelm;
    }

    @Override
    public int addArmor(String armorName) {
        return RenderingRegistry.addNewArmourRendererPrefix(armorName);
    }

    @Override
    public EntityPlayer findPlayer(String playerName) {
        for (Object a : FMLClientHandler.instance().getClient().theWorld.playerEntities) {
            EntityPlayer player = (EntityPlayer) a;
            if (player.getDisplayName().toLowerCase().equals(playerName.toLowerCase())) {
                return player;
            }
        }
        return null;
    }

    @Override
    public void registerHandlers() {
        super.registerHandlers();

    }
}
