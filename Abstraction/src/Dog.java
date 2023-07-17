public class Dog extends Animal{

    @Override
    public void Run() {
        System.out.println("Dog is runninng");
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof woof");
    }

    @Override
    public String toString(){
        return ("I am a dog.I have " + numLegs + " legs and i have agespan of " + ageSpan + "." );
    }


}
