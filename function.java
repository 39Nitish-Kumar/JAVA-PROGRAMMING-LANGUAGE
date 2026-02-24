import java.util.*;

public class function {

    /*
     Q.1.
    public static void printHelloWorld () {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return;
    }
        

    public static int calculateSum(int num1, int num2) { // parameters or formal parameters
       
        int sum = num1 + num2;
        return sum;    
    }
        
      
     public static int multiply(int a, int b) {
        int product = a * b;
        return product;
     }

    
    public static void main(String[] args) {
        
        // functions:- block of code/ reusable
        printHelloWorld(); // function call

        

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
       int sum = calculateSum(a ,b ); // arguments or actual parameters
       System.out.println("sum is : " + sum);

       

       // find product a & b
       int product = multiply(3,5);
       System.out.println(" product is :" + product);

    }

    
       
      // check if a prime or not
      public static boolean isPrime(int n) {
        if (n==2) {
            return true;
        }
      for(int i = 2; i<=n-1; i++){
         if (n % i == 0) { // completely dividing
            return false;
            
            
         }
     }
        return true;
    }
      
    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }

    */

     public static boolean isPrime(int n) {
        if (n==2) {
            return true;
        }
      for(int i = 2; i<=Math.sqrt(n); i++){
         if (n % i == 0) { // completely dividing
            return false;   
         }
     }
        return true;
    }  
      /* 
    public static void main(String[] args) {
    system.out.println(isPrime(10));
    }

    */

     

     // print all primes in range

     public static void primesInRange(int n) {
        for(int i = 2; i<= n; i++) {
            if (isPrime(i)) { // true
                System.out.print(i + " ");
                
            }
        }
        System.out.println();
     }

     public static void main(String[] args) {
        primesInRange(20);
     }
}
