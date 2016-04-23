package com.dicerolls.main;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DiceRolls {
	private int arr[] = {6,6,6,1,4};

	public int getValues(int[] arr1) {
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int i : arr){
			int value = 0;
			if(hMap.containsKey(i)){
				value = hMap.get(i);
			}
			value = value + 1;
			hMap.put(i, value);
		}
		return 0;
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
			return 3000;
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
}
