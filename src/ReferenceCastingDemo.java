public class ReferenceCastingDemo {
    public static void main(String [] args){

        RF1 result = (RF1) getRf1();
        System.out.println("Res: " + result);
    }

    static Object getRf1(){
        RF1 obj = new RF1();
        return obj;
    }

}

class RF1{
    int a;
    int b;

     void m1(){

    }
}
