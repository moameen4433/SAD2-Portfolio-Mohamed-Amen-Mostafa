package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Role:");
        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.println("3. Admin");

        int choice = sc.nextInt();
        User user = null;

        if (choice == 1) {
            user = new Doctor("Dr Ali");
        } else if (choice == 2) {
            user = new Patient("Ahmed");
        } else if (choice == 3) {
            user = new Admin("Admin");
        }

        if (user != null) {
            user.showMenu();
        }
    }
}
