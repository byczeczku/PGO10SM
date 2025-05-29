class KontenerChlodniczy extends Kontener
{
    private String rodzajProduktu;
    private double wymaganaTemperatura;

    public KontenerChlodniczy( int id, double maksLadownosc, String produkt, double temperatura)
    {
        super( "C", id, maksLadownosc);
        this.rodzajProduktu = produkt;
        this.wymaganaTemperatura = temperatura;
    }

    @Override
    public String toString()
    {
        return super.toString() + " | Produkt: " + rodzajProduktu + " | Temp: " + wymaganaTemperatura + "°C";
    }
}