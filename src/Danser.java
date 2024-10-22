public class Danser extends Person {
    private String groupName;

    public Danser() {
    }
    public Danser(String name,String designation,String groupName){
        super(name,designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName){
        this.groupName = groupName;
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
    public void dancing(){
        System.out.println("I'm lerning dance");
    }
    @Override
    public String toString() {
        return "Group name:" + groupName;
    }
}
