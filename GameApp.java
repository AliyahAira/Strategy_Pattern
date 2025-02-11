public class GameApp {
    public static void main(String[] args) {
        // Create character instances
        Knight knight = new Knight();
        Wizard wizard = new Wizard();
        Archer archer = new Archer();

        // Knight attacks and defends
        knight.attack();
        knight.defend();
        knight.defendWithDodge();
        knight.defendWithMagicBarrier();

        System.out.println();

        // Wizard attacks and defends
        wizard.attack();
        wizard.defend();

        System.out.println();

        // Archer attacks and defends
        archer.attack();
        archer.defend();
    }
}