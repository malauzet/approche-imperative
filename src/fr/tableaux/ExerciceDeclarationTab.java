package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        int[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(tableau[0]);
        System.out.println(tableau.length);
        System.out.println(tableau[tableau.length - 1]);

        //Affichez l’entier d’index 10. Pourquoi cela échoue ?
        //Notre tableau va de l'index 0 à 7, 10 est n'existe pas ici.
    }
}
