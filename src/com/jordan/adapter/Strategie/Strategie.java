package com.jordan.adapter.Strategie;

import com.jordan.adapter.MoviePlaylist.MoviePlaylistStandard;
import java.util.Iterator;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public interface Strategie {

    void displayMovie(Iterator<MoviePlaylistStandard> iterator);

}
