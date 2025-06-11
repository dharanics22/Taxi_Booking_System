package booking_syatem;
import java.util.*;
public class Taxi {
	
      private int id;
      private char current_point;
      private int total_earning;
      private int free_time;
      private  List<String>trips;
      Taxi(int id){
    	  this.id=id;
    	  this.current_point='A';
    	  this.total_earning=0;
    	  this.free_time=0;
    	  this.trips=new ArrayList<>();
      }
      public int  getId() {
    	  return id;
      }
      public char getCurrent_Point() {
    	  return current_point;
      }
      public int getTotal_Earning() {
    	  return total_earning;
      }
      public int getFree_Time() {
    	  return free_time;
      }
      
      public void bookride(char pickup,char drop,int time,int customerId) {
    	  int droptime=time+Math.abs(drop-pickup);
    	  int fare=calcaulatefare(pickup,drop);
    	  this.current_point=drop;
    	  this.free_time=droptime;
    	  this.total_earning+=fare;
    	  String trip = "CustomerID: " + customerId +
                  " | Pickup: " + pickup +
                  " | Drop: " + drop +
                  " | PickupTime: " + time +
                  " | DropTime: " + droptime +
                  " | Fare: Rs." + fare;

         trips.add(trip);
      }
      public int calcaulatefare(char pickup,char drop) {
    	  int dis=Math.abs(drop-pickup)*15;
    	  return 100+(dis-5)*10;
      }
      public void display() {
    	  System.out.println("Taxi-" + id + " | Total Earnings: Rs." + total_earning);
    	  for(String trip:trips) {
    		  System.out.println(trip);
    	  }
    	  System.out.println("----------------------------------");
      }
      
}
