public class Parent {
    String name;
    void display(){
        System.out.println("Super Class is Running!");
    }
}

class Child extends Parent{
    int age;

    @Override
    void display() {
        System.out.println("Sub Class is Running!");
    }
}

class Downcasting{
    public static void main(String[] args) {
        Parent p = new Child(); //upcasted object
        p.name = "Dilshan";
        Child c = (Child) p;
        c.age = 25;
        System.out.println(c.name);
        System.out.println(c.age);
        c.display();
    }
}
