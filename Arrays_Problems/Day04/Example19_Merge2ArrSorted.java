package Arrays.exmple_21;

import java.util.Arrays;
import java.util.Scanner;

public class Example19_Merge2ArrSorted {
    public static void main(String[] args) {

        System.out.println("THe 1st array");
        int[] x = readArray();
        dispArray(x);
        System.out.println("The 2nd array");
        int[] y = readArray();
        dispArray(y);
        int[] z = Merge2WithSort(x, y);
        System.out.println("The 3rd array");
        dispArray(z);
    }

     static int[] Merge2WithSort(int[] x, int[] y) {
         int[] new_array = new int[x.length + y.length];
         for(int i = 0 ; i< x.length ; i++){
             new_array[i] = x[i];
         }
         for(int i = 0 ; i< y.length ; i++){
             new_array[y.length + i ] = y[i];
         }
         Arrays.sort(new_array);
         return new_array;
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
