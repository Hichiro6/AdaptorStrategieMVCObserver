package com.jordan.adapter.Strategie;

import com.jordan.adapter.MoviePlaylist.MoviePlaylistStandard;

import java.util.Iterator;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class DisplayOnlyName implements Strategie {

    @Override
    public void displayMovie(Iterator<MoviePlaylistStandard> iterator) {

        while(iterator.hasNext()){
            MoviePlaylistStandard mov = iterator.next();
            mov.displayOnlyTitle();
            System.out.println();
        }
    }
}
