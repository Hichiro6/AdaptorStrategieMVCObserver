package com.jordan.adapter.MoviePlaylist;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class Movie {

    String nom;
    String realisateur;
    int duree;

    public Movie(String nom, String realisateur, int duree) {
        this.nom = nom;
        this.realisateur = realisateur;
        this.duree = duree;
    }

    public String getNom() {
        return nom;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public int getDuree() {
        return duree;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "nom='" + nom + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", duree=" + duree +
                '}';
    }
}
