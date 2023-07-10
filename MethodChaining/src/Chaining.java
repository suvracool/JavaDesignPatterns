public class Chaining {

    private String Name;
    private String Company;

    public Chaining setName(String Name){
        this.Name=Name;
        return this;
    }

    public Chaining setCompany(String Company){
        this.Company=Company;
        return this;
    }


    public Chaining getProfile(){
        return this;
    }

    @Override
    public String toString(){
        return Name + " works in " + Company + ".";
    }

}
