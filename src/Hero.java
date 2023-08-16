public class Hero {
    private int health;
    private int damege;
    private String superPaver;

    public int getHealth() {
        return health;
    }

    public int getDamege() {
        return damege;
    }

    public String getSuperPaver() {
        return superPaver;
    }

    public Hero(int health, int damege) {
        this.health = health;
        this.damege = damege;
    }

    public Hero(int health, int damege, String superPaver) {
        this.health = health;
        this.damege = damege;
        this.superPaver = superPaver;

    }
}