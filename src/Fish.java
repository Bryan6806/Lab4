public class Fish extends Animal {

    private String waterType;

    public Fish() {
        super();
        this.waterType = "Unknown";
    }

    public Fish(String name, int age, double weight, String waterType) {
        super(name, age, weight);
        this.waterType = waterType;
    }

    public Fish(String name, String waterType) {
        super(name);
        this.waterType = waterType;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating plankton.");
    }

    @Override
    public String getVoice() {
        return "Blub blub";
    }

    public void swim() {
        System.out.println(getName() + " is swimming.");
    }

    public String getWaterType() { return waterType; }
    public void setWaterType(String waterType) { this.waterType = waterType; }

    @Override
    public String toString() {
        return super.toString() + ", waterType=" + waterType;
    }
}
