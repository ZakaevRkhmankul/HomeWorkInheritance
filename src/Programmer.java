public class Programmer extends Person {
    private String companyName;

    public Programmer() {
    }

    public Programmer(String name, String desighation, String companyName) {
        super(name, desighation);
        this.companyName = companyName;
    }
    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    @Override
    public void lern() {
        super.lern();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void coding(){
        System.out.println("I can coding!");
    }

    @Override
    public String toString() {
        return "Company name: " + companyName;
    }
}
