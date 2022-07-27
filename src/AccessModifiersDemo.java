import packagedemo.Test2;

public class AccessModifiersDemo {
    public static void main(String [] args){
        A1 obj = new A1();
        obj.c = 9;
        Test2 tst = new Test2();
    }
}

class A1{
    public int a;
    private int b;
    protected int c;

    void m1(){

    }
}

class A2 extends  A1{
    void m2(){
        int d = this.c;
    }
}