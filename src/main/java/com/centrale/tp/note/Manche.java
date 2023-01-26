/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

import java.util.Arrays;
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

    
    
    public boolean nouveauTour(){
        boolean mancheTerminee;
        
        // On demande une nouvelle proposition de décodage
        nouveauDecode();
        
        // On check si c'est valide
        mancheTerminee = verifierDecode();
        
        return mancheTerminee;
    }
    
    public void nouveauCode(){
        Scanner scanner = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.print("Proposez votre code (ex: 1 0 0 1) avec des couleurs de 0 à 5 : ");

        // On recupere la proposition
        String strCode = scanner.nextLine();
        
        // On split dans un tableau
        String[] arrayCode = strCode.split("\\s+");
        
        // On parse tout le tableau dans une liste
        List<Integer> listCode = Arrays.asList(arrayCode).stream().map(Integer::parseInt).collect(Collectors.toList());
        
        // On ajoute cette liste a notre liste de decode
        this.m_plateauManche.setCode(listCode);
    }
    
    public void nouveauDecode(){
        Scanner scanner = new Scanner(System.in);

        // Affiche "Ecrire un nombre: "
        System.out.print("Proposez une tentative (ex: 1 0 0 1) avec des couleurs de 0 à 5 : ");

        // On recupere la proposition
        String strDecode = scanner.nextLine();
        
        // On split dans un tableau
        String[] arrayDecode = strDecode.split("\\s+");
        
        // On parse tout le tableau dans une liste
        List<Integer> listDecode = Arrays.asList(arrayDecode).stream().map(Integer::parseInt).collect(Collectors.toList());
        
        // On ajoute cette liste a notre liste de decode
        this.m_plateauManche.ajouterDecode(listDecode);
    }
    
    public boolean verifierDecode(){
        return this.m_plateauManche.verifierDecode();
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
