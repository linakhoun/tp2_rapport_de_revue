package vue;

import controleur.ServiceComparaison;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ConsoleUtilisateur {
    Scanner entree = new Scanner(System.in);
    ServiceComparaison serviceComparaison;

    public ConsoleUtilisateur() {
        while (true) {
            // initialisation
            serviceComparaison = new ServiceComparaison();
            int nbTermes = 0;
            messageDebut();

            while (true) {
                try {
                    nbTermes = Integer.parseInt(entree.nextLine());

                    //finir la boucle
                    if (nbTermes == 0) {
                        System.out.println("Au revoir!");
                        return;
                    }

                    if (nbTermes > 0 && nbTermes <= 45) {
                        serviceComparaison.comparer(nbTermes);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        //fin de la première boucle
                        break;

                    } else
                        messageErreur();
                } catch (NumberFormatException e) {
                    messageErreur();
                }
            }
        }
    }

    public void messageDebut() {
        System.out.print("Saisir un nombre de termes de la suite Fibonacci à calculer (entre 1 et 45) ou entrer \"0\" pour terminer : ");
    }

    public void messageErreur() {
        System.out.print("Erreur. Veuillez entrer un nombre entier entre 1 et 45 : ");
    }
}
