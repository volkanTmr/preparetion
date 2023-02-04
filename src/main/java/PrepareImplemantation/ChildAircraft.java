package PrepareImplemantation;

public class ChildAircraft extends ParentAirCraft {

    public static void main(String[] args) {

        ChildAircraft cac = new ChildAircraft();
        cac.engine();
        cac.safetGuide();
        cac.color();

    }

    @Override
    public void color() {

        System.out.println(" blue color good");

    }
}
