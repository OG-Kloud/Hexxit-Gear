package net.kloudspace.hg18.world.gen;

import java.util.Random;

import net.kloudspace.hg18.block.HG18Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class KloudWorldGen implements IWorldGenerator{
	
	private WorldGenerator hexibiscus;//Generates Hexibiscus Flowers in OverWorld
	
	public KloudWorldGen() {
		this.hexibiscus = new HexibiscusGenerator(HG18Blocks.hexibiscus.getDefaultState());
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionId()) {
	    case 0: //Overworld
	    	this.genHexibiscus(hexibiscus, world, random, chunkX, chunkZ, 1, 55, 128);
	        break;
	    case -1: //Nether

	        break;
	    case 1: //End

	        break;
	    }
	}
	
	private void genHexibiscus(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
			throw new IllegalArgumentException("Illegal Height Arguments in genHexibiscus");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chancesToSpawn; i++) {
			int x = chunk_X*16+rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunk_Z *16 + rand.nextInt(16);
			generator.generate(world, rand, new BlockPos(x, y ,z));
		}
	}
	
}
