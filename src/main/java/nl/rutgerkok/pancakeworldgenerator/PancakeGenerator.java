
package nl.rutgerkok.pancakeworldgenerator;

import org.bukkit.Material;

import nl.rutgerkok.worldgeneratorapi.BaseTerrainGenerator;

/**
 * This the actual terrain generator.
 *
 */
public class PancakeGenerator implements BaseTerrainGenerator {

    @Override
    public int getHeight(int x, int z, HeightType type) {
        return 63;
    }

    @Override
    public void setBlocksInChunk(GeneratingChunk chunk) {
        chunk.getBlocksForChunk().setRegion(0, 0, 0, CHUNK_SIZE, 63, CHUNK_SIZE, Material.STONE);
    }

}