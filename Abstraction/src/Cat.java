public class Cat extends Animal {
    @Override
    public void Run() {
        System.out.println("Cat is running");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
