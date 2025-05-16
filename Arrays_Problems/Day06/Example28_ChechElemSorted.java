package Arrays.exmple_21;

import java.util.Scanner;

public class Example28_ChechElemSorted {

    public static void main(String[] args) {
        int[] x = readArray();
        boolean res = isSorted(x);
        if(res)
            System.out.println("The given array is in sorted");
        else
            System.out.println("The given array is not sorted");
    }

     static boolean isSorted(int[] x) {
        int small = x[0];
        for (int i = 1 ; i < x.length ; i ++){
            if(x[i] > small){
                small = x[i];

            }else {
                return false;
            }
        }
        return  true;
    }

    static void dispArray(int[] arr) {
        System.out.println("The array elemnts are : ");
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
