import java.util.ArrayList;

public abstract class Person {

   private String name;
   private int age;

   public abstract void performDuty();

   public static ArrayList<Person> people = new ArrayList<>();

   public Person(String name, int age) {
      this.name = name;
      this.age = age;
      people.add(this);
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

}
