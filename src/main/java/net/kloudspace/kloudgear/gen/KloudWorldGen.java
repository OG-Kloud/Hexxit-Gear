package net.kloudspace.kloudgear.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFire;
import cpw.mods.fml.common.IWorldGenerator;

public class KloudWorldGen implements IWorldGenerator{
	
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case 0:
			generateSurface(world, rand, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateSurface(World world, Random rand, int x, int z) {

		
	}
	
	
	private void addFlowerGen(World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ,
			int maxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + rand.nextInt(maxX);
			int posY = minY + rand.nextInt(maxY - minY);
			int posZ = blockZPos + rand.nextInt(maxZ);
			new WorldGenFire();
		}
	}

}
