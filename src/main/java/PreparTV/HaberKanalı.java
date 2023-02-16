package PreparTV;

public class HaberKanalı extends Kanal{

    private String kanalTür;

    public HaberKanalı(String kanalAdı, int kanalNo, String haberTür) {
        super(kanalAdı, kanalNo);

        this.kanalTür = haberTür;

    }
}
