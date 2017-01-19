package com.jordan.adapter;

import com.jordan.adapter.MoviePlaylist.MoviePlaylistStandard;
import com.jordan.adapter.Strategie.DisplayAllData;
import com.jordan.adapter.Strategie.Strategie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class MovieDisplayApp extends Observable {

    Strategie displayStrategie;
    List<MoviePlaylistStandard> movieStandardList = new ArrayList();

    public MovieDisplayApp() {
        this.displayStrategie = new DisplayAllData();
    }

    public void addPlaylist(final MoviePlaylistStandard moviePlaylistStandard){

        movieStandardList.add(moviePlaylistStandard);

        this.setChanged();
        this.notifyObservers();
    }

    public void setDisplayStrategie(Strategie displayStrategie) {
        this.displayStrategie = displayStrategie;
    }

    public void displayPlaylist(){

        Iterator<MoviePlaylistStandard> ite = movieStandardList.iterator();

        displayStrategie.displayMovie(ite);
    }
}
