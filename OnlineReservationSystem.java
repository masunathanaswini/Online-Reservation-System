import java.util.Scanner;
public class OnlineReservationSystem {

    static Scanner sc = new Scanner(System.in);

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        System.out.println("===== ONLINE RESERVATION SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(user.equals(username) && pass.equals(password)) {

            System.out.println("\nLogin Successful!");

            System.out.println("\n1. Reservation");
            System.out.println("2. Cancellation");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {

                case 1:
                    reservation();
                    break;

                case 2:
                    cancellation();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } else {
            System.out.println("Invalid Login Credentials");
        }
    }

    static void reservation() {

        sc.nextLine();

        System.out.print("Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Train Number: ");
        String trainNo = sc.nextLine();

        System.out.print("Train Name: ");
        String trainName = sc.nextLine();

        System.out.print("From: ");
        String from = sc.nextLine();

        System.out.print("To: ");
        String to = sc.nextLine();

        System.out.println("\nReservation Successful!");
        System.out.println("Passenger: " + name);
        System.out.println("Train No: " + trainNo);
        System.out.println("Train Name: " + trainName);
        System.out.println("Journey: " + from + " -> " + to);
    }

    static void cancellation() {

        sc.nextLine();

        System.out.print("Enter PNR Number: ");
        String pnr = sc.nextLine();

        System.out.println("Ticket Cancelled Successfully!");
        System.out.println("PNR Number: " + pnr);
    }
}
