package PreparTV;

public class EncapsMain {

    public static void main(String[] args) {

        EncapsBook bookFirst=new EncapsBook("Nutuk",200,"M.K.Ataturk","Inkılap Kitabevi");
       // bookFirst.showBookData();
        System.out.println(bookFirst.publisher); // publisher public old ulaşabiliom ama name private ulaşamam

    }

}
