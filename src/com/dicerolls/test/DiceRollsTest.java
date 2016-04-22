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
		
		int arr3[] = {5,4,5,4,5};
		assertEquals(580,dr.getValues(arr3));
		
		int arr4[] = {4,4,4,4,4};
		assertEquals(480,dr.getValues(arr4));

		int arr5[] = {1,5,5,5,1};
		assertEquals(700,dr.getValues(arr5));
		
		int arr6[] = {0,0,0,0,0};
		assertEquals(0,dr.getValues(arr6));
		
		int arr7[] = {2,2,2,2,2};
		assertEquals(200,dr.getValues(arr7));
	}
}
