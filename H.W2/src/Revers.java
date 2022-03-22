/**
 * Created by server on 3/19/2022.
 */
public class Revers {
    public static void main(String[] args) {
        int arr[]=new int[]{4,5,6,7,};
        // System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("array in reverse order");

        for (int i =arr.length-1; i>= 0 ; i--) {
            System.out.println(arr[i]);


        }
    }
}
