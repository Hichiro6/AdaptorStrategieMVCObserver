package com.jordan.adapter;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class Controller {

    MovieDisplayApp movieDisplayApp;
    Vue vue;

    public Controller(Observable movieDisplayApp, Observer vue) {

        movieDisplayApp.addObserver(vue);

        this.movieDisplayApp = (MovieDisplayApp) movieDisplayApp;
        this.vue = (Vue) vue;
    }
}
