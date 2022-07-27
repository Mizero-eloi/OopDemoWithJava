public class MethodOverloadingDemo {

    public static void main(String [] args){
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        obj.m1(2, 4.5, 8);

    }


    void m1(int a){
        System.out.println("value =" + a);
    }

    void m1(double a){
        System.out.println("value =" + a);
    }

    void m1 (int a, double b, int c){
        System.out.println("value =" + a + b + c);
    }

}
