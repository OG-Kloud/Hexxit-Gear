package net.kloudspace.kloudgear.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class HexibiscusGen extends WorldGenerator implements IWorldGenerator {
	
    /** The ID of the plant block used in this plant generator. */
    public final Block plantID;
    public final int metadata;
    public int chances = 64;

    public HexibiscusGen(Block id, int meta)
    {
        this.plantID = id;
        this.metadata = meta;
    }

    public HexibiscusGen(Block id, int meta, int count)
    {
        this.plantID = id;
        this.metadata = meta;
        this.chances = count;
    }

    @Override
    public boolean generate (World world, Random random, int x, int y, int z)
    {
        for (int iter = 0; iter < chances; ++iter)
        {
            int posX = x + random.nextInt(8) - random.nextInt(8);
            int posY = y + random.nextInt(4) - random.nextInt(4);
            int posZ = z + random.nextInt(8) - random.nextInt(8);

            if (world.isAirBlock(posX, posY, posZ) && (!world.provider.hasNoSky || posY < 127) && this.plantID.canBlockStay(world, posX, posY, posZ))
            {
                world.setBlock(posX, posY, posZ, this.plantID, this.metadata, 2);
            }
        }

        return true;
    }

	@Override
	public void generate(Random arg0, int arg1, int arg2, World arg3,
			IChunkProvider arg4, IChunkProvider arg5) {
		
	}

}
