package vue;

import controleur.*;
import modele.Fibonacci;
import modele.SuiteFibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);
        ServiceComparaison serviceComparaison = new ServiceComparaison();


        System.out.print("Saisir le nombre de termes de la suite Fibonacci à calculer : ");
        int nbTermes = entree.nextInt();

        serviceComparaison.comparer(nbTermes);
    }
}