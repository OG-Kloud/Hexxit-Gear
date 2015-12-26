package net.kloudspace.hg18.world.gen;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class HexibiscusGenerator extends WorldGenerator {
	
	private IBlockState block;
	private Predicate<IBlockState>target;
	
	public HexibiscusGenerator(IBlockState block, Predicate<IBlockState> target) {
		this.block = block;
		this.target = target;
	}
	
	@SuppressWarnings("unchecked")
	public HexibiscusGenerator(IBlockState block) {
		this(block, BlockHelper.forBlock(Blocks.air));
	}
	
	@Override
	public boolean generate(World world, Random random, BlockPos pos) {
		if(world.getBlockState(pos).getBlock().isReplaceableOreGen(world, pos, this.target)) {
			if(world.getBlockState(pos.down()).getBlock() instanceof BlockDirt || world.getBlockState(pos.down()).getBlock() instanceof BlockGrass) {
				world.setBlockState(pos, this.block);
				return true;
			} else return false;
		} else return false;
	}

}
