package com.angel.cpvpbw;

public class Config {
    
    // Feature toggles
    public static boolean ENABLE_ITEM_TEXTURES = true;
    public static boolean ENABLE_SOUND_REPLACEMENTS = true;
    public static boolean ENABLE_CUSTOM_ITEMS = true;
    
    // Sound settings
    public static float AMBIENT_SOUND_VOLUME = 0.5f;
    
    public static void load() {
        // Load configuration from file if it exists
        CpvpBlackWhite.LOGGER.info("Configuration loaded");
    }
    
    public static void save() {
        // Save configuration to file
        CpvpBlackWhite.LOGGER.info("Configuration saved");
    }
}