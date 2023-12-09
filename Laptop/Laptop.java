package Laptop;

public class Laptop {
    private int screen;
    private Processor processor;
    private String ram;
    private String harddisk;
    private Graphicscard graphicscard;
    private String opticalDrive;
    private String keyboards;
    public Laptop() {
        this.screen = 15;
        this.processor = new Processor();
        this.ram = "5GB";
        this.harddisk = "500GB";
        this.graphicscard = new Graphicscard();
        this.opticalDrive = "ABC";
        this.keyboards = "Simple";
    }
    public Laptop(int screen, Processor processor, String ram, String harddisk, Graphicscard graphicscard,
            String opticalDrive, String keyboards) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.harddisk = harddisk;
        this.graphicscard = graphicscard;
        this.opticalDrive = opticalDrive;
        this.keyboards = keyboards;
    }
    
    @Override
    public String toString() {
        return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", harddisk=" + harddisk
                + ", graphicscard=" + graphicscard + ", opticalDrive=" + opticalDrive + ", keyboards=" + keyboards
                + "]";
    }
    public int getScreen() {
        return screen;
    }
    public Processor getProcessor() {
        return processor;
    }
    public String getRam() {
        return ram;
    }
    public String getHarddisk() {
        return harddisk;
    }
    public Graphicscard getGraphicscard() {
        return graphicscard;
    }
    public String getOpticalDrive() {
        return opticalDrive;
    }
    public String getKeyboards() {
        return keyboards;
    }

   
    
    
    


    
}
