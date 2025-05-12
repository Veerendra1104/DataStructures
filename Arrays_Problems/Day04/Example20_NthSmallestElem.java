package Arrays.exmple_21;

import java.util.Scanner;

public class Example20_NthSmallestElem {
    public static void main(String[] args) {
        int[] x = readArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reuired th smallest element");
        int n = sc.nextInt();
        int res = smallElement(x, n);
        if(res > 0){
            System.out.println("The " + n + "smallest element is :" + res);
        }else {
            System.out.println("Jolly Jolly");
        }
    }

     static int smallElement(int[] x, int n) {

        for(int i = 0; i < x.length ; i++){
            int count = 0;
            for (int j = 0 ; j < x.length ; j++){
                if(x[i]  < x[j]){
                    count++;
                }

            }
            if(count == n-1)
                return x[i];
        }
        return -1;
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
