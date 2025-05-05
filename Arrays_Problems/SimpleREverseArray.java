import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemetns");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= a.length-1 ; i++){
            System.out.println("Enter the value of " + i + " number");
            a[i] = sc.nextInt();
            }
        for (int i = a.length-1 ; i >=0 ; i--){
            System.out.print(a[i]);
        }

    }
}