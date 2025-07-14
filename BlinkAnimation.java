import java.awt.Color;
import Utils.StopWatch;

public class BlinkAnimation extends AnimationBase {
    private Color color;
    private double interval;
    private StopWatch clock;

    public BlinkAnimation(Color color) {
        this.color = color;
        this.clock = new StopWatch();
        this.interval = 2.0;
    }

    public void init() {
        this.clock.start();
    }

    public void periodic() {
        if ((int) clock.get() % 2 == 0) {
            this.strip.setAll(color);
        }
        else {
            this.strip.setAll(Color.black);
        }
    }
}
