package Växter;

class Kaktus extends Växt {
    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }
    @Override
    public double beräknaMängdVätska() {
        return 0.02;
    }
    @Override
    public String getVätskeTyp() {
        return "mineralvatten";
    }
}
