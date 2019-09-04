package main.java.classes.inner;

public class Inner {
    public static void main(String... args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Radio radio = vehicle.new Radio();
        Vehicle.SteeringWheel wheel = vehicle.new SteeringWheel();

        radio.turnOn();
        wheel.setDirection(1.0f);

        System.out.println(radio.getStatus());
        System.out.println(wheel.getDirection());
    }
}

class Vehicle {
    class Radio {
        private boolean on;
        public void turnOn() {
            this.on = true;
        }

        public void turnOff() {
            this.on = false;
        }

        public boolean getStatus() {
            return this.on;
        }
    }

    class SteeringWheel {
        private float direction;

        public void setDirection(float d) {
            direction = d;
        }

        public float getDirection() {
            return direction;
        }
    }
}
