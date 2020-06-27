package com.cosef.ctci;

import com.cosef.ctci.linkedlists.IQ6;
import com.cosef.ctci.linkedlists.Node;

public class Main {

    public static void main(String[] args) {
        Node node1 = new Node(7);
        node1.addTheTail(1);
        node1.addTheTail(3);
        node1.addTheTail(6);
        node1.addTheTail(3);
        node1.addTheTail(1);
        node1.addTheTail(7);

        System.out.println(IQ6.solution(node1));
    }
}
