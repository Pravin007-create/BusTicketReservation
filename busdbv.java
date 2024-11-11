

import java.sql.*;
import java.sql.SQLException;

public class busdbv {
	public void getbuses() throws SQLException {
		String query ="SELECT * FROM BUS;";
		Connection con = connection.getconnect();
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		while(rs.next()) {
			System.out.print("BUS NO: "+rs.getInt(1)+" , ");
			System.out.print("CAPASITY: "+rs.getInt(2)+" , ");
			if(rs.getBoolean(3)) {
				System.out.print("AC:YES");
			}
			else {
				System.out.print("AC:NO");
			}
		System.out.println();	
		}
		
		
		
	}
	public int getcapacity(int bcap) throws SQLException {
		String query ="select capasity from bus where busno='"+bcap+"'";
		Connection con = connection.getconnect();
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
		
	}

}
