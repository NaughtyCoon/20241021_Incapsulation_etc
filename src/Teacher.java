public class Teacher extends Person{

    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void performDuty() {
        System.out.println("Teacher " + getName() + " is " + getAge() + " and teaches " + this.subject + ".");
    }

    public void teach(){
        System.out.println("Teacher " + getName() + " gives a new lesson on " + this.subject + ".");
    }

}
