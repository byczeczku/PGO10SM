public class Main {
    public static void main(String[] args) {
        try {
            Kontenerowiec statek = new Kontenerowiec("Neptune", 15, 5, 20000);
            KontenerNaPlyny kontenerPlyny = new KontenerNaPlyny(1, 5000, true);
            KontenerNaGaz kontenerGaz = new KontenerNaGaz(2, 4000, 5.0);
            KontenerChlodniczy kontenerChlodniczy = new KontenerChlodniczy(3, 3000, "Bananas", 4.0);

            kontenerPlyny.zaladujLadunek(2000);
            statek.zaladujKontener(kontenerPlyny);
            statek.zaladujKontener(kontenerGaz);
            statek.zaladujKontener(kontenerChlodniczy);

            System.out.println(statek);
            for (Kontener kontener : statek.kontenery)
                System.out.println(kontener);
        } catch (Exception ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }
}