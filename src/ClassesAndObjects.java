public class ClassesAndObjects {
    public static void main(String [] args){
        // Classes and objects
        Dog obj1 = new Dog();
//        obj1.bark();
//        obj1.walk();
//
//        Dog obj2 = new Dog();
//        obj2.bark();
//        obj2.walk();

//        Dog obj3 = new Dog("Labrador", "White", 10);

    }

}

class Dog{
    String breed;
    String color;
    int weight;

    Dog(){
        this("Labrador", "White");
        System.out.println("Default constructor called.");

    }

    public Dog(String breed, String color, int weight) {

        System.out.println("Constructor with 3 parameters called...");
        System.out.println("breed= " +breed);
        System.out.println("color= " +color);
        System.out.println("weight= " +weight);
    }

    Dog(String b, String c){
        this("Labrador", "White", 50);
        System.out.println("Constructor with 2 parameters called...");
        System.out.println("breed= " + b);
        System.out.println("color= " + c);

    }

    void bark(){
        System.out.println("Barks");
    }

    void walk(){
        System.out.println("Walks");
    }
}