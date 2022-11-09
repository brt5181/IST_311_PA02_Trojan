package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void testAppend() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);

        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");

        Album a1 = new Album(1, artistNames, "album 1", 1);
        assertEquals(1, dll.append(a1).album.numberOfSongs);

        Album a2 = new Album(2, artistNames, "album 2", 2);
        assertEquals(2, dll.append(a2).album.numberOfSongs);

        Album a3 = new Album(3, artistNames, "album 3", 3);
        assertEquals(3, dll.append(a3).album.numberOfSongs);

        assertEquals(1, dll.head.album.numberOfSongs);

        assertEquals("1 -> 2 -> 3 -> NULL", dll.toString());

    }


    @Test
    void testGetIndex() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);

        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");

        Album a1 = new Album(1, artistNames, "album 1", 1);
        assertEquals(1, dll.append(a1).album.numberOfSongs);

        Album a2 = new Album(12, artistNames, "album 2", 2);
        assertEquals(2, dll.append(a2).album.numberOfSongs);

        Album a3 = new Album(3, artistNames, "album 3", 3);
        assertEquals(3, dll.append(a3).album.numberOfSongs);

        Album a4 = null;
        int index = dll.getIndex(a3);
        assertEquals(3, index);

        int index2 = dll.getIndex(a1);
       // assertEquals(-1, index2);




    }


    @Test
    void testDelete() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);

        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");

        Album a1 = new Album(1, artistNames, "album 1", 1);
        assertEquals(1, dll.append(a1).album.numberOfSongs);

        Album a2 = new Album(2, artistNames, "album 2", 2);
        assertEquals(2, dll.append(a2).album.numberOfSongs);

        Album a3 = new Album(3, artistNames, "album 3", 3);
        assertEquals(3, dll.append(a3).album.numberOfSongs);

        dll.delete(3);
        assertEquals("1 -> 2 -> NULL", dll.toString());
        //this shows delete at location is correct
        dll.delete(1);
        dll.delete(1);
        //the line below will throw illegal argument exception
        //dll.delete(1);



    }


    @Test
    void testInsert() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);

        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");
        Album a1 = new Album(1, artistNames, "album 1", 1);
        assertEquals(1, dll.append(a1).album.numberOfSongs);

        Album a2 = new Album(2, artistNames, "album 2", 2);
        assertEquals(2, dll.append(a2).album.numberOfSongs);

        Album a3 = new Album(3, artistNames, "album 3", 3);
        assertEquals(3, dll.append(a3).album.numberOfSongs);

        Album a4 = new Album(6, artistNames, "album 5", 6);
        Album a5 = new Album(9, artistNames, "album 5", 7);
        dll.insert(2, a4);
        System.out.println(dll.toString());
        dll.insert(3, a5);
        System.out.println(dll.toString());



    }


    @Test
    void testShuffle() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);

        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");
        Album a1 = new Album(1, artistNames, "album 1", 1);
        assertEquals(1, dll.append(a1).album.numberOfSongs);

        Album a2 = new Album(2, artistNames, "album 2", 2);
        assertEquals(2, dll.append(a2).album.numberOfSongs);

        Album a3 = new Album(3, artistNames, "album 3", 3);
        assertEquals(3, dll.append(a3).album.numberOfSongs);
        dll.shuffle();
        assertEquals("NULL", dll.toString());

    }


    @Test
    void testPartition() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);
        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");
        Album a1 = new Album(1, artistNames, "album 1", 1);
        assertEquals(1, dll.append(a1).album.numberOfSongs);

        Album a2 = new Album(2, artistNames, "album 2", 2);
        assertEquals(2, dll.append(a2).album.numberOfSongs);

        Album a3 = new Album(3, artistNames, "album 3", 3);
        assertEquals(3, dll.append(a3).album.numberOfSongs);
        assertEquals("1 -> 2 -> 3 -> NULL", dll.toString());
        dll = dll.partition(a2);
        assertEquals("2 -> 3 -> NULL", dll.toString());


    }

    @Test
    void testtoString() {
        DoublyLinkedList<Album> dll = new DoublyLinkedList<>();
        assertNull(dll.head);
        assertNull(dll.tail);

        ArrayList<String> artistNames = new ArrayList<>();
        artistNames.add("Artist 1");
        artistNames.add("Artist 2");
        Album a1 = new Album(1, artistNames, "album 1", 1);
        assertEquals(1, dll.append(a1).album.numberOfSongs);

        Album a2 = new Album(2, artistNames, "album 2", 2);
        assertEquals(2, dll.append(a2).album.numberOfSongs);

        Album a3 = new Album(3, artistNames, "album 3", 3);
        assertEquals(3, dll.append(a3).album.numberOfSongs);

        assertEquals("1 -> 2 -> 3 -> NULL", dll.toString());

    }

}