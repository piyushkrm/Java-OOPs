class Animal {
    public void animal() {
        System.out.println("They make sound");
        System.out.println("They have 4 legs");
        System.out.println("They have 2 eyes");
    }
}

class petanimal extends Animal {
    public void petAnimal() {
        System.out.println("Some animals are pet");
    }
}

class wildanimal extends petanimal {
      public void wildAnimal() {
        System.out.println("There are many of the animal are wild");
    }
}

public class inheritance {
    public static void main(String[] args) {
        System.out.println("This is inheritance excercise !");
        wildanimal animal = new wildanimal();
        animal.animal();
        animal.wildAnimal();
        animal.petAnimal();
    }
}
