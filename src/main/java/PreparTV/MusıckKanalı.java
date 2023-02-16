package PreparTV;

public class MusıckKanalı extends Kanal{

    private String müzikTürü;

    public MusıckKanalı(String kanalAdı, int kanalNo, String müzikTür) {

        super(kanalAdı, kanalNo);
        this.müzikTürü= müzikTür;
    }
}
