package org.example.linkedlist;

public class LL {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void LL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(10);
        list.addFirst(2);
        list.display();
    }

}
