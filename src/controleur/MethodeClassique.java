package controleur;

import modele.Fibonacci;
import modele.SuiteFibonacci;

public class MethodeClassique implements IMethode {
    private SuiteFibonacci suite;
    private Fibonacci fibonacci;

    public MethodeClassique() {
        this.suite = new SuiteFibonacci();
        suite.setMethode(this);
    }

    @Override
    public String getNom() {
        return "la méthode classique";
    }

    @Override
    public int calculer(int indexTerme) {
        // initialisation des deux premier termes et de la somme
        int terme1 = 1;
        int terme2 = 1;
        int somme = 0;

        //si l'index est à 0
        if (indexTerme == 0)
            return 0;
            // si l'index est à 1 (initiale) OU 2 (0 + 1), même valeur de 1 :
        else if (indexTerme == 1 || indexTerme == 2)
            return terme1;
            // pour la 3ème position et au-delà
        else {
            for (int i = 3; i <= indexTerme; i++) {
                somme = terme1 + terme2;
                terme1 = terme2;
                terme2 = somme;
            }
            return somme;
        }
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
