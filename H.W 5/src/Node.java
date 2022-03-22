/**
 * Created by server on 3/17/2022.
 */
public class Node {
    int data;
    Node next;
    Node (int d)
    {
        this.data=d;
        this.next=null;
    }
    static class LinkedList
    {
        Node start;
        LinkedList()
        {
            start=null;

        }
        public void push(int data)
        {
            if (this.start==null)
            {
                Node temp=new Node(data);
                this.start=temp;
            }
            else
            {
                Node temp=new Node(data);
                temp.next=this.start;
                this.start=temp;
            }
        }
        public int findSecandLastNode(Node ptr)
        {
            Node temp=ptr;
            if (temp==null||temp.next==null)
            return -1;
            while (temp.next.next!=null)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        public static void main(String[] args) {
            LinkedList b=new LinkedList();
            b.push(12);
            b.push(55);
            b.push(99);
            b.push(77);
            b.push(34);
            System.out.println(b.findSecandLastNode(b.start));


        }
    }

}
