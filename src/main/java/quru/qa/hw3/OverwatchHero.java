package quru.qa.hw3;

import java.util.Arrays;

public class OverwatchHero {

    static String universe = "Overwatch";
    boolean hasUltimateAbility = true;
    String name;
    String heroType;
    String[] weapons;
    int difficulty;
    boolean hasLegendarySkin = true;
    boolean canFly;

    public OverwatchHero(boolean hasUltimateAbility, String name, String heroType, int difficulty,
                         boolean hasLegendarySkin, boolean canFly, String[] weapons) {
        this.hasUltimateAbility = hasUltimateAbility;
        this.name = name;
        this.heroType = heroType;
        this.difficulty = difficulty;
        this.hasLegendarySkin = hasLegendarySkin;
        this.canFly = canFly;
        this.weapons = weapons;
    }

    public OverwatchHero() {
    }

    void setObtainingUltimateAbility(boolean hasUltimateAbility) {
        this.hasUltimateAbility = hasUltimateAbility;
    }

    void setObtainingLegendarySkin(boolean hasLegendarySkin) {
        this.hasLegendarySkin = hasLegendarySkin;
    }

    void setFlyAbility(boolean canFly) {
        this.canFly = canFly;
    }

    void setName(String name) {
        this.name = name;
    }

    void setHeroType(String heroType) {
        this.heroType = heroType;
    }

    void setWeapons(String... weapons) {
        this.weapons = weapons;
    }

    void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    String getHeroType() {
        return heroType;
    }

    String getName() {
        return name;
    }

    String[] getWeapons() {
        return weapons;
    }

    int getDifficulty() {
        return difficulty;
    }

    boolean getObtainingUltimateAbility() {
        return hasUltimateAbility;
    }

    boolean getObtainingLegendarySkin() {
        return hasLegendarySkin;
    }

    boolean getFlyAbility() {
        return canFly;
    }

    static void printUniverse() {
        System.out.println("Universe of hero is: " + universe);
    }

    public String toString() {
        return String.format("{\n\t\"universe\" : \"%s\",\n" +
                        "\t\"name\" : \"%s\",\n" +
                        "\t\"weapons\" : \"%s\",\n" +
                        "\t\"hasUltimateAbility\" : %s,\n" +
                        "\t\"heroType\" : \"%s\",\n" +
                        "\t\"difficulty\" : %s,\n" +
                        "\t\"hasLegendarySkin\" : %s,\n" +
                        "\t\"canFly\" : %s\n}",
                universe, name, Arrays.toString(weapons), hasUltimateAbility, heroType, difficulty, hasLegendarySkin,
                canFly);
    }
}