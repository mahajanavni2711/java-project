import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:sqlite:book_management.db";

    public static Connection getConnection() throws SQLException {

        try {
            Class.forName("org.sqlite.JDBC");  // ✅ Required for loading the driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new SQLException("SQLite JDBC Driver not found!");
        }
        return DriverManager.getConnection(URL);
    }
}

