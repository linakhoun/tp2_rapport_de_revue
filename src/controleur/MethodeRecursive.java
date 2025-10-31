package controleur;

import modele.SuiteFibonacci;

public class MethodeRecursive implements IMethode {
    private SuiteFibonacci suite;

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
        //si l'index est à 0 ou 1
        if (indexTerme <= 1)
            return indexTerme;
        else
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
