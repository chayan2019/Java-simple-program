import java.util.Scanner;

public class InputFromUser {

    public static void main(String[] args) {

        // How to take input from from the User keyboard

         System.out.println("Please Enter user id");
         Scanner scanner = new Scanner(System.in);
         String userName = scanner.next(); 
         System.out.println("User Id: "+userName); 
         System.out.println("Please Enter password");
         String passWord = scanner.next();
         System.out.println("Password: "+passWord);

        }

}