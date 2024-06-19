package main.subsystem;
import org.springframework.stereotype.Component;

@Component
public class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void wideScreenMode() {
        System.out.println("Setting projector to wide screen mode");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}
