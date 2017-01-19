package com.jordan.adapter;

import com.jordan.adapter.MoviePlaylist.MovieFromSpielberg;
import com.jordan.adapter.MoviePlaylist.MovieFromTarantino;
import com.jordan.adapter.MoviePlaylist.MovieFromTarantinoAdapter;
import com.jordan.adapter.Strategie.DisplayOnlyName;

public class Main {

    public static void main(String[] args) {

        MovieDisplayApp movieDisplayApp = new MovieDisplayApp();
        Vue vue = new Vue();
        Controller controller = new Controller(movieDisplayApp,vue);



        MovieFromTarantino movieFromTarantino = new MovieFromTarantino();
        MovieFromSpielberg movieFromSpielberg = new MovieFromSpielberg();

        movieDisplayApp.addPlaylist(movieFromSpielberg);
        //movieDisplayApp.addPlaylist(movieFromTarantino);
        movieDisplayApp.setDisplayStrategie(new DisplayOnlyName());

        MovieFromTarantinoAdapter movieFromTarantinoAdapter = new MovieFromTarantinoAdapter();
        movieDisplayApp.addPlaylist(movieFromTarantinoAdapter);

        //movieDisplayApp.displayPlaylist();
    }
}
