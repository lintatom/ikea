/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tests;

import com.itexps.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER-4W55N52
 */
public class CalculatorTest {
    
    Calculator cal;
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cal=new Calculator();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testadd(){
        int z=cal.add(4, 5);
        assertEquals(9, z);
    }
    @Test
    public void testsub(){
        int z=cal.sub(4, 5);
        assertEquals(-1, z);
    }
    // public void hello() {}
}
