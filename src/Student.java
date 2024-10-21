public class Student extends Person{

    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }


    @Override
    public void performDuty() {
        System.out.println("Student " + getName() + " is " + getAge() + " y.o. and is in the " + this.grade + "th grade.");;
    }

    public void study(){
        System.out.println("Student " + getName() + " performs a home task.");
    }

}
