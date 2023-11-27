package Växter;

abstract class Växt implements VattenBehov {
    /*abstrakt eftersom man enbart kan skapa objekt av olika typer av växter. Denna klass implementerar även vårt interface
    vilket gör att klasser som ärver denna måste implementera metoderna i vårt interface gränssnitt*/
    private String namn; //inkapsling
    private double höjd;
    public Växt(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
    }
    public String getNamn() {
        return namn;
    }
    public double getHöjd() {
        return höjd;
    }
}
/*
Denna abstrakta klass används för att skapa växter med namn och höjd. Med inkapsling för 'namn' och 'höjd' kan
klasser som ärver denna abstrakta klass enbart skapa objekt genom metoderna växt, getNamn samt getHöjd,
samt som den implementerar vårt interface vilket gör att varje objekt
som skapas upp måste implementera metoderna från interface gränssnittet. Om en ny klass inte skapar en kosntruktor
kommer klassen att ärva Växt klassens egna konstruktor.
*/
