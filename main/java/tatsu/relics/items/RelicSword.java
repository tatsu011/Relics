package tatsu.relics.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import tatsu.relics.Relics;
import tatsu.relics.constants.core;
import tatsu.relics.systems.RelicPostfix;
import tatsu.relics.systems.RelicPrefix;

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


    @Override
    public ICapabilityProvider initCapabilities(ItemStack stack, NBTTagCompound tagCompound)
    {
        return new RelicCap();
    }



    private class RelicCap implements ICapabilitySerializable<NBTTagInt>
    {
        private RelicPrefix relicPrefix;
        private RelicPostfix relicPostfix;

        public RelicCap()
        {

        }

        @Override
        public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
            return false;
        }

        @Override
        public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
            return null;
        }

        @Override
        public NBTTagInt serializeNBT() {
            return null;
        }

        @Override
        public void deserializeNBT(NBTTagInt nbt) {

        }
    }

}
