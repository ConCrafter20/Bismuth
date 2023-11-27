package io.github.concrafter20.bismuth;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Bismuth implements ModInitializer {

	public static final String MOD_ID = "bismuth";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Bismuth loaded successfully. Please note that this mod is still in Aplha");
		LOGGER.info("Bismuth Version: dev-0.0.1");
		// Simple Checks to know if the user has a Microsoft account
		// Its logging it because if you don't know that you can't join Minecraft Servers you may look into the console
		if (MinecraftClient.getInstance().getSession().getSessionId() == "" || MinecraftClient.getInstance().getSession().getSessionId() == null) {
			LOGGER.error("Error: Not logged into an account! Please log in to play Multiplayer!");
		}
		if (MinecraftClient.getInstance().getSession().getUuidOrNull() == null) {
			LOGGER.error("Error: No UUID found this can prevent you from using certain Minecraft Features");
		}

		// Print the mod status to get some updates
		LOGGER.info("Bismuth Mod Status: " + MinecraftClient.getModStatus());
	}
}