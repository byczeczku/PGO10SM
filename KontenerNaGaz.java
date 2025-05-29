class KontenerNaGaz extends Kontener implements PowiadomienieONiebezpieczenstwie
{
    private double cisnienie;

    public KontenerNaGaz( int id, double maksLadownosc, double cisnienie)
    {
        super( "G", id, maksLadownosc);
        this.cisnienie = cisnienie;
    }

    @Override
    public void rozladuj()
    {
        this.obecnyLadunek *= 0.05;
    }

    @Override
    public void powiadomONiebezpieczenstwie( String numerSeryjny)
    {
        System.out.println( "Uwaga! Ryzyko w kontenerze gazowym " + numerSeryjny);
    }
}