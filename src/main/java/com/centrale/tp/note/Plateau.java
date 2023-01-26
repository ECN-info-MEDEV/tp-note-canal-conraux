/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

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
     *
     * @param m_code
     * @param m_decode
     * @param m_indicateur
     */
    public Plateau(List<Integer> m_code, List<List<Integer>> m_decode, List<List<Integer>> m_indicateur) {
        this.m_code = m_code;
        this.m_decode = m_decode;
        this.m_indicateur = m_indicateur;
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

    
    
    
    
}
