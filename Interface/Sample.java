package Interface;

public class Sample {
    public static void main(String[] args) {
        Samsung p1=new Samsung();
        String s=p1.processor();
        int g=p1.spaceingb();
        System.out.println(s);
        System.out.println(g);

        Iphone p2=new Iphone();
         s=p2.processor();
         g=p2.spaceingb();
        System.out.println(s);
        System.out.println(g);

        //Multiple Inheritance is achived by interface in java.
        Iphone phone=new Iphone();
        System.out.println(phone.Airdrop());

        Samsung sa1=new Samsung();
        System.out.println(sa1.Airdrop());
        
    }
    
}
