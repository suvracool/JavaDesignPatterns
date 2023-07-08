package Builder2.JavaDesignPatterns;

public class PhoneBuilder {
    private String os;
    private String make;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os=os;
        return this;
    }

    public PhoneBuilder setMake(String make) {
        this.make=make;
        return this;
    }

    public PhoneBuilder setBattery(int battery){
        this.battery=battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os,make,battery);
    }
}
