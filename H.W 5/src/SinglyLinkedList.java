/**
 * Created by server on 3/17/2022.
 */
public class SinglyLinkedList <E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;
    public SinglyLinkedList()
    {
    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }

    public E first()
    {
        if (isEmpty())return null;
            return head.getElement();
    }
    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addfirst(E element)
    {
        head=new Node<E>(element,head);
        if (isEmpty())
            tail=head;
        size++;
    }
    public void addlast(E element)
    {
        Node<E> newest=new Node<E>(element,null);
        if (size==0)
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;

    }
    public E removefirst()
    {
        if (isEmpty())return null;
        E x=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return x;
    }
    private static class Node<E>
    {
        E element;
        Node<E>next;
        public Node(E element, Node<E>next)
        {
            this.element=element;
            this.next=next;
        }
        public E getElement()
        {
            return element;
        }
        public void setElement(E element)
        {
            this.element=element;
        }
        public Node<E>getNext()
        {
            return next;
        }
        public void setNext(Node<E>next)
        {
            this.next=next;
        }
    }
}
