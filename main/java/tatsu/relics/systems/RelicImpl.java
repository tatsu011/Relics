package tatsu.relics.systems;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.util.INBTSerializable;
import tatsu.relics.constants.nbt;

/**
 * Created by Tatsu on 5/18/2016.
 */
public class RelicImpl implements IRelic, INBTSerializable<NBTTagCompound> {

    RelicPrefix prefix;
    RelicPostfix postfix;



    @Override
    public RelicPrefix getPrefix() {
        return prefix;
    }

    @Override
    public void setPrefix(RelicPrefix pfx) {
        prefix = pfx;
    }

    @Override
    public RelicPostfix getPostfix() {
        return postfix;
    }

    @Override
    public void setPostfix(RelicPostfix pfx) {
        postfix = pfx;
    }

    @Override
    public NBTTagCompound serializeNBT() {
        NBTTagCompound compound = new NBTTagCompound();
        compound.setString(nbt.PRE_ID, prefix.toString());
        compound.setString(nbt.POST_ID, postfix.toString());


        return compound;
    }

    @Override
    public void deserializeNBT(NBTTagCompound tags) {
        prefix = RelicPrefix.valueOf(tags.getString(nbt.PRE_ID));
        postfix = RelicPostfix.valueOf(tags.getString(nbt.POST_ID));
    }
}
