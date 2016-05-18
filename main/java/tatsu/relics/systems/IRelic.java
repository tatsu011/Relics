package tatsu.relics.systems;

import net.minecraft.item.Item;

/**
 * Created by Tatsu on 5/18/2016.
 */
public interface IRelic {

    RelicPrefix getPrefix();
    void setPrefix(RelicPrefix pfx);


    RelicPostfix getPostfix();
    void setPostfix(RelicPostfix pfx);




}


