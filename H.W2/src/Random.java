import java.util.Arrays;

/**
 * Created by server on 3/17/2022.
 */
public class Random {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rem(a)));
    }

    public static int[] rem(int[] x) {
        Random r = new Random();
        int index = r.nextInt(x.length - 1);
        System.out.println(index);
        for (int i = 0; i < x.length; i++) {
            if (index <= i) {
                x[i] = -1;
            }
        }
        return x;
    }
}

