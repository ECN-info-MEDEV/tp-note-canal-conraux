/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

import java.util.List;

/**
 * Classe Partie qui définit le déroulement d'une partie
 * @author Canal_Conraux
 */
public class Partie {
    /**
    * Entier qui définit le nombre de manches
    */
    private int m_nbManche;
    /**
    * Liste des différentes manches
    */
    private List<Manche> m_manches;
    /**
    * Liste des deux joueurs participant a la partie
    */
    private List<Joueur> m_joueurs;

    /**
     *
     * @param m_nbManche
     * @param m_manches
     * @param m_joueurs
     */
    public Partie(int m_nbManche, List<Manche> m_manches, List<Joueur> m_joueurs) {
        this.m_nbManche = m_nbManche;
        this.m_manches = m_manches;
        this.m_joueurs = m_joueurs;
    }

    /**
     *
     * @return
     */
    public int getNbManche() {
        return m_nbManche;
    }

    /**
     *
     * @param m_nbManche
     */
    public void setNbManche(int m_nbManche) {
        this.m_nbManche = m_nbManche;
    }

    /**
     *
     * @return
     */
    public List<Manche> getManches() {
        return m_manches;
    }

    /**
     *
     * @param m_manches
     */
    public void setManches(List<Manche> m_manches) {
        this.m_manches = m_manches;
    }

    /**
     *
     * @return
     */
    public List<Joueur> getJoueurs() {
        return m_joueurs;
    }

    /**
     *
     * @param m_joueurs
     */
    public void setJoueurs(List<Joueur> m_joueurs) {
        this.m_joueurs = m_joueurs;
    }

   
    
    
}
