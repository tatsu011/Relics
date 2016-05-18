package tatsu.relics.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import tatsu.relics.Relics;
import tatsu.relics.constants.core;

/**
 * Created by Tatsu on 5/16/2016.
 */
public class RelicSword extends ItemSword {

    ToolMaterial baseMaterial;



    public RelicSword(ToolMaterial material, String name) {
        super(material);
        baseMaterial = material;
        setRegistryName(core.MODID, name);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(Relics.modTab);
        maxStackSize = 1;

    }

}
