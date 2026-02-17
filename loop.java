import java.util.*;
public class loop {
    public static void main(String[] args) {
        // while loop
        /* 
        int counter = 0;
        while (counter < 100) {
        System.out.println("Hello world");
        counter++;  
        }
        System.out.println("printed H ello world 100x");
    
        

        // print number from 1 to 10
        int counter = 1;
        while (counter<= 10) {
           System.out.println(counter);            
        
        
        counter++;
        }
        

        // Q.1. input se 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int counter = 1;

        while (counter <= n) {
         System.out.print(counter + " "); 
         counter++;  
        }
        System.out.println();
        

        // sum of first n natural numbers

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i<=n) {
        sum +=i; // sum = sum + i;
        i++;  
        }
        System.out.println("sum is " + sum);
        

        // FOR LOOP
        for(int i = 1; i <= 10; i++) {
            System.out.println("Hello world");
        }
         

        // Print square pattern
            // first method(for loop)
        for(int line = 1; line<=4; line++) {
            System.out.println("****");
        }
            

        // while loop
        int line = 1;
        while (line<=4) {
            System.out.println("****");
            line++;
        }
            

        // print reverse of a number
        int n =  10899;

        while (n>0) {
           int  lastdigit = n % 10;
           System.out.print( lastdigit );
           n = n / 10;
        }
        System.out.println( );
        

        // reverse the given number

        int n = 2028;
        int rev = 0;

        while (n>0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);
        

        // do- while loop
        
        int i = 1;
        
        do {
            System.out.println("Hello world");
            i++;
        } while(i<=10);
         

        // Break statement

        for(int i = 1; i<=5; i++){
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
        

        // Q break statement
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
               break; 
            }
          System.out.println(n);
        } while(true);


        

        // continue statement

        for(int i = 1; i<=5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
            

        // Q. continue statement

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your number");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was :" + n);
        }while(true);

        */

        // Q. check if a prime or not
          Scanner sc = new Scanner(System.in);
          int n = sc. nextInt();
        
          if (n == 2) {
            System.out.println("n is prime");
          } else {
            boolean isPrime = true;
            for( int i = 2; i<= Math.sqrt(n); i++){
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
          }
        }
    }


