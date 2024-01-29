package reservation;

import java.sql.*;
import java.util.Date;


public class BookingDAO {
public int getBookedCount(int busNo,Date date) throws SQLException{
	    String url="jdbc:mysql://localhost:3306/ busresev";
	    String username="root";
	    String pass="karthik12@";
		String query = "select count(passenger_name) from booking where bus_no=? and travel_date=?";
		
		Connection con = DriverManager.getConnection(url, username, pass);
		PreparedStatement pst = con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, busNo);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	
	public void addBooking(Booking booking) throws SQLException{
		String url="jdbc:mysql://localhost:3306/ busresev";
	    String username="root";
	    String pass="karthik12@";
		String query = "Insert into booking values(?,?,?)";
		
		Connection con = DriverManager.getConnection(url, username, pass);
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, booking.passengerName);
		pst.setInt(2, booking.busNo);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
	}

}
