package booking_syatem;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Booking booking=new Booking();
 	   System.out.println("-----Welcome to Taxi Booking-------");
 	   while(true) {
 		   System.out.println("\n1.Taxi Booking \n2.Display Taxi Details \n3.Exit");
 		   Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
 		   switch(n) {
 		   case 1:
 			   System.out.println("Enter PickPoint(A-F)");
 			   char pickup=Character.toUpperCase(sc.next().charAt(0));
 			   System.out.println("Enter DropPoint(A-F)");
 			   char drop=Character.toUpperCase(sc.next().charAt(0));
 			   System.out.println("Enter Picck Up Timing");
 			   int time=sc.nextInt();
 			   if(pickup<'A' || pickup>'F' || drop<'A' || drop>'F' || pickup==drop) {
 				   System.out.println("Enter valid pickup and drop point");
 			   }
 			   else {
 				   booking.booktaxi(pickup,drop,time);
 			   }
 			   break;
 		  case 2:
			   booking.displayalltaxi();
			   break;
		   case 3:
			  System.out.println("Thanks For Visting");
			  return;
 		   }
 		  
 	   }
 	   
    }
}
