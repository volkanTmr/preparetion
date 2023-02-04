package PrepareImplemantation;

public abstract class ParentAirCraft {

    // abstract class da private kullanamazsın

    public void engine(){

        System.out.println(" follow engine guide");
    }

    public void safetGuide(){

        System.out.println(" keep safety rules");
    }

    public void audioSystem(){

        System.out.println(" parent audio system ");
    }

    public abstract void color();
}
