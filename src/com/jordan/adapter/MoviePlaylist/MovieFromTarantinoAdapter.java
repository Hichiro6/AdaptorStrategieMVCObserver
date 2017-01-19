package com.jordan.adapter.MoviePlaylist;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class MovieFromTarantinoAdapter extends MovieFromTarantino implements MoviePlaylistStandard {

    @Override
    public void display() {
        this.afficher();
    }

    @Override
    public void displayOnlyTitle() {
        this.afficherNom();
    }


}
