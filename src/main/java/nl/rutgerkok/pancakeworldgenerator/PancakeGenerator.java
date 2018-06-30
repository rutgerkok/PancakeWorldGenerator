
package nl.rutgerkok.pancakeworldgenerator;

import org.bukkit.Material;

import nl.rutgerkok.worldgeneratorapi.BaseChunkGenerator;

/**
 * This the actual terrain generator.
 *
 */
public class PancakeGenerator implements BaseChunkGenerator {

    /**
     * Width or length of a chunk. (Not the height.)
     */
    private static final int CHUNK_SIZE = 16;

    @Override
    public void setBlocksInChunk(GeneratingChunk chunk) {
        chunk.getBlocksForChunk().setRegion(0, 0, 0, CHUNK_SIZE, 1, CHUNK_SIZE, Material.BEDROCK);
        chunk.getBlocksForChunk().setRegion(0, 1, 0, CHUNK_SIZE, 4, CHUNK_SIZE, Material.DIRT);
        chunk.getBlocksForChunk().setRegion(0, 4, 0, CHUNK_SIZE, 5, CHUNK_SIZE, Material.GRASS);
    }

}