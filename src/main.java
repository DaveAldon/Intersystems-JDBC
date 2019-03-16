import java.sql.*;
import com.intersys.jdbc.*;

// This class connects to an Intersystems Cache database via JDBC and runs a SQL query
// on one of the built in sample tables in the SAMPLES namespace
public class main {
	public static void main(String[] args) {
		try {
			// Create special Cache object
			CacheDataSource ds = new CacheDataSource();
			// Connection parameters
			ds.setURL("jdbc:Cache://HOSTNAME:1972/SAMPLES");
			ds.setUser("USERNAME");
			ds.setPassword("PASSWORD");
			
			// This will be the connection. If it fails to connect, it will capture it here
			Connection dbconnection = ds.getConnection();
			// Prepare the object your query is going to be run against
			Statement stmt = dbconnection.createStatement();
			// Query init
			String sql;
			sql = "SELECT AircraftCategory FROM Aviation.Aircraft";
			// Execute the query
			ResultSet rs = stmt.executeQuery(sql);
			// Go through the result
   			while(rs.next()){
   				String AircraftCategory = rs.getString("AircraftCategory");
   				//Display values
   				System.out.print("AircraftCategory: " + AircraftCategory);
			}
   			// Close out the connection when we're done
			rs.close();
		}
		catch (SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
