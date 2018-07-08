
enum MageAttackType {
    Default_Staff,
    Fire_Staff,
    Ice_Staff
}

class Mage extends Human {
    MageAttackType actType;
    public Mage(String name, MageAttackType actType) {
        super(name);
        this.actType = actType;
    }

    public Mage() {
        super("Mage");
        actType = MageAttackType.Default_Staff;
    }

    @Override
    public void attack() {
        System.out.println(name + " " + convertToString(actType));
    }

    private String convertToString(MageAttackType act) {
        switch(act) {
            case Fire_Staff: return "Fireball!";
            case Ice_Staff: return "Frostbolt!";
            default: return "Arcane Missiles!";
        }
    }
}