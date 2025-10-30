package controleur;

import modele.SuiteFibonacci;

public interface IMethode {

    //démontrer le nom de la méthode
    public String getNom();
    public int calculer(int indexTerme);
    public SuiteFibonacci calculerSuite (int nbTermes);

}
