public class ReachableAndUnreachableDemo {
    public static void main(String [] args){
        REmployee emp = new REmployee();

        // Ways of making objects unreachable

        emp = null; // 1. by assigning an object to null
        emp = new REmployee(); // 2. by assigning it to another object
        System.gc();



    }
}


class  REmployee{
    String name;
    Address address; // Also this object will be unreachable


    protected  void finalize(){
        System.out.println("Release resources");

    }



}

class  Address{
    String street;
    String city;
    String state;

}

