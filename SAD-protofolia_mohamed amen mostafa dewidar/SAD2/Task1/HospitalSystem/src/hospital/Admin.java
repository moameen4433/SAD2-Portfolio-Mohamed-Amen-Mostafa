package hospital;

import java.util.Scanner;

public class Admin extends User implements ManageUsers {

    public Admin(String name) {
        super(name);
    }

    @Override
    public void addUser() {
        System.out.println("User added");
    }

    @Override
    public void removeUser() {
        System.out.println("User removed");
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add User");
            System.out.println("2. Remove User");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            if (choice == 1) {
                addUser();
            } else if (choice == 2) {
                removeUser();
            }

        } while (choice != 0);
    }
}
