public class Character {
    private String name;
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;

    public Character(String name, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        defenseStrategy.defend();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
}