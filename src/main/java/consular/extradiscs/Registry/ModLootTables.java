package consular.extradiscs.Registry;

import consular.extradiscs.ExtraDiscs;
// Very depracated but fuck you I'm not learning this shit
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTables {
    private static final Identifier TEMPLE_TABLE_ID = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier CITY_TABLE_ID = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier IGLOO_TABLE_ID = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier DUNGEON_TABLE_ID = new Identifier("minecraft", "chests/simple_dungeon");

    @SuppressWarnings("deprecation")
    public static void registerLootTables() {
        LootTableLoadingCallback.EVENT.register((ResourceManager, LootManager, id, Supplier, Setter) -> {
            //Puts all music discs that aren't considered rare in dunegons... very messily because fuck it.
            if (DUNGEON_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(-8,1))
                    .with(ItemEntry.builder(ExtraDiscs.OVERWORLD_SHUFFLE_ITEM));
                    Supplier.withPool(poolBuilder.build());
            }
            if (DUNGEON_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(-8,1))
                    .with(ItemEntry.builder(ExtraDiscs.CLARA_ITEM));
                    Supplier.withPool(poolBuilder.build());
            }
            if (DUNGEON_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(-8,1))
                    .with(ItemEntry.builder(ExtraDiscs.ENRAPTURE_ITEM));
                    Supplier.withPool(poolBuilder.build());
            }
            //Desert temple time
            if (TEMPLE_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(-2,1))
                    .with(ItemEntry.builder(ExtraDiscs.THINGS_UNSAID_ITEM).weight(1));
                    Supplier.withPool(poolBuilder.build());
            }
            //End city time
            if (CITY_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(-6,1))
                    .with(ItemEntry.builder(ExtraDiscs.INSIDE_ITEM).weight(1));
                    Supplier.withPool(poolBuilder.build());
            }
            //Igloo time
            if (IGLOO_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                    .rolls(UniformLootNumberProvider.create(0,1))
                    .with(ItemEntry.builder(ExtraDiscs.STYLISH_STORY_ITEM).weight(1));
                    Supplier.withPool(poolBuilder.build());
            }
        });
    }
}
