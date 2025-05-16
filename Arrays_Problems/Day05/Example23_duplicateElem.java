package Arrays.exmple_21;

import java.util.Scanner;

public class Example23_duplicateElem {
    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("The array elements inputed : ");
        dispArray(x);
        int res[] = dublicateElements(x);
        System.out.println("The duplicate eleemnts are : ");
        dispArray(res);

    }
    public static int[] dublicateElements(int[] x){
        int[] y = new int[x.length];
        int k = 0;
        for(int i = 0; i<x.length ; i++){
            for(int j = i+1 ; j < x.length ; j++){
                if(x[i] == x[j]){
                    y[k++] = x[i];
                }
            }

        }

        int[] res = new int[k];
        for(int i = 0; i< res.length ; i++){
            res[i] = y[i];
            System.out.println(y[i]);
        }

        return  res;
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
