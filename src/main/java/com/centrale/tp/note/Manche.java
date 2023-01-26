/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Canal_Conraux
 */
public class Manche {
    /**
    * Joueur qui code le plateau durant la manche
    */
    private Joueur m_codeur;
    /**
    * Joueur qui décode le plateau durant la manche
    */
    private Joueur m_decodeur;
    /**
    * Plateau utilisé pour la manche
    */
    private Plateau m_plateauManche;

    /**
     *
     * @param m_codeur
     * @param m_decodeur
     * @param m_plateauManche
     */
    public Manche(Joueur m_codeur, Joueur m_decodeur, Plateau m_plateauManche) {
        this.m_codeur = m_codeur;
        this.m_decodeur = m_decodeur;
        this.m_plateauManche = m_plateauManche;
    }

    /**
     *  Méthode nouveau tour qui va régir le fonctionnement d'un tour en appelant différentes fonctions
     * @return
     */
    public boolean nouveauTour(){
        boolean mancheTerminee;
        
        // On demande une nouvelle proposition de décodage
        nouveauDecode();
        
        // On check si c'est valide
        mancheTerminee = verifierDecode();
        
        // On indique au joueur le bilan de ce tour
        if(mancheTerminee){
            System.out.println("Bravo, tous les pions sont bien placés !");
            System.out.println("Fin de tour.");
            System.out.println("----------------------");
        }
        else {
            afficheIndication();
        }
        
        return mancheTerminee;
    }
    
    /**
     *  Fonction nouveau code qui va récupérer le nouvea code proposé par le codeur
     */
    public void nouveauCode(){
        Scanner scanner = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.print(this.m_codeur.getPseudo() + "    -   Proposez votre code (ex: 1 0 0 1) avec des couleurs de 0 à 5 : ");

        // On recupere la proposition
        String strCode = scanner.nextLine();
        
        // On split dans un tableau
        String[] arrayCode = strCode.split(" ");
        
        // On parse tout le tableau dans une liste
        List<Integer> listCode = Arrays.asList(arrayCode).stream().map(Integer::parseInt).collect(Collectors.toList());
        
        // On ajoute cette liste a notre liste de decode
        this.m_plateauManche.setCode(listCode);
    }
    
    /**
     * Méthode nouveau decode qui va récuperer une tentative du décodeur
     */
    public void nouveauDecode(){
        Scanner scanner = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.print(this.m_decodeur.getPseudo() + "    -   Proposez une tentative (ex: 1 0 0 1) avec des couleurs de 0 à 5 : ");

        // On recupere la proposition
        String strDecode = scanner.nextLine();
        
        // On split dans un tableau
        String[] arrayDecode = strDecode.split(" ");
        
        // On parse tout le tableau dans une liste
        List<Integer> listDecode = Arrays.asList(arrayDecode).stream().map(Integer::parseInt).collect(Collectors.toList());
        
        // On ajoute cette liste a notre liste de decode
        this.m_plateauManche.ajouterDecode(listDecode);
    }
    
    /**
     * Méthode qui vérifie si la tentative est bonne en appelant la méthode de verification de plateau 
     * @return retourn true si c'est bon
     */
    public boolean verifierDecode(){
        return this.m_plateauManche.verifierDecode();
    }
    
    /**
     * Méthode qui indique au joueur le resultat de sa tentative
     */
    public void afficheIndication(){
        int n2, n1, n0;
        List<Integer> indication = this.m_plateauManche.getIndicateur().get(this.m_plateauManche.getIndex());
        n2 = Collections.frequency(indication, 2);
        n1 = Collections.frequency(indication, 1);
        n0 = Collections.frequency(indication, 0);
        
        System.out.println("Vous avez " + n2+ " pions au bon emplacement.");
        System.out.println("Vous avez " + n1 + " pions de la bonne couleur mais mal placé.");
        System.out.println("Vous avez " + n0 + " pions dont la couleur ne correspond à aucun pion du code.");
    }
            
            
            
            
    /**
     *
     * @return
     */
    public Joueur getCodeur() {
        return m_codeur;
    }

    /**
     *
     * @param m_codeur
     */
    public void setCodeur(Joueur m_codeur) {
        this.m_codeur = m_codeur;
    }

    /**
     *
     * @return
     */
    public Joueur getDecodeur() {
        return m_decodeur;
    }

    /**
     *
     * @param m_decodeur
     */
    public void setDecodeur(Joueur m_decodeur) {
        this.m_decodeur = m_decodeur;
    }

    /**
     *
     * @return
     */
    public Plateau getPlateauManche() {
        return m_plateauManche;
    }

    /**
     *
     * @param m_plateauManche
     */
    public void setPlateauManche(Plateau m_plateauManche) {
        this.m_plateauManche = m_plateauManche;
    }
    
    
}
