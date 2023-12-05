
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
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class PanelControlCerdos extends javax.swing.JPanel {

    
    DefaultTableModel tableModel;
    Cerdos listaCerdos[];
    
    public PanelControlCerdos() {
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
        this.tableCerdos.getColumn("Editar").setCellRenderer(new ButtonRenderer());
        this.tableCerdos.getColumn("Editar").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        this.tableCerdos.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        this.tableCerdos.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox()));
        
        // Llenar la tabla con los datos del arreglo
        llenarTabla();
        setVisible(true);
    }
    
    public void llenarTabla(){
        tableModel.setNumRows(0);
        for (int i=0; i<listaCerdos.length; i++) {
            String id_cerdo = listaCerdos[i].getId_cerdo();
            String raza = listaCerdos[i].getRaza();
            Float peso = listaCerdos[i].getPeso();
            String fecha = listaCerdos[i].getFecha();
            String estado = listaCerdos[i].getEstado();
            String id_finca = listaCerdos[i].getId_finca();
            
            JButton btnAccionModificar = new JButton("Modificar");
            btnAccionModificar.setBackground(new Color(144,238,144));
            btnAccionModificar.setOpaque(true);
            
            JButton btnAccionEliminar = new JButton("Eliminar");
            btnAccionEliminar.setBackground(Color.RED);
            btnAccionEliminar.setOpaque(true);
            
            final int posicion = i;
            btnAccionModificar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickBotonModificar( listaCerdos[posicion] );
                }
            });
            btnAccionEliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    accionClickBotonEliminar( listaCerdos[posicion] );
                }
            });
            Object[] temporal = new Object[]{ id_cerdo, raza, peso, fecha, estado, id_finca, btnAccionModificar , btnAccionEliminar };
            tableModel.addRow(temporal);
        }
    }
    public void accionClickBotonModificar(Cerdos listaPersona){
        System.out.println("funcionando boton modificar");
        //UpdatePersona ventana = new UpdatePersona(this, listaPersona);
    }
    public void accionClickBotonEliminar(Cerdos temp){
        ConsumoAPI ejemplo = new ConsumoAPI();
        String tempCerdo = temp.getId_cerdo();
        Map<String, String> deleteData = new HashMap<>();
        deleteData.put("id_cerdo", tempCerdo);
        String respuesta = ejemplo.consumoPOST("http://localhost/APIPorcinos/Cerdos/Delete.php", deleteData);
        JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
        
        if ( objetoJson.get("status").getAsBoolean()  ) {
            initAlterntComponent();
            
        }else{
            System.out.println("Error al eliminar los datos de la tabla");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        campoBuscarCerdos = new javax.swing.JTextField();
        btnBuscarCerdos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCerdos = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(630, 390));

        bg.setBackground(new java.awt.Color(255, 255, 191));
        bg.setPreferredSize(new java.awt.Dimension(638, 390));

        jPanel1.setBackground(new java.awt.Color(119, 119, 91));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE CERDOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 191));

        campoBuscarCerdos.setBackground(new java.awt.Color(255, 255, 191));
        campoBuscarCerdos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        campoBuscarCerdos.setToolTipText("");
        campoBuscarCerdos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(119, 119, 91)));

        btnBuscarCerdos.setBackground(new java.awt.Color(255, 255, 191));
        btnBuscarCerdos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngwing.com.png"))); // NOI18N
        btnBuscarCerdos.setBorderPainted(false);
        btnBuscarCerdos.setFocusable(false);
        btnBuscarCerdos.setPreferredSize(new java.awt.Dimension(24, 24));
        btnBuscarCerdos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCerdosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoBuscarCerdos, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCerdos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBuscarCerdos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBuscarCerdos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 191));

        jButton2.setBackground(new java.awt.Color(255, 255, 191));
        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jButton2.setText("Registrar Nuevo Cerdo");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(119, 119, 91)));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        tableCerdos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Identificacion", "Raza", "Sexo", "Peso", "Fecha", "Estado", "Eliminar", "Editar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
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
        }

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RegistrarCerdo ventana = new RegistrarCerdo();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarCerdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCerdosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarCerdosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnBuscarCerdos;
    private javax.swing.JTextField campoBuscarCerdos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCerdos;
    // End of variables declaration//GEN-END:variables

    

   
}
