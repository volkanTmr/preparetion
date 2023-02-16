package PreparTV;


import java.util.Scanner;

public class PrepOopTvSim {

    static Scanner scn = new Scanner(System.in);
    static Televizyon tv;



    public static void main(String[] args) {

        menüGoster();
        boolean çıkış = false;

        while (!çıkış) {

            System.out.println("Seçiminizi tuşlayınız ");
            int seçim = scn.nextInt();

            switch (seçim) {
                case 1:
                    tvKurveOluştur();
                    break;
                case 2:
                    tvAç();
                case 3:
                    sesAc();
                case 7:
                    tvKapat2();
                case 8:
                    menüGoster();
                    break;
                case 0:
                    System.out.println("sistemden çıkılıyor");
                    çıkış = true;
                default:
                    System.out.println("0 ile 8 arası bir rakam giriniz ");
                    break;
            }
        }
    }

    private static void sesAc() {

        System.out.println("ses açıldı");

       // if(tv.tvAc())
    }

    private static void tvAç() {

        if(tv!=null){
            tv.tvAc();

        }else{
            System.out.println("önce tv kur,kanal ayarla");
        }
    }

    private static  void tvKapat2() {

        if (tv != null) {
            tv.tvKapat();

        } else {
            System.out.println("önce tv kur ve kanalları oluştur ");
        }
    }

    private static void tvKurveOluştur() {

        if (tv == null) {
            scn.nextLine();
            System.out.println(" TV nin markasını giriniz ");
            String marka = scn.nextLine();
            System.out.println(" TV nin boyutunu giriniz ");
            String boyut = scn.nextLine();
            tv = new Televizyon(marka, boyut);
            System.out.println(tv);
        }else
        {
            System.out.println(tv);
        }

    }

    private static void menüGoster() {

        System.out.println("******MENU*******");
        System.out.println("0  --  Çıkış\n" +
                "1  --  TV Kur \n" +
                "2  --  TV Aç \n" +
                "3  --  Volume UP \n" +
                "4  --  Volume Down \n" +
                "5  --  Kanal DEğiştir \n" +
                "6  --  Kanal Bilgisini Göster \n" +
                "7  --  TV kapat \n");
    }
}
