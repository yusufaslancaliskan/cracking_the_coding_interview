package com.cosef.ctci.linkedlists;

public class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public void addTheTail(int data) {
        Node nextOne = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = nextOne;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

}
