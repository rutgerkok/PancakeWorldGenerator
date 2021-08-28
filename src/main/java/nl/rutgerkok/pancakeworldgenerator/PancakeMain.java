package nl.rutgerkok.pancakeworldgenerator;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This is the main class of the plugin. It is where you'd normally see an
 * onEnable method. For this plugin, we do not need it.
 *
 * <p>
 * The actual terrain generator is located in {@link PancakeGenerator}.
 */
public class PancakeMain extends JavaPlugin {


    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        PancakeConfig pancakeConfig = new PancakeConfig(id == null || id.isEmpty() ? worldName : id);

        FileConfiguration yamlFile = getConfig();
        pancakeConfig.read(yamlFile);
        pancakeConfig.write(yamlFile);
        saveConfig();
        return new PancakeGenerator(pancakeConfig);
    }

}
