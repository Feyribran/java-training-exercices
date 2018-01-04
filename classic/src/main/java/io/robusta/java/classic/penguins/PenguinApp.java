package io.robusta.java.classic.penguins;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by nicorama on 28/09/2017.
 */
public class PenguinApp {


    Penguin createSimplePenguin(){
    	String name = "";
		Penguin penguin = new Penguin(name);
		return penguin;
    }


    List<Penguin> getPenguins(Penguin ... penguins){
        List<Penguin> result = new ArrayList<>();
        
        for (Penguin petitPenguin : penguins) {
        		if(petitPenguin != null) {
        			result.add(petitPenguin);
        		}		
        }
    		return result;
    }

    Penguin getPenguinByName(Penguin[] pingouins, String name){

    		//int index = 0;

    		for (Penguin pingu : pingouins) {
    			if (pingu.name == name) {
				return pingu;
    			}
    		}
    		/*
    		while (index < pingouins.length) {
    			if (pingouins[index].name == name) {
    				return pingouins[index];
    			} else {
    				index++;
    			}
    		}*/

    		return null;
    }


    Penguin getFastest(List<Penguin> penguins){
        
    		//int index = 1;
    		Penguin fastest = penguins.get(0);
    		
    		for (Penguin current : penguins) {
    			if (fastest.speed < current.speed) {
    				fastest = current;
    			}	
    		}
    		
    		/*
    		for (int index = 1; index < penguins.size(); index++) {
    			if (fastest.speed < penguins.get(index).speed) {
    				fastest = penguins.get(index);
    			}	
    		*/
		//System.out.println("Pinguin le plus rapide : " + fastest.name);

    		/*
    		while (index < penguins.size()) {
    			System.out.println("index : " + index);
    			System.out.println("nom du current : " + penguins.get(index).name);
    			System.out.println("vitesse du current : " + penguins.get(index).speed);

    			if (penguins.get(index).speed > fastest.speed) {
    				fastest = penguins.get(index);
        			System.out.println("Pinguin le plus rapide : " + index + " - " + fastest.name);

    				index++;
    			} else {
    				index++;
    			}

    		}*/
		//System.out.println("FIN Pinguin le plus rapide : " + index + " - " + fastest.name);

    		return fastest;
    }

    Penguin getFriend(Penguin penguin){
    	
    		Penguin friend = penguin.friend;
        return friend;
    }

    List<Penguin> getPenguinsWithLetter(    Penguin[] pengouins, String letters){
        
    		List<Penguin> result = new ArrayList<>();
    		
    		for (Penguin current : pengouins) {
    			if (current.name.contains(letters)) {
    				result.add(current);
    			}
    		}
    	
    		return result;
    }

    Penguin[] getPenguinsWithLetter(    List<Penguin> pengouins, String letters){
         
    		List<Penguin> resultList = new ArrayList<>();
    		int arraySize = 0;
    		int index = 0;
    		
    		for (Penguin current : pengouins) {
    			if (current.name.contains(letters)) {
    				resultList.add(current);
    				arraySize++;
    			}
    		}
    		
    		Penguin resultArray [] = new Penguin [arraySize];
    		
    		for (Penguin currentReducedList : resultList) {
    			resultArray[index] = currentReducedList;
    			index++;
    		}
    	
    		return resultArray;
    }


    Object getSmallestSize(Penguin[] array, List<Penguin> list){
        
    		if (array.length < list.size()) {
    			return array;
    		} else if (array.length > list.size()){
    			return list;
    		} else {
    			return null;
    		}
    }

    Set<Penguin> getFriends(Penguin[] penguins){
    		Set<Penguin> resultSet = new HashSet<Penguin>();
    		List<Penguin> friendList = new ArrayList<>();
    		
    		for (Penguin currentPenguin : penguins) {
    			//System.out.println("parcours du tableau input : " + currentPenguin);
    			if (currentPenguin.friend != null) {
    				friendList.add(currentPenguin.friend);
    			}
    		}
    		if (friendList.size() > 0) {
    			resultSet.add(friendList.get(0));
    		}

    		for (int index = 1; index < friendList.size(); index++) {
    			int index2 = 0;
    			boolean result = true;
    			//System.out.println("index dans la for loop :" + index);
    			while(result == true && index2 < index) {
    				//System.out.println("index2 dans la while loop :" + index2);
    				if (friendList.get(index) != friendList.get(index2)) {
    					//System.out.println("friend index " + index + " : " + friendList.get(index).name);
    					//System.out.println("friend index2 " + index2 + " : " + friendList.get(index2).name);
    					index2++;
    				} else {
    					//System.out.println("friend index " + index + " : " + friendList.get(index).name);
    					//System.out.println("friend index2 " + index2 + " : " + friendList.get(index2).name);
    					result = false;
    				}
    			}
    			if (result == true) {
    				//System.out.println("friend à ajouter : " + friendList.get(index).name);
    				resultSet.add(friendList.get(index));
    			}
    			
    		}
    			
    		//System.out.println("taille du set à la fin :" + resultSet.size());	
    		return resultSet;
    }




}
