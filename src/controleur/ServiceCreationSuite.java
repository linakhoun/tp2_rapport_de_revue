package controleur;

import modele.SuiteFibonacci;

public class ServiceCreationSuite {
    private SuiteFibonacci suite;
    public SuiteFibonacci creerSuite(int nbTermes, IMethode methode) {
        // vérifier que la suite est vide
        if (!suite.getSuite().isEmpty())
            suite.getSuite().clear();
        suite.setMethode(methode);
        // ajouter des termes dans la suite
        for (int i = 1; i <= nbTermes; i++)
            suite.getMethode().calculer(i);
        return suite;
    }

    @Override
    public String toString() {
        return "ServiceCreationSuite{" +
                "suite=" + suite +
                '}' + suite.getMethode().toString();
    }
}
