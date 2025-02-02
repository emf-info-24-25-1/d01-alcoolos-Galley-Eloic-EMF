package app;

public class Ami {
    private final String nom;
    private int bieresRestantes;

    public Ami(String nom, int bieresMax) {
        this.nom = nom;
        this.bieresRestantes = bieresMax;
    }

    public String getNom() {
        return nom;
    }

    public int getBieresRestantes() {
        return bieresRestantes;
    }

    public void boitUneBiere() {
        if (bieresRestantes > 0) {
            bieresRestantes--;
            System.out.println(nom + " a bu une bière. il peut boire encore : " + bieresRestantes + " bieres");
        } else {
            System.out.println(nom + " ne peut plus boire de bières, il est déjà saoul !");
        }
    }
}

