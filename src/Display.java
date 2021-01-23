public class Display {
    public static void main(String[] args) {
       int [] f = {54,32, 56, 86,31, 100, 29, 45};
        System.out.printf("Element 6:  %d", f[5]);
        System.out.println();

        int g []  = new int [5];
        for(int index = 0; index < g.length; index++) {
            g[index] = 8;
        System.out.printf("element %d:  %d%n", index, g[index]);
        }

        System.out.println();
        System.out.println();

        double total = 0;
        float [] c = new float[101];
        for(int index = 1; index < c.length; index++) {
            c[index] = index ;
            System.out.printf("%.1f  ",  c[index]);
            total += index;
            if(index % 10 == 0 ) {
                System.out.println();
            }
        }
        System.out.printf("Total: %.1f", total);
        System.out.println();
        System.out.println();

        /*(d) Copy 11-element array a into the first portion of array b, which contains 34 elements.
          (e) Determine and display the smallest and largest values contained in 99-element floating point
        array w */

        float smallest = Float.MAX_VALUE;
        float largest = Float.MIN_VALUE;
        float [] q = new float[100];
        for(int index = 0; index < c.length; index++) {
            c[index] = index;
            if(c[index] > largest ) {
                largest = c[index];
            }

            if(c[index] <  smallest) {
                smallest= c[index];
            }
        }
        System.out.printf("Smallest: %.1f%nLargest: %.1f", smallest, largest);
    }
}
