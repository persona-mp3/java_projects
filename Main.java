import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    int generatedOtp = 0123;


    System.out.print("Enter your email address --> ");
    String userEmail = scanner.nextLine();

    System.out.print("Enter your OTP Password -->");
    int otpPassword = scanner.nextInt();


    System.out.println("We sent an OTP to the email " + userEmail + " but the pin you entered --> " + otpPassword + " is wrong!");

    if (otpPassword != generatedOtp) {
      System.out.println("This OTP is invalid");
    }
      
    
    scanner.close();
  }
}
