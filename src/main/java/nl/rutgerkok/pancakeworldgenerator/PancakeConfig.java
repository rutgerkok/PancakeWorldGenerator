package nl.rutgerkok.pancakeworldgenerator;

import java.util.Objects;

import org.bukkit.configuration.file.FileConfiguration;

/**
 * This class holds all the settings of the Pancake world generator. At the
 * moment, there is only one setting.
 *
 */
public class PancakeConfig {
    private static final String HEIGHT_SETTING = "height";

    public int height = 70;

    /**
     * World name used for the settings.
     */
    private final String worldName;

    public PancakeConfig(String worldName) {
        this.worldName = Objects.requireNonNull(worldName);
    }

    public void read(FileConfiguration config) {
        this.height = config.getInt(worldName + "." + HEIGHT_SETTING, this.height);
    }

    public void write(FileConfiguration config) {
        config.set(worldName + "." + HEIGHT_SETTING, this.height);
    }
}