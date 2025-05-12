package Arrays.exmple_21;

import java.util.Scanner;

public class Example18_RevArr {
    public static void main(String[] args) {
        int[] arr = readArray();

        System.out.println("The array inputed");
        dispArray(arr);
        reverse(arr);
        System.out.println("The reversed array ");
        dispArray(arr);

    }

     static void reverse(int[] arr) {

        for(int i=0; i < arr.length/2  ; i++){
            int tem = arr[i];
            arr[i] = arr[arr.length - 1- i];
            arr[arr.length - 1 - i] = tem ;
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
