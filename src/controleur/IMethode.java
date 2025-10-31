package controleur;
import modele.SuiteFibonacci;

/** Une interface IMethode ayant 2 stratégies (calcul) différentes
 *
 */
public interface IMethode {

    /** Méthode getNom();
     *
     * @return retourne le nom de la méthode dans le toString();
     */
    String getNom();

    /**
     *
     * @param indexTerme pour entrer l'index du terme désiré de la suite de Fibonacci
     * @return retourne la valeur de l'index de la suite de Fibonacci
     */
    int calculer(int indexTerme);

    /**
     *
     * @param nbTermes pour entrer le nombre de termes totaux dans la suite de Fibonacci
     * @return retourne la suite de Fibonacci sous forme d'une liste
     */
    SuiteFibonacci calculerSuite (int nbTermes);

}
