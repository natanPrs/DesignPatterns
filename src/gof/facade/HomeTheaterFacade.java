package gof.facade;

import gof.facade.Amplifier;
import gof.facade.DVDPlayer;
import gof.facade.Projector;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        projector.on();
        projector.wideScreen();
        amplifier.on();
        amplifier.setVolume(4);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        amplifier.off();
        projector.off();
        dvdPlayer.off();
    }
}
