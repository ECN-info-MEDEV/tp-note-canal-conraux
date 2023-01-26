/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.centrale.tp.note;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author conra
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getPseudo method, of class Joueur.
     */
    @Test
    public void testGetPseudo() {
        System.out.println("getPseudo");
        Joueur instance = new Joueur();
        String expResult = "";
        String result = instance.getPseudo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPseudo method, of class Joueur.
     */
    @Test
    public void testSetPseudo() {
        System.out.println("setPseudo");
        String m_pseudo = "Alphonse";
        Joueur instance = new Joueur();
        instance.setPseudo(m_pseudo);
    }

    /**
     * Test of getScore method, of class Joueur.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Joueur instance = new Joueur();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    /**
     * Test of setScore method, of class Joueur.
     */
    @Test
    public void testSetScore() {
        System.out.println("setScore");
        int m_score = 0;
        Joueur instance = new Joueur();
        instance.setScore(m_score);
    }
    
}
