package com.krunal;

public class Node<T> {
    int data;
    Node<T> left;
    Node<T> right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
