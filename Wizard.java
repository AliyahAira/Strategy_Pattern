public class Wizard extends Character {
    public Wizard() {
        super("Wizard", new CastSpell(), new CreateMagic());
    }
}