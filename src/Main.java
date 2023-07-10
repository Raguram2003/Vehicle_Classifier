class Vehicle
{
    String vehicle="vehicle";
    void start()
    {
        System.out.println( vehicle +" started");
    }
    void stop()
    {
        System.out.println( vehicle +" stopped");
    }
}
class Car extends Vehicle{
    Car(String vehicle){
        super.vehicle = vehicle;
    }

}
class MotorCycle extends Vehicle{
    MotorCycle(String vehicle){
        super.vehicle = vehicle;
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("car");
        car.start();
        car.stop();

        MotorCycle motorCycle = new MotorCycle("MotorCycle");
        motorCycle.start();
        motorCycle.stop();

        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.stop();


    }
}
