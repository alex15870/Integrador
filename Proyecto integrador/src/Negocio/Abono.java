package Negocio;

import Negocio.Conexion;
import Negocio.Conexion;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Abono {
    
    public static void AgregarCobrador(String a1, String a2, String a3, String a4)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call AgregarCobrador(?,?,?,?)}");
        entrada.setString(1, a1);
        entrada.setString(2, a2);
        entrada.setString(3, a3);
        entrada.setString(4, a4);
        entrada.execute();
    }
    
    public static void EliminarCobrador(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarCobrador(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void ModificarCobrador(int a1, String a2, String a3, String a4, String a5)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ActualizarCobrador(?,?,?,?,?)}");
        entrada.setInt(1, a1);
        entrada.setString(2, a2);
        entrada.setString(3, a3);
        entrada.setString(4, a4);
        entrada.setString(5, a5);
        entrada.execute();
    }

    
}
