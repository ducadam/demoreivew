package bt;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class MyQueue {
    Node head, tail;

    boolean EmptyQ() {
        return head == null;
    }

    // ===== AddQ =====
    void AddQ(int x) {
        Node t = new Node(x);

        if (head == null)
            head = tail = t;
        else {
            tail.next = t;
            tail = t;
        }
    }

    // ===== RemoveQ =====
    int RemoveQ() {
        int x = 0;

        if (head == null)
            System.out.println("\nHang doi rong");
        else {
            x = head.data;

            if (head.next == null)
                head = tail = null;
            else
                head = head.next;
        }
        return x;
    }

    // ===== Nhap =====
    void nhap() {
        int x;
        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap 1 so <> 0 de them vao HD: ");
            x = kb.nextInt();

            if (x == 0) break;

            AddQ(x);
        }
        System.out.println("\nDa them xong");
    }

    // ===== In (không phá queue) =====
    void in() {
        MyQueue t = new MyQueue();

        System.out.println("\nNoi dung hang doi:");

        while (!EmptyQ()) {
            int x = RemoveQ();
            System.out.print(x + " ");
            t.AddQ(x);
        }

        while (!t.EmptyQ()) {
            int x = t.RemoveQ();
            AddQ(x);
        }
    }

    // ===== Main =====
    public static void main(String[] args) {
        MyQueue Q = new MyQueue();

        Q.nhap();
        Q.in();

        System.out.println("\nXONG!");
    }
}

	
