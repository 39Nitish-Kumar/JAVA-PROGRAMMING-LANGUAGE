public class function_overloading {

    /* 
    // func to calculate of sum 2 numbers
    public static int sum (int a , int b){
        return a + b;
    }

    // func to calc sum of 3 numbers
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(5,2,1));
    }

    */

    // func to calc int sum
    public static int sum (int a , int b ) {
        return a + b;
    }

    // func to calc float sum
    public static float sum (float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,3));
        System.out.println(sum(3.2f,4.8f));
    }
}
