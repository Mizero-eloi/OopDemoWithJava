public class StaticDemo {
    public static void main(String [] args){
        SC1 ob1 = new SC1();
        SC1 ob2 = new SC1();
        SC1 ob3 = new SC1();

        System.out.println("Count " + SC1.count);
        m1();
    }

    static void m1(){
        System.out.println("Static should always be called in static methods");
    }
}

class SC1 {

    static int count = 0;

    SC1(){
        count++;
    }
}
