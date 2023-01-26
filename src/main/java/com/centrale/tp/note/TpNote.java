/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.centrale.tp.note;

import java.util.Scanner;

/**
 *
 * @author mouche66
 */
public class TpNote {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Partie partie = new Partie();

        //CHOIX DES NOMS
        System.out.println("Bienvenue sur le jeu Mastermind ! ");
        System.out.println("----------------------------------");
        System.out.println("");
        System.out.println(" Joueur n°1: veuillez choisir votre nom (les espaces ne sont pas autorisés) : ");
        Scanner sc = new Scanner(System.in);
        partie.getM_joueurA().setPseudo(sc.next());
        System.out.println(" Joueur n°2: veuillez choisir votre nom (les espaces ne sont pas autorisés) : ");
        sc = new Scanner(System.in);
        partie.getM_joueurB().setPseudo(sc.next());

        //DEBUT DE PARTIE
        System.out.println("");
        System.out.println("Commençons la partie !");
        System.out.println("----------------------");

        //BOUCLE DE PARTIE
        while (!partie.isM_over()) {

            //LES DEUX MANCHES SONT JOUEES
            partie.playManche(partie.getM_joueurA(), partie.getM_joueurB());
            partie.playManche(partie.getM_joueurB(), partie.getM_joueurA());
            
            //DEMONSTRATION DES SCORES
            System.out.println("");
            System.out.println("Voici les scores de ta partie : ");
            System.out.println("Joueur A : " + partie.getM_joueurA().getScore());
            System.out.println("Joueur B : " + partie.getM_joueurB().getScore());
            System.out.println("----------------------");

            //FIN DE PARTIE ?
            System.out.println("");
            partie.askIfPartieOver();

        }
        
        //SI ON SORT DE LA BOUCLE, LA PARTIE EST FINIE
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("La partie est terminée...");
        partie.printWinner();
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("Appuyez sur Entrée pour quitter l'application.");
        sc = new Scanner(System.in);
        
    }
}
