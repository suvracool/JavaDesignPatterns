public class Main {
    public static void main(String[] args) {

        Animal [] animals = new Animal[3];

        animals[0]= new Dog();
        animals[1]= new Cat();
        animals[2]= new Dog();
        animals[0].makeNoise();

        int i=0;
        for (Animal animal: animals){

            System.out.print("Animal at Index " + i + " makes noise as " );
            animal.makeNoise();
            System.out.println();
            i++;
        }

    }
}