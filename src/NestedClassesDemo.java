public class NestedClassesDemo {

    public static void main(String [] args){
        Outer.Inner inner = new Outer.Inner();
        inner.m1();

    }
}

class Outer{
    static class Inner{
        void m1(){
            System.out.println("m1() from the inner class");
        }
    }
}
