import java.util.Scanner;

class BankAcc
{
    float balance;
    float amount;

    public float returnBalance()
    {
        return balance;
    }
    public void deposit(float amount)
    {
        balance = balance + amount;
        System.out.println("SUCCESSFUL DEPOSIT");
        System.out.println("BALANCE = "+balance);
    }
    public void withdraw(float amount)
    {
        if(amount > balance)
        {
            System.out.println("INSUFFICIENT FUNDS");
            System.exit(0);
        }
        balance = balance - amount;
        System.out.println("WITHDRAWEL SUCCESSFUL");
        System.out.println("BALANCE = "+balance);
    }
}
class AtmTransaction extends BankAcc{

    public void process(BankAcc acc)
    {
        try (Scanner scan = new Scanner(System.in)) {
            int option;
            do
            {
                System.out.println("OPTIONS FOR THE ATM TRANSACTION:");
                System.out.println("=============");
                System.out.println("1. SHOW BALANCE\n2. DEPOSIT MONEY\n3. WITHDRAW MONEY\n4. EXIT");
                System.out.print("ENTER YOUR OPTION: ");
                option = scan.nextInt();
                switch (option) 
                {
                    case 1:
                        System.out.println("ACCOUNT BALANCE: "+acc.returnBalance());
                        break;
                    case 2:
                        System.out.println("ENTER THE AMOUNT TO BE DEPOSITED: ");
                        float depositAmount = scan.nextFloat();
                        deposit(depositAmount);
                        break;
                    case 3:
                        System.out.println("ENTER THE AMOUNT FOR WITHDRAWEL: ");
                        float withdrawAmount = scan.nextFloat();
                        withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.exit(0);
                }
            }while(option != 4);
        }
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("=============");
        System.out.println("ATM INTERFACE");
        System.out.println("=============");

        BankAcc acc = new BankAcc();
        AtmTransaction atm = new AtmTransaction();
        atm.process(acc);
    }
}
