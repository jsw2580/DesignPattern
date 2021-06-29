package builder;

public interface TerrainBuild {
    TerrainBuild buildWall();
    TerrainBuild buildFort();
    TerrainBuild buildMine();
    Terrain build();
}
