package classtest;
import java.util.Scanner;
public class login {
    public static void main(String[] args) {
    
        String correctUserId = "21btccse00066";
        String correctPassword = "Bikash@2002";

  
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;

        Scanner scanner = new Scanner(System.in);

        while (attempts < MAX_ATTEMPTS) {
            
            System.out.print("Enter User ID: ");
            String userId = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();


            if (userId.equals(correctUserId) && password.equals(correctPassword)) {
                System.out.println("Login successful!");
                break;
            } else {
                attempts++;
                if (attempts < MAX_ATTEMPTS) {
                    System.out.println("Invalid User ID or Password. Try again.");
                } else {
                    System.out.println("Account locked. Maximum attempts reached.");
                }
            }
        }
        scanner.close();
    }
}

