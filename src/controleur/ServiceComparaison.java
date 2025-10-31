package controleur;

/** Dernière classe servant de service pour calculer la durée de chaque méthode de calcul
 *
 */
public class ServiceComparaison {
    MethodeClassique methodeClassique = new MethodeClassique();
    MethodeRecursive methodeRecursive = new MethodeRecursive();
    ServiceDuree dureeClassique =  new ServiceDuree();
    ServiceDuree dureeRecursive = new ServiceDuree();

    /** comparer avec messages de calcul et de comparaisons
     *
     * @param nbTermes prend le nombre de termes totaux de la liste de Fibonacci
     */
    public void comparer(int nbTermes) {
        // initialisation des calculs
        dureeClassique.calculerDuree(nbTermes, methodeClassique);
        dureeRecursive.calculerDuree(nbTermes, methodeRecursive);

        // acquisition des durées
        double dureeTotaleClassique = dureeClassique.getDuree();
        double dureeTotaleRecursive = dureeRecursive.getDuree();

        //messages selon les résultats obtenus
        if (dureeTotaleClassique < dureeTotaleRecursive)
            System.out.printf("À %d termes, la méthode classique (%f millisecondes)" +
                            " est plus rapide que la méthode récursive (%f millisecondes).\n",
                    nbTermes, dureeTotaleClassique, dureeTotaleRecursive);

        else if (dureeTotaleRecursive < dureeTotaleClassique)
            System.out.printf("À %d termes, la méthode récursive (%f millisecondes)" +
                            " est plus rapide que la méthode classique (%f millisecondes).\n",
                    nbTermes, dureeTotaleRecursive, dureeTotaleClassique);
        else
            System.out.printf("À %d termes, les deux méthodes ont la même durée de %f millisecondes.\n",
                    nbTermes, dureeTotaleClassique);
    }

}
