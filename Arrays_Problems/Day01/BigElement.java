
public class BigElement {
    public static void main(String[] args) {
        int[] a = {10, 20,30, 40,50};
        int big_elem = BigElem(a);
        System.out.println("The biggest element in the given array is " + big_elem);
    }

    public static int BigElem(int[] a ){
        int big=0;
        for(int i= 0; i < a.length ; i++){
            if(a[i] > big)
                big = a[i];
        }
        return big;
    }
}
