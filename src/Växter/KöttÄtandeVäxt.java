package Växter;

class KöttÄtandeVäxt extends Växt {
    public KöttÄtandeVäxt(String namn, double höjd) {
        super(namn, höjd);
    }
    @Override
    public double beräknaMängdVätska() {
        return 0.1 + (0.2 * getHöjd());
    }
    @Override
    public String getVätskeTyp() {
        return "proteindryck";
    }
}
