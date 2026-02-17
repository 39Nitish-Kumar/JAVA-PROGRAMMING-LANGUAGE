import java.util.*;
public class conditional_assignment {
   public static void main(String[] args) {
    // Q.1.

    /* 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = sc.nextInt();
    if (number >= 0) {
        System.out.println("positive");  
    } else {
        System.out.println("Negative");
    }

    // Q.2.
 
    Scanner sc = new Scanner(System.in);
    float temp = sc.nextFloat();

    if (100.0f <= temp) {
     System.out.println("fever");   
    }
     else {
        System.out.println("not fever");
     }
        
     // Q.3.
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter week number(1-7)");
     int number = sc.nextInt();

     switch (number) {
        case 1: System.out.println("Sunday");
                 break;
        case 2: System.out.println("Monday");
                 break;
        case 3: System.out.println("Tuesday");
                 break;          
        case 4: System.out.println("Wednesday");
                 break;
        case 5: System.out.println("thursday");
                 break;
        case 6: System.out.println("friday");
                 break;
        case 7: System.out.println("saturday");
                 break;                                        
        default: System.out.println("Not name");
            break;
     }
     

     // Q.4.
     int a=63,b=36;
     boolean x= (a<b)?true:false;
     int y= (a>b)?a:b;
     System.out.println(y);
     System.out.println(x);

     */

     // Q.5.
     Scanner sc = new Scanner(System.in);
     System.out.print("Input the year: ");
     int year=sc.nextInt();
     boolean x= (year%4) ==0;
     boolean y= (year%100) !=0;
     boolean z= ((year%100==0) && (year%400==0));
     if(x&& (y||z)) {
        System.out.println(year+" is a leap year");
     }else{
        System.out.println(year+" is not a leapyear");}
   } 
}
