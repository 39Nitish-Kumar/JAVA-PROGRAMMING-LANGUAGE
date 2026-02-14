import java.util.*;
public class assignment {
 public static void main(String[] args) {
    // Q.1.
    /* 
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int average = (A + B + C) / 3;
    System.out.println("average is :" + average);
    */

    // Q.2.
    /* 
    Scanner sc = new Scanner(System.in);
    int side = sc.nextInt();
    int area = (side * side);
    System.out.println("area of the square is : " + area);
    */

    // Q.3.
    /* 
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float    pen = sc.nextFloat();
    float erraser = sc.nextFloat();
    float total =  pencil + pen + erraser;
    System.out.println("Bill is: " + total);

    // add on with 18% tax
    float newtotal = total + (0.18f * total);

    System.out.println("Bill with 18% tax : " + newtotal);
 */
   // Q.4.

   byte b = 4;
   char c = 'a';
   short s = 512;
   int i = 1000;
   float f = 3.14f;
    double d = 99.9954;
 double result  = (f * b) + (i % c) - (d * s);
   System.out.println(d);
   
 }   
}
