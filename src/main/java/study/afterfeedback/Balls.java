package study.afterfeedback;

/**
 * @author jhkim
 * @since 2022-09-03
 */
public class Balls {
    private int number;
    private int location;

    public Balls(int number, int location) {
        this.number = number;
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public int getLocation() {
        return location;
    }

    public Status play(Balls balls) {
        if(balls.getNumber() == number) {
            if(balls.getLocation() == location) {
                return Status.STRIKE;
            }
            return Status.BALL;
        }
        return Status.NOTHING;
    }
}
