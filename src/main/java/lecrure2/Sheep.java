package lecrure2;

public class Sheep extends Animal implements Slepable, Breathable{

    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.setAge(5);
        System.out.println(sheep.getAge());
    }

    @Override
    public String makeSound() {
        return "Bee!";
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
