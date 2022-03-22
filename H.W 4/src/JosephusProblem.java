/**
 * Created by server on 3/19/2022.
 */
public class JosephusProblem {
    static int josephus(int n,int k)
    {
        if (n==1)
            return  1;
        else
            return (josephus(n-1,k)+k-1)%n+1;
    }

    public static void main(String[] args) {
        int n=15;
        int k=2;
        System.out.println("the chosen place is");
        System.out.println(josephus(n,k));
    }
}
