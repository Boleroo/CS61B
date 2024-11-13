import java.util.Comparator;
public class Dog implements Comparable<Dog> {
    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println(name + " " + age);
    }

    @Override
    public int compareTo(Dog o){
        return this.age - o.age;
    }

    private static class NameComparator implements Comparator<Dog> {
        @Override
        public int compare(Dog a, Dog b) {
            return a.name.compareTo(b.name);
        }
    }

    public static Comparator<Dog> getNameComparator() {
        return new NameComparator();
    }
}
