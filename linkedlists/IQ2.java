package com.cosef.ctci.linkedlists;

public class IQ2 {
    public static Node solution(Node head, int k) {
        if (head == null) {
            return null;
        }
        int index = 0;
        Node runner = head;
        Node follower = head;
        while (index < k - 1) {
            if(runner.next == null){
                break;
            }
            runner = runner.next;
            index++;
        }
        follower = head;

        while (runner.next != null) {
            follower = follower.next;
            runner = runner.next;
        }
        return follower;
    }

}
