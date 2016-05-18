package tatsu.relics.systems;

/**
 * Created by Tatsu on 5/18/2016.
 */
public enum RelicPrefix {

                                                                    //    Name,         Harvest, Durability,    MiningSpeed,    damageVsEntities    EnchantmentBonus
    //public static ToolMaterial RELIC_IRON = EnumHelper.addToolMaterial("RELIC_IRON",  2,          300,        7.0F,           7.0F,               18);

    ; //FOR NOW EMPTY!

    int bHarvestLevel;
    int bDurability;
    float bMiningSpeed;
    float bDamage;
    int bEnchantability;
    int special;
    boolean tools,armor,baubles;



    RelicPrefix(int bonusHarvestLevel, int bonusDurability, float bonusMiningSpeed, float bonusDamage , int bonusEnchantability, int doSpecialThing, int applicationCode)
    {
        bHarvestLevel = bonusHarvestLevel;
        bDurability = bonusDurability;
        bMiningSpeed = bonusMiningSpeed;
        bDamage = bonusDamage;
        bEnchantability = bonusEnchantability;
        special = doSpecialThing;

        switch (applicationCode)
        {
            case 1:
                tools = true;
                break;
            case 2:
                armor = true;
                break;
            case 3:
                baubles = true;
                break;
            case 4:
                tools = true;
                armor = true;
                break;
            case 5:
                tools = true;
                baubles = true;
                break;
            case 6:
                armor = true;
                baubles = true;
                break;
            case 7:
                tools = true;
                armor = true;
                baubles = true;
                break;
            default:
                tools = true;


        }
    }

    RelicPrefix(int bonusHarvestLevel, int bonusDurability, float bonusMiningSpeed, float bonusDamage , int bonusEnchantability, int doSpecialThing, boolean onArmor, boolean onTools, boolean onBaubles)
    {
        bHarvestLevel = bonusHarvestLevel;
        bDurability = bonusDurability;
        bMiningSpeed = bonusMiningSpeed;
        bDamage = bonusDamage;
        bEnchantability = bonusEnchantability;
        special = doSpecialThing;
        tools = onTools;
        armor = onArmor;
        baubles = onBaubles;

    }






}
