/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.centrale.tp.note;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mouche66
 */
public class PlateauTest {
    
    public PlateauTest() {
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
     * Test of ajouterDecode method, of class Plateau.
     */
    @Test
    public void testAjouterDecode() {
        System.out.println("ajouterDecode");
        List decode = Arrays.asList(1, 0, 1, 0);
        Plateau instance = new Plateau();
        instance.ajouterDecode(decode);
        
        assertEquals(decode, instance.getDecode().get(0));
    }

    /**
     * Test of verifierDecode method, of class Plateau.
     */
    @Test
    public void testVerifierDecode() {
//        System.out.println("verifierDecode");
//        List decode = Arrays.asList(1, 0, 1, 0);
//        
//        Plateau instance = new Plateau();
//        boolean expResult = false;
//        boolean result = instance.verifierDecode();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
