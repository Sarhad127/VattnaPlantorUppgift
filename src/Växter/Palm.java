package Växter;

class Palm extends Växt {
    /* Skapar upp en växttyp som ärver från abstrakta klassen 'Växt' och
    implementerar metoderna från vårt interface 'Vattenbehov' */
    public Palm(String namn, double höjd) {
        super(namn, höjd); //'super' kallar på konstruktorn i vår 'Växt' klass
    }
    @Override
    public double beräknaMängdVätska() {
        return 0.5 * getHöjd();
    }
    @Override
    public String getVätskeTyp() {
        return "kranvatten";
    }
}
    /* Metoderna som implementeras från vårt interface gränssnitt initeras i varje växt typ klass och skapar upp
    mängden vätska och vätsketyp för varje typ av växt. Här används polymorfism. För varje objekt som skapas
    skapas även dess egna mängd vätska och vätske typ.*/
