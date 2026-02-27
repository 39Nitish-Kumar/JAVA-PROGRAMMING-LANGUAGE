public class pattern_2 {

    // print hollow rectangle
    /* 
    public static void hollow_rectangle(int totRows, int totCols) {
        // outer loop
        for(int i = 1; i<=totRows; i++) {
            // inner-colums
            for(int j = 1; j<=totCols; j++) {
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");                   
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
    */

    // print inverted & rotated half pyramid

    /* 
    public static void inverted_rotated_half_pyramid(int n){
        // outer
        for(int i = 1; i<=n; i++){
           // spaces
           for(int j = 1; j<=n-i; j++){
            System.out.print(" " );
           }

           // stars
           for(int j = 1; j<=i; j++){
            System.out.print("*");
           }

           System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(7);
    }
    */

    // print inverted half-pyramid with numbers

    /* 

    public static void inverted_half_pyramid_withNumbers(int n){
        // outer
        for(int i =1; i<=n; i++) {

            // inner
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid_withNumbers(5);
    }
    */


    // print floyd's triangle

    /* 

    public static void floyd_triangle(int n){
        // outer
        int counter = 1;
        for(int i = 1; i<=n; i++){
            // inner-how many times will counter printed
            for(int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }  
    }

    public static void main(String[] args) {
        floyd_triangle(5);
    }
    */

    // print zero-one triangle

    /* 

    public static void zero_one_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        zero_one_triangle(5);
    }
    */

    // print butterfly pattern
    /* 

    public static void butterfly(int n){
        // 1st half solve
        // outer
        for(int i = 1; i<=n; i++){
            // inner
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half solve
        // outer loop
        
        for(int i = n; i>=1; i--){
            // inner loop
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            // spaces
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterfly(4);
    }
    */

    // print solid rhombus

    /* 

    public static void solid_rhombus(int n) {
        // outer loop
        for(int i = 1; i<=n; i++){
            // inner loop
            // spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
             System.out.println();
        }
    }
    public static void main(String[] args) {
        solid_rhombus(5);
    }
    */

    // print hollow rhombus

    /* 

    public static void hollow_rhombus(int n){
        // outer loop
        for(int i = 1; i<=n; i++){
            // inner loop
            // spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // hollow rectangle
            for(int j = 1; j<=n; j++){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rhombus(5);
    }
    */

    // print diamond pattern

    public static void diamond(int n){
        // 1st half solve
        // outer loop
        for(int i = 1; i<=n; i++){
            // inner loop
            // spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half solve
        // outer loop
        for(int i = n; i>=1; i--){
            // inner loop
            // spaces
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // stars
            for(int j = 1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
