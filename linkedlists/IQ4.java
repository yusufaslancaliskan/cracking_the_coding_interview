package com.cosef.ctci.linkedlists;

public class IQ4 {

    public static Node solution(Node node, int partition) {
        if (node == null) {
            return null;
        }

        Node head = node;
        Node tail = node;

        while (node != null) {
            Node nextOne = node.next;
            if (node.data < partition) {
               node.next = head;
               head = node;
            }else {
                tail.next = node;
                tail = node;
            }
            node = nextOne;
        }
        tail.next = null;

        return head;
    }

}
