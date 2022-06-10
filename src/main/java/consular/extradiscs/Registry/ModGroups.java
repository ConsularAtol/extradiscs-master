package consular.extradiscs.Registry;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import consular.extradiscs.ExtraDiscs;

public class ModGroups {
    
    public static final ItemGroup EXTRA_DISCS_GROUP = FabricItemGroupBuilder.build(new Identifier("extradiscs", "extradiscs"), () -> new ItemStack(ExtraDiscs.CLARA_ITEM));
    
}
