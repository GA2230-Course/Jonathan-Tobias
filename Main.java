import java.awt.Color;

import LedsSim.LedSim;

public class Main {
    public static void main(String[] args) {
        // Initialize the LED simulation with a row layout
        LedSim ledSim = LedSim.getRowsSim(100);

        LedController control = new LedController(ledSim);
        SolidAnimation solid = new SolidAnimation(Color.RED);
        control.setAnimation(solid);
        while (true) {
            control.periodic();
        }
        // Apply the changes to the simulation

    }
}
