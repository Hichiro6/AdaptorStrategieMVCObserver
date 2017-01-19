package com.jordan.adapter.MoviePlaylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class MovieFromTarantino {

    List<Movie> listMovie = new ArrayList<>();

    public MovieFromTarantino() {
        this.listMovie.add(new Movie("Title1", "Tarantino", 150));
        this.listMovie.add(new Movie("Title2", "Tarantino", 200));
        this.listMovie.add(new Movie("Title3", "Tarantino", 160));
        this.listMovie.add(new Movie("Title4", "Tarantino", 150));
    }

    public void afficher() {
        System.out.println("Movie from Tarantino");
        Iterator<Movie> ite = listMovie.iterator();

        while (ite.hasNext()) {
            Movie m = ite.next();
            System.out.println(m.toString());
        }
    }

    public void afficherNom() {
        System.out.println("Movie from Tarantino");
        Iterator<Movie> ite = listMovie.iterator();

        while (ite.hasNext()) {
            Movie m = ite.next();
            System.out.println(m.getNom());
        }
    }
}