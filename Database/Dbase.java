import java.sql.*;
import java.util.*;

public class Dbase {
	Connection cn;
	PreparedStatement stmt;
	static Scanner scan = new Scanner(System.in);

	public Dbase() throws Exception {
		final String uname = "root";
		final String pwd = "";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Java", uname, pwd);
	}

	public void updateMarks() throws Exception {
		System.out.println("Enter roll");
		int roll = scan.nextInt();
		System.out.println("Enter marks");
		float marks = scan.nextFloat();
		stmt = cn.prepareStatement("UPDATE STUDENT SET MARKS =? WHERE ROLL =?");
		stmt.setFloat(1, marks);
		stmt.setFloat(2, roll);
		int i = stmt.executeUpdate();
		System.out.println("Records updated");

	}

	public void showRecord() throws Exception {
		System.out.println("Enter Roll no.: ");
		int roll = scan.nextInt();
		stmt = cn.prepareStatement("SELECT * FROM Student WHERE roll=?");
		stmt.setInt(1, roll);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			System.out.println("Name " + rs.getString(1));
			System.out.println("Roll " + rs.getInt(2));
			System.out.println("Faculty " + rs.getString(3));
			System.out.println("Marks " + rs.getFloat(4));
		} else {
			System.out.println("Student doesn't exist!!!");
		}
	}

	public void average() throws Exception {
		System.out.println("Enter marks");
		float marks = scan.nextFloat();
		stmt = cn.prepareStatement("SELECT avg(?) from Student");
		stmt.setFloat(1, marks);
		ResultSet rs = stmt.executeQuery();
		rs.next();
		System.out.println("average marks is :" + rs.getFloat(4));

	}

	public void delete() throws Exception {
		System.out.println("Enter roll to delete");
		int roll = scan.nextInt();
		stmt = cn.prepareStatement("DELETE FROM Student WHERE roll=?");
		stmt.setInt(1, roll);
		int i = stmt.executeUpdate();
		System.out.println(i + " Records Deleted");
	}

	public void exit() throws Exception {
		cn.close();
		System.exit(0);
	}

	public void showMenu() {
		System.out.println("******Menu*******");
		System.out.println("1.Show Record");

		System.out.println("2. Update Marks");
		System.out.println("3. Delete Marks");
		System.out.println("4. Average");
		System.out.println("5. Exit");

	}

	public static void main(String[] args) throws Exception {
		Dbase db = new Dbase();
		db.showMenu();

		while (true) {
			System.out.println("enter a choice");
			int ch = scan.nextInt();

			switch (ch) {
				case 1:
					db.showRecord();
					break;
				case 2:
					db.updateMarks();
					break;
				case 3:
					db.delete();
					break;

				case 4:
					db.average();
					break;

				case 5:
					db.exit();
					break;
				default:
					db.showMenu();

			}
		}
	}

}