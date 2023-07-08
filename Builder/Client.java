package Builder2.JavaDesignPatterns;

public class Client {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("iOs").setMake("Apple").setBattery(3000).getPhone();
        System.out.println(p);
    }
}
