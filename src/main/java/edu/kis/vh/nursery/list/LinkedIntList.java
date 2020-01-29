package edu.kis.vh.nursery.list;

class Node {

    int value;
    Node prev, next;

    Node(int i) {
        value = i;
    }
}

class LinkedIntList {

    Node last;

    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return last.value;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    private boolean isEmpty() {
        return last == null;
    }
}
