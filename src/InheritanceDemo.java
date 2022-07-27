public class InheritanceDemo {

    public static void main(String [] args){
        C1 obj1 = new C1();
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        C2 obj2 = new C2();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.c);
        System.out.println(obj2.d);
        obj2.m1();
        obj2.m2();
        obj2.m3();
        obj2.m4();

    }


}

class C1{
    int a = 10;
    int b = 20;

    void m1(){
        System.out.println("m1 method of c1");
    }

    void m2(){
        System.out.println("m2 method of c1");
    }
}

class C2 extends C1{
    int c = 30;
    int d = 40;

    void m3(){
        System.out.println("m3 method of c2");
    }

    void m4(){
        System.out.println("m4 method of c2");
    }
}
