package tatsu.relics.items;

import net.minecraft.item.Item;
import tatsu.relics.Relics;
import tatsu.relics.constants.core;


/**
 * Created by Tatsu on 5/13/2016.
 */
public class ItemBase extends Item {

    public ItemBase(String name)
    {
        super();
        setRegistryName(core.MODID, name);
        setUnlocalizedName(getRegistryName().toString());
        setCreativeTab(Relics.modTab);
    }

}
