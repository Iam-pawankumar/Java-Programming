package Bikes;

public class Bike {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0)
            this.speed = speed;
    }

    public void increaseSpeed(int speed) {
        setSpeed(this.speed + speed);
    }

    public void decreaseSpeed(int speed) {
        setSpeed(this.speed - speed);
    }
}
