package Arrays.exmple_21;

import java.util.Scanner;

public class Example21_PairSumTarget {
    public static void main(String[] args) {
        int[] x  = readArray();
        System.out.println("The entered elements are : ");
        dispArray(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target required");
        int target = sc.nextInt();
        PrintPairTarget(x, target);

    }

     static void PrintPairTarget(int[] x, int target) {
        for(int i = 0 ; i < x.length ; i++){
            for(int j = i+1 ; j < x.length - 1 ; j++){
                if(x[i] + x[j] == target){
                    System.out.println("{ " + x[i] + " , " + x[j] + " }");
                    break;
                }
            }
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
