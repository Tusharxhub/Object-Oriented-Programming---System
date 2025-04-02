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







//? This program connects to a MySQL database named "tushar" and retrieves employee records from the "employees" table.
//? It uses JDBC to establish the connection, execute a SQL query, and display the results in a formatted manner.
//? The program handles exceptions and ensures that resources are closed after use.
//? Make sure to replace the database URL, username, and password with your own credentials before running the program.
//? Also, ensure that the MySQL JDBC driver is included in your classpath.




//? To run this program, you need to have the MySQL JDBC driver in your classpath.


//? To run the program, following commands can be used in the terminal:
//? 1. Compile the program: javac EmployeeDatabase.java
//? 2. Run the program: java -cp .:mysql-connector-java-x.x.x.jar EmployeeDatabase
//? (Replace x.x.x with the version of the MySQL connector you are using.)   [In my case my version is mysql-connector-j-9.2.0]
//? Make sure to have the MySQL server running and the database and table created before executing the program.
