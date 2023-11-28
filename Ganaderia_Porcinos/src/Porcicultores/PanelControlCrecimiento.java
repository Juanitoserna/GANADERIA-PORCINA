
package Porcicultores;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import clases.Cerdos;
import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class PanelControlCrecimiento extends javax.swing.JPanel {

    DefaultTableModel tableModel;
    Cerdos listaCerdos[];
    InterPorcicultores ventana;
    public PanelControlCrecimiento(InterPorcicultores ventana) {
        this.ventana = ventana;
        initComponents();
        initAlterntComponent();
        tableModel =  (DefaultTableModel) this.tableCerdos.getModel();
    }
    
    public void initAlterntComponent(){
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIPorcinos/Cerdos/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arreglocerdos = objetoRespuesta.getAsJsonArray("registros").getAsJsonArray();
        listaCerdos = new Cerdos[arreglocerdos.size()];
        
        for (int i = 0; i < arreglocerdos.size(); i++) {
            Cerdos temp = gson.fromJson(arreglocerdos.get(i).getAsJsonObject(), Cerdos.class);
            listaCerdos[i] = temp;
        }
        tableModel =  (DefaultTableModel) this.tableCerdos.getModel();
        this.tableCerdos.getColumn("Agregar Peso").setCellRenderer(new ButtonRenderer());
        this.tableCerdos.getColumn("Agregar Peso").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        // Llenar la tabla con los datos del arreglo
        llenarTabla();
        setVisible(true);
    }
    
    public void llenarTabla(){
        tableModel.setNumRows(0);
        for (int i=0; i<listaCerdos.length; i++) {
            String id_cerdo = listaCerdos[i].getId_cerdo();
            String raza = listaCerdos[i].getRaza();
            String sexo = listaCerdos[i].getSexo();
            Float peso = listaCerdos[i].getPeso();
            String fecha = listaCerdos[i].getFecha();
            String estado = listaCerdos[i].getEstado();
            String id_finca = listaCerdos[i].getId_finca();
            
            JButton btnAccionAgregar = new JButton("Agregar Peso");
            btnAccionAgregar.setBackground(new Color(144,238,144));
            btnAccionAgregar.setOpaque(true);
            
            final int posicion = i;
            btnAccionAgregar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickBotonAgregar( listaCerdos[posicion] );
                }
            });
            Object[] temporal = new Object[]{ id_cerdo, raza, sexo, peso, fecha, estado,id_finca, btnAccionAgregar };
            tableModel.addRow(temporal);
        }
    }
    public void accionClickBotonAgregar(Cerdos cerdo){
        this.ventana.agregarPesoCerdo(cerdo);
        this.ventana.revalidate();
    }

  

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCerdos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(630, 390));

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(119, 119, 91));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CONTROL DE PESO DE LOS CERDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 191));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com.png"))); // NOI18N

        tableCerdos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Id", "Raza", "Sexo", "Peso", "Fecha", "Estado", "Finca", "Agregar Peso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCerdos);
        if (tableCerdos.getColumnModel().getColumnCount() > 0) {
            tableCerdos.getColumnModel().getColumn(0).setResizable(false);
            tableCerdos.getColumnModel().getColumn(1).setResizable(false);
            tableCerdos.getColumnModel().getColumn(2).setResizable(false);
            tableCerdos.getColumnModel().getColumn(3).setResizable(false);
            tableCerdos.getColumnModel().getColumn(4).setResizable(false);
            tableCerdos.getColumnModel().getColumn(5).setResizable(false);
            tableCerdos.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 660, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableCerdos;
    // End of variables declaration//GEN-END:variables
}
