package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author maynor.menjivarusam
 */
public class Conexion {

    private static String db = "torneoTenis";
    private static String usser = "root";
    private static String pass = "root";
    private static String url = "jdbc:mysql://localhost:3306/" + db + "?useSSL=false";

    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public void conectar() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection(url, usser, pass);
            if (this.con != null) {
                System.out.println("Conectado correctamente");
            } else {
                System.out.println("Error de conexion");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void desconectar() throws Exception {
        try {
            if (this.con != null) {
                if (this.con.isClosed() != true) {
                    this.con.close();
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
 
   /* public static void main(String[] args) {

        try {
            Conexion cone = new Conexion();
            cone.conectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
