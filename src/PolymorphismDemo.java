public class PolymorphismDemo {
    public static void main(String [] args){
        Animal a1 = new Dog1();
        Animal a2 = new Cat1();
        Animal a3 = new Lion();
        a1.makeNoise();
        a2.makeNoise();
        a3.makeNoise();

    }
}


class Animal{
    void makeNoise(){
        System.out.println("Make some noise");
    }
}

class Dog1 extends Animal{

    void makeNoise(){
        System.out.println("Barks");
    }

}


class Cat1 extends Animal{

    void makeNoise(){
        System.out.println("Mews");
    }

}

class Lion extends Animal{

    void makeNoise(){
        System.out.println("Roars");
    }

}