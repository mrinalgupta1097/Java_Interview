package com.mrinalgupta.linkedList;

public class Insertion {
    Node head;

    public void insertAtFront(int data){
        //.... 3 step process....
        // step 1: create a new node to hold the data
        Node new_node = new Node(data);

        //step 2: make the new_node point to a node that is head
        new_node.next = head;

        //step 3: new_node will now be head linking to older head
        new_node = head;
    }
}
