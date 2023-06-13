package tema8;

public class Human extends Primate implements BasicNeeds{
    @Override
    public String eat() {
        return "Omnivore";
    }
    @Override
    public void sleep() {
        System.out.println("I need to sleep!");
    }

    @Override
    public void drink() {}
    @Override
    public void speak(){
        System.out.println("I can speak!");
    };
}
