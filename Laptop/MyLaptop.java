package Laptop;

public class MyLaptop {
    public static void main(String[] args) {
        Laptop laptop=new Laptop();
        System.out.println(laptop);
        Processor p1=new Processor();
        Graphicscard g1=new Graphicscard();
        Laptop l1= new Laptop(15, p1, "6GB", "1TB", g1,"XYZ", "simple");
        System.out.println(l1);
    }
    
}
