// StackLinkedList File
package com.keyin.Stacks;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class StackLinkedList {
    Node top;

    public StackLinkedList() {
        this.top = null;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Push method
    public void push(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("The value " + value + " is successfully inserted");
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int value = top.value;
            top = top.next;
            System.out.println("The value " + value + " is successfully removed");
            return value;
        }
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return top.value;
        }
    }

    // Delete stack method
    public void deleteStack() {
        top = null;
        System.out.println("The stack is successfully deleted");
    }

    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        System.out.println("Peek: " + stackLinkedList.peek());
        stackLinkedList.pop();
        System.out.println("Peek after pop: " + stackLinkedList.peek());
        stackLinkedList.deleteStack();
    }
}