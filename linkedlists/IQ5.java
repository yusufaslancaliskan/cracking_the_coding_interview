package com.cosef.ctci.linkedlists;

public class IQ5 {

    public static Node solution(Node n1, Node n2) {
        if (n1 == null || n2 == null) {
            return n1 == null ? n2 : n1;
        }
        int basamak = 1;
        int sum = 0;
        while (n1 != null) {
            sum += basamak * n1.data;
            basamak *= 10;
            n1 = n1.next;
        }

        basamak = 1;
        while (n2 != null) {
            sum += basamak * n2.data;
            basamak *= 10;
            n2 = n2.next;
        }

        Node sumNode = new Node(sum % 10);
        while (sum / 10 > 0) {
            sum = sum / 10;
            sumNode.addTheTail(sum % 10);
        }

        return sumNode;
    }

}
