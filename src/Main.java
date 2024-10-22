public class Main {
    public static void main(String[] args) {
//        БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.
//    ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ
//    КЫЛЫП  ТУЗОСУЗДОР
//    АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.
//    АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА
//    МЕТОДТОРУ БАР СУРОТТОГУДОЙ.
//    КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
//    МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
//    КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.

        Person person = new Person();
        person.setName("Rahmankul");
        person.setDesighation("Student");

        System.out.println("  Programmer");

        Programmer programmer = new Programmer();
        programmer.setCompanyName("Peaksoft Hause");
        System.out.println(person.toString());
        System.out.println(programmer.toString());
        programmer.lern();

        System.out.println("~~~~~~~~~~~\n  Danser");

        Danser danser = new Danser();
        danser.setGroupName("Kg 77");
        System.out.println(person.toString());
        System.out.println(danser.toString());
        danser.walk();

        System.out.println("~~~~~~~~~~~~\n  Singer");

        Singer singer = new Singer();
        singer.setName("Arsen");
        singer.setDesighation("Singer");
        singer.setBandName("Jigitter");
        System.out.println("Name: "+singer.getName()+
                "\nDesinghation: "+singer.getDesighation()+
                "\nBand name: "+singer.getBandName());
        singer.eat();
    }
}