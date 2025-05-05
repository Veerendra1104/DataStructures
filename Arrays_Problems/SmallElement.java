
public class SmallElement {
    public static void main(String[] args) {
        int[] a = {20,30, 40,50, 10};
        int big_elem = SmallElem(a);
        System.out.println("The smallest element in the given array is " + big_elem);
    }

    public static int SmallElem(int[] a ){
        int small= Integer.MAX_VALUE;
        for(int i= 0; i < a.length ; i++){
            if(a[i] < small)
                small = a[i];
        }
        return small;
    }
}
