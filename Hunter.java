
enum HunterAttackType {
    Default_Bow,
    Fire_Bow,
    Ice_Bow
}

class Hunter extends Human {
    HunterAttackType actType;
    public Hunter(String name, HunterAttackType actType) {
        super(name);
        this.actType = actType;
    }

    public Hunter() {
        super("Hunter");
        actType = HunterAttackType.Default_Bow;
    }

    @Override
    public void attack() {
        System.out.println(name + " " + convertToString(actType));
    }
    
    private String convertToString(HunterAttackType act) {
        switch(act) {
            case Fire_Bow: return "Fire Arrow!";
            case Ice_Bow: return "Ice Arrow!";
            default: return "Arrow Attack!";
        }
    }
}