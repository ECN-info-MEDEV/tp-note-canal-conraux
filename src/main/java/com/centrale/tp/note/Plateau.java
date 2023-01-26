/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Canal_Conraux
 */
public class Plateau {
    /**
    * Code proposé par le codeur
    */
    private List<Integer> m_code;
    /**
    * Liste des tentatives de décodage
    */
    private List<List<Integer>> m_decode;
    /**
    * Liste des indications
    */
    private List<List<Integer>> m_indicateur;
    
    /**
    * Entier qui décrit ou on en est
    */
    private int m_index;
    

    /**
     *  Constructeur plateau avec 3 paramètres
     * @param m_code
     * @param m_decode
     * @param m_indicateur
     */
    public Plateau(List<Integer> m_code, List<List<Integer>> m_decode, List<List<Integer>> m_indicateur) {
        this.m_code = m_code;
        this.m_decode = m_decode;
        this.m_indicateur = m_indicateur;
        this.m_index = -1;
    }
    
    /**
     *  Constructeur plateau par défault
     */
    public Plateau() {
        this.m_code = new ArrayList<>();
        this.m_decode = new ArrayList<>();
        this.m_indicateur = new ArrayList<>();
        this.m_index = -1;
    }
    
    /**
     * Méthode qui ajoute une nouvelle tentative de décode à la liste
     * @param decode
     */
    public void ajouterDecode(List<Integer> decode){
        this.m_index++;
        this.m_decode.add(decode);
    }
    
    /**
     *  Méthode qui vérifie si le code et decode est semblable
     * @return retourne true s'ils sont similaires
     */
    public boolean verifierDecode(){
        int resFinal = 0;  
        List<Integer> indications = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int res = 0;
            
            // Si bon emplacement res=2
            if(Objects.equals(this.m_code.get(i), this.m_decode.get(m_index).get(i))){
                res = 2;
            }
            // Si existe autre part res=1
            else if(this.m_code.contains(this.m_decode.get(m_index).get(i))){
                res = 1;
            }
            // sinon res=0
            
            // On ajoute dans l'indication
            indications.add(res);
            
            
            resFinal += res;
        }
        // On ajoute dans l'indicateur de manche
        this.m_indicateur.add(indications);
        // Si resFinal == 8 alors la manche est finie
        return (resFinal==8);
    }
    
    

    /**
     *
     * @return
     */
    public List<Integer> getCode() {
        return m_code;
    }

    /**
     *
     * @param m_code
     */
    public void setCode(List<Integer> m_code) {
        this.m_code = m_code;
    }

    /**
     *
     * @return
     */
    public List<List<Integer>> getDecode() {
        return m_decode;
    }

    /**
     *
     * @param m_decode
     */
    public void setDecode(List<List<Integer>> m_decode) {
        this.m_decode = m_decode;
    }

    /**
     *
     * @return
     */
    public List<List<Integer>> getIndicateur() {
        return m_indicateur;
    }

    /**
     *
     * @param m_indicateur
     */
    public void setIndicateur(List<List<Integer>> m_indicateur) {
        this.m_indicateur = m_indicateur;
    }

    /**
     *
     * @return
     */
    public int getIndex() {
        return m_index;
    }

    /**
     *
     * @param m_index
     */
    public void setIndex(int m_index) {
        this.m_index = m_index;
    }

    
    
    
    
}
