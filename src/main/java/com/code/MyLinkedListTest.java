package com.code;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("----------TEST MY LINKED LIST----------");
        // starts list is element 10
        MyLinkedList list = new MyLinkedList(10);
        // use method add()
        list.addFirst(11);
        list.addFirst(12);
        list.printList();
        System.out.println(list.getNumNodes());
    }
}
