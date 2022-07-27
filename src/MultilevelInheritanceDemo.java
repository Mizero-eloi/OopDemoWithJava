public class MultilevelInheritanceDemo {
    public static void main(String [] args){
        MC3 obj = new MC3();
        obj.printAll();
    }
}

class MC1{
    int a = 10;
    int b = 20;

    void m1(){
        System.out.println("m1 method of c1");
    }


}

class MC2 extends MC1{
    int c = 30;
    int d = 40;

    void m2(){
        System.out.println("m2 method of c1");
    }




}

class MC3 extends MC2{
    int e = 30;
    int f = 40;


    void m3(){
        System.out.println("m3 method of c2");
    }

    void printAll(){
        System.out.println("a += " + a);
        System.out.println("a += " + b);
        System.out.println("a += " + c);
        System.out.println("a += " + d);
        System.out.println("a += " + e);
        System.out.println("a += " + f);
    }


}
