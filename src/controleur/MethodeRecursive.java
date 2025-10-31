package controleur;

import modele.SuiteFibonacci;

/** classe de la méthode récursive ayant la suite finale de Fibonacci comme variable
 *
 */
public class MethodeRecursive implements IMethode {
    private final SuiteFibonacci suite;

    /** constructeur :
     *
     */
    public MethodeRecursive() {
        this.suite = new SuiteFibonacci();
        suite.setMethode(this);
    }

    /** getNom() :
     *
     * @return le nom de la méthode Classique pour le toString();
     */
    @Override
    public String getNom() {
        return "la méthode récursive";
    }

    /** calculer la valeur de l'index de la suite de Fibonacci
     *
     * @param indexTerme pour entrer l'index du terme désiré de la suite de Fibonacci
     * @return la valeur de l'index dans la suite de Fibonacci
     */
    @Override
    public int calculer(int indexTerme) {
        //si l'index est à 0 ou 1
        if (indexTerme <= 1)
            return indexTerme;
        else
            return calculer(indexTerme - 1) + calculer(indexTerme - 2);
    }

    /** calculer une liste entière de la suite Fibonacci
     *
     * @param nbTermes pour entrer le nombre de termes totaux dans la suite de Fibonacci
     * @return la liste de la suite de Fibonacci
     */
    @Override
    public SuiteFibonacci calculerSuite(int nbTermes) {
        // vérifier que la suite est vide
        if (!suite.getSuite().isEmpty())
            suite.getSuite().clear();
        // ajouter des termes dans la suite
        for (int i = 1; i <= nbTermes; i++)
            suite.getSuite().add(calculer(i));
        return suite;
    }
}
