public class Myproject{
    public static void main(String[] args) {
        Car car= new Car("Closed","Seated",10);
        
        /*car.setDoors("Closed");
        car.setDriver("Seated");
        car.setSpeed(10);
        car.setEngine("off");*/
        System.out.println(car.run());
    }
}