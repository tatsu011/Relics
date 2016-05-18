package tatsu.relics.items;

import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Tatsu on 5/15/2016.
 */
public class RelicIronSword extends RelicSword {
    public static ToolMaterial RELIC_IRON = EnumHelper.addToolMaterial("RELIC_IRON", 2, 300, 7.0F,7.0F,18);

    public RelicIronSword() {
        super(RELIC_IRON, "relicIronSword");
    }
}
