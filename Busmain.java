


import java.sql.SQLException;
import java.util.*;



public class Busmain{
    public static void main(String[] args) {
      try (Scanner scan = new Scanner(System.in)) {
          busdbv bus = new busdbv();
          try {
              bus.getbuses();
          } catch (SQLException e) {
              // TODO Auto-generated catch block

          }
          int num = 1;
            while (num==1) {
                System.out.println("Enter 1 for continue booking and 2 for exit ");
                num = scan.nextInt();
                if (num==1){
                    Bookingss booking = new Bookingss();
                    
                    try {
                        if(booking.issequal()){
                            bookeddbv buk = new bookeddbv();
                            buk.assignvalue(booking);
                            System.out.println("Booked Succesfully...... thank you "+booking.name);
                            
                        }
                        else{
                            System.out.println("Bus is full try another date or Bus");
                        }
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block

                    }
                    
                }   }
//
    }    }
}