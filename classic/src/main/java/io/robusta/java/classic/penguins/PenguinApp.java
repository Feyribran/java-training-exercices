package io.robusta.java.classic.penguins;

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
        List<Penguin> penguins = new List<>();
        
        int index = 0;
        while (index < penguins.size()){
        	penguins.
        	index++;
        }
    	
    	return null;
    }

    Penguin getPenguinByName(Penguin[] pingouins, String name){
        return null;
    }


    Penguin getFastest(List<Penguin> penguins){
        return null;
    }

    Penguin getFriend(Penguin penguin){
        return null;
    }

    List<Penguin> getPenguinsWithLetter(    Penguin[] pengouins, String letters){
        return null;
    }

    Penguin[] getPenguinsWithLetter(    List<Penguin> pengouins, String letters){
        return null;
    }


    Object getSmallestSize(Penguin[] array, List<Penguin> list){
        return null;
    }





    Set<Penguin> getFriends(Penguin[] penguins){
        return null;
    }




}
