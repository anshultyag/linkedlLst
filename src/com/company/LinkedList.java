package com.company;

public class LinkedList {
    Node head;

    //Node Class
    class Node {
         int data;
         Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Add Data at head
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print() {
        Node currNode = head;
        while (currNode.next != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

}