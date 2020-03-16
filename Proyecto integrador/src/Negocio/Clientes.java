package Negocio;

import Negocio.Conexion;
import Negocio.Conexion;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Clientes {
    
    public static void AgregarCliente(String a1, String a2, String a3, String a4, String a5, float a6, int a7)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call AgregarCliente(?,?,?,?,?,?,?)}");
        entrada.setString(1, a1);
        entrada.setString(2, a2);
        entrada.setString(3, a3);
        entrada.setString(4, a4);
        entrada.setString(5, a5);
        entrada.setFloat(6, a6);
        entrada.setInt(7, a7);
        entrada.execute();
    }
    
    public static void EliminarCliente(int a)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call EliminarCliente(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void ModificarCliente(int a1, String a2, String a3, String a4, String a5, String a6, float a7, int a8)throws SQLException{
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call ModificarCliente(?,?,?,?,?,?,?,?)}");
        entrada.setInt(1, a1);
        entrada.setString(2, a2);
        entrada.setString(3, a3);
        entrada.setString(4, a4);
        entrada.setString(5, a5);
        entrada.setString(6, a6);
        entrada.setFloat(7, a7);
        entrada.setInt(8, a8);
        entrada.execute();
    }

    
}
