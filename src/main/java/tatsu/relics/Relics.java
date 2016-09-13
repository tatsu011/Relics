package tatsu.relics;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tatsu.relics.constants.core;
import tatsu.relics.proxy.CommonProxy;

/**
 * Created by Tatsu on 5/13/2016.
 */
@Mod(
        modid = core.MODID,
        name = core.MODNAME,
        version = core.VERSION
)
public class Relics {

    @Mod.Instance
    public static Relics instance;

    @SidedProxy(clientSide = core.PROXY_CLIENT, serverSide = core.PROXY_SERVER)
    public static CommonProxy proxy;

    public static CreativeTabs modTab = new CreativeTabs(core.MODID) {
        @Override
        public Item getTabIconItem() {
            return Items.IRON_BOOTS;
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.registerItems();

        proxy.registerBlocks();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.registerRecipies();
        proxy.registerWorldGen();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        //stuff apparently...
    }




}
