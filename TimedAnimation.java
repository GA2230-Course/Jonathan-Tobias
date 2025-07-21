import Utils.StopWatch;

public class TimedAnimation extends AnimationBase {
    private AnimationBase currentAnimation;
    private StopWatch timer;
    private double time;

    public TimedAnimation(AnimationBase currentAnimation, double time){
        this.currentAnimation = currentAnimation;
        this.timer = new StopWatch();
        this.time = time;
    }
    public void init(){
        timer.start();
    }
    public void periodic(){
        currentAnimation.periodic();
    }
    public boolean isOver(){
        if(timer.get() >= time){
            return true;
        }
        return false;
    }
}
