
package Factura;

import clases.Cerdos;
import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;


public class ListadoCerdos extends javax.swing.JFrame {
    Cerdos listaCerdos [];
    Cerdos temporal;
    Facturador ventana;
    DefaultTableModel modelo;
    public ListadoCerdos(Facturador ventana) {
        this.ventana=ventana;
        this.temporal = temporal;
        
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPorcinos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PORCINOS");

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        listaPorcinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID_CERDO", "RAZA", "SEXO", "PESO", "FECHA", "ESTADO", "ID_FINCA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPorcinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPorcinosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaPorcinos);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("(Seleccione el porcino)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 839, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Facturador ventana = new Facturador();
        setVisible(false);
        ventana.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
       
        

        
        /*Map<String, String> getData = new HashMap<>();
        getData.put("cedula", "108805");
        System.out.println("Consumo SELECT: " + ejemplo.consumoGET("http://localhost/APIenPHP/getPersona.php", getData));*/
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void listaPorcinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPorcinosMouseClicked
        ConsumoAPI ejemplo = new ConsumoAPI(); 
        int row = listaPorcinos.rowAtPoint(evt.getPoint());
        if (row >= 0) {
            Object cellValue = listaPorcinos.getValueAt(row, 0);
            System.out.println("Valor de la celda seleccionada: " + cellValue);
           
            ventana.agregandoCerdoFactura(cellValue);
            ventana.setVisible(true);
            setVisible(false);
            
            ventana.revalidate();
        
        }
    }//GEN-LAST:event_listaPorcinosMouseClicked

    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setTitle("Lista");
        this.modelo=(DefaultTableModel) this.listaPorcinos.getModel();
        mostrarDatos();
    }
    
    public void mostrarDatos(){
         ConsumoAPI ejemplo = new ConsumoAPI();
        
        Gson gson = new Gson();
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIPorcinos/Cerdos/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arregloCerdos = objetoRespuesta.get("registros").getAsJsonArray();
        listaCerdos = new Cerdos [ arregloCerdos.size()];
        for(int i = 0; i < arregloCerdos.size(); i++){
            Cerdos temp = gson.fromJson(arregloCerdos.get(i).getAsJsonObject(), Cerdos.class);
            listaCerdos[i] = temp;
            System.out.println(listaCerdos[i].getId_cerdo());
        }
        this.modelo.setRowCount(0);
        for(int i = 0; i < this.listaCerdos.length; i++){
            if(this.listaCerdos[i]!=null){
                
                
                Object temporal [] = {this.listaCerdos[i].getId_cerdo(), this.listaCerdos[i].getRaza(), this.listaCerdos[i].getSexo(), this.listaCerdos[i].getPeso(), this.listaCerdos[i].getFecha(), this.listaCerdos[i].getEstado(), this.listaCerdos[i].getId_finca()};
                this.modelo.addRow(temporal);
                revalidate();
            }
        }
        
        
        System.out.println("Consumo GET: " + ejemplo.consumoGET("http://localhost/APIPorcinos/Cerdos/Obtener.php"));
        
        // GET con Datos
        
        
      
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaPorcinos;
    // End of variables declaration//GEN-END:variables
}
