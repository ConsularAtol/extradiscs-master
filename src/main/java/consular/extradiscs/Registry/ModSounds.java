package consular.extradiscs.Registry;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static final Identifier CLARA = new Identifier("extradiscs:clara");
    public static SoundEvent CLARA_EVENT = new SoundEvent(CLARA);

    public static final Identifier OVERWORLD_SHUFFLE = new Identifier("extradiscs:overworld_shuffle");
    public static SoundEvent OVERWORLD_SHUFFLE_EVENT = new SoundEvent(OVERWORLD_SHUFFLE);

    public static final Identifier INSIDE = new Identifier("extradiscs:inside_me_still");
    public static SoundEvent INSIDE_EVENT = new SoundEvent(INSIDE);

    public static final Identifier STYLISH_STORY = new Identifier("extradiscs:stylish_story");
    public static SoundEvent STYLISH_STORY_EVENT = new SoundEvent(INSIDE);

    public static final Identifier THINGS_UNSAID = new Identifier("extradiscs:things_unsaid");
    public static SoundEvent THINGS_UNSAID_EVENT = new SoundEvent(THINGS_UNSAID);

    public static final Identifier ENRAPTURE = new Identifier("extradiscs:enrapture");
    public static SoundEvent ENRAPTURE_EVENT = new SoundEvent(ENRAPTURE);

    public static void registerSounds(){
        Registry.register(Registry.SOUND_EVENT, CLARA, CLARA_EVENT);
        Registry.register(Registry.SOUND_EVENT, OVERWORLD_SHUFFLE, OVERWORLD_SHUFFLE_EVENT);
        Registry.register(Registry.SOUND_EVENT, INSIDE, INSIDE_EVENT);
        Registry.register(Registry.SOUND_EVENT, STYLISH_STORY, STYLISH_STORY_EVENT);
        Registry.register(Registry.SOUND_EVENT, THINGS_UNSAID, THINGS_UNSAID_EVENT);
        Registry.register(Registry.SOUND_EVENT, ENRAPTURE, ENRAPTURE_EVENT);
    }
}
