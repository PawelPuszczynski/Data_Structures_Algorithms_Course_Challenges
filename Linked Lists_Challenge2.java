package com.company;

public class IntegerLinkedList2 {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    // MY SOLUTION*******************************************************************
    public void insertSorted(Integer value) {
        IntegerNode newNode = new IntegerNode(value);

        if (head == null) {
            System.out.println("Setting head to : " + newNode.getValue());
            head = newNode;
            return;
        }
        IntegerNode currentNode = head;
        System.out.println("New iteration with : " + value);

            if (value <= currentNode.getValue()) {

                if (currentNode == head) {
                    head = newNode;
                    newNode.setNext(currentNode);
                }
                newNode.setNext(currentNode);
                size++;

            } else {
                while (currentNode.getNext() != null && value > currentNode.getValue()) {
                    System.out.println(" +1 at " + currentNode.getValue());
                    currentNode = currentNode.getNext();

                }
                if (value >currentNode.getValue()){
                    currentNode.setNext(newNode);
                }
                else  {

                    int tempVal = currentNode.getValue();

                    currentNode.setValue(newNode.getValue());
                    newNode.setValue(tempVal);
                    currentNode.setNext(newNode);
                    size++;
                }
            }
       }
//*****************************************************************************
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
package com.company;


public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public IntegerNode getNext() {
        return next;
    }

    public void setNext(IntegerNode next) {
        this.next = next;
    }

    public String toString() {
        return value.toString();
    }

}
package com.company;

public class Main {

    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList2 list = new IntegerLinkedList2();
        list.insertSorted(four);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(one);
        list.printList();
        list.insertSorted(three);
        list.printList();

    }
}
