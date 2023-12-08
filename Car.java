public class Car extends vehicle {
    private String driver;
    private String name;
    private String doors;
    private int speed;
   /*  public Car(){
        doors="Closed";
        engine="off";
        speed=0;
        driver="away";
    }*/
    public Car(String doors,String driver ,int speed)
    {
        this.doors=doors;
        this.driver=driver;
        this.speed=speed;
        
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setDoors(String doors) {
        this.doors = doors;
    }
    public String getDoors() {
        return doors;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    public String getDriver() {
        return driver;
    }
    public String run(){
        
       return "Running Bike"+super.run();
    }
}
