package com.dicerolls.main;

import java.util.HashMap;

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

}
