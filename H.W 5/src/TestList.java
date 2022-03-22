import java.util.Scanner;

/**
 * Created by server on 3/17/2022.
 */
public class TestList {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("1-add first \n 2-add last \n 3-remove first \n 0-exit");
        int choice = -1;
        while (choice != 0) {
            System.out.println("your choice");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter number");
                    list.addfirst(in.nextInt());
                    System.out.println("first number=" + list.first() + "\t last number" + "" + list.last() + "\t size=" + list.size());
                    break;
                case 2:
                    System.out.println("enter a number");
                    list.addlast(in.nextInt());
                    System.out.println("first=" + list.first() + "\t last=" + list.last() + "\t size=" + list.size());
                    break;
                case 3:
                    System.out.println("remove first" + list.removefirst());
                    System.out.println("first=" + list.first() + "\t last=" + list.last() + "\t size=" + list.size());
                    break;
                case 4:
                    System.exit(0);
                    break;
            }

        }
    }
}
