package hospital_mangament_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class establishconnection {

    private static final String URL = "jdbc:mysql://localhost:3306/hospl";
    private static final String USER = "root";       // your MySQL username
    private static final String PASSWORD = "123456"; // your MySQL password
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL Driver
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    Connection con;
    private Statement st;
    public ResultSet rs; // ✅ accessible in Activity_5

    public establishconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            st = con.createStatement();
            System.out.println("Database connected successfully");
        } catch (Exception e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
    }

    // ✅ For SELECT queries
    public void executeQuery(String query) {
        try {
            rs = st.executeQuery(query);
        } catch (Exception e) {
            System.out.println("Query execution error: " + e.getMessage());
        }
    }

    // ✅ For INSERT, UPDATE, DELETE
    public int update(String query) {
        try {
            return st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Update error: " + e.getMessage());
            return 0;
        }
    }

    // ✅ Close resources (optional, but good practice)
    public void close() {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Close error: " + e.getMessage());
        }
    }
}   