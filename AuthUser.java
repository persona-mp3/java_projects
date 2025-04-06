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
   
    // in java, the comparison operator ie !=, and == only work for primitives
    // for other datatypes these operators simply check their memory address
    // in the stack heap. thereby always return false depending on the scenario
    // if (String a != String b) will return TRUE 
    // String a == String b will return FALSE 
    // BECAUSE IT IS COMPARING THE MEMORY ADDRESS IN HEAP MEMORY
    //
    // however int a == int b assuming they are the same values will be true;

    if (!userPassword.equals(password)) {
      System.out.println("Incorrect Password");
    } else {
      System.out.println("Login successful");
    }

    scanner.close();

  }
}

