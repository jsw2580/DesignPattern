package builder;

public class ComplexTerrainBuilder implements TerrainBuild {

    Terrain terrain = new Terrain();

    @Override
    public TerrainBuild buildWall() {
        terrain.wall = new Wall(10,10, 50,50);
        return this;
    }

    @Override
    public TerrainBuild buildFort() {
        terrain.fort = new Fort(10, 10, 50, 50);
        return this;
    }

    @Override
    public TerrainBuild buildMine() {
        terrain.mine = new Mine(10, 10, 50, 50);
        return this;
    }

    @Override
    public Terrain build() {
        return terrain;
    }
}
