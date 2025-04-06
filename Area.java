import java.util.Scanner;     

public class Area {
  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    int height;
    int width;
    int area;


    System.out.print("Enter the height(cm) --> ");
    height = scanner.nextInt();

    System.out.print("Enter the width(cm) --> ");
    width = scanner.nextInt();

    System.out.print("Calculating....");



    area = height * width;

    System.out.println("The total area is given as: " + area + "cm2");

    scanner.close();
  }
}
