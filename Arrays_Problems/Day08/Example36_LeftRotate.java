package Arrays.exmple_21;

import java.util.Scanner;

public class Example36_LeftRotate {
    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("The entered array is : ");
        dispArray(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rotations required");
        int n = sc.nextInt();
        LeftRotate(x, n-1);
        dispArray(x);
    }

     static void LeftRotate(int[] x, int n) {
         n = n % x.length;
         while (n >= 0){
             int first = x[0];
             for(int i = 1; i < x.length ; i++){
                 x[i-1] = x[i];

             }
             x[x.length-1 ] = first;
             n--;
         }

    }

    static void dispArray(int[] arr) {
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] general = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i < n ; i++){
            general[i] = sc.nextInt();
        }
        return  general;
    }
}
