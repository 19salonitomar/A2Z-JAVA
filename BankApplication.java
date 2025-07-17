import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {

    //Scannner for take user inputs   
    Scanner sc = new Scanner(System.in);   //Create Scanner object to read user input.

    //Initial balance and password
    float Avalbalance = 50000;
    String pswrd = "s#123";

    //Welcome Messsage
    System.out.println("Hey CX, Welcome to the HDFC Bank!");

    int choice = 0;

    //Menu Loop for using while
    
    while(choice!= 6) {
        System.out.println("Please choose an option:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Amount");
        System.out.println("3.Withdrawn Amount");
        System.out.println("4. Change Password");
        System.out.println("5. Inquiry Or help");
        System.out.println("6. Exit");
        System.out.println("Please, Enter your choice....");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter Your Password!");
            String inputPass = sc.next();

            if(inputPass.equals(pswrd)) {
                System.out.println("Your Current Available Blance is : Rs" + Avalbalance);
                } else {
                    System.out.println("Incorrect Password");
                }
                } else if (choice == 2) {
                // Deposit Money
                System.out.print("Enter amount to deposit: ₹");
                float depositAmount = sc.nextFloat();

                if (depositAmount > 0) {
                    Avalbalance += depositAmount;
                    System.out.println(" ₹" + depositAmount + " deposited successfully.");
                    System.out.println("New Balance: ₹" + Avalbalance);
                } else {
                    System.out.println(" Invalid deposit amount.");
                }

            } else if (choice == 3) {
                // Withdraw Money
                System.out.print("Enter amount to withdraw: ₹");
                float withdrawAmount = sc.nextFloat();

                if (withdrawAmount > 0 && withdrawAmount <= Avalbalance) {
                    Avalbalance -= withdrawAmount;
                    System.out.println(" ₹" + withdrawAmount + " withdrawn successfully.");
                    System.out.println("Remaining Balance: ₹" + Avalbalance);
                } else if (withdrawAmount > Avalbalance) {
                    System.out.println(" Insufficient balance!");
                } else {
                    System.out.println(" Invalid withdraw amount.");
                }

            } else if (choice == 4) {
                // Change Password
                System.out.print("Enter current password: ");
                String oldPass = sc.next();

                if (oldPass.equals(pswrd)) {
                    System.out.print("Enter new password: ");
                    String newPass = sc.next();
                    pswrd = newPass;
                    System.out.println(" Password changed successfully!");
                } else {
                    System.out.println(" Incorrect current password.");
                }

            } else if (choice == 5) {
                // Inquiry / Help
                System.out.println(" HDFC Bank Customer Service");
                System.out.println(" Email: support@hdfcbank.com");
                System.out.println(" Website: www.hdfcbank.com");
                System.out.println(" Toll-Free: 1800-202-6161");
                System.out.println(" Visit nearest branch for more services.");
            } 
            else if (choice == 6) {
                // Exit
                System.out.println(" Thank you for banking with HDFC. Have a great day!");

            } else {
                // Invalid choice
                System.out.println(" Invalid choice. Please select between 1 and 6.");
            }
        }

        sc.close(); // Close scanner
    }
        
    }
       

