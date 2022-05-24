package com.clientAdmin.Tasks;

public class Kata {
    //public static int snail(int column, int day, int night) {
	public static void main(String[] args)
	{		
     int actualTime =0;
     int dayCount =0;
     int column = 10;
     int day = 3;
     int night = 2;
      
    while(actualTime !=column)
        {
		    	
		    	
		    		actualTime = (day+actualTime)-night;
		            System.out.println("actualTime = "+actualTime);
		              
		}
        
      System.out.println("daycouunt = "+dayCount);
      
      
    }
}