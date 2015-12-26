package net.kloudspace.hg18.block;

import java.util.Random;

import net.kloudspace.hg18.item.HG18Items;
import net.minecraft.block.BlockBush;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HGBlock extends BlockBush {
	
    protected PropertyEnum type;

	
	public HGBlock(String name, float hardness, float res) {
		super();
		this.setUnlocalizedName(name);
		this.setHardness(hardness);
		this.setResistance(res);
		this.setCreativeTab(CreativeTabs.tabDecorations);
		float f = 0.2F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 3.0F, 0.5F + f);
	}
	
	public HGBlock(String name) {
		this(name, 0.0F, 1.0F);
	}
	
	@Override
	public void setBlockBoundsForItemRender()
    {
        float f = 0.125F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.25F, 0.5F + f);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }
	@Override
	 @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
		return true;
    }
	@Override
    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
    {
        return null;
    }
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return HG18Items.essence;
	}

}