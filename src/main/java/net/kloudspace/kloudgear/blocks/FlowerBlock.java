package net.kloudspace.kloudgear.blocks;

import java.util.Random;

import net.kloudspace.kloudgear.init.ModItems;
import net.kloudspace.kloudgear.init.ModTabs;
import net.kloudspace.kloudgear.util.Reference;
import net.minecraft.block.BlockFlower;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class FlowerBlock extends BlockFlower {
	
    public FlowerBlock()
    {
        super(0);
        setCreativeTab(ModTabs.tabKloudGear);
        this.setStepSound(soundTypeGrass);
        this.damageDropped(ModItems.hexicalEssence.getIdFromItem(ModItems.hexicalEssence));
        // HINT: icons + serverside == bad
        if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)
        {
            // TODO 1.7 pls no
            ObfuscationReflectionHelper.setPrivateValue(BlockFlower.class, this, new IIcon[1], "field_149861_N");
        }
    }

    @Override
    public IIcon getIcon (IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        return this.blockIcon;
    }

    @Override
    public IIcon getIcon (int p_149691_1_, int p_149691_2_)
    {
        return this.blockIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons (IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName());
    }
    
    @Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return ModItems.hexicalEssence;
    }

}
