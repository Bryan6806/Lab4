public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Lion", 5, 190.0, "Golden");
        animals[1] = new Dog("Rex", "Labrador");
        animals[2] = new Bird();
        animals[3] = new Pigeon("Coco", 2, 0.4, "Gray", "Rock Pigeon");
        animals[4] = new Fish("Nemo", "Saltwater");
        animals[5] = new Blowfish("Puffy", 1, 0.8, "Saltwater", true);

        for (int i = 0; i < animals.length; i++) {
            System.out.println("=== Animal " + i + " ===");
            System.out.println(animals[i]);
            animals[i].eat();
            System.out.println("Voice: " + animals[i].getVoice());
            System.out.println();
        }

        ((Mammal) animals[0]).nurse();
        ((Dog) animals[1]).fetch();
        ((Bird) animals[2]).fly();
        ((Pigeon) animals[3]).deliverMessage();
        ((Fish) animals[4]).swim();
        ((Blowfish) animals[5]).inflate();
    }
}