/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import com.mycompany.testunitaireinsset.NombrePremier.NombrePremier;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author talend
 */
@RunWith(JUnitParamsRunner.class)
public class StringUtilsParameterJUinitTest {
    private Object[] parametersForTestIsPalindrome() {
        return new Object[][]{
            {"test", false},
            {"ici", true},
            {"baboune", false},
            {"kayak", true}
        };
    }

    /**
     * Test de la methode isPremier aec un nombre premier
     */
    //Créons ensuite notre méthode de test, en l’annotant avec @Parameters, fournie par JUnitParams : 
    @Test
    @Parameters
    public void testIsPalindrome(String n, boolean expResult) {
        //given
        StringUtils instance = new StringUtils();

        //when
        boolean result = instance.isPalindrome(n);

        //then
        assertEquals(expResult, result);

    }
}
