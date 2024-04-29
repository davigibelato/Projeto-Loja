package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Conexao implements ServletContextListener {
    private static final String url = "jdbc:mysql://localhost:3306/banco_ds";
    private static final String user = "root";
    private static final String password = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static Connection con;

    public static Connection conectar() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static void fecharConexao() {
        try {
            if (con != null) {
                con.close();
            }
            DriverManager.deregisterDriver(DriverManager.getDriver(url));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        fecharConexao();
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // Não é necessário fazer nada na inicialização do contexto
    }
}
