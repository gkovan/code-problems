/**
 * 
 */
package com.example.demos.test.java.linkedlistset;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class MyLinkedListSet {

    private int size = 0;
    private Node headOfList = null;

    public MyLinkedListSet() {

    }

    public int size() {
        return size;
    }

    public boolean contains(int value) {
        boolean result = false;
        Node node = headOfList;
        while (node != null) {
            if (node.value == value) {
                result = true;
                break;
            }
            node = node.nextElement;
        }
        return result;
    }

    public boolean add(int value) {
        boolean result = false;
        if (contains(value)) {
            return result;
        }

        if (headOfList == null) {
            headOfList = new Node(value);
            result = true;
            size++;
            return result;
        }

        Node node = headOfList;
        Node prevNode = null;
        while (node != null) {
            prevNode = node;
            node = node.nextElement;
        }
        node = new Node(value);
        prevNode.nextElement = node;
        result = true;
        size++;
        return result;

    }

    public boolean delete(int value) {
        boolean result = false;

        Node node = headOfList;
        Node prevNode = null;
        while (node != null) {
            prevNode = node;
            if (node.value == value) {
                prevNode.nextElement = node.nextElement;
                size--;
                result = true;
                break;
            }
            node = node.nextElement;
        }
        return result;
    }

    private class Node {
        Node nextElement = null;
        int value;

        public Node(int _value) {
            this.value = _value;
        }
    }
}
