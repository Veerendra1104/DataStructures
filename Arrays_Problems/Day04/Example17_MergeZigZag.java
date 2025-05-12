package Arrays.exmple_21;

import java.util.Scanner;

public class Example17_MergeZigZag {
    public static void main(String[] args) {

        int[] array_1 = readArray();
        int[] array_2 = readArray();

        int[] merger_array = ZigZag(array_1, array_2);

        System.out.println("Array 1 : ");
        dispArray(array_1);

        System.out.println("Array 2 : ");
        dispArray(array_2);

        System.out.println("ZigZaged Array : ");
        dispArray(merger_array);

    }

    static int[] ZigZag(int[] array1, int[] array2) {
        int i = 0, j = 0, k =0 ;
        int[] new_array = new int[array1.length + array2.length];
        while(i < array1.length && j < array2.length){
            new_array[k++] = array1[i++];
            new_array[k++] = array2[j++];

        }
        while (i < array1.length){
            new_array[k++] = array1[i++];
        }
        while (j < array2.length){
            new_array[k++] = array2[j++];
        }

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
