
package nl.rutgerkok.pancakeworldgenerator;

import org.bukkit.Material;

import nl.rutgerkok.worldgeneratorapi.BaseTerrainGenerator;
import nl.rutgerkok.worldgeneratorapi.WorldRef;

/**
 * This the actual terrain generator.
 *
 */
public class PancakeGenerator implements BaseTerrainGenerator {

    private final WorldRef world;
    private final PancakeConfig config;

    PancakeGenerator(WorldRef world, PancakeConfig config) {
        this.world = world;
        this.config = config;
    }

    @Override
    public int getHeight(int x, int z, HeightType type) {
        return (int) config.height.get(world);
    }

    @Override
    public void setBlocksInChunk(GeneratingChunk chunk) {
        int height = (int) config.height.get(world);

        chunk.getBlocksForChunk().setRegion(0, 0, 0, CHUNK_SIZE, height, CHUNK_SIZE, Material.STONE);
    }

}