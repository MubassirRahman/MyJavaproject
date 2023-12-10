package Interface;

public class Iphone implements Phone,IOS {

    @Override
    public String processor() {
        return "A51";
    }

    @Override
    public int spaceingb() {
        return 256;
    }

    @Override
    public String Airdrop() {
       return "Copy and paste in Iphone";
    }

    
}
