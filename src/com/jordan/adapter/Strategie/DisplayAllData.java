package com.jordan.adapter.Strategie;

import com.jordan.adapter.MoviePlaylist.MoviePlaylistStandard;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class DisplayAllData implements Strategie {

    @Override
    public void displayMovie(Iterator<MoviePlaylistStandard> iterator) {

        while(iterator.hasNext()){
            MoviePlaylistStandard mov = iterator.next();
            mov.display();
            System.out.println();
        }
    }
}
