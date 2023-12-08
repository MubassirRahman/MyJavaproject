package Laptop;

public class Graphicscard {
   private String brand;
   private String series;
   private String memory;
   public Graphicscard() {
    this.brand = "NIvedia";
    this.series = "11th";
    this.memory = "2GB";
}
public Graphicscard(String brand, String series, String memory) {
    this.brand = brand;
    this.series = series;
    this.memory = memory;
}
@Override
public String toString() {
    return "Graphicscard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
}

   

    
}
