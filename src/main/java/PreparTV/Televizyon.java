package PreparTV;

import java.util.ArrayList;

public class Televizyon {

    private String marka;
    private String boyut;
    private ArrayList<Kanal> kanallar;
    private boolean TvAcık;

    public Televizyon(String marka, String boyut) {

        this.marka = marka;
        this.boyut = boyut;
        kanallar=new ArrayList<>();
        kanalOluştur();
        this.TvAcık = false;

    }

    private void kanalOluştur() {

        HaberKanalı cnn = new HaberKanalı("cnn", 1, "haber");
        kanallar.add(cnn);
        MusıckKanalı msc = new MusıckKanalı("kral türk", 2, "pop");
        kanallar.add(msc);
        HaberKanalı trt = new HaberKanalı("trt", 3, "siyaset");
        kanallar.add(trt);
        MusıckKanalı numberOne = new MusıckKanalı("numberOne", 4, "yerli");
        kanallar.add(numberOne);
    }


    public void tvAc() {

        if (!TvAcık) {
            TvAcık = true;
            System.out.println("tv açıldı");
        } else {
            System.out.println("tv zaten açık ");
        }
    }

    public void tvKapat() {

        if (TvAcık) {
            TvAcık = false;
            System.out.println("tv kapandı");
        } else {
            System.out.println("tv zaten kapalı ");
        }
    }

        public void setMarka (String marka){
            this.marka = marka;
        }

        public void setBoyut (String boyut){
            this.boyut = boyut;
        }

        public String getMarka () {
            return marka;
        }

        public String getBoyut () {
            return boyut;
        }

}
