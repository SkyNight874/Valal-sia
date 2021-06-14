
package net.mcreator.valalsiamod.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.valalsiamod.ElementsValalsiaModMod;

@ElementsValalsiaModMod.ModElement.Tag
public class ItemMIAMArmor extends ElementsValalsiaModMod.ModElement {
	@GameRegistry.ObjectHolder("valalsia_mod:miam_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("valalsia_mod:miam_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("valalsia_mod:miam_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("valalsia_mod:miam_armorboots")
	public static final Item boots = null;
	public ItemMIAMArmor(ElementsValalsiaModMod instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("MIAM_ARMOR", "valalsia_mod:miam", 15, new int[]{2, 6, 5, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("miam_armorhelmet")
				.setRegistryName("miam_armorhelmet").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("miam_armorbody")
				.setRegistryName("miam_armorbody").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("miam_armorlegs")
				.setRegistryName("miam_armorlegs").setCreativeTab(CreativeTabs.COMBAT));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("miam_armorboots")
				.setRegistryName("miam_armorboots").setCreativeTab(CreativeTabs.COMBAT));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("valalsia_mod:miam_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("valalsia_mod:miam_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("valalsia_mod:miam_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("valalsia_mod:miam_armorboots", "inventory"));
	}
}
