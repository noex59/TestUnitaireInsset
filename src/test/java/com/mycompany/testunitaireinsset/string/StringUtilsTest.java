/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author talend
 */
public class StringUtilsTest {
    
    StringUtils instance;
        
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       instance = new StringUtils();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        //When
        boolean r = this.instance.isChaineValide("Test");
        
        //Then 
        assertTrue(r);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testIsChaineNonValide() {
        //When
        boolean r = instance.isChaineValide("T");
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        //Given
        String test = "azerty";
        
        //When
        test = instance.inverse(test);
        
        //Then
        assertEquals("ytreza", test);
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
        //When
        boolean t = instance.isPalindrome("kayak");
        
        //Then
        assertTrue(t);
    }
    
    @Test
    public void testIsNonPalindrome() {
        //When
        boolean t = instance.isPalindrome("kayakiste");
        
        //Then
        assertFalse(t);
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        //Given
        String t = "babibo";
        Map<String, Integer> attendu = new HashMap<>();
        attendu.put("b", 3);
        attendu.put("a", 1);
        attendu.put("i", 1);
        attendu.put("o", 1);
        
        //When
        Map<String, Integer> map = instance.compterOccurences(t);
        
        //Then
        assertEquals(attendu, map);
    }
    
}
