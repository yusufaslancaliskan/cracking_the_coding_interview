package com.cosef.ctci.linkedlists;

import java.util.Stack;

public class IQ6 {

    public static boolean solution(Node node) {
        if (node == null) {
            return false;
        }

        int size = 1;
        Node temp = node;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }

        if (size % 2 == 0)
            return false;

        Stack<Integer> nodes = new Stack<>();
        for (int i = 0; i < size; i++) {
            if (i < size / 2) {
                nodes.push(node.data);
            } else if (i > size / 2) {
                if(nodes.pop() != node.data){
                    return false;
                }
            }
            node = node.next;
        }

        return true;

    }

}
