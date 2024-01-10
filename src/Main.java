import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("aytekin", "ozis", 30);
        Person person2 = new Person("isim", "soyisim", 16);
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());

        Person person3 = new Person("ahmet", "mehmet", 54, 435456, true, new String[]{"running", "swimming","heavy lifting"});
        System.out.println(Arrays.toString(person3.getHobbies()));
        System.out.println(person3.getFirstName());

        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("isteen: " + person2.isTeen());
        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("------------------------------");

        Wall wall = new Wall(24.6, 10);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        wall.setWidth(18);
        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}