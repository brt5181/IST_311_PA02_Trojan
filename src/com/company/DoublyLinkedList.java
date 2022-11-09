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

    public Node deleteNode(Node del){
        if (head == null || del == null){
            return null;
        }
        if (head == del){
            head = del.next;
        }
        if (del.next != null){
            del.next.previous = del.previous;
        }
        if (del.previous != null){
            del.previous.next = del.next;
        }
        del = null;
        return head;
    }

    public Node delete(int location) throws IllegalArgumentException{


            Node toDelete = head;
            int i;

            for (i = 1; toDelete != null && i < location; i++){
                toDelete = toDelete.next;

            }

            if (toDelete == null) {throw new IllegalArgumentException("Location not found");}

            deleteNode(toDelete);
            return toDelete;

    }


   public int getIndex(Album album) {

       //Return the position of the node having the value of given data.
       int index = 1;
       if(this.head == null){
           index = 0;
           System.out.println("Empty List");
       }
       else{
           Node tempNode = this.head;
           while (tempNode != null) {
               if (tempNode.album.compareTo(album)==0)
                   return index;
               else{
                   tempNode = tempNode.next;
                   index++;
               }
           }
       }
       return -1;


    }


   public Node insert(int location, Album album) throws IllegalArgumentException{//Insert new node with data at given position and update the linked list.
       Node insertNode = new Node(album);
       if(this.head==null) {
           if (location>1 ) System.out.println("Inserting in an Empty List");
           this.head = insertNode;
       }
       else{
           //Insert new Node at given position in a nonempty list.
           int pos = 1;
           Node tempNode = this.head;
           while((pos < (location-1)) && (tempNode.next!=null)){
               tempNode = tempNode.next;
               pos++;
           }
           insertNode.next = tempNode.next;
           tempNode.next = insertNode;
       }
       return insertNode;

   }


   public Node shuffle() {


    }


   // public DoublyLinkedList<Album> partition(Album album) {


   // }


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
