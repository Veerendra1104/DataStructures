package Arrays.exmple_21;

import java.util.Scanner;

public class Example26_MisssingElem {
    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("The elements inputed are : ");
        dispArray(x);
        int res = findMissedElem(x);
        System.out.println("Missing element is : " + res);
    }

     static int findMissedElem(int[] x) {
        int n = x.length + 1;
        int sum = n * ( n + 1 ) / 2 ;
         System.out.println(sum);
        for(int i = 0 ; i < x.length ; i ++){
            sum = sum - x[i];

        }
       return sum;

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
