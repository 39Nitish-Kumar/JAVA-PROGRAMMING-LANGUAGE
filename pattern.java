import java.util.*;
public class pattern {
    public static void main(String[] args) {
        // Q. Print star pattern
           /* 
        for(int line = 1; line<=4; line++) {
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        

        // Q.2. print-inverted star pattern

        // first method (input se...)
          
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
    
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    

        // second method(output se...)
        int n = 4;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=(n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        
         
        // print - Half pyramid pattern

        int n = 4;

        for(int line = 1; line<=n; line++) {
            // print number
            for(int number = 1; number<=line; number++) {
                System.out.print(number);
            }
            System.out.println( " ");
        }
        */

        // Q.3.
        // print character pattern

        int n = 4;
        char ch = 'A';

        // outer loop
        for( int line = 1; line<=n; line++) {
            // inner loop
            for(int chars= 1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
