package tatsu.relics.systems;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import tatsu.relics.constants.nbt;
import tatsu.relics.items.RelicSword;

/**
 * Created by Tatsu on 5/18/2016.
 */
public class RelicCapabilities {

    private static boolean enabled = false;

    @CapabilityInject(IRelic.class)
    public static Capability<IRelic> RELIC = null;



    public void enable()
    {
        if(enabled)
        {
            return;
        }

        CapabilityManager.INSTANCE.register(IRelic.class,new relicStorage(), () -> null);
        //TODO: default implementation for that last argument.

    }


    public class relicStorage implements Capability.IStorage<IRelic>
    {


        @Override
        public NBTBase writeNBT(Capability<IRelic> capability, IRelic instance, EnumFacing side) {
        RelicPrefix pre = instance.getPrefix();
        RelicPostfix post = instance.getPostfix();
        NBTTagCompound compound = new NBTTagCompound();
        compound.setString(nbt.PRE_ID, pre.toString());
        compound.setString(nbt.POST_ID, post.toString());
        return compound;
    }

        @Override
        public void readNBT(Capability<IRelic> capability, IRelic instance, EnumFacing side, NBTBase tags) {
            NBTTagCompound compound = (NBTTagCompound) tags;
            instance.setPrefix(RelicPrefix.valueOf(compound.getString(nbt.PRE_ID)));
            instance.setPostfix(RelicPostfix.valueOf(compound.getString(nbt.POST_ID)));



    }
    }

}
