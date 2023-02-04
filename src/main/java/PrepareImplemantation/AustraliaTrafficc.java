package PrepareImplemantation;

public class AustraliaTrafficc implements TraficcRuless{

    public static void main(String[] args) {

        TraficcRuless tr = new AustraliaTrafficc();
        tr.flashYellow();
        tr.greenGo();
        tr.redGo();

    }


    @Override
    public void redGo() {

        System.out.println(" red imple" );

    }

    @Override
    public void greenGo() {

        System.out.println(" green imple" );

    }

    @Override
    public void flashYellow() {

        System.out.println(" yellow imple" );

    }
}
