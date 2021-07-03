package com.krunal;

import java.util.Scanner;

public class BinarySearchTree<T> {
    Node<T> root;
    int size = 0;

    public BinarySearchTree() {
        this.root = null;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BST Program !!!");

        boolean flag = true;
        while (flag) {

            System.out.println("\n1.To insert new node\n2.To display BST\n3.To get size of BST\n4.To exit");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    bst.insertNewNode(56);
                    bst.insertNewNode(30);
                    bst.insertNewNode(70);
                    bst.insertNewNode(22);
                    bst.insertNewNode(40);
                    bst.insertNewNode(11);
                    bst.insertNewNode(3);
                    bst.insertNewNode(16);
                    bst.insertNewNode(60);
                    bst.insertNewNode(95);
                    bst.insertNewNode(65);
                    bst.insertNewNode(63);
                    bst.insertNewNode(67);
                    break;

                case 2:
                    bst.inorderTraversal(bst.root);
                    break;

                case 3:
                    int sizeOfBST = bst.getSize();
                    System.out.println("Size is : "+sizeOfBST);
                    break;

                case 4:
                    System.out.println("\nExited !!!");
                    flag = false;
                    break;

                default:
                    System.out.println("Enter Valid Input");
                    break;

            }

        }

    }

    /**
     * Purpose : To add newNode to BST
     *
     * @param data input from user
     */
    public void insertNewNode(int data) {

        // create new Node
        Node<T> newNode = new Node<>(data);

        // Check if BST is empty or not
        if (root == null) {

            root = newNode;
            size ++;
            return;

        } else {

            Node<T> current = root, parent = null;
            while (true) {

                //parent keep track of the parent node of current node.
                parent = current;

                //If data is less than current's data, node will be inserted to the left of tree
                if (data < current.data) {

                    current = current.left;

                    if (current == null) {

                        parent.left = newNode;
                        size++;
                        return;

                    }
                }

                //If data is greater than current's data, node will be inserted to the right of tree
                else {

                    current = current.right;

                    if (current == null) {

                        parent.right = newNode;
                        size++;
                        return;

                    }

                }
            }

        }
    }

    /**
     * Purpose : inorderTraversal() will perform inorder traversal on binary search tree
     *           and print data of bst
     *
     * @param node
     */
    public void inorderTraversal(Node<T> node) {

        //Check whether tree is empty
        if (root == null) {

            System.out.println("Tree is empty");
            return;

        } else {

            if (node.left != null)
                inorderTraversal(node.left);

            System.out.print(node.data + " ");

            if (node.right != null)
                inorderTraversal(node.right);


        }
    }
}
