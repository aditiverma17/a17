package com.a17;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseA {
	 @Test  
     public void testFindMax(){  
     	assertEquals(4,Sample1.findMax(new int[]{1,3,4,2}));  
     	assertEquals(-1,Sample1.findMax(new int[]{-12,-1,-3,-4,-2}));  
     }  
}
