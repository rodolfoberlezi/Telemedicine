package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodolfo
 */
public class BankConnection {

    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String way;
    private String user;
    private String password;
    public Connection conn;

    public void connection() {
        try {
            String setProperty = System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(way, user, password);
            JOptionPane.showMessageDialog(null, "Sucess");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fail");
        }
    }

    public void disconnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failure to disconnection");
        }
    }

}
