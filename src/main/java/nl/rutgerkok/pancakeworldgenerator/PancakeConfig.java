package nl.rutgerkok.pancakeworldgenerator;

import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

import nl.rutgerkok.worldgeneratorapi.WorldRef;
import nl.rutgerkok.worldgeneratorapi.property.FloatProperty;
import nl.rutgerkok.worldgeneratorapi.property.PropertyRegistry;

/**
 * This class holds all the settings of the Pancake world generator. At the
 * moment, there is only one setting.
 *
 */
public class PancakeConfig {
    private static final String HEIGHT = "height";

    public final FloatProperty height;

    public PancakeConfig(Plugin plugin, PropertyRegistry registry) {
        // The constructor initializes the default settings
        height = registry.getFloat(new NamespacedKey(plugin, HEIGHT), 63);

    }

    public void readConfig(WorldRef world, FileConfiguration fileConfiguration) {
        // This method reads all the settings for a world
        height.setWorldDefault(world, (float) fileConfiguration.getDouble(HEIGHT, height.get(world)));
    }

    public void writeConfig(WorldRef world, FileConfiguration fileConfiguration) {
        // This method writes all the settings for a world
        fileConfiguration.set(HEIGHT, height.get(world));
    }
}