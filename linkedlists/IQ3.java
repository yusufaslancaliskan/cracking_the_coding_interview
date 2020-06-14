package com.cosef.ctci.linkedlists;

public class IQ3 {

    public static boolean solution(Node n) {
        if (n == null || n.next == null) {
            return false;
        }
        n.data = n.next.data;
        n.next = n.next.next;

        return true;
    }

}
