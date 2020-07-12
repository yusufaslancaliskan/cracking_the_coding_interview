package com.cosef.ctci.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class IQ8 {

    private static Set<Node> nodes = new HashSet<>();

    public static Node solution(Node node) {
        if (node == null) {
            return null;
        }

        while (node.next != null) {
            if (!nodes.contains(node)) {
                nodes.add(node);
            } else {
                return node;
            }
            node = node.next;
        }

        return null;

    }

}
