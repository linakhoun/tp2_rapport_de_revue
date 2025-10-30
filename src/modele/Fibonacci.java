package modele;

import controleur.IMethode;

public class Fibonacci {
    private int valeur;
    private IMethode methode;

    // Le constructeur initialise la valeur de la position demandée dans la suite de Fibonacci
    public Fibonacci(int terme) {
        terme = terme;
    }

    public IMethode getMethode() {
        return methode;
    }

    public void setMethode(IMethode methode) {
        this.methode = methode;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        String methode = "aucune position";
        if (methode != null)
            methode = methode.toString();
        return "Fibonacci à l'index " + valeur +
                " avec " + methode;
    }
}
