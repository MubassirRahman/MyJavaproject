package Laptop;

public class Processor {
    private String Brand;
    private int series;
    private String generation;
    private String frequency;
    public Processor() {
        this.Brand ="Qualcomm";
        this.series = 1100;
        this.generation = "7th";
        this.frequency = "5GHZ";
    }
    public Processor(String brand, int series, String generation, String frequency) {
        this.Brand = brand;
        this.series = series;
        this.generation = generation;
        this.frequency = frequency;
    }
    @Override
    public String toString() {
        return "Processor [Brand=" + Brand + ", series=" + series + ", generation=" + generation + ", frequency="
                + frequency + "]";
    }
    
    
    
}
