/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

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
