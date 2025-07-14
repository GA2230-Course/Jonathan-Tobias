import LedsSim.LedStrip;

public class LedController {
    private LedStrip strip;
    private AnimationBase currentAnimation;

    public LedController(LedStrip strip) {
        this.strip = strip;
    }

    public void periodic() {
        if (!currentAnimation.isOver()) {
            currentAnimation.periodic();
            this.strip.apply();
        }
    }

    public void setAnimation(AnimationBase animation) {
        this.currentAnimation = animation;
        currentAnimation.setStrip(this.strip);
        currentAnimation.init();
        this.strip.apply();
    }
}
