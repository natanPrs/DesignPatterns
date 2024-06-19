package main.facade;

import main.subsystem.Amplifier;
import main.subsystem.Projector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import main.subsystem.DVDPlayer;

@Component
public class HomeTheaterFacade {

    private final DVDPlayer dvdPlayer;
    private final Amplifier amplifier;
    private final Projector projector;

    @Autowired
    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.off();
        amplifier.off();
        projector.off();
    }
}
