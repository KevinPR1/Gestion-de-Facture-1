package miam;

public class Four {
    protected int puissance;
    protected int capacite;

    private Resistance  resistance ;
    private Soufflerie soufflerie ;




    public void cuire(int temperature, int duree) {
        if (temperature < 40 || temperature > 250)
            throw new IllegalArgumentException("La température du four doit être comprise enntre 40 et 250 degrés");
        if (duree <= 0)
            throw new IllegalArgumentException("La durée doit être positive");
        System.out.println("Je cuis un plat à " + temperature + " degrés, pendant " + duree + " minutes.");
    }



    private void maintenir() {
    }



    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        System.out.println("la puisasnce est modifié");
        this.puissance = puissance;
    }

    public Resistance getResistance() {
        return resistance;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }
    public int getCapacite() {
        return capacite;
    }


    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
