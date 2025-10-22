import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fibonacci fibonacciC = new Fibonacci();
        Fibonacci fibonacciR =  new Fibonacci();
        Fibonacci fibonacciB = new Fibonacci();

        System.out.print("Saisir le nombre de termes de la suite Fibonacci à calculer : ");
        int nbTermes = sc.nextInt();

        System.out.println("Méthode classique : ");
        double startC = System.nanoTime();
        System.out.println(fibonacciC.classiqueList(nbTermes));
        double endC = System.nanoTime();
        double timeElapsedC = (endC - startC) / 1_000_000;
        System.out.println("Temps en millisecondes : " + timeElapsedC + "\n");

        System.out.println("Méthode récursive : ");
        double startR = System.nanoTime();
        System.out.println(fibonacciR.recursiveList(nbTermes));
        double endR = System.nanoTime();
        double timeElapsedR = (endR - startR) / 1_000_000;
        System.out.println("Temps en millisecondes : " + timeElapsedR + "\n");

        System.out.println("Méthode récursive avec boucle for : ");
        double startB = System.nanoTime();
        for (int i = 1; i <= nbTermes; i++) {
            System.out.println(fibonacciB.recursive(i));
        }
        double endB = System.nanoTime();
        double timeElapsedB = (endB - startB) / 1_000_000;
        System.out.println("Temps en millisecondes : " + timeElapsedB + "\n");


    }
}