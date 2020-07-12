package com.cosef.ctci.linkedlists;

import java.util.HashSet;
import java.util.Set;

public class IQ7 {

    private static Set<Node> nodes = new HashSet<>();

    public static Node solution(Node firstLL, Node secondLL) {
        if (firstLL == null || secondLL == null) {
            return null;
        }

        while (firstLL.next != null) {
            nodes.add(firstLL);
            firstLL = firstLL.next;
        }

        while (secondLL.next != null) {
            if (nodes.contains(secondLL)) {
                return secondLL;
            }
            secondLL = secondLL.next;
        }

        return null;

    }

}
