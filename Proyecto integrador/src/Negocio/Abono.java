package Negocio;

import Negocio.Conexion;
import Negocio.Conexion;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Abono {
    
    public static void AgregarAbono(String a1, int a2, String a3, String a4, String a5, String a6, int a7, int a8)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call AgregarAbono(?,?,?,?,?,?,?,?)}");
        entrada.setString(1, a1);
        entrada.setInt(2, a2);
        entrada.setString(3, a3);
        entrada.setString(4, a4);
        entrada.setString(5, a5);
        entrada.setString(6, a6);
        entrada.setInt(7, a7);
        entrada.setInt(8, a8);
        entrada.execute();
    }
    

    
}
