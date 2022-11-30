
package shopmanagementsystem;
import java.util.Scanner;
public class ShopManagementSystem {
 
    public static void main(String[] args) {
 
        int maxProducts = 10;
        int productCount = 0;
        int choice;
        String[] productNames = new String[maxProducts];
        double[] prices = new double[maxProducts];
        int[] productQuantities = new int[maxProducts];
 
        Scanner input = new Scanner(System.in);
 
        while (true) {
            System.out.println("Welcome to the Shop Management System");
            System.out.println("1. Add New Product");
            System.out.println("2. List All Products");
            System.out.println("3. Update Product Quantity");
            System.out.println("4. Update Product Price");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
 
            if (choice == 1) {
                System.out.println("Enter the product name:");
                productNames[productCount] = input.next();
                System.out.println("Enter the price:");
                prices[productCount] = input.nextDouble();
                System.out.println("Enter the quantity:");
                productQuantities[productCount] = input.nextInt();
                System.out.println("Product Added Successfully!");
                productCount++;
            } else if (choice == 2) {
                System.out.println("List of Products");
                System.out.println("Product Name\tPrice\tQuantity");
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + "\t\t" + prices[i] + "\t" + productQuantities[i]);
                }
            } else if (choice == 3) {
                System.out.println("Enter the product name:");
                String productName = input.next();
                int productIndex = -1;
                for (int i = 0; i < productCount; i++) {
                    if (productNames[i].equalsIgnoreCase(productName)) {
                        productIndex = i;
                        break;
                    }
                }
                if (productIndex == -1) {
                    System.out.println("Product not found!");
                } else {
                    System.out.println("Enter the new quantity:");
                    productQuantities[productIndex] = input.nextInt();
                    System.out.println("Quantity Updated Successfully!");
                }
            } else if (choice == 4) {
                System.out.println("Enter the product name:");
                String productName = input.next();
                int productIndex = -1;
                for (int i = 0; i < productCount; i++) {
                    if (productNames[i].equalsIgnoreCase(productName)) {
                        productIndex = i;
                        break;
                    }
                }
                if (productIndex == -1) {
                    System.out.println("Product not found!");
                } else {
                    System.out.println("Enter the new price:");
                    prices[productIndex] = input.nextDouble();
                    System.out.println("Price Updated Successfully!");
                }
            } else if (choice == 5) {
                System.out.println("Thank you for using Shop Management System!");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        } 
    }
}
    
   
    
