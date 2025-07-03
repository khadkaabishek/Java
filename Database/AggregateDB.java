import java.sql.*;

public class AggregateDB {
    public static void main(String[] args) throws Exception {
        final String url = "jdbc:mysql://localhost:3306/Java";
        final String username = "root";
        final String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection(url, username, password);
        Statement stmt = cn.createStatement();
        String query = "SELECT sum(age) as TotalAge , avg(age) as AverageAge FROM person";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("Your Output");
        rs.next();
        System.out.println("Sum " + rs.getFloat(1) + "Average " + rs.getFloat(2));
        cn.close();

    }
}