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
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author mouche66
 */
public class MancheTest {
    
    public MancheTest() {
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
     * Test of nouveauCode method, of class Manche.
     */
    @Test
    @Disabled
    public void testNouveauCode() {
        System.out.println("nouveauCode");
        Manche instance = null;
        instance.nouveauCode();

    }

    /**
     * Test of nouveauDecode method, of class Manche.
     */
    @Test
    @Disabled
    public void testNouveauDecode() {
        System.out.println("nouveauDecode");
        Manche instance = null;
        instance.nouveauDecode();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierDecode method, of class Manche.
     */
    @Test
    @Disabled
    public void testVerifierDecode() {
        System.out.println("verifierDecode");
        Manche instance = null;
        boolean expResult = false;
        boolean result = instance.verifierDecode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of afficheIndication method, of class Manche.
     */
    @Test
    @Disabled
    public void testAfficheIndication() {
        System.out.println("afficheIndication");
        Manche instance = null;
        instance.afficheIndication();
    }
}
