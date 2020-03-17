/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Negocio.*;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lv1821
 */
public class Interfaz_usuario extends javax.swing.JFrame implements Tablas{

    static ResultSet res;
    int cont;
    
    /**
     * Creates new form Interfaz_usuario
     */
    public Interfaz_usuario() {
        initComponents();
        CreaTablas();
        tablaCobrador.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent mouse_evt){
                JTable table = (JTable) mouse_evt.getSource();
                Point point = mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (mouse_evt.getClickCount() == 2){
                    txt_Midcobrador.setText(tablaCobrador.getValueAt(tablaCobrador.getSelectedRow(), 0).toString());
                    txt_Mnombrecobrador.setText(tablaCobrador.getValueAt(tablaCobrador.getSelectedRow(), 1).toString());
                    txt_Mcobradorzona.setText(tablaCobrador.getValueAt(tablaCobrador.getSelectedRow(), 2).toString());
                    txt_MdireccionCobrador.setText(tablaCobrador.getValueAt(tablaCobrador.getSelectedRow(), 3).toString());
                    txt_McelularCobrador.setText(tablaCobrador.getValueAt(tablaCobrador.getSelectedRow(), 4).toString());
                }
                
            }
        });
        
        tablaCliente.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent mouse_evt){
                JTable table = (JTable) mouse_evt.getSource();
                Point point = mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if (mouse_evt.getClickCount() == 2){
                    txt_Midcliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 0).toString());
                    txt_MnombreCliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 1).toString());
                    txt_MdirCliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 2).toString());
                    txt_MtelCliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 3).toString());
                    txt_MsectorCliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 4).toString());
                    txt_MartCliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 5).toString());
                    txt_MengancheCliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 6).toString());
                    txt_McobradorCliente.setText(tablaCliente.getValueAt(tablaCliente.getSelectedRow(), 7).toString());
                }
                
            }
        });
        
        /***********
         * 
         */
        this.comboRcliente1.removeAllItems();
        try {
            res = Negocio.Conexion.Consulta("select * from Cobrador");
            while (res.next()){
                this.comboRcliente1.addItem(res.getString("IDcobrador"));
            }
        } catch (Exception e) {
        }
        
    }
    
    @Override
    public void CreaTablas() {
        DefaultTableModel modelo = (DefaultTableModel) tablaAyuda.getModel();
        modelo.setRowCount(0);
        res = Negocio.Conexion.Consulta("select * from Cobrador");
        try{
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                modelo.addRow(v);
                tablaAyuda.setModel(modelo);
            }
        }catch (SQLException e){
        }
        //----------------------------------------------------------------------
        DefaultTableModel modelo1 = (DefaultTableModel) tablaCobrador.getModel();
        modelo1.setRowCount(0);
        res = Negocio.Conexion.Consulta("select * from Cobrador");
        try{
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                modelo1.addRow(v);
                tablaCobrador.setModel(modelo1);
            }
        }catch (SQLException e){
        }
        //----------------------------------------------------------------------
        DefaultTableModel modelo2 = (DefaultTableModel) tablaCliente.getModel();
        modelo2.setRowCount(0);
        res = Negocio.Conexion.Consulta("select * from Cliente");
        try{
            while(res.next()){
                Vector v = new Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getString(6));
                v.add(res.getFloat(7));
                v.add(res.getInt(8));
                modelo2.addRow(v);
                tablaCobrador.setModel(modelo2);
            }
        }catch (SQLException e){
        }
        
    }

    
    
    
    
    
    
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_Rcliente2 = new javax.swing.JTextField();
        txt_Rcliente3 = new javax.swing.JTextField();
        txt_Rcliente4 = new javax.swing.JTextField();
        txt_Rcliente5 = new javax.swing.JTextField();
        txt_Rcliente6 = new javax.swing.JTextField();
        btnRcliente = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        comboRcliente = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        comboRcliente1 = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaAyuda = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_Midcliente = new javax.swing.JTextField();
        txt_MnombreCliente = new javax.swing.JTextField();
        txt_MdirCliente = new javax.swing.JTextField();
        txt_MtelCliente = new javax.swing.JTextField();
        txt_MsectorCliente = new javax.swing.JTextField();
        txt_MartCliente = new javax.swing.JTextField();
        txt_MengancheCliente = new javax.swing.JTextField();
        txt_McobradorCliente = new javax.swing.JTextField();
        btnMcliente = new javax.swing.JButton();
        btnEcliente = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Rcobrador = new javax.swing.JTextField();
        txt_Rcobrador2 = new javax.swing.JTextField();
        txt_Rcobrador3 = new javax.swing.JTextField();
        btnRCobrador = new javax.swing.JButton();
        comboRcobrador = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCobrador = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Midcobrador = new javax.swing.JTextField();
        txt_Mnombrecobrador = new javax.swing.JTextField();
        txt_Mcobradorzona = new javax.swing.JTextField();
        txt_MdireccionCobrador = new javax.swing.JTextField();
        txt_McelularCobrador = new javax.swing.JTextField();
        btnMcobrador = new javax.swing.JButton();
        btnEcobrador = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel37.setBackground(new java.awt.Color(102, 102, 0));
        jLabel37.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel37.setText("DATOS DE DEL CLIENTE.");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setText("Tabla1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tabla 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Tabla 3");

        jButton4.setText("Tabla 4");

        jButton5.setText("Tabla 5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(jButton3)
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addGap(57, 57, 57)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.setName("Registrar Cobrador"); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setText("Nombre:");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel13.setText("Dirección:");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel14.setText("Telefono:");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel15.setText("Sector:");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setText("Articulo:");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setText("Enganche:");

        btnRcliente.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnRcliente.setText("REGISTRAR");
        btnRcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRclienteActionPerformed(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(102, 102, 0));
        jLabel39.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel39.setText("REGISTRO DEL CLIENTE.");

        comboRcliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norte", "Monte Carlo", "Villa ITSON", "Nuevo Cajeme" }));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setText("Cobrador");

        comboRcliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norte", "Monte Carlo", "Villa ITSON", "Nuevo Cajeme" }));

        tablaAyuda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablaAyuda);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(comboRcliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(comboRcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Rcliente2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(txt_Rcliente3)
                                    .addComponent(txt_Rcliente4)
                                    .addComponent(txt_Rcliente5)
                                    .addComponent(txt_Rcliente6))))))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(btnRcliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_Rcliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_Rcliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_Rcliente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(comboRcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_Rcliente5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_Rcliente6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(comboRcliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnRcliente)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jTabbedPane5.addTab("Registrar Cliente", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        tablaCliente.setBackground(new java.awt.Color(102, 102, 102));
        tablaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Fecha", "Dirección", "Telefono", "Sector", "Articulo", "Enganche"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCliente);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("ID:");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Nombre:");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("Direccion:");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setText("Telefono:");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setText("Sector:");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel24.setText("Articulo:");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setText("Enganche:");

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel26.setText("Cobrador:");

        txt_Midcliente.setEditable(false);
        txt_Midcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MidclienteActionPerformed(evt);
            }
        });

        txt_MartCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MartClienteActionPerformed(evt);
            }
        });

        btnMcliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnMcliente.setText("Modificar Registro");
        btnMcliente.setActionCommand("MODIFICAR");
        btnMcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMclienteActionPerformed(evt);
            }
        });

        btnEcliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEcliente.setText("Eliminar registro");
        btnEcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEclienteActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(102, 102, 0));
        jLabel38.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel38.setText("DATOS DEL CLIENTE.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Midcliente)
                            .addComponent(txt_MnombreCliente)
                            .addComponent(txt_MdirCliente)
                            .addComponent(txt_MtelCliente))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_MsectorCliente)
                            .addComponent(txt_MartCliente)
                            .addComponent(txt_MengancheCliente)
                            .addComponent(txt_McobradorCliente))
                        .addGap(134, 134, 134))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btnMcliente)
                                .addGap(163, 163, 163)
                                .addComponent(btnEcliente))
                            .addComponent(jLabel38))
                        .addContainerGap(218, Short.MAX_VALUE))))
            .addComponent(jScrollPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel23)
                    .addComponent(txt_Midcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MsectorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel24)
                    .addComponent(txt_MnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MartCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel25)
                    .addComponent(txt_MdirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MengancheCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26)
                    .addComponent(txt_MtelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_McobradorCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMcliente)
                    .addComponent(btnEcliente))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane5.addTab("Modificar/Eliminar Cliente", jPanel5);

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel27.setText("Fecha:");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel28.setText("No de folio:");

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel29.setText("Dirección:");

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel30.setText("Telefono:");

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel31.setText("Sector:");

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel32.setText("Articulo:");

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel33.setText("Cantidad:");

        jButton12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jButton12.setText("REGISTRAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(102, 102, 0));
        jLabel36.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel36.setText("DATOS DE DEL ABONO.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField32)
                            .addComponent(jTextField31)
                            .addComponent(jTextField30)
                            .addComponent(jTextField29)
                            .addComponent(jTextField28)
                            .addComponent(jTextField27)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(362, 362, 362))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(37, 37, 37))
        );

        jTabbedPane5.addTab("Registro abono", jPanel7);

        jPanel3.setBackground(new java.awt.Color(102, 102, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setMaximumSize(new java.awt.Dimension(2000, 2000));

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel1.setText("DATOS DE REGISTRO.");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Ruta:");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Direccion:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Celular:");

        txt_Rcobrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RcobradorActionPerformed(evt);
            }
        });

        txt_Rcobrador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Rcobrador2ActionPerformed(evt);
            }
        });

        txt_Rcobrador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Rcobrador3ActionPerformed(evt);
            }
        });

        btnRCobrador.setBackground(new java.awt.Color(102, 102, 0));
        btnRCobrador.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnRCobrador.setForeground(new java.awt.Color(102, 102, 102));
        btnRCobrador.setText("REGISTRAR");
        btnRCobrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRCobradorActionPerformed(evt);
            }
        });

        comboRcobrador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Norte", "Monte Carlo", "Villa ITSON", "Nuevo Cajeme" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_Rcobrador2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                            .addComponent(comboRcobrador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Rcobrador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Rcobrador3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jLabel35)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRCobrador)
                .addGap(323, 323, 323))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Rcobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel35))
                        .addGap(18, 18, 18)
                        .addComponent(comboRcobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Rcobrador2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(txt_Rcobrador3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(65, 65, 65)
                .addComponent(btnRCobrador)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Registrar cobrador", jPanel3);

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));

        tablaCobrador.setBackground(new java.awt.Color(102, 102, 102));
        tablaCobrador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Zona", "Direccion", "Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCobrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCobradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCobrador);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("ID:");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel8.setText("Zona:");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel9.setText("Dirección:");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setText("Celular:");

        txt_Midcobrador.setEditable(false);

        txt_Mnombrecobrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_MnombrecobradorActionPerformed(evt);
            }
        });

        btnMcobrador.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnMcobrador.setText("MODIFICAR");
        btnMcobrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMcobradorActionPerformed(evt);
            }
        });

        btnEcobrador.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        btnEcobrador.setText("ELIMINAR");
        btnEcobrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEcobradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Midcobrador)
                            .addComponent(txt_Mnombrecobrador)
                            .addComponent(txt_Mcobradorzona, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_MdireccionCobrador)
                                    .addComponent(txt_McelularCobrador, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnEcobrador))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(btnMcobrador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(txt_Midcobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_MdireccionCobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(txt_Mnombrecobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_McelularCobrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Mcobradorzona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMcobrador)
                    .addComponent(btnEcobrador))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane5.addTab("Modificar/Eliminar cobrador", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane5)))
                .addContainerGap())
        );

        jTabbedPane5.getAccessibleContext().setAccessibleName("REGISTRAR COBRADOR");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_RcobradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RcobradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RcobradorActionPerformed

    private void txt_Rcobrador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Rcobrador3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Rcobrador3ActionPerformed

    private void txt_MnombrecobradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MnombrecobradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MnombrecobradorActionPerformed

    private void txt_MartClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MartClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MartClienteActionPerformed

    private void txt_MidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_MidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_MidclienteActionPerformed

    private void txt_Rcobrador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Rcobrador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Rcobrador2ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnMclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMclienteActionPerformed
        // TODO add your handling code here:
        
        if(txt_Midcliente.getText().isEmpty() && txt_MnombreCliente.getText().isEmpty() && txt_MdirCliente.getText().isEmpty() && txt_MtelCliente.getText().isEmpty() && txt_MsectorCliente.getText().isEmpty() && txt_MartCliente.getText().isEmpty() && txt_MengancheCliente.getText().isEmpty() && txt_McobradorCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese bien la informacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            txt_Midcliente.requestFocus();
            txt_MnombreCliente.requestFocus();
            txt_MdirCliente.requestFocus();
            txt_MtelCliente.requestFocus();
            txt_MsectorCliente.requestFocus();
            txt_MartCliente.requestFocus();
            txt_MengancheCliente.requestFocus();
            txt_McobradorCliente.requestFocus();
        } else {
            try {
                    Clientes.ModificarCliente(Integer.parseInt(txt_Midcliente.getText()),txt_MnombreCliente.getText(), txt_MdirCliente.getText(), txt_MtelCliente.getText(), txt_MsectorCliente.getText(), txt_MartCliente.getText(),  Float.parseFloat(txt_MengancheCliente.getText()), Integer.parseInt(txt_McobradorCliente.getText()));
                    txt_Midcliente.setText("");
                    txt_MnombreCliente.setText("");
                    txt_MdirCliente.setText("");
                    txt_MtelCliente.setText("");
                    txt_MsectorCliente.setText("");
                    txt_MartCliente.setText("");
                    txt_MengancheCliente.setText("");
                    txt_McobradorCliente.setText("");
                    txt_Midcliente.requestFocus();
                    txt_MnombreCliente.requestFocus();
                    txt_MdirCliente.requestFocus();
                    txt_MtelCliente.requestFocus();
                    txt_MsectorCliente.requestFocus();
                    txt_MartCliente.requestFocus();
                    txt_MengancheCliente.requestFocus();
                    txt_McobradorCliente.requestFocus();
                    JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIGO GUARDADOS CORRECTAMENTE");
                
            }catch (SQLException e){
            }
        }
        CreaTablas();
        
    }//GEN-LAST:event_btnMclienteActionPerformed

    private void btnRclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRclienteActionPerformed
        // TODO add your handling code here:
        
        if( txt_Rcliente2.getText().isEmpty() && txt_Rcliente3.getText().isEmpty() && txt_Rcliente4.getText().isEmpty() && txt_Rcliente5.getText().isEmpty() && txt_Rcliente6.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Ingrese bien la informacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            
            txt_Rcliente2.requestFocus();
            txt_Rcliente3.requestFocus();
            txt_Rcliente4.requestFocus();
            txt_Rcliente5.requestFocus();
            txt_Rcliente6.requestFocus();
            
        } else {
            try {
                    Clientes.AgregarCliente(txt_Rcliente2.getText(), txt_Rcliente3.getText(), txt_Rcliente4.getText(), comboRcliente.getSelectedItem().toString(), txt_Rcliente5.getText(),  Float.parseFloat(txt_Rcliente6.getText()), Integer.parseInt(comboRcliente1.getSelectedItem().toString()));
                    
                    txt_Rcliente2.setText("");
                    txt_Rcliente3.setText("");
                    txt_Rcliente4.setText("");
                    txt_Rcliente5.setText("");
                    txt_Rcliente6.setText("");
                    comboRcliente1.requestFocus();
                    txt_Rcliente2.requestFocus();
                    txt_Rcliente3.requestFocus();
                    txt_Rcliente4.requestFocus();
                    comboRcliente.requestFocus();
                    txt_Rcliente5.requestFocus();
                    txt_Rcliente6.requestFocus();
                    JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIGO GUARDADOS CORRECTAMENTE");
                
            }catch (SQLException e){
            }
        }
        CreaTablas();
        
        
    }//GEN-LAST:event_btnRclienteActionPerformed

    private void btnRCobradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRCobradorActionPerformed
        // TODO add your handling code here:
        
        if(txt_Rcobrador.getText().isEmpty() && txt_Rcobrador2.getText().isEmpty() && txt_Rcobrador3.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Ingrese bien la informacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            txt_Rcobrador.requestFocus();
            txt_Rcobrador2.requestFocus();
            txt_Rcobrador3.requestFocus();
        } else {
            try {
                    Cobrador.AgregarCobrador(txt_Rcobrador.getText(), comboRcobrador.getSelectedItem().toString(), txt_Rcobrador2.getText(), txt_Rcobrador3.getText());
                    txt_Rcobrador.setText("");
                    txt_Rcobrador2.setText("");
                    txt_Rcobrador3.setText("");
                    txt_Rcobrador.requestFocus();
                    txt_Rcobrador2.requestFocus();
                    txt_Rcobrador3.requestFocus();
                    comboRcobrador.requestFocus();
                    JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIGO GUARDADOS CORRECTAMENTE");
                
            }catch (SQLException e){
            }
        }
        CreaTablas();
        
    }//GEN-LAST:event_btnRCobradorActionPerformed

    private void tablaCobradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCobradorMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_tablaCobradorMouseClicked

    private void btnMcobradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMcobradorActionPerformed
        // TODO add your handling code here:
        if(txt_Midcobrador.getText().isEmpty() && txt_Mnombrecobrador.getText().isEmpty() && txt_Mcobradorzona.getText().isEmpty() && txt_MdireccionCobrador.getText().isEmpty() && txt_McelularCobrador.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese bien la informacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            txt_Midcobrador.requestFocus();
            txt_Mnombrecobrador.requestFocus();
            txt_Mcobradorzona.requestFocus();
            txt_MdireccionCobrador.requestFocus();
            txt_McelularCobrador.requestFocus();
        } else {
            try {
                    Cobrador.ModificarCobrador(Integer.parseInt(txt_Midcobrador.getText()), txt_Mnombrecobrador.getText(), txt_Mcobradorzona.getText(), txt_MdireccionCobrador.getText(), txt_McelularCobrador.getText());
                    txt_Midcobrador.setText("");
                    txt_Mnombrecobrador.setText("");
                    txt_Mcobradorzona.setText("");
                    txt_MdireccionCobrador.setText("");
                    txt_McelularCobrador.setText("");
                    txt_Midcobrador.requestFocus();
                    txt_Mnombrecobrador.requestFocus();
                    txt_Mcobradorzona.requestFocus();
                    txt_MdireccionCobrador.requestFocus();
                    txt_McelularCobrador.requestFocus();
                    JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIGO GUARDADOS CORRECTAMENTE");
                
            }catch (SQLException e){
            }
        }
        CreaTablas();
    }//GEN-LAST:event_btnMcobradorActionPerformed

    private void btnEcobradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEcobradorActionPerformed
        // TODO add your handling code here:
        
        if(txt_Midcobrador.getText().isEmpty() && txt_Mnombrecobrador.getText().isEmpty() && txt_Mcobradorzona.getText().isEmpty() && txt_MdireccionCobrador.getText().isEmpty() && txt_McelularCobrador.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese bien la informacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            txt_Midcobrador.requestFocus();
        } else {
            try {
                    Cobrador.EliminarCobrador(Integer.parseInt(txt_Midcobrador.getText()));
                    txt_Midcobrador.setText("");
                    txt_Mnombrecobrador.setText("");
                    txt_Mcobradorzona.setText("");
                    txt_MdireccionCobrador.setText("");
                    txt_McelularCobrador.setText("");
                    txt_Midcobrador.requestFocus();
                    JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIGO ELIMINADOS CORRECTAMENTE");
                
            }catch (SQLException e){
            }
        }
        CreaTablas();
        
    }//GEN-LAST:event_btnEcobradorActionPerformed

    private void btnEclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEclienteActionPerformed
        // TODO add your handling code here:
        
        if(txt_Midcliente.getText().isEmpty() && txt_MnombreCliente.getText().isEmpty() && txt_MdirCliente.getText().isEmpty() && txt_MtelCliente.getText().isEmpty() && txt_MsectorCliente.getText().isEmpty() && txt_MartCliente.getText().isEmpty() && txt_MengancheCliente.getText().isEmpty() && txt_McobradorCliente.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese bien la informacion", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            txt_Midcliente.requestFocus();
            try {
                    Clientes.EliminarCliente(Integer.parseInt(txt_Midcliente.getText()));
                    txt_Midcliente.setText("");
                    txt_MnombreCliente.setText("");
                    txt_MdirCliente.setText("");
                    txt_MtelCliente.setText("");
                    txt_MsectorCliente.setText("");
                    txt_MartCliente.setText("");
                    txt_MengancheCliente.setText("");
                    txt_McobradorCliente.setText("");
                    txt_Midcliente.requestFocus();
                    JOptionPane.showMessageDialog(this, "LOS DATOS HAN SIGO GUARDADOS CORRECTAMENTE");
                
            }catch (SQLException e){
            }
        }
        CreaTablas();
        
    }//GEN-LAST:event_btnEclienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEcliente;
    private javax.swing.JButton btnEcobrador;
    private javax.swing.JButton btnMcliente;
    private javax.swing.JButton btnMcobrador;
    private javax.swing.JButton btnRCobrador;
    private javax.swing.JButton btnRcliente;
    private javax.swing.JComboBox<String> comboRcliente;
    private javax.swing.JComboBox<String> comboRcliente1;
    private javax.swing.JComboBox<String> comboRcobrador;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTable tablaAyuda;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTable tablaCobrador;
    private javax.swing.JTextField txt_MartCliente;
    private javax.swing.JTextField txt_McelularCobrador;
    private javax.swing.JTextField txt_McobradorCliente;
    private javax.swing.JTextField txt_Mcobradorzona;
    private javax.swing.JTextField txt_MdirCliente;
    private javax.swing.JTextField txt_MdireccionCobrador;
    private javax.swing.JTextField txt_MengancheCliente;
    private javax.swing.JTextField txt_Midcliente;
    private javax.swing.JTextField txt_Midcobrador;
    private javax.swing.JTextField txt_MnombreCliente;
    private javax.swing.JTextField txt_Mnombrecobrador;
    private javax.swing.JTextField txt_MsectorCliente;
    private javax.swing.JTextField txt_MtelCliente;
    private javax.swing.JTextField txt_Rcliente2;
    private javax.swing.JTextField txt_Rcliente3;
    private javax.swing.JTextField txt_Rcliente4;
    private javax.swing.JTextField txt_Rcliente5;
    private javax.swing.JTextField txt_Rcliente6;
    private javax.swing.JTextField txt_Rcobrador;
    private javax.swing.JTextField txt_Rcobrador2;
    private javax.swing.JTextField txt_Rcobrador3;
    // End of variables declaration//GEN-END:variables
    
    }
