package com.angel.cpvpbw;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoundManager {
    
    public static final SoundEvent SILENCE = registerSound("silence");
    
    private static SoundEvent registerSound(String name) {
        Identifier id = new Identifier(CpvpBlackWhite.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    
    public static void register() {
        // Sounds are registered through the static initializers above
    }
}