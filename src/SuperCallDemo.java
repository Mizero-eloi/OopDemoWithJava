public class SuperCallDemo {
    public static void main(String [] args){
        Child child = new Child();
    }

}

class Parent{
    Parent(){
        System.out.println("Default constructor of Parent");
    }
    Parent(int a, int b){
        System.out.println("Constructor with 2 parameters");
    }

    Parent(int a, int b, int c ){
        System.out.println("Constructor with 3 parameters");
    }
}

class Child extends Parent{
    Child(){
        super(10, 20, 30);
        System.out.println("Default constructor of child");
    }
}