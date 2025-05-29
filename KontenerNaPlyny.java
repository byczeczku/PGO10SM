class KontenerNaPlyny extends Kontener implements PowiadomienieONiebezpieczenstwie {
    private boolean jestNiebezpieczny;

    public KontenerNaPlyny(int id, double maksLadownosc, boolean niebezpieczny) {
        super("L", id, maksLadownosc);
        this.jestNiebezpieczny = niebezpieczny;
    }

    @Override
    public void zaladujLadunek(double waga) throws Przepelnienie {
        double limit = jestNiebezpieczny ? maksymalnaLadownosc * 0.5 : maksymalnaLadownosc * 0.9;
        if (waga > limit) {
            powiadomONiebezpieczenstwie(numerSeryjny);
            throw new Przepelnienie("Przekroczono limit niebezpiecznego ładunku w " + numerSeryjny);
        }
        super.zaladujLadunek(waga);
    }

    @Override
    public void powiadomONiebezpieczenstwie(String numerSeryjny) {
        System.out.println("Alarm! Próba niebezpiecznej operacji w kontenerze " + numerSeryjny);
    }
}