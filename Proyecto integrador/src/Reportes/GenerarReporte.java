/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import Negocio.Conexion;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Alex
 */
public class GenerarReporte {
    
    public void reporteAbonos(String fecha){
        
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("src/Reportes/reporteAbonosFecha.jasper");
            Map parametro = new HashMap();
            
            parametro.put("Fecha", fecha);
            
            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, Conexion.getConexion());
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reportes de abonos");
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
        
        
    }
    
    public void reporteCobrador(int id){
        
        try {
            JasperReport reporte = (JasperReport) JRLoader.loadObject("src/Reportes/reporteCobrador.jasper");
            Map parametro = new HashMap();
            
            parametro.put("Cobrador", id);
            
            JasperPrint j = JasperFillManager.fillReport(reporte, parametro, Conexion.getConexion());
            JasperViewer jv = new JasperViewer(j,false);
            jv.setTitle("Reportes de abonos por cobrador");
            jv.setVisible(true);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
        
        
    }
    
}
