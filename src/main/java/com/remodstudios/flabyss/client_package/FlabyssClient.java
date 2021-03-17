package com.remodstudios.flabyss.client_package;

import com.remodstudios.flabyss.FlaringAbyssMain;
import com.remodstudios.flabyss.blocks_package.BlocksRegistery;
import com.remodstudios.flabyss.items_package.ItemRegistery;
import com.swordglowsblue.artifice.api.Artifice;
import net.fabricmc.api.ClientModInitializer;

import java.io.IOException;

public class FlabyssClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Artifice.registerAssetPack(FlaringAbyssMain.id("artifice_rp"), pack -> {
            ItemRegistery.INSTANCE.generateAssets(pack);
            BlocksRegistery.INSTANCE.generateAssets(pack);

            try {
                pack.dumpResources("artifice.dbg", "assets");
            } catch (IOException ioe) {
                FlaringAbyssMain.LOGGER.error("BRUH! Artifice failed to dump!");
                ioe.printStackTrace();
            }
        });
    }
}