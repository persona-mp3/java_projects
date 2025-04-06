import java.util.Scanner;

public class AuthUser {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String user = "laptop@homedir";
    String password = "passWord123";
  
    System.out.println(System.identityHashCode(user));  

    System.out.println("Welcome " + user);
    System.out.print("Enter your password: ");

    String userPassword = scanner.next();
    
    if (!userPassword.equals(password)) {
      System.out.println("Incorrect Password");
    } else {
      System.out.println("Login successful");
    }

    scanner.close();

  }
}

