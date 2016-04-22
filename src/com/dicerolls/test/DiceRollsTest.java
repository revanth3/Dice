package com.dicerolls.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dicerolls.main.DiceRolls;



public class DiceRollsTest {
	
	@Test
	public void getValuesTest(){
		
		DiceRolls dr = new DiceRolls();
		
		int arr1[] = {1,2,3,4,5};
		assertEquals(140,dr.getValues(arr1));
		
		int arr2[] = {1,1,1,2,2};
		assertEquals(1000,dr.getValues(arr2));
		

	}
}
