package controleur;
import modele.SuiteFibonacci;

/** Classe service qui calcul la durée de chaque méthode utilisée
 *
 */
public class ServiceDuree {
    private final int MILLISECONDES = 1_000_000;
    SuiteFibonacci suite = new SuiteFibonacci();
    double debut;
    double fin;
    double duree;

    /** calculerDurée de chaque méthode :
     *
     * @param nbTermes pour le nombre de termes totaux dans la suite de Fibonacci
     * @param methode pour la méthode demandée pour mesurer la durée
     */
    public void calculerDuree(int nbTermes, IMethode methode) {
        debut = System.nanoTime();
        suite.setMethode(methode);
        System.out.println(suite.getMethode().calculerSuite(nbTermes));
        fin = System.nanoTime();
        duree = (fin - debut) / MILLISECONDES;
        System.out.println("Durée de calcul en millisecondes : " + duree);

    }

    /** getDuree() :
     *
     * @return retourne la valeur de la durée
     */
    public double getDuree() {
        return duree;
    }
}
