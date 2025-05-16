package Arrays.exmple_21;

import java.util.Scanner;

public class Example27_MisssingElems {

    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("The elements inputed are : ");
        dispArray(x);
        findMissedElems(x);

    }

    static void findMissedElems(int[] x) {

        for(int i = 0 ; i < x.length ; i ++){
         int m  = x[i] + 1; int n;
         if(i < x.length - 1) {
              n = x[i + 1];
         } else{
             n = x.length ;
         }

         while (m < n){
             System.out.print(m + " ");

             m++;
         }

        }

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
