package lecrure2;

public class Dog extends Animal implements Slepable, Breathable {
    @Override
    public String makeSound() {
        return "Wof!";
    }

    public int getAge (String name, int age) {
        return (age * 2);
    }

    @Override
    public void breath() {

    }

    @Override
    public void exhale() {

    }

    @Override
    public void inhale() {

    }

    @Override
    public void fallAsleep() {

    }

    @Override
    public void awake() {

    }
}
