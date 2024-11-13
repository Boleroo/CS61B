public class Dog implements OurComparable{
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
    public int compareTo(Object o){
        Dog d = (Dog) o;
        return this.age - d.age;
    }
}
