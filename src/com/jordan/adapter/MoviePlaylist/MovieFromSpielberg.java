package com.jordan.adapter.MoviePlaylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class MovieFromSpielberg implements MoviePlaylistStandard {

    List<Movie> listMovie = new ArrayList<>();

    public MovieFromSpielberg() {
        this.listMovie.add(new Movie("Title1","Spielberg",150));
        this.listMovie.add(new Movie("Title2","Spielberg",200));
        this.listMovie.add(new Movie("Title3","Spielberg",160));
        this.listMovie.add(new Movie("Title4","Spielberg",150));
    }

    @Override
    public void display() {
        System.out.println("Movie from Spielberg");

        Iterator<Movie> ite = listMovie.iterator();

        while(ite.hasNext()){
            Movie m = ite.next();
            System.out.println(m.toString());
        }
    }

    @Override
    public void displayOnlyTitle() {
        System.out.println("Movie from Spielberg");

        Iterator<Movie> ite = listMovie.iterator();

        while(ite.hasNext()){
            Movie m = ite.next();
            System.out.println(m.getNom());
        }
    }
}
