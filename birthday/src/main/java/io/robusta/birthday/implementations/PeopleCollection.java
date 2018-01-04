package io.robusta.birthday.implementations;

import io.robusta.birthday.interfaces.IPeople;
import io.robusta.birthday.interfaces.IPeopleCollection;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Nicolas Zozol on 04/10/2016.
 */
public class PeopleCollection extends ArrayList<People>implements IPeopleCollection<People> {

	public PeopleCollection() {

	}

	public PeopleCollection(int size) {
		super(size);
		for (int i = 0; i < size; i++) {
			People people = new People();
			Random random = new Random();
			int date = random.nextInt(365) + 1;
			people.setBirthday(date);
			this.add(people);
		}
	}

	@Override
	public boolean hasSame() {
		
		/* return true if two people of the same collection has
		 same birthday
		  */
		
		boolean result = false;
		
		for (int current = 0; current < this.size() - 1; current++){
			for (int current2 = current + 1; current2 <this.size(); current2 ++){
				if (this.get(current).birthday == this.get(current2).birthday){
		    		result = true;
		    	}
			}
		}
		return result;
	}

}
