import java.util.Scanner;

public class loop_assignment {
    public static void main(String[] args) {

        // Q.1.

        /* 
        for(int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i+=2;
        }
        

        // Q.2.

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.print("Enter the number ");
            number=sc.nextInt();
            if(number%2==0) {
                evenSum+=number;
            }else{
                oddSum+=number;
             }
            System.out.print("Do you want to continue ? Press 1 for yes or 0 for no");
            choice =sc.nextInt();
        } while(choice==1);
            System.out.println("Sum of even numbers: "+evenSum);
            System.out.println("Sum of odd numbers: "+oddSum);
            

            // Q.3.

            Scanner sc = new Scanner(System.in);
            int num;
            int fact = 1;

            System.out.print("Enter any positive number");
            num = sc.nextInt();

            for(int i = 1; i<=num; i++) {
                fact *=i;
            }
            System.out.println("Factorial " + fact);
            */

            // Q.4. 

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = sc.nextInt();

            for(int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + n*i);
            }
    }
} 
    

    

