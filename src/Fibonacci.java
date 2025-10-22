import java.util.ArrayList;

public class Fibonacci {
    private ArrayList<Integer> suite;

    //Constructeur
    public Fibonacci() {
        suite = new ArrayList<>();
    }


    public int recursive (int nbTermes) {
        if (nbTermes == 0)
            return 0;
        else if ((nbTermes == 1) || (nbTermes == 2)) {
            return 1;
        } else
            return recursive(nbTermes - 1) + recursive(nbTermes - 2);
    }

    public ArrayList<Integer> classiqueList (int nbTermes) {
        if  (nbTermes == 0)
            suite = null;
        else if (nbTermes == 1)
            suite.add(1);
        else if (nbTermes == 2) {
            suite.add(1);
            suite.add(1);
        }
        else {
            //Deux premiers termes commençant par 1
            int index = 0;
            suite.add(1);
            suite.add(1);
            int somme;
            //boucle pour le 3ème terme ++
            for (int i = 3; i <= nbTermes; i++) {
                somme = suite.get(index) + suite.get(index + 1);
                suite.add(somme); //index + 2
                index += 1;
            }
        }
        //return la liste complète
        return suite;
    }

    public ArrayList<Integer> recursiveList (int nbTermes) {
        //Initialisation
        if (nbTermes == 0)
            suite = null;
        else if (nbTermes == 1) {
            suite.add(1);
        }
        else if (nbTermes == 2) {
            suite.add(1);
            suite.add(1);
        }
        else {
            suite.add(1);
            suite.add(1);
            int index = 0;
            for (int i = 3; i <= nbTermes; i++) {
                suite.add(suite.get(index) + suite.get(index + 1));
                index += 1;
            }
        }
        return suite;
    }
}
