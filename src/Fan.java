/**
 * Created by christopherorlik on 11/27/16.
 * CMSC 1513
 * This program creates a class that defines the object Fan
 */
public class Fan {
    // Create constants
    public static int SLOW = 1;
    public static int MEDIUM = 2;
    public static int FAST = 3;

    // Create data fields
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    // Create accessor and mutators for the methods
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Constructor for a default fan
    public Fan() {
    }

    // Override to create string description based on if the fan is on or off
    @Override
    public String toString() {
        if (on) {
            return "Fan{" +
                    "speed=" + speed +
                    ", on=" + on +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

        }
        else {
            return "fan is off, " + "color = " + color + "," + " radius = " + radius;
        }
    }
    // Prints the description for the default fan called myFan
    public static void main(String[] args) {
        Fan myFan = new Fan();
        System.out.print(myFan);
    }
}
