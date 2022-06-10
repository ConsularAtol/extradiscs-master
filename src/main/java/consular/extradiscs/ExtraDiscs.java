package consular.extradiscs;

import consular.extradiscs.Discs.ClaraMusicDisc;
import consular.extradiscs.Discs.EnraptureMusicDisc;
import consular.extradiscs.Discs.InsideMeStillMusicDisc;
import consular.extradiscs.Discs.OverworldShuffleMusicDisc;
import consular.extradiscs.Discs.StylishStoryMusicDisc;
import consular.extradiscs.Discs.ThingsUnsaidMusicDisc;
import consular.extradiscs.Registry.ModLootTables;
import consular.extradiscs.Registry.ModSounds;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExtraDiscs implements ModInitializer {
	public static Item CLARA_ITEM = Registry.register(Registry.ITEM, id("clara"), new ClaraMusicDisc());;
	public static Item OVERWORLD_SHUFFLE_ITEM = Registry.register(Registry.ITEM, id("overworld_shuffle"), new OverworldShuffleMusicDisc());;
	public static Item INSIDE_ITEM = Registry.register(Registry.ITEM, id("inside_me_still"), new InsideMeStillMusicDisc());;
	public static Item STYLISH_STORY_ITEM = Registry.register(Registry.ITEM, id("stylish_story"), new StylishStoryMusicDisc());;
	public static Item THINGS_UNSAID_ITEM = Registry.register(Registry.ITEM, id("things_unsaid"), new ThingsUnsaidMusicDisc());;
	public static Item ENRAPTURE_ITEM = Registry.register(Registry.ITEM, id("enrapture"), new EnraptureMusicDisc());;

	@Override
	public void onInitialize() {
		
		//final String MODID = "extradiscs";
		ModSounds.registerSounds();
		ModLootTables.registerLootTables();
	}

	public static final Identifier id(String s) {
		return new Identifier("extradiscs", s);
	}
}
