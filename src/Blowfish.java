public class Blowfish extends Fish {

    private boolean poisonous;

    public Blowfish() {
        super();
        this.poisonous = true;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, boolean poisonous) {
        super(name, "Saltwater");
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating small crustaceans.");
    }

    @Override
    public String getVoice() {
        return "Bloop bloop";
    }

    public void inflate() {
        System.out.println(getName() + " is inflating its body!");
    }

    public boolean isPoisonous() { return poisonous; }
    public void setPoisonous(boolean poisonous) { this.poisonous = poisonous; }

    @Override
    public String toString() {
        return super.toString() + ", poisonous=" + poisonous;
    }
}
