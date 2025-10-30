package modele;

import controleur.IMethode;

import java.util.ArrayList;
import java.util.List;

public class SuiteFibonacci {
    private List<Integer> suite;
    IMethode methode;

    public SuiteFibonacci() {
        this.suite = new ArrayList<>();
    }

    public SuiteFibonacci(IMethode methode) {
        this.suite = new ArrayList<>();
        this.methode = methode;
    }

    public List<Integer> getSuite() {
        return suite;
    }

    public void setSuite(List<Integer> suite) {
        this.suite = suite;
    }

    public IMethode getMethode() {
        return methode;
    }

    public SuiteFibonacci setMethode(IMethode methode) {
        this.methode = methode;
        return this;
    }

    @Override
    public String toString() {
        String nomMethode = "aucune méthode";
        if (methode != null)
            nomMethode = methode.getNom();

        return "Suite Fibonacci avec " + nomMethode +
                " : " + suite;
    }
}
