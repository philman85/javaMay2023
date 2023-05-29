package com.learn.java;

public class CakeBake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake = new Cake();
        cake.setCake(1.5,"Fruit Cake",true,'M');
        cake.bakeCake();
        System.out.println(cake.cakeDecor());
        System.out.println("Your cake is ready!");
        System.out.println("++++++++++++++++++");
        System.out.println("Please pay the cost of cake Rs."+cake.cakeCost(1.5,"Fruit Cake"));
        System.out.println("++++++++++++++++++");
	}

}

class Cake{
	
	 	private double cakeWeight;
	    private String cakeFlavor;
	    private boolean hasEggs;
	    private char cakeSize;
	    
	    
	    void setCake(double x, String y, boolean z, char p) {
			System.out.println("Preheating oven and setting preferences....");
			cakeWeight = x;
			cakeFlavor = y;
			hasEggs= z;
			cakeSize= p;
		}
	    
	  
	    void bakeCake() {
	      	    	
	    	System.out.println("Weight of Cake : "+cakeWeight);
			System.out.println("Cake Flavor  : "+cakeFlavor);
			System.out.println("Does cake have eggs? : "+hasEggs);
			System.out.println("Cake Dimensions: "+cakeSize);
			System.out.println("-------------------");
	    }
	    
	    float cakeCost(double x, String y) {
	    	if (y=="Chocolate"&&x>=1)
	    		return 500;
	    	else 
	    		return 1000;
	    }
	    
	    String cakeDecor() {
	    	return "Cake Frosting with Decoration";
	    }
}

