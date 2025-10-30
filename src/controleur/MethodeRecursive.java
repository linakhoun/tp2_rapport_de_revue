package controleur;

import modele.Fibonacci;
import modele.SuiteFibonacci;

public class MethodeRecursive implements IMethode {
    private SuiteFibonacci suite;
    private Fibonacci fibonacci;

    public MethodeRecursive() {
        this.suite = new SuiteFibonacci();
        suite.setMethode(this);
    }

    @Override
    public String getNom() {
        return "la méthode récursive";
    }

    @Override
    public int calculer(int indexTerme) {
        //si l'index est à 0
        if (indexTerme == 0)
            return 0;
            // si l'index est à 1 (initiale) OU 2 (0 + 1), même valeur de 1 :
        else if ((indexTerme == 1) || (indexTerme == 2)) {
            return 1;
            // pour la 3ème position et au-delà
        } else
            return calculer(indexTerme - 1) + calculer(indexTerme - 2);
    }

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
