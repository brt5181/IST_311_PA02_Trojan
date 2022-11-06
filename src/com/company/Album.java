package com.company;

import java.util.ArrayList;

public class Album implements Comparable<Album> {

    private int numericalID;
    private ArrayList<String> artistNames;
    private String title;
    protected int numberOfSongs;

    public Album(int numericalID, ArrayList<String> artistNames, String title, int numberOfSongs) {
        this.numericalID = numericalID;
        this.artistNames = artistNames;
        this.title = title;
        this.numberOfSongs = numberOfSongs;
    }

    @Override
    public String toString() {
        return numericalID + ": " + numberOfSongs + " -- " + artistNames;
    }

    @Override
    public int compareTo(Album o) {

        if (this.numberOfSongs == o.numberOfSongs) {
            return  0;
        }

        if (this.numberOfSongs < o.numberOfSongs) {
            return -1;
        }
        else {
            return 1;
        }


    }
}
