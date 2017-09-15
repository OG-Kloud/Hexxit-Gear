package kloud.item;

import kloud.KG;
import kloud.block.BlockHandler;
import kloud.boiler.item.IModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemHexibiscus extends Item implements IModelProvider{
	
	private final String name;
	
	public ItemHexibiscus(String n) {
		this.name = n;
		this.setRegistryName(name);
		this.setUnlocalizedName(name);
	}
	
	@Override
	public void registerItemModel(Item item) {
		KG.proxy.registerItemRenderer(item, 0, this.name);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand,
			EnumFacing facing, float hitX, float hitY, float hitZ) {
		
		if(pos != null && worldIn != null) {
			Block blockIn = worldIn.getBlockState(pos).getBlock();
			if(blockIn instanceof BlockDirt | blockIn instanceof BlockGrass) {
				Block toplayer = worldIn.getBlockState(pos.up()).getBlock();
				if(toplayer.isReplaceable(worldIn, pos.up())) {
					worldIn.setBlockState(pos.up(), BlockHandler.hexibiscus.getDefaultState());
					if(hand == EnumHand.MAIN_HAND) {
						player.inventory.getCurrentItem().shrink(1);
					}
				}
			}
		}
		
		return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
	}
	
	/*
	 * It is said that a long time ago from blocksmiths
and shammens from the land of Exetria once infused
a precious gem with the mystical powers of the 
Hexxical-Deity's. Many treasure hunters have searched for
the remnents of the anciant gems for centuries,
cut to no avail there seems to be no evidence
that the knowlege prior will ever be recovered.*/
	
	

}
