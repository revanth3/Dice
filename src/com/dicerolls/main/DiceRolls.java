package com.dicerolls.main;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DiceRolls {

/*	public static void main(String a[]){
		int arr[] = {6,6,6,1,4};

		DiceRolls dr = new DiceRolls();

		int score = dr.getScores(arr);

		System.out.println(score);


	}*/
	
	/*
	 * get values method take integer array as input and returns total score  
	 */
	public int getScores(int[] arr1) {
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int i : arr1){
			int value = 0;
			if(hMap.containsKey(i)){
				value = hMap.get(i);
			}
			value = value + 1;	
			hMap.put(i, value);
		}
		return calculateScore(hMap);
	}

	/*
	 * Calculates score 
	 * 
	 */
	private int calculateScore(HashMap<Integer, Integer> hMap) {
		Set<Entry<Integer, Integer>> entries = hMap.entrySet();

		int score = 0;
		for(Entry<Integer, Integer> entry : entries ){
			int count = entry.getValue();
			if(count >= 3){
				count = count - 3;

				score += getTripleScore(entry.getKey()); 

			}		
			if(count >= 1){
				score = score + (getSingleScore(entry.getKey())*count);
			}
		}

		return score;
	}

	/*
	 * Gets triple score 
	 * which returns 1000 for 1
	 *  200 for 2
	 *  300 for 3
	 *  400 for 4
	 *  500 for 5
	 *  600 for 6
	 * 0 for other numbers 
	 * takes input as integer and returns integer 
	 */
	private int getTripleScore(int key){

		switch(key){
		case 1:
			return 1000;
		case 2:
			return 200;
		case 3:
			return 300;
		case 4:
			return 400;
		case 5:
			return 500;
		case 6:
			return 600;
		default:
			return 0;

		}
	}

	/*
	 * Gets single score 
	 * which returns 100 for 1
	 * 40 for 4
	 * 0 for other numbers 
	 * takes input as integer and returns integer 
	 */
	private int getSingleScore(int key){

		switch(key){
		case 1:
			return 100;
		case 4:
			return 40;
		default:
			return 0;

		}

	}
}
