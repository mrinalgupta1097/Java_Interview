package com.mrinalgupta.linkedList;

public class LinkedList {
    Node head;

    // method to insert a new node
    public void insert(int data){

        // create a new node
        Node node = new Node();
        node.data = data;
        node.next = null;

        // if the data we are adding is first element
        // head becomes first node
        if(head==null){
            head = node;
        }
        // if the node is not first node
        // then create a temporary node and call it head
        else{
            Node n = head;
            //traverse the linked list and get to the last position
            while(n.next != null){
                n = n.next;
            }
            //at last position set the address of data as temporary node
            n.next = node;
        }
    }

    // method to print the linked list
    public void show(){
        //start from head
        Node node = head;

        //traverse the list as above
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        //the last data will not ber printed as address will be null before that
        //so loop will stop a value before
        System.out.println(node.data);
    }
}
