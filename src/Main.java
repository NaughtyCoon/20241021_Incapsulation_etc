import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[5];
        student[0] = new Student("Ann", 15, 9);
        student[1] = new Student("Bob", 14, 8);
        student[2] = new Student("Jill", 16, 10);
        student[3] = new Student("Mark", 15, 9);
        student[4] = new Student("Harry", 15, 9);

        Teacher[] teacher = new Teacher[2];
        teacher[0] = new Teacher("Mr. Woodpecker", 32, "Hole making");
        teacher[1] = new Teacher("Mrs. Blackwidow", 23, "Family relations");

        Principal principal = new Principal("Cmd. Lassard", 81, 50);

        School school = new School();
        for (int i = 0; i < Person.people.size(); i++) {
            school.callPersonToDuty(Person.people.get(i));
        }
        IntStream.range(0, student.length).forEach(i -> student[i].study());
        IntStream.range(0, teacher.length).forEach(i -> teacher[i].teach());
        principal.manage();
    }
}