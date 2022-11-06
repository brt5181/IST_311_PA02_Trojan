package com.company;

public class Node {

    Album album;
    Node next;
    Node previous;

    public Node(Album album) {
        this.album = album;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return album.toString();
    }
}
