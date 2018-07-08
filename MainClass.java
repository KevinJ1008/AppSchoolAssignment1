
public class MainClass {
    public static void main(String[] args) {
        Human[] array = {
                new Warrior(),
                new Warrior("Warrior", WarriorAttackType.Fire_Blade),
                new Warrior("Warrior", WarriorAttackType.Ice_Blade)
                new Hunter(),
                new Hunter("Hunter", HunterAttackType.Fire_Bow),
                new Hunter("Hunter", HunterAttackType.Ice_Bow),
                new Mage(),
                new Mage("Mage", MageAttackType.Fire_Staff),
                new Mage("Mage", MageAttackType.Ice_Staff),
        };
        for (int i = 0; i < array.length; i++) {
            array[i].attack();
        }
    }
}
