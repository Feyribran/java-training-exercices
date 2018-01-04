package io.robusta.java.classic;

/**
 * Created by nicorama on 22/06/2017.
 */
public class FoodApp {


    static final int TRAVEL_COST = 2;

    int money = 0;
    int foodStock = 1000;



    void reset(){
    	this.money = 0;
    	this.foodStock = 1000;
    }

    int deliver(int food){
    	int resultPrice = food*2;
    	
    	this.money = this.money + resultPrice - this.TRAVEL_COST;
    	this.foodStock = this.foodStock - food;
        
    	return resultPrice;
    }

    int deliverAll(int count, int food){

    	int resultPrice = food*2*count;
    	
    	this.money = this.money + resultPrice - (count*this.TRAVEL_COST);
    	this.foodStock = this.foodStock - (count*food);
    	
        return resultPrice;
    }


}
