

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bookingss {
    String name;
    int seats;
    Date date;
    int busno;
   
    Bookingss(){
        Scanner scan = new Scanner(System.in);
			System.out.println("Enter your name :");
			name = scan.nextLine();
			System.out.println("Enter the Bus no:");
			busno = scan.nextInt();
			System.out.println("Enter the Seats:");
			seats = scan.nextInt();
			System.out.println("Enter the date (dd-mm-yyyy):");
			String dateins = scan.next();
			SimpleDateFormat sdate = new SimpleDateFormat("dd-MM-yyyy");
			try {
			    date = sdate.parse(dateins);
			} catch (ParseException e) {
			    
			    e.printStackTrace();
			}
		


    }
     public boolean issequal() throws SQLException{
    	 busdbv bus = new busdbv();
    	 bookeddbv buked = new bookeddbv();
        int capacit = bus.getcapacity(busno) ;
     	
        int booked = 0 ;
        
        int availab = buked.getavailabe(busno,date);
        booked = availab+this.seats;

        return booked<=capacit;
    }
    
}
