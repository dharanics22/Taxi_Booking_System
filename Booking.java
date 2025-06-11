package booking_syatem;
import java.util.*;
public class Booking {
       private int customer_id;
       private List<Taxi>taxies;
       Booking(){
    	   taxies=new ArrayList<>();
           for(int i=1;i<=4;i++) {
        	   taxies.add(new Taxi(i));
           }
           customer_id=1;
       }
       public void booktaxi(char pickup,char drop,int time) {
    	   Taxi selectedtaxi=null;
    	   int mindistance=Integer.MAX_VALUE;
    	   for(Taxi taxi:taxies) {
    		   if(taxi.getFree_Time()<=time) {
    			   int distance=Math.abs(taxi.getCurrent_Point()-pickup);
    			   if(selectedtaxi==null || distance<mindistance || (distance==mindistance && taxi.getTotal_Earning()<selectedtaxi.getTotal_Earning())) {
    				   selectedtaxi=taxi;
    				   mindistance=distance;
    			   }
    		   }
    	   }
    	   if(selectedtaxi!=null) {
    		   selectedtaxi.bookride(pickup, drop, time, customer_id);
    		   System.out.println("Taxi can be alloted");
    		   System.out.println(selectedtaxi.getId());
    	   }
    	   else {
    		   System.out.println("Taxi cannot be alloted.No free Taxiii");
    	   }
    	   customer_id++;
       }
       public void displayalltaxi() {
    	   for(Taxi taxi:taxies) {
    		   taxi.display();
    	   }
       }
}
