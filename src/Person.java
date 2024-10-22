public class Person {
    private String name;
    private String desighation;

    public Person() {

    }

    public Person(String name, String desighation) {
        this.name = name;
        this.desighation = desighation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesighation() {
        return desighation;
    }

    public void setDesighation(String desighation) {
        this.desighation = desighation;
    }
    public void lern(){
        System.out.println("Lern Java");
    }
    public void walk(){
        System.out.println("Walk in the park");
    }
    public void eat(){
        System.out.println("manty");
    }

    @Override
    public String toString() {
        return "name:" + name +
                "\ndesighation: " + desighation;
    }
}
