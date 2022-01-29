package edu.kis.vh.nursery.list;

/**
 * IntLinkedList is implementation of linked list
 * @see <a href="https://en.wikipedia.org/wiki/Linked_list">...</a>
 *
 * Atributes:
 *  EMPTY - used as return value in certain cases
 *  last - object of class Node
 *  @see Node
 */
public class IntLinkedList {

    private static final int EMPTY = -1;
    private Node last;
    private int i;

    /**
     * Method used to push new object of class Node into the linked list
     *
     * @param i value for new node pushed into linked list
     * @see Node
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.setNext(new Node(i));
            last.getNext().setPrev(last);
            last = last.getNext();
        }
    }

    /**
     * Method used for describing if linked list is empty or not
     *
     * @return boolean value describing if list is empty
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Method used for describing if linked list is full or not
     *
     * @return boolean value describing if list is full
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Method used for returning last element in linked list
     *
     * if list is empty:
     * @return -1
     *
     * if list is not empty:
     * @return object of class Node which is on top of linked list
     * @see Node
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.getValue();
    }

    /**
     * Method used for deleting last element from linked list
     *
     * if list is empty:
     * @return -1
     *
     * if list is not empty:
     * @return value of deleted node
     * @see Node
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.getValue();
        last = last.getPrev();
        return ret;
    }

    private class Node {

        private int value;
        private Node prev;
        private Node next;

        public Node(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
