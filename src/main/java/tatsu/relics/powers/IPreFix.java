package tatsu.relics.powers;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by Tatsu on 9/13/2016.
 */
public interface IPreFix {

    Material GetAlteredMaterial(Material material);

    //Allowed on these types of tools:
    //1- weapon, 2 - armor, 4 - bows, 8 - charms, (15 = everything, 3 = weapons + armor, ect)
    int ToolType();

    void onAttackEvent(Entity target);

    void onBreakEvent(EntityPlayer player);

    void onEquip(EntityPlayer player);


}
