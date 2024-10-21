public class Principal extends Person{

    private int experience;

    public Principal(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    @Override
    public void performDuty() {
        System.out.println("Principal " + getName() + " is " + getAge() + " y.o. and runs the school for " + this.experience + " years.");
    }

    public void manage(){
        System.out.println("Principal " + getName() + " leads a meeting with teachers.");
    }
}
