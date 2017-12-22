package io.robusta.java.classic;

/**
 * Created by nicorama on 21/06/2017.
 */
public class ArrayApp {



    String[] buildEmptyArray(int size){
        String result[] = new String [size];
    	return result;
    }

    int[] buildArray(int a, int b, int c){
        //int result[] = new int [3];
        //result[0] = a;
        //result[1] = b;
        //result[2] = c;
        int[] result = {a,b,c};
    	return result;
    }


    boolean equality(int[] array1, int[] array2){
    	//boolean result;
        if (array1[0] == array2[0] && array1[1] == array2[1] && array1[2] == array2[2]){
        	return true;
        } else {
    	return false;
        }
    }

    String asString (int [] numbers){
    	String string = "";
    	
    	for (int index = 0; index < numbers.length; index++){
    		string = string + numbers[index] + ":";
    	}
        return string;
    
    }

    String asStringJoin (int [] numbers){
    	String string = "";
    	
    	for (int index = 0; index < numbers.length-1; index++){
    		string = string + numbers[index] + ":";
    	}
    	string = string + numbers[numbers.length-1];
        return string;
    }

    String asString (String [] strings){
    	String string = "";
    	
    	for (int index = 0; index < strings.length-1; index++){
    		string = string + strings[index] + " ";
    	}
    	string = string + strings[strings.length-1];
        return string;

    }

    String asString (Card [] cards){
    	String string = "[";
    	
    	for (int index = 0; index < cards.length-1; index++){
    		string = string + cards[index] + " ";
    	}
    	string = string + cards[cards.length-1] +"]";
        return string;
    }

}
