import java.util.ArrayList;
import java.util.List;

class Kontenerowiec {
    private String nazwa;
    private double maksymalnaPredkosc;
    private int maksymalnaLiczbaKontenerow;
    private double maksymalnaWaga;
    public List<Kontener> kontenery;

    public Kontenerowiec(String nazwa, double predkosc, int maksKontenery, double maksWaga) {
        this.nazwa = nazwa;
        this.maksymalnaPredkosc = predkosc;
        this.maksymalnaLiczbaKontenerow = maksKontenery;
        this.maksymalnaWaga = maksWaga;
        this.kontenery = new ArrayList<>();
    }

    public void zaladujKontener(Kontener kontener) throws Exception {
        if (kontenery.size() >= maksymalnaLiczbaKontenerow || pobierzCalkowitaWage() + kontener.maksymalnaLadownosc > maksymalnaWaga)
            throw new Exception("Nie można dodać więcej kontenerów; przekroczono pojemność statku!");
        kontenery.add(kontener);
    }

    public double pobierzCalkowitaWage() {
        double calkowitaWaga = 0;
        for (Kontener kontener : kontenery)
            calkowitaWaga += kontener.maksymalnaLadownosc;
        return calkowitaWaga;
    }

    @Override
    public String toString() {
        return "Statek: " + nazwa + " | Prędkość: " + maksymalnaPredkosc + " węzły | Kontenery: " + kontenery.size() + "/" + maksymalnaLiczbaKontenerow;
    }
}