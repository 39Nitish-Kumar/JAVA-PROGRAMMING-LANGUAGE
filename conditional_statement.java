import java.util.*;
public class conditional_statement {
 public static void main(String[] args) {
    /* 
    int age = 16;
    if(age >= 18){
        System.out.println("adult : vote : drive ");
    }
    if(age > 13 && age < 18){
        System.out.println("teenager");
    }
    else{
        System.out.println("You are not adult.");
        
    }
    

    int a= 1, b = 5;
    if(a >= b) {
        System.out.println("a is largest of 2 ");
        System.out.println("a >= b");
    } else {
        System.out.println("b is largest of 2");
    }
        
       
    // print if number is even or odd

     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     if(number % 2 == 0){
        System.out.println("Even");
     } else{
        System.out.println("odd");
     }
      

     // else if

     int age = 13;
     if(age >= 18){
        System.out.println("Adult");
     } else if(age >= 13 && age < 18){
        System.out.println("teenager");
     } else {
        System.out.println("Not Adult");
     }
        

     // Income tex calculator
        
      Scanner sc = new Scanner(System.in);
      int income = sc.nextInt();
      int tax;

      if(income < 500000) {
         tax = 0;
      }
       else if(income >= 500000 && income < 1000000) {
         tax = (int) (income * 0.2);
      } 
      else {
         tax = (int) (income * 0.3);
      }
      System.out.println("Your tax is :" + tax);
       
      
      // print the largest of 3

      int A = 8;
      int B = 12;
      int C = 50;

      if((A >= B) && (A >=C)) {
         System.out.println("largest is A");
      }
       else if(B >= C) {
         System.out.println("Largest is B");
       } 
        else {
         System.out.println("largest is c");
         

             // Ternary operator

             int number = 4;

             String type = ((number%2) == 0) ? "even" : "odd";
             System.out.println(type);
             

             // check if a student pass ya fail
             int marks = 67;

             String Status = (marks >= 40) ? "Pass" : "Fail";
             System.out.println(Status);
             


            // Switch Statement
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            switch (number) {
               case 1 : System.out.println("sunday");   
                         break;
               case 2 : System.out.println("Monday");
                         break;
               case 3 : System.out.println("Tuesday");
                         break;
            
               default : System.out.println("wednesday,thrusday,friday,saturday");
                  break;
            }
                  */


            // Simple Calculator

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A");
            int A = sc.nextInt();
            System.out.println("Enter B ");
            int B = sc.nextInt();
            System.out.println("Enter the choice operator");
            char operator = sc.next().charAt(0);

            switch (operator) {
               case '+': System.out.println(A + B);
                          break;
               case '-' : System.out.println(A-B);
                           break;
               case '*' : System.out.println(A * B);
                           break;
               case '/' : System.out.println(A / B);
                           break;
               case '%' : System.out.println(A % B);
                           break;                                   
               default  : System.out.println("My calculator is not advance");
                  break;
            }
        }
   }


