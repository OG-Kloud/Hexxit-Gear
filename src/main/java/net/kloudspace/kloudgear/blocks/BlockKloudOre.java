package net.kloudspace.kloudgear.blocks;

import net.kloudspace.kloudgear.init.ModTabs;
import net.kloudspace.kloudgear.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockKloudOre extends Block{
	
	public BlockKloudOre(String name) {
		super(Material.cloth);
		setCreativeTab(ModTabs.tabKloudGear);
		setBlockName(name);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName());
		setStepSound(soundTypeGlass);
		setHardness(10F);
		setResistance(10F);
		setBlockUnbreakable();
		setLightLevel(15F);
		
	}

}
