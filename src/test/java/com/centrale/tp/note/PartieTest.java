/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.centrale.tp.note;

import java.util.ArrayList;
import java.util.List;
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
public class PartieTest {
    
    public PartieTest() {
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

//    /**
//     * Test of playManche method, of class Partie.
//     */
//    @Test
//   public void testPlayManche() {
//        System.out.println("playManche");
//        Joueur codeur = new Joueur("Eudes", 0);
//        Joueur decodeur = new Joueur("Jean", 0);
//        Partie instance = new Partie();
//        instance.setM_joueurA(codeur);
//        instance.setM_joueurB(decodeur);
//        instance.playManche(codeur, decodeur);
//    }
//
//    /**
//     * Test of askIfPartieOver method, of class Partie.
//     */
//    @Test
//    public void testAskIfPartieOver() {
//        System.out.println("askIfPartieOver");
//        Partie instance = new Partie();
//        instance.askIfPartieOver();
//    }

    /**
     * Test of printWinner method, of class Partie.
     */
    @Test
    public void testPrintWinner() {
        System.out.println("printWinner");
        Joueur codeur = new Joueur("Eudes", 0);
        Joueur decodeur = new Joueur("Jean", 22);
        Partie instance = new Partie();
        instance.setM_joueurA(decodeur);
        instance.setM_joueurB(codeur);
        instance.printWinner();
    }
    
    /**
     * Test of printWinner method, of class Partie.
     */
    @Test
    public void testPrintWinner2() {
        System.out.println("printWinner");
        Joueur codeur = new Joueur("Eudes", 55);
        Joueur decodeur = new Joueur("Jean", 22);
        Partie instance = new Partie();
        instance.setM_joueurA(decodeur);
        instance.setM_joueurB(codeur);
        instance.printWinner();
    }
    
    /**
     * Test of printWinner method, of class Partie.
     */
    @Test
    public void testPrintWinner3() {
        System.out.println("printWinner");
        Joueur codeur = new Joueur("Eudes", 22);
        Joueur decodeur = new Joueur("Jean", 22);
        Partie instance = new Partie();
        instance.setM_joueurA(decodeur);
        instance.setM_joueurB(codeur);
        instance.printWinner();
    }
    
}
