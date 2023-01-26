/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

/**
 *  Classe joueur qui définit les joueurs participant à une partie
 * @author CANAL_CONRAUX
 */
public class Joueur {
    /**
    * Chaine de caractère qui définit le pseudo du joueur
    */
    private String m_pseudo;
    /**
    * entier qui définit le score du joueur sur la partie
    */
    private int m_score;

    /**
     *  Constructeur
     * @param m_pseudo
     * @param m_score
     */
    public Joueur(String m_pseudo, int m_score) {
        this.m_pseudo = m_pseudo;
        this.m_score = m_score;
    }
    
    /**
     *  Constructeur
     */
    public Joueur() {
        this.m_pseudo = "";
        this.m_score = 0;
    }

    /**
     *  
     * @return
     */
    public String getPseudo() {
        return m_pseudo;
    }

    /**
     *
     * @param m_pseudo
     */
    public void setPseudo(String m_pseudo) {
        this.m_pseudo = m_pseudo;
    }

    /**
     *
     * @return
     */
    public int getScore() {
        return m_score;
    }

    /**
     *
     * @param m_score
     */
    public void setScore(int m_score) {
        this.m_score = m_score;
    }
    
    
}
