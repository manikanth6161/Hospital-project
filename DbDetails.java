package hospital_mangament_system;

import java.io.*;
import java.sql.*;

public class DbDetails {

    private static final String FILE_PATH = "dbdetails.txt";

    // Save username and password
    public void saveDetails(String[] details) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write(details[0] + "\n" + details[1]);
            System.out.println("Database details saved successfully.");
        } catch (IOException e) {
            System.out.println("File write error: " + e.getMessage());
        }
    }

    // Read username and password
    public String[] getDetails() {
        String[] details = new String[2];
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            details[0] = br.readLine();
            details[1] = br.readLine();
        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }
        return details;
    }

    // Connect to existing database
    public Connection connectDatabase(String username, String password) {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/hospl";
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
        return con;
    }

    // Ensure 'flag' table exists
    public void checkFlagTable(Connection con) {
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery("SHOW TABLES LIKE 'flag'");
            if (!rs.next()) {
                stmt.executeUpdate("CREATE TABLE flag (id INT PRIMARY KEY AUTO_INCREMENT, status VARCHAR(10) NOT NULL)");
                stmt.executeUpdate("INSERT INTO flag (status) VALUES ('0')");
                stmt.executeUpdate("insert into flag (id,status) values('0,mani')");
                System.out.println("Flag table created with default row.");
            } else {
                System.out.println("Flag table exists.");
            }
        } catch (SQLException e) {
            System.out.println("Flag table check error: " + e.getMessage());
        }
    }
}
