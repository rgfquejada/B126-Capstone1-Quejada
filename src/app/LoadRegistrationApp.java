package app;

import java.util.Scanner;

public class LoadRegistrationApp {

    static Scanner scanner = new Scanner(System.in);
    static double loadBalance = 100.0;
    static boolean running = true;

    public static void main(String[] args) {
        clearScreen();
        validateUssdCode();

        while (true) {
            try {
                clearScreen();
                mainMenu();

            } catch (Exception e) {
                System.out.println("Invalid Input! Please enter a number");
                scanner.nextLine(); // clear buffer
            }
        }
    }

    public static void validateUssdCode() {
        System.out.println("Dial *143# to access Globe services");
        System.out.println("Enter USSD Code: ");
        String ussdCode = scanner.nextLine().trim();

        if (ussdCode.isEmpty() || !ussdCode.equals("*143#")) {
            System.out.println("Invalid USSD Code. Exiting...");
            System.exit(0);
        }

    }

    public static void mainMenu() {
        System.out.println("\n\n\n Load Balance: " + loadBalance);
        System.out.println("\n * Load Registration * ");
        System.out.println("    [1] Unli Text");
        System.out.println("    [2] Unli Call");
        System.out.println("    [3] Go+");
        System.out.println("    [4] UNLI 5G");
        System.out.println("    [5] Unli Call and Text");
        System.out.println("    [6] Exit");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                unliText();
                break;
            case 2:
                unliCall();
                break;
            case 3:
                goPlus();
                break;
            case 4:
                unli5G();
                break;
            case 5:
                unliCallAndText();
                break;
            case 6:
                exitConfirmation();
            default:
                System.out.println("Invalid Menu Choice!");
                break;
        }
    }

    public static void unliText() {
        System.out.println("\n--- Choose your Unli Text Promo ---");
        System.out.println("    [1] 1 Day (P10)");
        System.out.println("    [2] 3 Days (P20)");
        System.out.println("    [3] 7 Days (P50)");
        System.out.println("    [0] Back to Main Menu");
        System.out.print("Enter Duration: ");
        int subChoice = scanner.nextInt();
        scanner.nextLine();

        int days = 0;
        int price = 0;

        switch (subChoice) {
            case 1:
                days = 1;
                price = 10;
                break;
            case 2:
                days = 3;
                price = 20;
                break;
            case 3:
                days = 7;
                price = 50;
                break;
            case 4:
                return;
            default:
                System.out.println("Wrong input / Transaction Cancelled!");
                return;
        }
        confirmSubscription("Unlimited Text to all Globe users", days, price);
    }

    public static void unliCall() {
        System.out.println("\n--- Choose your Unli Call Promo ---");
        System.out.println("    [1] 1 Day (P15)");
        System.out.println("    [2] 3 Days (P30)");
        System.out.println("    [3] 7 Days (P70)");
        System.out.println("    [0] Back to Main Menu");
        System.out.print("Enter Duration: ");
        int subChoice = scanner.nextInt();
        scanner.nextLine();

        int days = 0;
        int price = 0;

        switch (subChoice) {
            case 0:
                System.out.println("Going back to Main Menu");
                return;
            case 1:
                days = 1;
                price = 15;
                break;
            case 2:
                days = 3;
                price = 30;
                break;
            case 3:
                days = 7;
                price = 70;
                break;
            default:
                System.out.println("Wrong input / Transaction Cancelled!");
                return;
        }
        confirmSubscription("Unlimited Call to Globe/TM", days, price);
    }

    public static void goPlus() {
        System.out.println("\n--- Choose your Go+ Promo ---");
        System.out.println("    Go+99 (8GB Data + 8GB Apps for 7 Days - P99)");
        System.out.println("    Go+149 (12GB Data + 8GB Apps for 7 Days - P149)");
        System.out.println("    Back to Main Menu");
        System.out.print("Enter Choice: ");
        int subChoice = scanner.nextInt();
        scanner.nextLine();

        String promoName = "";
        int days = 7;
        int price = 0;

        switch (subChoice) {
            case 0:
                System.out.println("Going back to Main Menu");
                return;
            case 1:
                promoName = "Go+99 (8GB Data + 8GB Apps)";
                price = 99;
                break;
            case 2:
                promoName = "Go+149 (12GB Data + 8GB Apps)";
                price = 149;
                break;
            default:
                System.out.println("Wrong input / Transaction Cancelled!");
                return;
        }
        confirmSubscription(promoName, days, price);
    }

    public static void unli5G() {
        System.out.println("\n--- Choose your UNLI 5G Promo ---");
        System.out.println("    1 Day (P50)");
        System.out.println("    3 Days (P120)");
        System.out.println("    7 Days (P250)");
        System.out.println("    Back to Main Menu");
        System.out.print("Enter Duration: ");
        int subChoice = scanner.nextInt();
        scanner.nextLine();

        int days = 0;
        int price = 0;

        switch (subChoice) {
            case 0:
                System.out.println("Going back to Main Menu");
                return;
            case 1:
                days = 1;
                price = 50;
                break;
            case 2:
                days = 3;
                price = 120;
                break;
            case 3:
                days = 7;
                price = 250;
                break;
            default:
                System.out.println("Wrong input / Transaction Cancelled!");
                return;
        }
        confirmSubscription("UNLI 5G Data", days, price);
    }

    public static void unliCallAndText() {
        System.out.println("\n--- Choose your Unli Call and Text Promo ---");
        System.out.println("    1 Day (P25)");
        System.out.println("    3 Days (P50)");
        System.out.println("    7 Days (P100)");
        System.out.println("    Back to Main Menu");
        System.out.print("Enter Duration: ");
        int subChoice = scanner.nextInt();
        scanner.nextLine();

        int days = 0;
        int price = 0;

        switch (subChoice) {
            case 0:
                System.out.println("Going back to Main Menu");
                return;
            case 1:
                days = 1;
                price = 25;
                break;
            case 2:
                days = 3;
                price = 50;
                break;
            case 3:
                days = 7;
                price = 100;
                break;
            default:
                System.out.println("Wrong input / Transaction Cancelled!");
                return;
        }
        confirmSubscription("Unlimited Call & Text to all networks", days, price);
    }

    public static boolean confirmSubscription(String promoName, int days, int price) {

        System.out.println("\nConfirm registration for " + promoName + "?");
        System.out.println("Duration: " + days + " day/s");
        System.out.println("Price: P" + price);
        System.out.println("    [1] Confirm");
        System.out.println("    [2] Cancel");
        System.out.println("    [3] Back to Main Menu");
        System.out.print("Enter choice: ");
        int finalChoice = scanner.nextInt();
        scanner.nextLine();

        if (finalChoice == 1) {
            
            
            if (loadBalance >= price) {
                loadBalance -= price;
                String successMsg = "Thank you! You are now subscribed to " + promoName + "for " + days + " day/s.";
                System.out.println("\n" + successMsg);
                System.exit(0);
                
            } else {
                System.out.println("Insufficient Balance! Please reload");
            }
            running = false;
            return true;

        } else if (finalChoice == 3) {
            System.out.println("Returning to Main Menu");
            String promo = "";
            switch (promo) {
                case "unliText":
                    unliText();
                case "unliCall":
                    unliCall();
                case "goPlus":
                    goPlus();
                case "unli5G":
                    unli5G();
                case "unliCallAndText":
                    unliCallAndText();

            }
            return false;

        } else {
            System.out.println("Transaction cancelled");
            return false;
        }
    }

    public static void checkBalance() {

        System.out.println("\n\n\nYour current load balance is: P" + loadBalance);
    }

    public static void exitConfirmation() {
        scanner.nextLine();
        System.out.println("\n\n\nAre you sure you really want to exit? ");
        System.out.print("Type Y to proceed: ");
        char choice = scanner.nextLine().trim().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            System.out.println("Thank you for using Globe Services.");
            System.exit(0);
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
/*
    how to run Java Program in Terminal
Steps:
    1. Check Java Installation // java --version
    2. Navigate to project


 */
// hello