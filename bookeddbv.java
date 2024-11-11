

import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class bookeddbv {
	public int getavailabe(int num,Date date) throws SQLException {
		String query ="select seats from bookings where busno=? and Date = ?";
		Connection con = connection.getconnect();
		PreparedStatement st = con.prepareStatement(query);
		java.sql.Date sqdate = new java.sql.Date(date.getTime());
		st.setInt(1,num);
		st.setDate(2, sqdate);
		ResultSet rs =st.executeQuery();
		int aseats = 0;
		
		while(rs.next()) {
			 aseats+= rs.getInt(1); 
			
		}
		
		return aseats;
		
	}
	public void assignvalue(Bookingss book) throws SQLException {
		String query ="insert into bookings values(?,?,?,?)";
		Connection con = connection.getconnect();
		java.sql.Date sqdate =new java.sql.Date(book.date.getTime());
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1,book.busno);
		st.setString(2,book.name);
		st.setDate(3, sqdate);
		st.setInt(4, book.seats);
		st.executeUpdate();
		
	}

}
