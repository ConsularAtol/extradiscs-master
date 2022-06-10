package consular.extradiscs.Discs;

import net.minecraft.util.Rarity;
import net.minecraft.item.MusicDiscItem;
import consular.extradiscs.Registry.ModGroups;
import consular.extradiscs.Registry.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class ClaraMusicDisc extends MusicDiscItem {
	public ClaraMusicDisc() {
		super(0, (net.minecraft.sound.SoundEvent) ModSounds.CLARA_EVENT,
				new FabricItemSettings().group(ModGroups.EXTRA_DISCS_GROUP).maxCount(1).rarity(Rarity.RARE));
	}
}