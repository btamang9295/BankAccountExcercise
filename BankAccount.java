import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    private String phoneNumber;
    private String email;


    public BankAccount(int accountNumber, String name, double balance, String phoneNumber, String email){
         this.accountNumber = accountNumber;
         this.name = name;
         this.balance = balance;
         this.phoneNumber = phoneNumber;
         this.email = email;

    }

    double showBalance(){
        return this.balance;
    }


    void depositAmount (double amt){
        balance = balance + amt;
    }

    void withdrawAmount (double amt){
        balance = balance - amt;
    }

    void showInfo (){
        System.out.println("name: " + name + "\n" + "Account Number: " + accountNumber
                + "\n" + "Balance : $" + balance + "\n" + "Email: " + email +
                "\n" + "Phone Number: " + phoneNumber + "\n");
    }





    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(123456789, "Bikram Tamang", 50.0,
                "51098379895", "bikram9295@gmail.com"  );
        account1.showInfo();



        Scanner input = new Scanner(System.in);

        int option = -1;

        while(option < 1 || option > 3){

            System.out.println(" ============================= ");
            System.out.println(" 1. Show Account Balance ");
            System.out.println(" 2. Deposit ");
            System.out.println(" 3. withdraw ");
            System.out.println(" 4. Exit ");
            System.out.println( " Please Enter a Number to select from the menu: ");


            if(input.hasNextInt())
                option = input.nextInt();

        }
        Scanner in = new Scanner(System.in);

        switch(option){
            case 1:
                //do logic
                System.out.println("Current Balance: " + account1.showBalance());
                break;
            case 2:
                //do logic
                System.out.println("Please enter the amount you want to deposit $: ");
                int amount = in.nextInt();
                account1.depositAmount(amount);
                System.out.println("Thank you ! \n Your new balance is  :$" + account1.balance  );
                break;
            case 3:
                //do logic
                System.out.println("Enter the amount you want to withdraw");
                int amt = in.nextInt();
                if (account1.balance < amt) {
                    System.out.println("Error, not enough balance \n" + account1.name + "\n" + "Balance :$" + account1.balance);
                }
                else{
                    account1.withdrawAmount(amt);
                    System.out.println("you have successfully withdraw: $" + amt);
                    System.out.println("Your new balance is: $ " + account1.balance);
                }

                break;
        }

    }

}
