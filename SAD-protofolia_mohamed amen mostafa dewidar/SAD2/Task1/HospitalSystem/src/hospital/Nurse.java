package hospital;

import java.util.Scanner;

public class Nurse extends User {

    public Nurse(String name) {
        super(name);
    }

    public void assistDoctor() {
        System.out.println("Assisting doctor");
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nNurse Menu:");
            System.out.println("1. Assist Doctor");
            System.out.println("0. Exit");

            choice = sc.nextInt();

            if (choice == 1) {
                assistDoctor();
            }

        } while (choice != 0);
    }
}

