package Bikes;

public class BikeRunner {
    public static void main(String args[]){
        Bike pulsar = new Bike();
        Bike yamaha = new Bike();

        System.out.println("Pulsar speed: " + pulsar.getSpeed());
        System.out.println("Yamaha Speed: " + yamaha.getSpeed());

        pulsar.setSpeed(100);
        yamaha.setSpeed(150);

        System.out.println("Pulsar speed set: " + pulsar.getSpeed());
        System.out.println("Yamaha Speed set: " + yamaha.getSpeed());

        pulsar.decreaseSpeed(50);
        yamaha.decreaseSpeed(50);

        System.out.println("decreaseSpeed of Pulsar : " + pulsar.getSpeed());
        System.out.println("decreaseSpeed of Speed: " + yamaha.getSpeed());

        pulsar.increaseSpeed(100);
        yamaha.increaseSpeed(150);

        System.out.println("increaseSpeed of Pulsar: " + pulsar.getSpeed());
        System.out.println("increaseSpeed of Yamaha: " + yamaha.getSpeed());
    }
}
