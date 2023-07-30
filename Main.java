import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //? Chapitre 3

        var saisieUtilisateur = new Scanner(System.in);
        System.out.println("Saissisez votre Age : ");
        var age = saisieUtilisateur.nextInt();
        //! Les instructions if,else if et else
        lecons15(age);
        lecons16(age);
        lecons17(age);
        lecons18and19();
        lecons20();
        lecons21();


    }

    /**
     * Chapitre 3
     * Leçon 15
     * Les instructions if,else if et else
     * Affiche un message en fonction de l'age de l'utilisateur.
     *
     * @param age Entier représentant l'age d'un être vivant.
     */
    public static void lecons15(int age) {
        if (age < 18) {
            System.out.println("Vous êtes mineur");
        } else if (age < 0) {
            System.out.println("Age non valide");
        } else if (age > 100) {
            System.out.println("Vous êtes centenaire");
        } else {
            System.out.println("Vous êtes majeur");
        }
    }

    /**
     * Chapitre 3
     * Leçon 16
     * L'instruction switch
     *
     * @param chiffre valeur entière de test.
     */
    public static void lecons16(int chiffre) {
        switch (chiffre) {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            default:
                System.out.println("Invalide");
                break;
        }
    }

    /**
     * Chapitre 3
     * Leçon 17
     * L'opérateur ternaire
     *
     * @param age d'une être vivant.
     */
    public static void lecons17(int age) {
        var isMajeurString = age >= 18 ? "Majeur" : "Mineur";
        System.out.println(isMajeurString);
    }

    /**
     * Chapitre 3
     * Leçon 18 and 19
     * Introduction aux itérables et boucle for
     */
    public static void lecons18and19() {

        var fruits = new ArrayList<String>();
        fruits.add("Pommes");
        fruits.add("Poires");
        fruits.add("Fraises");
        for (var fruit : fruits) {
            System.out.println("fruit : " + fruit);
        }

        var notes = new int[3];
        notes[0] = 12;
        notes[1] = 15;
        notes[2] = 9;
        var somme = 0;
        for (var i = 0; i < notes.length; i++) {
            somme += notes[i];
        }
        var moyenne = somme / notes.length;
        System.out.println(moyenne);
    }

    /**
     * Chapitre 3
     * Leçon 20
     * Les boucles while et do while
     */
    public static void lecons20() {

        var compteur = 0;
        do {
            System.out.println("Compteur : " + compteur);
            compteur++;
        } while (compteur < 10);
    }

    /**
     * Chapitre 3
     * Leçon 21
     * Les instructions break et continue
     */
    public static void lecons21() {

        var compteur = 0;
        while (compteur < 10) {
            if (compteur == 5) {
                compteur++;
                continue;
            }
            System.out.println("Compteur : " + compteur);
            compteur++;
        }
        System.out.println("Compteur : " + compteur);
        compteur++;
    }


}