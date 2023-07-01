import java.sql.*;

public class Application {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
		Connection conn= DriverManager.getConnection(url, "root", "password123");

		Statement statement = conn.createStatement();

		ResultSet res = statement.executeQuery("SELECT * FROM employees_tbl");

		while(res.next()) {
			System.out.println(res.getString("dept"));
		}
	}
}
