package controleur;

import modele.SuiteFibonacci;

public class MethodeClassique implements IMethode {
    private SuiteFibonacci suite;

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
        //si l'index est à 0
        if (indexTerme == 0)
            return 0;
        //si l'index est à 1
        else if (indexTerme == 1)
            return 1;

        // initialisation des deux premier termes et de la somme
        int terme1 = 0;
        int terme2 = 1;

        // si l'index est à 2 ou plus
        for (int i = 2; i <= indexTerme; i++) {
            int somme = terme1 + terme2;
            terme1 = terme2;
            terme2 = somme;
        }
        return terme2;
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
