/**
 * Created by server on 3/19/2022.
 */
public class ArrayQueue extends LinkedQueue {
    public static void main(String[] args) {
        String[] a={"a","b","c","e","f"};
        LinkedQueue c=new LinkedQueue();
        for (int i = 0; i <a.length ; i++) {
            c.enqueue(a[i]);
            
        }
        while (c.size()>1)
        {
            for (int i = 0; i <2 ; i++)
                c.rotate();

            System.out.println(c.dequeue()+"is out");
        }
        System.out.println("is winner"+c.dequeue());
    }
}
