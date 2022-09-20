package homework2;

public class Animal {
    private String name;
    private String noise;

    public Animal() {
    }

    public Animal(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    //getter method
    public String getName() {
        return this.name;
    }

    public String getNoise() {
        return this.noise;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public static void makeNoise(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println(animal.noise);
        } else if (animal instanceof Cat) {
            System.out.println(animal.noise);
        } else if (animal instanceof Fish) {
            System.out.println(animal.noise);
        } else {
            System.out.println("");

        }

    }
}



