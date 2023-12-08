public class vehicle {
    private String engine;
    private int wheel;
    private int seat;
    private String light;

    public vehicle()
    {
        engine="Petrol";
        wheel=2;
        seat=2;
        light="LED";
    }
    public String getEngine() {
        return engine;
    }
    public String getLight() {
        return light;
    }
    public int getSeat() {
        return seat;
    }
    public int getWheel() {
        return wheel;
    }
    public String run(){
        return "Running vehicle";
    }
    
}
