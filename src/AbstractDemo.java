public class AbstractDemo {
    public static void main(String [] args){

    }

}

abstract class Animal1{
    void walk(){
        System.out.println("Walks");
    }

    abstract  void makeNoise();
}


abstract  class Mammal extends Animal1{
    abstract void makeNoise();
}

class Dog2 extends Mammal{
    @Override
    void makeNoise() {
        System.out.println("Barks");
    }
}


