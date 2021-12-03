package com.sparta.mvc.model;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TreeSort implements Sorter {

    @Override
    public int[] sort(int[] arr) {

        BST bst = new BST(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            bst.insert(bst.node, arr[i]);
        }
        int arr2[] = new int[arr.length];
        bst.inOrder(bst.node, arr2);
        return arr2;
    }

    @Override
    public <T extends Comparable> List<T> sort(List<T> list) {
//        //everything T except for loop
//        BST bst2 = new BST(list.get(0));
//        for (int i = 1; i < list.size(); i++) {
//            bst2.insert(bst2.node, list.get(i));
//        }
//        int arr2[] = new int[list.size()];
//        bst2.inOrder(bst2.node, arr2);
//        return arr2;
        return null;
    }

    // Class for tree nodes
    class Node {
        int value;
        Node left;
        Node right;
        int counter = 1;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    // Class for Binary Search Tree
    class BST {
        Node node;

        BST(int value) {
            node = new Node(value);
        }

        public Node insert(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }
            // Move to left for value less than parent node
            if (value < node.value) {
                node.left = insert(node.left, value);
            }

            else if (value == node.value){
                node.counter += 1;
            }
            // Move to right for value greater than parent node
            else if (value > node.value) {
                node.right = insert(node.right, value);
            }
            return node;
        }

        public void inOrder(Node node, int[] arr){
            Stack<Node> stack = new Stack<>();
            int n = -1;
            while (!stack.isEmpty() || node != null ){
                if(node != null){
                    stack.push(node);
                    node = node.left;
                } else{
                    Node insert = stack.pop();
                    for(int i = 0; i < insert.counter; i++){
                        arr[n += 1] = insert.value;
                    }
                    node = insert.right;
                }
            }
        }

        public <T extends Comparable> void inOrder(Node node, List<T> list){
//            Stack<Node> stack2 = new Stack<>();
//            int n = -1;
//            while (!stack2.isEmpty() || node != null ){
//                if(node != null){
//                    stack2.push(node);
//                    node = node.left;
//                } else{
//                    Node insert = stack2.pop();
//                    for(int i = 0; i < insert.counter; i++){
//                        list.set(list.ge) = insert.value;
////                        arr[n += 1] = insert.value;
//                    }
//                    node = insert.right;
//                }
//            }
        }


    }
}
