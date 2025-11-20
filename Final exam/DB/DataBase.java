import java.sql.*;
import java.util.*;

public class DataBase {
    public static void main(String[] args) throws Exception {
        final String url = "jdbc:mysql//localhost:3306/dab";
        final String uname = "root";
        final String pwd = "myowd";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cnn = DriverManager.getConnection(url, uname, pwd);
        Scanner scan = new Scanner(System.in);
        int count = 0;
        PreparedStatement ps = cnn.prepareStatement("Insert into user values(?,?)");
        while (true) {
            System.out.println("Enter roll");
            int roll = scan.nextInt();
            System.out.println("Enter name");
            String name = scan.nextLine();
            ps.setInt(0, roll);
            ps.setString(1, name);
            ps.execute();
            count++;
            System.out.println("wanna continue or exit (y/n)?");
            String choice = scan.nextLine();
            if (choice.equals('y')) {
                break;
            }
        }

        System.out.println(count + "Records inserted Successfully");
        cnn.close();
    }
}