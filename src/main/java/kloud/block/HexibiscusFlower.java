package kloud.block;

import java.util.Random;

import kloud.KG;
import kloud.item.ItemHandler;
import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IPlantable;

public class HexibiscusFlower extends BlockBush {
	
//	private AxisAlignedBB bb = new AxisAlignedBB(0.5F - 0.02F, 0.0F, 0.5F - 0.02F, 0.5F + 0.02F, 0.02F * 3.0F, 0.5F + 0.02F);
	
	public HexibiscusFlower(String name) {
		this.setRegistryName(new ResourceLocation(KG.ID, name));
	}

	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return BUSH_AABB;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ItemHandler.hexibiscusItem;
	}

	@Override
	public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction,
			IPlantable plantable) {
		
		
		
		return state.getBlock() == Blocks.DIRT ? true : state.getBlock() == Blocks.GRASS ? true : false;
	}

	

}
