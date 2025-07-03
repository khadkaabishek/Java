import java.sql.*;

public class Example {
    public static void main(String[] args) throws Exception {
        final String url = "jdbc:mysql://localhost:3306/Java";
        final String username = "root";
        final String password = "";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection(url, username, password);
        Statement stmt = cn.createStatement();
        String query = "SELECT * FROM person";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println("  ID  First-Name  Last-Name  Age  Email");
        while (rs.next()) {
            System.out.println(" " + rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
                    + " " + rs.getString(5));
        }
        cn.close();
    }
}

// to run this kode
// compile this one first by following command :
// javac Example.java

// then run with command :
// java -cp
// '/Users/abishekkhadka/Downloads/mysql-connector-j-9.3.0/mysql-connector-j-9.3.0.jar' Example.java