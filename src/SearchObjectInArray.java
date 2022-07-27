import java.util.Scanner;

public class SearchObjectInArray {
    public static void main(String [] args){
        Product []  products= new Product[5];

        products[0] = new Product(101, "p1", "c1");
        products[1] = new Product(102, "p2", "c2");
        products[2] = new Product(103, "p3", "c3");
        products[3] = new Product(104, "p4", "c4");
        products[4] = new Product(105, "p5", "c5");

        Scanner scanner = new Scanner(System.in);


        int option = 1;
        while (option != 0){
            System.out.println("The menu");
            System.out.println("1. Search for the object");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");
            option = scanner.nextInt();
            if(option == 1){



                System.out.println("Enter the id of the project: ");

                int id = scanner.nextInt();

                for (Product product : products) {
                    if(product.getProductId() == id){
                        System.out.println("Product found...");
                        System.out.println("ProductId " + product.getProductId());
                        System.out.println("ProductName " + product.getProductName());
                        System.out.println("ProductCategory " + product.getProuductCategory());
                    }

                }

            }


        }






    }




}

class Product{
     int productId;
    String productName;
    String prouductCategory;

    public Product(int productId, String productName, String prouductCategory) {
        this.productId = productId;
        this.productName = productName;
        this.prouductCategory = prouductCategory;
    }

    public int getProductId() {
        return productId;
    }



    public String getProductName() {
        return productName;
    }



    public String getProuductCategory() {
        return prouductCategory;
    }


}
