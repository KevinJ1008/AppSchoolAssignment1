
public class Human {

    /**
        **************** Tips ****************
        * Jobs: Hunter, Warrior, Mage
        * Weapons and Skills:
        * -----------------------------------
        * | Default Blade | Slash           |
        * | Fire Blade    | Fire Slash      |
        * | Ice Blade     | Ice Slash       |
        * -----------------------------------
        * | Default Bow   | Arrow           |
        * | Fire Bow      | Fire Arrow      |
        * | Ice Bow       | Ice Arrow       |
        * -----------------------------------
        * | Default Staff | Arcane Missiles |
        * | Fire Staff    | Fireball        |
        * | Ice Staff     | Frostbolt       |
        * -----------------------------------
        *
        */
    public String name;
    public final static int FIRE_BOW = 1;
    public final static int ICE_BOW = 2;

    public Human(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("Fist Attack!");
    }
}