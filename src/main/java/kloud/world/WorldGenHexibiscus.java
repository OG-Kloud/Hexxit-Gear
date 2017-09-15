package kloud.world;

import java.util.Random;

import kloud.block.HexibiscusFlower;
import net.minecraft.block.BlockBush;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenHexibiscus implements IWorldGenerator {
	
	private final BlockBush block;
	
	public WorldGenHexibiscus(HexibiscusFlower b) {
		this.block = b;
	}


	public boolean generate(World worldIn, Random rand, BlockPos position) {
//		KGLogger.log("Called 2nd generate method", false);
		for (int i = 0; i < 1; ++i) {
			BlockPos blockpos = position.add(rand.nextInt(8) - rand.nextInt(8), rand.nextInt(4) - rand.nextInt(4), rand.nextInt(8) - rand.nextInt(8));

			if (worldIn.isAirBlock(blockpos) && (!worldIn.provider.isNether() || blockpos.getY() < worldIn.getHeight() - 1) &&
					this.block.canBlockStay(worldIn, blockpos, this.block.getDefaultState())) {
				worldIn.setBlockState(blockpos, this.block.getDefaultState(), 2);
			}
		}
		return true;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
//		KGLogger.log("Called 1st generate method", false);
		BlockPos blockpos = new BlockPos(chunkX*16, 0, chunkZ*16);
		
		int i7 = random.nextInt(16) + 8;
        int l10 = random.nextInt(16) + 8;
        int j14 = world.getHeight(blockpos.add(i7, 0, l10)).getY() + 32;
        
        if (j14 > 0)
        {
            int k17 = random.nextInt(j14);
            BlockPos blockpos1 = blockpos.add(i7, k17, l10);
            generate(world, random, blockpos1);
        }
	}

}
