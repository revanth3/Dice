package com.dicerolls.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.dicerolls.main.DiceRolls;



public class DiceRollsTest {
	
	
	DiceRolls dr;
	
	@Before
	public void init(){
		dr = new DiceRolls();
	}
	
	@Test
	public void getScoresTest(){
		
		int arr1[] = {1,2,3,4,5};
		assertEquals(140,dr.getScores(arr1));
		
		int arr2[] = {1,1,1,2,2};
		assertEquals(1000,dr.getScores(arr2));
		
		int arr3[] = {3,3,3,3,3};
		assertEquals(300,dr.getScores(arr3));
		
		int arr4[] = {4,4,4,4,4};
		assertEquals(480,dr.getScores(arr4));

		int arr5[] = {1,5,5,5,1};
		assertEquals(700,dr.getScores(arr5));
		
		int arr6[] = {0,0,0,0,0};
		assertEquals(0,dr.getScores(arr6));
		
		int arr7[] = {2,2,2,2,2};
		assertEquals(200,dr.getScores(arr7));
	}
}
