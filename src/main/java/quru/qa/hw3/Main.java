package quru.qa.hw3;

public class Main {
    public static void main(String[] args) {
        OverwatchHero ana = new OverwatchHero();
        ana.setName("Ana");
        ana.setHeroType("Healer");
        ana.setDifficulty(3);
        ana.setWeapons("Biotic rifle", "Sleep dart", "Biotic grenade");

        System.out.println("Info about hero " + ana.name + " " + ana);

        OverwatchHero.printUniverse();
        System.out.println("Name of hero is: " + ana.getName());
        System.out.println("Hero type is: " + ana.getHeroType());
        System.out.println("Hero uses such weapon as: " + String.join(", ", ana.getWeapons()));
        System.out.println("Difficulty level is: " + ana.getDifficulty());
        System.out.println("Does hero have ultimate ability? - " + ana.getObtainingUltimateAbility());
        System.out.println("Does hero have legendary skin? - " + ana.getObtainingLegendarySkin());
        System.out.println("Can hero fly? - " + ana.getFlyAbility());

        OverwatchHero ashe = new OverwatchHero(true, "Ashe", "Damage dealer", 2,
                true, false, new String[]{"The viper, Dynamite, Coach gun"});

        System.out.println("Info about hero " + ashe.name + " " + ashe);
    }
}