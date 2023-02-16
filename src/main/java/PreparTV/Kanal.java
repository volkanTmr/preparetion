package PreparTV;

public class Kanal {

    String kanalAdı;
    int kanalNo;

    public Kanal(String kanalAdı, int kanalNo) {

        this.kanalAdı = kanalAdı;
        this.kanalNo = kanalNo;
    }

    public String getKanalAdı() {
        return kanalAdı;
    }

    public void setKanalAdı(String kanalAdı) {
        this.kanalAdı = kanalAdı;
    }

    public int getKanalNo() {
        return kanalNo;
    }

    public void setKanalNo(int kanalNo) {
        this.kanalNo = kanalNo;
    }
}
