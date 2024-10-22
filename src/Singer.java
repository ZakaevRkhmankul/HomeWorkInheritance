public class Singer extends Person{
    private String bandName;

    public Singer(){

    }
    public Singer(String name,String desinhation,String bandName){
        super(name,desinhation);
        this.bandName=bandName;
    }
    public String getBandName(){
        return bandName;
    }
    public void setBandName(String bandName){
        this.bandName=bandName;
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
    public void singing(){
        System.out.println("Song");
    }
    public void playGitar(){
        System.out.println("I can play the gitar");
    }
    @Override
    public String toString() {
        return "Band name: " + bandName;
    }
}
