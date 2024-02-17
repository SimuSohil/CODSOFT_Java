import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        float marks;
        float total = 0;
        float avg;
        boolean cont = true;
        int choice;

        while (cont) {
            System.out.println("========================");
            System.out.println("STUDENT GRADE CALCULATOR");
            System.out.println("========================");
            System.out.println("1. CALCULATE GRADE\n2. STOP");
            System.out.print("ENTER YOUR CHOICE: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENTER THE MARKS: ");
                    for(int i=1; i<=5; i++)
                    {
                        System.out.print("MARK"+i+": ");
                        marks = scan.nextFloat();
                        total += marks;
                    }
                    avg = (float) total / 5;
                    System.out.println("\n");
                    if(avg >= 90)
                    {
                        System.out.println("GRADE: A");
                    }
                    else if(avg >= 80)
                    {
                        System.out.println("GRADE: B");
                    }
                    else if(avg >= 70)
                    {
                        System.out.println("GRADE: C");
                    }
                    else if(avg >= 60)
                    {
                        System.out.println("GRADE: D");
                    }
                    else if(avg >= 50)
                    {
                        System.out.println("GRADE: E");
                    }
                    else if(avg < 50){
                        System.out.println("GRADE: FAIL");
                    }
                    System.out.println("\n");
                    break;
                case 2: 
                    System.exit(0);
            }   
        }
        scan.close();
    }
}
