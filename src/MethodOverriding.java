public class MethodOverriding {

}

class M0C1{
    void m1(int a, int b){
        System.out.println("a = " + a + ", b = " + b);
    }
}

class MOC2 extends M0C1{
    void m1(int a, int b){
        System.out.println("overriden version");
    }
}