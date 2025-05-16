package Arrays.exmple_21;

import java.util.Scanner;

public class Example29_InsertAtIndex {

    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("THe elements inputed : ");
        dispArray(x);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the specific index to insert");
        int index = sc.nextInt();
        System.out.println("Enter the specific element to insert");
        int elem = sc.nextInt();
        int res[] = InsertAtSpecific(x, index, elem);
        System.out.println("The after insertion");
        dispArray(res);
    }

     static int[] InsertAtSpecific(int[] x, int index, int elem) {
        int[] y = new int[x.length + 1];
        y[index] = elem;
        for(int i = 0  ; i < x.length ; i++){
            if(i < index)
                y[i] = x[i];
            else
                y[i + 1] = x[i];
        }
        return  y;
    }

    static void dispArray(int[] arr) {
        System.out.println("The array elemnts are : ");
        for(int i = 0; i < arr.length ; i++){
            System.err.print(arr[i] + " ");
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
