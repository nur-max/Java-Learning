import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = "123456";

        System.out.print("Enter password: ");
        String input = sc.nextLine();

        if (input.equals(password)) {
            System.out.println("Correct Password");
        } else {
            System.out.println("Wrong Password");
        }
    }
}
