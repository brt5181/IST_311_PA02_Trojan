package com.company;


public class DoublyLinkedList <T extends Comparable<T>> {

    protected Node head;
    protected Node tail;


    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }


    public Node append(Album album) {

        //create a new node
        Node toAppend = new Node(album);

        //check if list is empty
        if (head == null) {
            head = toAppend;
            tail = toAppend;
        }

        //if list length is one or more than one
        else {
            toAppend.previous = tail;
            tail.next = toAppend;
            tail = tail.next;
        }


        //return node
        return toAppend;
    }


    public Node delete(int location) throws IllegalArgumentException{

    }


    public int getIndex(Album album) {


    }


    public Node insert(int location, Album album) throws IllegalArgumentException{


    }


    public Node shuffle() {


    }


    public DoublyLinkedList<Album> partition(Album album) {


    }


    @Override
    public String toString() {

        // get a current pointer
        Node toPrint = this.head;

        // get a string builder
        StringBuilder stringBuilder = new StringBuilder();

        // loop through all the nodes
        while (toPrint != null) {

            // append the content of the string to the builder
            stringBuilder.append(toPrint.album.numberOfSongs);
            stringBuilder.append(" -> ");

            // advance the pointer
            toPrint = toPrint.next;
        }

        // append null
        stringBuilder.append("NULL");

        // return the result
        return stringBuilder.toString();
    }
}
