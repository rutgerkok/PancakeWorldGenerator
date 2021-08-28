
package nl.rutgerkok.pancakeworldgenerator;

import java.util.Random;

import org.bukkit.HeightMap;
import org.bukkit.Material;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;


/**
 * This the actual terrain generator.
 *
 */
public class PancakeGenerator extends ChunkGenerator {

    private static final int CHUNK_SIZE = 16;
    private final PancakeConfig config;

    PancakeGenerator(PancakeConfig config) {
        this.config = config;
    }

    @Override
    public void generateNoise(WorldInfo world, Random random, int x, int z, ChunkData chunk) {
        int height = config.height;

        chunk.setRegion(0, chunk.getMinHeight(), 0, CHUNK_SIZE, height, CHUNK_SIZE, Material.STONE);
    }

    @Override
    public int getBaseHeight(WorldInfo world, Random random, int x, int z, HeightMap type) {
        return config.height;
    }

    @Override
    public boolean shouldGenerateBedrock() {
        return true;
    }

    @Override
    public boolean shouldGenerateCaves() {
        return true;
    }

    @Override
    public boolean shouldGenerateDecorations() {
        return true;
    }

    @Override
    public boolean shouldGenerateMobs() {
        return true;
    }

    @Override
    public boolean shouldGenerateNoise() {
        return false; // We do this ourselves
    }

    @Override
    public boolean shouldGenerateStructures() {
        return true;
    }

    @Override
    public boolean shouldGenerateSurface() {
        return true;
    }

}