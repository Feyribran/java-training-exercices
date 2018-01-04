package io.robusta.java.classic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ListApp {

    List<Integer> buildList(int a, int b, int c){
        List<Integer> integer = new ArrayList<>(3);
        integer.add(a);
        integer.add(b);
        integer.add(c);
    		return integer;
    	}


    ArrayList<Integer> buildList(int... numbers){
    		ArrayList<Integer> result = new ArrayList<>();
        
    		
    		/*
        for (int index : numbers){
    		result.add(index);
    		}*/
    		
    		int index = 0;
    		while (index < numbers.length) {
    	
    			result.add(numbers[index]);
    			index++;
    		}

    		return result;
    }


    boolean equality(List<Integer> list1, List<Integer> list2){
    	
    		boolean result = true;
    	
    		int index = 0;
    		
    		while (result == true && index < list1.size()){
    			if (list1.get(index).equals(list2.get(index))){
    				index++;  				
    			} else {
    				result = false;
    			}
    		}
    		
    		return result;
    }

    String asString (List<Integer> numbers){
        return null;
    }


    int first(List<Integer> ints){
        return ints.get(0);
    }

    int last(List<Integer> ints){
        return ints.get(ints.size()-1);
    }

    int medium(List<Integer> ints){
    		int indexMiddle = Math.abs((ints.size()+1)/2)-1;
        return ints.get(indexMiddle);
    }
}
