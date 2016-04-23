package com.dicerolls.main;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DiceRolls {

/*	public static void main(String a[]){
		int arr[] = {6,6,6,1,4};

		DiceRolls dr = new DiceRolls();

		int score = dr.getValues(arr);

		System.out.println(score);


	}*/

	public int getValues(int[] arr1) {
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int i : arr1){
			int value = 0;
			if(hMap.containsKey(i)){
				value = hMap.get(i);
			}
			value = value + 1;	
			hMap.put(i, value);
		}
		return  getScore(hMap);
	}

	private int getScore(HashMap<Integer, Integer> hMap) {
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
