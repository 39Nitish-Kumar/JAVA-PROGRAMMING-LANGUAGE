import java.util.*;
public class assignment_function {

    /* 
    // Q.1.
  public static float average(float x, float y, float z){
    return(x + y + z)/3;
  } 
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Input the first number :");
    float x = sc.nextFloat();
    System.out.println("Input the second number : ");
    float y = sc.nextFloat();
    System.out.println("input the third number :");
    float z = sc.nextFloat();
    System.out.print("The average value is :" + average(x, y, z) + "\n");
  }

  */

     // Q.2.
     
     /* 

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a integer : ");
         num = sc.nextInt();

         if (isEven(num)) {
            System.out.println("Number is even");
         } else {
            System.out.println("NUmber is odd");
         }
     }

     public static boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
     }

     */


     // Q.3.

     /* 

     public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
           int remainder = palindrome % 10;
           reverse = reverse * 10 + remainder;
           palindrome = palindrome / 10; 
        }
        return number == reverse;
     }

     public static void main(String[] args) {
        System.out.println("Enter a print Number");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if (isPalindrome(palindrome)) {
            System.out.println("Number :" + palindrome + " is a palindrome");
        } else {
            System.out.println("Number :" + palindrome + " is not a palindrome");
        }

        */


        // Q.4.

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int digits = sc.nextInt(); 
            System.out.println("The sum is "+sumDigits(digits));
        }
               
        public static int sumDigits(int n) {
            int sumOfDigits = 0;
            while(n>0) {
                int lastDigit = n%10;
                sumOfDigits += lastDigit;
                n /= 10;
            }
            return sumOfDigits;
        }
}
