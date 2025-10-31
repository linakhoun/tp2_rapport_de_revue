package modele;

import controleur.IMethode;
import java.util.ArrayList;
import java.util.List;

/** Classe modèle de la suite de Fibonacci contenant une liste d'Integer
 *
 */
public class SuiteFibonacci {
    private final List<Integer> suite;
    IMethode methode;

    /** constructeur :
     *
     */
    public SuiteFibonacci() {
        this.suite = new ArrayList<>();
    }

    /*** getters :
     *
     * @return la suite complète de Fibonacci
     */
    public List<Integer> getSuite() {
        return suite;
    }

    /**
     *
     * @return la méthode utilisée pour la suit de Fibonacci
     */
    public IMethode getMethode() {
        return methode;
    }

    /*** setter :
     *
     * @param methode à utiliser pour la suite de Fibonacci
     * @return la liste complète de la suite de Fibonacci
     */
    public SuiteFibonacci setMethode(IMethode methode) {
        this.methode = methode;
        return this;
    }

    /** toString() :
     *
     * @return description de la suite de Fibonacci
     */
    @Override
    public String toString() {
        String nomMethode = "aucune méthode";
        if (methode != null)
            nomMethode = methode.getNom();

        return String.format("Suite Fibonacci avec %s : ", nomMethode) + suite;
    }
}
