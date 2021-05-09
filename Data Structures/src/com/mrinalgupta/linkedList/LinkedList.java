package com.mrinalgupta.linkedList;

public class LinkedList {
    Node head;



    // method to insert a new element at the end
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
            Node currentNode = head;
            //traverse the linked list and get to the last position
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            //at last position set the address of data as temporary node
            currentNode.next = node;
        }
    }

    // method to add element at the start
    public void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    //method to insert at specified position
    public void insertAtPosition(int position, int data){
        Node newNode = new Node(data);

        Node currentNode = head;
        int index = 0;

        while(index < position-1){
            currentNode = currentNode.next;
            index++;
        }
        //point the new node to next node
        newNode.next = currentNode.next;
        //point the previous node to current node
        currentNode.next = newNode;

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
