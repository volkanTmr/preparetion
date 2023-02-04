package PrepInheritance;

public class ChildClass extends ParentInherit{

    String colour= "blue" ;

    public ChildClass(){
        // super kodun constructor da kullanılışı
        super();
        System.out.println(" l am childClass Constructor ");
    }

    public void engine(){

        System.out.println(" new generation engine ");
    }


    // override
    @Override
    public void audioSystem() {
        // aynı isindeki metot ama biz parent geçerli olsun istiyoruz
        super.audioSystem();
        System.out.println(" new system audio ");
    }

    /*public void audioSystem() {

        System.out.println(" new system audio ");

    }*/


    public void colour(){

        // aynı isimde variable ama biz parentın ki geçerli olsun istiyoruz

        System.out.println(super.colour);
        System.out.println(colour);
    }


    public static void main(String[] args) {

        ChildClass cc= new ChildClass();
        cc.colour();
        cc.breaks();
        cc.audioSystem();

    }
}
