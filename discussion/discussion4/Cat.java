public class Cat extends Animal {
    /** Change noise in the constructor. */
    public Cat(String name, int age){
        super(name, age);
        noise = "Meow!";
    }

    @Override
    /** Override the greet method. */
    public void greet() {
        System.out.println("Cat " + name + "says: " + makeNoise());
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Cat", 1);
        cat.greet();
    }
}
