// Main.java
public class Main {
    public static void main(String[] args) {
        Character knight = new Character(new SwingSword(), new Shield());
        Character wizard = new Character(new CastSpell(), new MagicBarrier());
        Character archer = new Character(new ShootArrow(), new Dodge());

        knight.attack();
        knight.defend();

        wizard.attack();
        wizard.defend();

        archer.attack();
        archer.defend();
    }
}