package com.jordan.adapter;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class Vue implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        MovieDisplayApp m = (MovieDisplayApp) o;
        m.displayPlaylist();
    }
}
