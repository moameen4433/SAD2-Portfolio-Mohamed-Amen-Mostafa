package hospital;

import java.util.Scanner;

public class Doctor extends User {

    public Doctor(String name) {
        super(name);
    }

    public void viewPatients() {
        System.out.println("Viewing patients");
    }

    public void writePrescription() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter medicine name: ");
        String med = sc.nextLine();

        Prescription prescription = new Prescription(med);
        System.out.println("Prescription created: " + prescription.getMedicine());
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nDoctor Menu:");
            System.out.println("1. View Patients");
            System.out.println("2. Write Prescription");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                viewPatients();
            } else if (choice == 2) {
                writePrescription();
            }

        } while (choice != 0);
    }
}
