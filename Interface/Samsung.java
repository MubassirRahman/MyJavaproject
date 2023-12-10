package Interface;

public class Samsung implements Phone,Android{

    @Override
    public String processor() {
        return "SD1000";
    }

    @Override
    public int spaceingb() {
        return 256;
    }

    @Override
    public String Airdrop() {
        return "Copy and paste in Android";
    }
    

    
}
