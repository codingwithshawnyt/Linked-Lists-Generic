/**
 * @(#)sNode.java
 */
//Shawn Ray
//sNode.java
//Period 4
//This file recreates the node functionality from ListNode.java
//but generalized for any data type T.

public class sNode<T> {

    T data;
    sNode<T> next;

    public sNode() {
        this(null, null);
    }

    public sNode(T data) {
        this.data = data;
        this.next = null;
    }

    public sNode(T data, sNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
