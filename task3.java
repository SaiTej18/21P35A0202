import java.util.ArrayList;
import java.util.Scanner;

class Product {
  private String name;
  private String specification;
  private double cost;
  private int count;

  public Product(String name, String specification, double cost, int count) {
    this.name = name;
    this.specification = specification;
    this.cost = cost;
    this.count = count;
  }

  public String getName() {
    return name;
  }

  public String getSpecification() {
    return specification;
  }

  public double getCost() {
    return cost;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}

class Inventory {
  private ArrayList<Product> products;

  public Inventory() {
    products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public void removeProduct(Product product) {
    products.remove(product);
  }

  public Product getProduct(String name) {
    for (Product product : products) {
      if (product.getName().equals(name)) {
        return product;
      }
    }
    return null;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }
}

public class task3 {
  private static Scanner input = new Scanner(System.in);
  private static Inventory inventory = new Inventory();

  public static void main(String[] args) {
    int choice;
    do {
      System.out.println("Inventory Management System");
      System.out.println("1. Product List");
      System.out.println("2. Product Count");
      System.out.println("3. View Product Details");
      System.out.println("4. Edit Product");
      System.out.println("5. Update Inventory");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
      choice = input.nextInt();
      switch (choice) {
        case 1:
          viewProductList();
          break;
        case 2:
          viewProductCount();
          break;
        case 3:
          ViewProductDetails();
          break;
        case 4:
          editProduct();
          break;
        case 5:
          updateInventory();
          break;
        case 6:
          System.out.println("Exiting the system... Bye!");
          break;
        default:
          System.out.println("Invalid choice. Try again.");
      }
    } while (choice != 6);
  }

  private static void viewProductList() {
    System.out.println("Product List:");
    ArrayList<Product> products = inventory.getProducts();
    for (Product product : products) {
      System.out.println(product.getName());
    }
  }

  private static void viewProductCount() {
    System.out.print("Enter product name: ");
  }
}