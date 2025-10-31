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
            // envoie du message inital
            messageDebut();

            while (true) {
                try {
                    int nbTermes = Integer.parseInt(entree.nextLine());

                    // entrer 0 pour quitter
                    if (nbTermes == 0) {
                        System.out.println("Au revoir!");
                        return;
                    }

                    // calculer
                    if (nbTermes > 0 && nbTermes <= 45) {
                        serviceComparaison.comparer(nbTermes);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        //fin de du premier calcul
                        break;

                        //nombre de termes invalide
                    } else
                        messageErreur();

                        // format de la valeur entrée invalide (pas un nombre entier)
                } catch (NumberFormatException e) {
                    messageErreur();
                }
            }
        }
    }

    /** Message du début de l'opération
     *
     */
    public void messageDebut() {
        System.out.print("Saisir un nombre de termes de la suite Fibonacci à calculer (entre 1 et 45) ou entrer \"0\" pour terminer : ");
    }

    /** Message d'erreur d'entrée de saisie
     *
     */
    public void messageErreur() {
        System.out.print("Erreur. Veuillez entrer un nombre entier entre 1 et 45 : ");
    }
}
