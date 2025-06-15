public class Armor {
    
    private int defense;
    private int speedPenalty;

    public Armor(int defense, int speedPenalty) {
        this.defense = defense;
        this.speedPenalty = speedPenalty;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeedPenalty() {
        return speedPenalty;
    }

    public void setSpeedPenalty(int speedPenalty) {
        this.speedPenalty = speedPenalty;
    }

}
