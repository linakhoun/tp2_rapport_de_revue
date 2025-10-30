package controleur;

import modele.SuiteFibonacci;

public class ServiceDuree {
    private final int MILLISECONDES = 1_000_000;
    SuiteFibonacci suite = new SuiteFibonacci();
    IMethode methode;
    double debut;
    double fin;
    double duree;

    public void calculerDuree(int nbTermes, IMethode methode) {
        debut = System.nanoTime();
        suite.setMethode(methode);
        System.out.println(suite.getMethode().calculerSuite(nbTermes));
        fin = System.nanoTime();
        duree = (fin - debut) / MILLISECONDES;
        System.out.println("Durée de calcul en millisecondes : " + duree);

    }

    public double getDuree() {
        return duree;
    }
}
