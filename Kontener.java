abstract class Kontener
{
    protected String numerSeryjny;
    protected double maksymalnaLadownosc;
    protected double obecnyLadunek;

    protected Kontener( String przedrostekNumeru, int unikalnyId, double maksLadownosc)
    {
        this.numerSeryjny = "KON-" + przedrostekNumeru + "-" + unikalnyId;
        this.maksymalnaLadownosc = maksLadownosc;
    }

    public void zaladujLadunek( double waga) throws Przepelnienie, Przepelnienie
    {
        if ( waga > maksymalnaLadownosc)
            throw new Przepelnienie( "Błąd przepełnienia w kontenerze " + numerSeryjny);
        this.obecnyLadunek = waga;
    }

    public void rozladuj()
    {
        this.obecnyLadunek = 0;
    }

    @Override
    public String toString()
    {
        return numerSeryjny + " | Ładunek: " + obecnyLadunek + "/" + maksymalnaLadownosc + " kg";
    }
}