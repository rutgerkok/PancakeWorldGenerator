package nl.rutgerkok.pancakeworldgenerator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

import nl.rutgerkok.worldgeneratorapi.WorldGeneratorApi;
import nl.rutgerkok.worldgeneratorapi.WorldRef;

/**
 * This is the main class of the plugin. It is where you'd normally see an
 * onEnable method. For this plugin, we do not need it.
 *
 * <p>
 * The actual terrain generator is located in {@link PancakeGenerator}.
 */
public class PancakeMain extends JavaPlugin {

    private PancakeConfig pancakeConfig;
    private WorldGeneratorApi api;

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        /*
         * This method is like onEnable, except for world generators. It is called once
         * for each world that has been assigned to this plugin. Assignments happen
         * through either the bukkit.yml file, or through a third-party world management
         * plugin.
         */
        WorldRef world = WorldRef.ofName(worldName);
        return api.createCustomGenerator(world, generator -> {
            // Code changing the world generator goes here
            pancakeConfig.readConfig(world, getConfig());
            generator.setBaseTerrainGenerator(new PancakeGenerator(world, pancakeConfig));

            // The following two lines are new
            pancakeConfig.writeConfig(world, getConfig());
            saveConfig();

            this.getLogger().info("Enabled the Pancake world generator for world \"" + worldName + "\"");
        });
    }

    @Override
    public void onEnable() {
        api = WorldGeneratorApi.getInstance(this, 0, 5);
        pancakeConfig = new PancakeConfig(this, api.getPropertyRegistry());
    }

}
