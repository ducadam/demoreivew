package bt;
import java.util.*;
class Node {
    int info;
    Node next;
	public int data;

    Node(int x) {
        info = x;
        next = null;
    }
}

public class ss {
    Node head, tail;

    ss() {
        head = tail = null;
    }

    boolean EmptyQ() {
        return head == null;
    }

    void AddQ(int x) {
        Node t = new Node(x);
        if (head == null)
            head = tail = t;
        else {
            tail.next = t;
            tail = t;
        }
    }

    int RemoveQ() {
    	int x = 0;

        if (head == null)
            System.out.println("\n Hang doi rong");
        else {
            x = head.data;

            if (head.next == null)
                head = tail = null;
            else
                head = head.next;
        }

        return x;
    }

	public static void main(String[] args) {
		ss Q = new ss();

        Q.AddQ(3); Q.AddQ(2); Q.AddQ(7);
        Q.AddQ(6); Q.AddQ(9); Q.AddQ(8);

        while (!Q.EmptyQ()) {
            int x = Q.RemoveQ();
            System.out.print(x + " ");
        }

        System.out.print("\nXONG!");

	}

}
