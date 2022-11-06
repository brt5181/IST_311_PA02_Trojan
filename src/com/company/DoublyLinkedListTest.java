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


    }


    @Test
    void testDelete() {


    }


    @Test
    void testInsert() {



    }


    @Test
    void testShuffle() {

    }


    @Test
    void testPartition() {



    }

    @Test
    void testtoString() {


    }

}