package controleur;

public class ServiceComparaison {
    MethodeClassique methodeClassique = new MethodeClassique();
    MethodeRecursive methodeRecursive = new MethodeRecursive();
    ServiceDuree dureeClassique =  new ServiceDuree();
    ServiceDuree dureeRecursive = new ServiceDuree();

    public void comparer(int nbTermes) {
        dureeClassique.calculerDuree(nbTermes, methodeClassique);
        dureeRecursive.calculerDuree(nbTermes, methodeRecursive);

        double dureeTotaleClassique = dureeClassique.getDuree();
        double dureeTotaleRecursive = dureeRecursive.getDuree();

        if (dureeTotaleClassique < dureeTotaleRecursive)
            System.out.println(String.format("À %d termes, la méthode classique (%f millisecondes)" +
                            " est plus rapide que la méthode récursive (%f millisecondes).\n",
                    nbTermes, dureeTotaleClassique, dureeTotaleRecursive));
        else if (dureeTotaleRecursive < dureeTotaleClassique)
            System.out.println(String.format("À %d termes, la méthode récursive (%f millisecondes)" +
                            " est plus rapide que la méthode classique (%f millisecondes).\n",
                    nbTermes, dureeTotaleRecursive, dureeTotaleClassique));
        else
        System.out.println(String.format("À %d termes, les deux méthodes ont la même durée de %f millisecondes.\n",
                    nbTermes, dureeTotaleClassique));
    }

}
