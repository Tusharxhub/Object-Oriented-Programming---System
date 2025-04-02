//! Develop a Java program to access the Employee database and show the records of employees using JDBC.


import java.sql.*;

public class EmployeeDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/tushar";
        String user = "root";
        String password = "Hi,Tushar29@35";
        String query = "SELECT name, position, salary FROM employees";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Name | Position | Salary");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " | " + rs.getString("position") + " | " + rs.getDouble("salary"));
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
