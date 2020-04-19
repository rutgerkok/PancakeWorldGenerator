
package nl.rutgerkok.pancakeworldgenerator;

import org.bukkit.Material;

import nl.rutgerkok.worldgeneratorapi.BaseChunkGenerator;
import nl.rutgerkok.worldgeneratorapi.BaseTerrainGenerator;
import nl.rutgerkok.worldgeneratorapi.WorldRef;

/**
 * This the actual terrain generator.
 *
 */
public class PancakeGenerator implements BaseChunkGenerator, BaseTerrainGenerator {

    /**
     * Width or length of a chunk. (Not the height.)
     */
    private static final int CHUNK_SIZE = 16;

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