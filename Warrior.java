
enum WarriorAttackType {
    Default_Blade,
    Fire_Blade,
    Ice_Blade
}
class Warrior extends Human {
    WarriorAttackType actType;
    public Warrior(String name, WarriorAttackType actType) {
        super(name);
        this.actType = actType;
    }

    public Warrior() {
        super("Warrior");
        actType = WarriorAttackType.Default_Blade;
    }

    @Override
    public void attack() {
        System.out.println(name + " " + convertToString(actType));
    }

    private String convertToString(WarriorAttackType act) {
        switch(act) {
            case Fire_Blade: return "Fire Slash!";
            case Ice_Blade: return "Ice Slash!";
            default: return "Slash!";
        }
    }
}