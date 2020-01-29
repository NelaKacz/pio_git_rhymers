package edu.kis.vh.nursery.list;

class Node {

    int value;
    Node prev, next;

    Node(int i) {
        value = i;
    }
}

/**
 * Linked List on Int elements
 */
class LinkedIntList {

    /**
     * Reference to last element in the list
     */
    Node last;

    /**
     * Adds a new element on the top of the list
     *
     * @param i - new element value
     */
    public void push(int i) {
        if (last == null) {
            last = new Node(i);
        } else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Checks if the linked list is full
     *
     * @return boolean - if full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Gets the last element of the linked list
     *
     * @return element value
     */
    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return last.value;
    }

    /**
     * Deletes the last element from the linked list
     *
     * @return last element value
     */
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int ret = last.value;
        last = last.prev;
        return ret;
    }

    /**
     * Checks if the linked list is empty
     *
     * @return boolean - if empty
     */
    private boolean isEmpty() {
        return last == null;
    }
}
