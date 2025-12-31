package hospital;

import java.util.Scanner;

public class Patient extends User {

    public Patient(String name) {
        super(name);
    }

    public void bookAppointment() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter appointment date: ");
        String date = sc.nextLine();

        Appointment appointment = new Appointment(date);
        System.out.println("Appointment booked on: " + appointment.getDate());
    }

    @Override
    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nPatient Menu:");
            System.out.println("1. Book Appointment");
            System.out.println("0. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                bookAppointment();
            }

        } while (choice != 0);
    }
}
