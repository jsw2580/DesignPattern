package builder;

public class Main {
    public static void main(String[] args) {
        TerrainBuild build = new ComplexTerrainBuilder();
        Terrain terrain = build.buildFort().buildWall().buildMine().build();

        Person person = new Person.PersonBuilder()
                .basicInfo(1, "zhangsan", 18)
                .score(20)
                .weight(200)
                .loc("bj", "23")
                .build();
    }
}
