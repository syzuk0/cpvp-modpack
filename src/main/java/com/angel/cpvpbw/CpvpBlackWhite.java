package com.angel.cpvpbw;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CpvpBlackWhite implements ModInitializer {
    public static final String MOD_ID = "cpvpbw";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("CPvP Black & White mod initialized!");
        Config.load();
    }
}