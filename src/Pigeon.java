public class Pigeon extends Bird {

    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public Pigeon(String name, String species) {
        super(name, "Unknown");
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating breadcrumbs.");
    }

    @Override
    public String getVoice() {
        return "Coo coo!";
    }

    public void deliverMessage() {
        System.out.println(getName() + " is delivering a message.");
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public String toString() {
        return super.toString() + ", species=" + species;
    }
}
