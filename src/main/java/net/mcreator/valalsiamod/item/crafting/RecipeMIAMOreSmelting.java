
package net.mcreator.valalsiamod.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.valalsiamod.item.ItemMIAM;
import net.mcreator.valalsiamod.block.BlockMIAMOre;
import net.mcreator.valalsiamod.ElementsValalsiaModMod;

@ElementsValalsiaModMod.ModElement.Tag
public class RecipeMIAMOreSmelting extends ElementsValalsiaModMod.ModElement {
	public RecipeMIAMOreSmelting(ElementsValalsiaModMod instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockMIAMOre.block, (int) (1)), new ItemStack(ItemMIAM.block, (int) (1)), 0.7F);
	}
}
