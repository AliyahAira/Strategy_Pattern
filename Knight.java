public class Knight extends Character {
    public Knight() {
        super("Knight", new SwingSword(), new Shield());
    }

    // Knights can switch between different defenses
    public void defendWithDodge() {
        setDefenseStrategy(new Dodge());
        defend();
    }

    public void defendWithMagicBarrier() {
        setDefenseStrategy(new CreateMagic());
        defend();
    }
}
