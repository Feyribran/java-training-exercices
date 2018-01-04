package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IGeneration;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class Generation implements IGeneration{

    List<PeopleCollection> collections;

    public Generation(){

    }

    public Generation(int n, int collectionSize) {
        this.collections = createAllRandom(n, collectionSize);
    }

    @Override
    public PeopleCollection createRandom(int size) {
    	
    	PeopleCollection result = new PeopleCollection(size);
    	
    	return result;
    }

    @Override
    public List<PeopleCollection> createAllRandom(int n, int size) {
        // call n times createRandom(size)
        List<PeopleCollection> resultList = new ArrayList<>();
    	
        for (int current = 0; current < n; current++){
    		PeopleCollection resultPeople = new PeopleCollection(size);
    		resultList.add(resultPeople);
    	}
    	
    	return resultList;
    }

    @Override
    public List<PeopleCollection> getPeopleCollections() {
    	return this.collections;
    }

    @Override
    public int getNumberOfCollectionsThatHasTwoPeopleWithSameBirthday() {
        
    	int result = 0;
    	
    	for (int current = 0; current < this.getPeopleCollections().size(); current++){
    		if (this.getPeopleCollections().get(current).hasSame()){
    		result++;
    		}
    	}	
    	return result;
    }

    @Override
    public boolean isLessThan50() {
        
    	boolean result = false;
    	
    	for (int current = 0; current < this.getPeopleCollections().size(); current++){
    		if (this.getPeopleCollections().get(current).size() < 50){
    			result = true;
    		}
    	}	
    	
    	return result;
    }


}
