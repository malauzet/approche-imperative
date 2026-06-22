package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {

        // Affichez tous les nombres de 1 à 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n-------------\n");

        String nom = "Alauzet";
        String prenom = "Marius";

        // Affichez 20 fois votre nom et votre prénom
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + ": " + nom + " " + prenom);
        }

        System.out.println("\n-------------\n");

        // Affichez les éléments pairs de 2 à 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " est un nombre pair.");
            }
        }

        System.out.println("\n-------------\n");

        //Affichez les éléments impairs de 1 à 99
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " est un nombre impair.");
            }
        }
    }
}
