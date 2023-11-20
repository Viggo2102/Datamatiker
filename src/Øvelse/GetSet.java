package Øvelse;

public class GetSet {

    String name;
    int age;

    public static void main(String[] args) {

        GetSet a = new GetSet();
        a.setName("Lars");
        a.setAge(33);
        System.out.println(a.getName());
        System.out.println(a.getAge());
        a.printDetails();

    }
    public void setName( String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    public void printDetails() {
        System.out.println(getName() + ", " + getAge()); //Kan også bare være alm. name + age uden "get".
    }
}

     /*void GoodMorning(String na, int a) {
        name = na;
        age = a;
         System.out.println(na + a);
    }

    public static void main(String[] args) {
        GetSet hej = new GetSet();
        hej.GoodMorning("Viktor", 27);
    }*/
