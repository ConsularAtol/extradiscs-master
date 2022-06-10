package consular.extradiscs.Discs;

import net.minecraft.util.Rarity;
import net.minecraft.item.MusicDiscItem;
import consular.extradiscs.Registry.ModGroups;
import consular.extradiscs.Registry.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class OverworldShuffleMusicDisc extends MusicDiscItem {
	public OverworldShuffleMusicDisc() {
		super(0, (net.minecraft.sound.SoundEvent) ModSounds.OVERWORLD_SHUFFLE_EVENT,
				new FabricItemSettings().group(ModGroups.EXTRA_DISCS_GROUP).maxCount(1).rarity(Rarity.RARE));
	}
}