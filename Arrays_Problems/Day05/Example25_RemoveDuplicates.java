package Arrays.exmple_21;

import java.util.Scanner;

public class Example25_RemoveDuplicates {


    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("The given array : ");
        dispArray(x);
        int[] res = removeDuplicates(x);
        System.out.println("th elements after removed  :");
        dispArray(res);
    }

     static int[] removeDuplicates(int[] x) {
        boolean[] res = new boolean[x.length];
        int cnt = 0;
        for(int i = 0 ; i < x.length; i++){
            if(res[i] == false){
                for(int j = i+ 1 ; j< x.length ; j++){
                    if(x[i] == x[j]){
                        cnt++;
                        res[i] = true;
                    }
                }
            }
        }

        int[] y = new int[x.length - cnt];
        int k = 0;
        for(int i = 0; i < x.length ; i++){
            if(res[i] == false){
                y[k++] = x[i];
            }
        }
        return  y;
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
