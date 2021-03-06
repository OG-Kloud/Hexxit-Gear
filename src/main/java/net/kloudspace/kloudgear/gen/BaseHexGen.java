package net.kloudspace.kloudgear.gen;

import java.util.Random;

import net.kloudspace.kloudgear.init.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class BaseHexGen implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        final int xChunk = chunkX * 16 + 8, zChunk = chunkZ * 16 + 8;
        int xCh = chunkX * 16 + random.nextInt(16);
        int yCh = random.nextInt(128);
        int zCh = chunkZ * 16 + random.nextInt(16);

        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX * 16, chunkZ * 16);
        
        //Hexibiscus
        if(random.nextInt(12) == 0) {
        	generateHexibiscus(world, random, xCh, yCh, zCh);
        }
	}

	private boolean generateHexibiscus(World world, Random random, int x, int y, int z) {
		
		int tries = random.nextInt(50);
        for (int i = 0; i < tries; i++)
        {
//            int i1 = (x + random.nextInt(8)) - random.nextInt(8);
        	int i1 =(x + random.nextInt(16));
            int j1 = (y + random.nextInt(8)); // - random.nextInt(8);
            int k1 = (z + random.nextInt(16)); // - random.nextInt(8);
            if (world.isAirBlock(i1, j1, k1) && Blocks.yellow_flower.canBlockStay(world, i1, j1, k1))
            {
                world.setBlock(i1, j1, k1, ModBlocks.hexibiscus, 0, 2);
                System.out.println("Generating Hexibiscus");
            }
        }

        return true;
	}
	
	

}
