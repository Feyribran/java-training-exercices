package io.robusta.java.classic;

import java.util.*;
import java.util.Map.Entry;

/**
 *
 *  Map :
 *  We add entry with map.put(key, val)
 *  We read value with map.get(key)
 *  We read keys with map.keySet()
 *  We read values with map.values()
 *  We read entries with map.entrySet()
 *
 *
 */
public class MapApp {

    Map<Integer, String> buildMap(int key1, String val1, int key2, String val2){
        
    		Map<Integer, String> result = new HashMap<>();
    		result.put(key1, val1);
    		result.put(key2, val2);
    		return result;
    }


    Map<Integer, String> buildMap(int[] keys, String[] values){
        
    		Map<Integer, String> result = new HashMap<>();
    		
    		for (int index = 0 ; index < keys.length; index ++) {
    			result.put(keys[index], values[index]);
    		}
    	
    		return result;
    }

    Set<Integer> getKeys(Map<Integer, String> map){
        
    		Set<Integer> result = new HashSet<>();
    		
    		for (int current : map.keySet()) {
    			result.add(current);
    		}

    		return result;
    }

    List<Integer> getKeysAsList(Map<Integer, String> map){
        
    		List<Integer> result = new ArrayList<>();
    		for (int current : map.keySet()) {
    			result.add(current);
    		}

    		return result;
    }
    
     Set<Entry<Integer, String>> getEntries(Map<Integer, String> map){
        
    	 	Set<Entry<Integer, String>> result = new HashSet<>();
    	 	
    	 	for (Entry<Integer, String> current : map.entrySet()) {
    	 		result.add(current);
    	 		System.out.println("current : " +current);
    	 	}
    	 	
    	 	return result;
     }
    
    List<String> getValues(Map<Integer, String> map){
        
    		List<String> result = new ArrayList<>();
    		
		for (String current : map.values()) {
			result.add(current);
		}

		return result;
    }

    

    String[]  getValuesFromMap(Map<Integer, String> map, int key1,  int key2){
        
    		String [] result = {map.get(key1), map.get(key2)};
    		return result;
    }


    List<Integer>  getKeysHavingValue(Map<Integer, String> map, String value){
        
    		List<Integer> result = new ArrayList<>();
    		
    		for (Entry<Integer, String> current : map.entrySet()) {
    			if (current.getValue() == value) {
    				result.add(current.getKey());
    			}
    		}

    		return result;
    }

    List<Integer>  getKeysHavingValueAnyValue(Map<Integer, String> map, String... values){

		List<Integer> result = new ArrayList<>();
    	
		for (Entry<Integer, String> currentEntry : map.entrySet()) {
			for(String currentString : values) {
				if (currentEntry.getValue() == currentString) {
				result.add(currentEntry.getKey());
				}
			}
			
		}

		return result;
    }

    //TODO: move up
    String displayMap(Map<Integer, String> map){
        //Map<Integer, String> newMap = new HashMap<>();
        //newMap = map;
    	String result = "";
    	// Use map.entrySet()to have nice display
        for (Entry<Integer, String> entry: map.entrySet()){
            //System.out.println( "Entry:"+entry.getKey());
            //System.out.println( "Value:"+entry.getValue());
            result = result + entry.getValue() + "->" + entry.getKey() + ":";
        }
        System.out.println(result); // les données sont triées ... pourquoi ?
        return result;
    }

    List<Card> getCards(Map<Integer, Character> map){
        
    		List<Card> result = new ArrayList<Card>();
    		for (Entry<Integer, Character> current : map.entrySet()) {
    			Card currentCard = new Card(current.getKey(), current.getValue());
    			result.add(currentCard);
    		}

    		return result;
    }




   




}
