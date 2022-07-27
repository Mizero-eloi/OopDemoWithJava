public class ThisReference {
    public static void main(String [] args){
        // This reference
        Test obj1 = new Test();
        obj1.m1(1,2);
        obj1.m2();


        Test obj2 = new Test();
        obj2.m1(10,20);
        obj2.m2();




    }

}

class Test{
    int a;
    int b;

    void m1(int v1, int v2){
        this.a = v1;
        this.b = v2;
    }

    void m2(){
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }


}