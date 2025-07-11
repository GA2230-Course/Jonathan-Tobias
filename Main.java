import java.awt.Color;

import LedsSim.LedSim;

public class Main {
    public static void main(String[] args) {
        // Initialize the LED simulation with a row layout
        LedSim ledSim = LedSim.getRowsSim(100);

        SolidAnimation solid = new SolidAnimation(Color.black);
        solid.setStrip(ledSim);
        solid.init();
        ledSim.apply();
        while (true) {
            solid.periodic();
            ledSim.apply();
        }
        // Apply the changes to the simulation

    }
}
