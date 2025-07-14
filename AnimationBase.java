
import LedsSim.LedStrip;

public abstract class AnimationBase {
    protected LedStrip strip;

    public void setStrip(LedStrip strip) {
        this.strip = strip;
    }
    
    public abstract void init();

    public abstract void periodic();

    public abstract boolean isOver();
}
