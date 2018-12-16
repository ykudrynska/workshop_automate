package lecrure2;

public abstract class Animal {
    int age;
    boolean isHungry;

    public int getAge() {
        return age;
    }

    public boolean isHungry(){
        return isHungry;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public abstract String makeSound();
}
