package com.cosef.ctci.linkedlists;

import java.util.HashMap;
import java.util.HashSet;

public class IQ1 {

    private static HashSet<Integer> linkedData;

    public static Node solution(Node head) {
        if (head == null) {
            return null;
        }
        linkedData = new HashSet<>();
        linkedData.add(head.data);
        removeDups(head);
        return head;
    }

    private static void removeDups(Node node) {
        if (node.next != null) {
            if (!linkedData.contains(node.next.data)) {
                linkedData.add(node.next.data);
                removeDups(node.next);
            } else {
                if (node.next != null) {
                    node.next = node.next.next;
                    removeDups(node);
                } else {
                    node.next = null;
                }
            }
        }
    }
}
