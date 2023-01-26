/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

import java.util.ArrayList;
import java.util.List;

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
     *
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
    
    
    
    public void ajouterDecode(List<Integer> decode){
        this.m_index++;
        this.m_decode.add(decode);
    }
    
//    public boolean verifierDecode(){
//        for (int i = 0; i < 4; i++) {
//            int res = 0;
//            
//            // Si bon emplacement res=2
//            //if(this.m_code.get(i) == )
//        }
//    }

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

    public int getIndex() {
        return m_index;
    }

    public void setIndex(int m_index) {
        this.m_index = m_index;
    }

    
    
    
    
}
