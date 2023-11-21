
package Factura;

import clases.Cerdos;
import clases.ConsumoAPI;
import clases.Items;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Facturador extends javax.swing.JFrame {

    Cerdos listaCerdos[];
    int i;
    private Items lista[];
    public Facturador() {
        this.i=i;
        this.lista=new Items[100];
        initComponents();
        initAlternComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        campo_serie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campo_identificacion = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campo_precioXkilo = new javax.swing.JTextField();
        btn_calcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campo_precio = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        campo_raza = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        campo_sexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campo_peso = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        scroll_lista = new javax.swing.JScrollPane();
        lista_items = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_generarVenta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campo_total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N

        jSeparator1.setMinimumSize(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText(" Nro de serie");

        campo_serie.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("N° Identificacion");

        campo_identificacion.setEnabled(false);

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio X kilo");

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Precio cerdo");

        campo_precio.setEnabled(false);

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Raza");

        campo_raza.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sexo");

        campo_sexo.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Peso");

        campo_peso.setEnabled(false);

        scroll_lista.setBackground(new java.awt.Color(255, 255, 255));
        scroll_lista.setForeground(new java.awt.Color(0, 0, 0));

        lista_items.setBackground(new java.awt.Color(255, 255, 255));
        lista_items.setForeground(new java.awt.Color(0, 0, 0));
        lista_items.setLayout(new javax.swing.BoxLayout(lista_items, javax.swing.BoxLayout.Y_AXIS));
        scroll_lista.setViewportView(lista_items);

        btn_cancelar.setText("Cancelar");

        btn_generarVenta.setText("Generar Venta");
        btn_generarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarVentaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total a pagar:");

        campo_total.setText("0");
        campo_total.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_precio)
                            .addComponent(campo_precioXkilo)
                            .addComponent(campo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(campo_peso, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(scroll_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btn_generarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_total, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(387, 387, 387)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(campo_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campo_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar)
                    .addComponent(jLabel7)
                    .addComponent(campo_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campo_precioXkilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_calcular)
                    .addComponent(jLabel8)
                    .addComponent(campo_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campo_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_agregar)
                    .addComponent(jLabel9)
                    .addComponent(campo_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scroll_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(campo_total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        if(campo_precioXkilo.getText()==""){
            JOptionPane.showMessageDialog(this, "Llene el campo seleccionado");
            campo_precioXkilo.setBackground(Color.red);
        }else{
            float precio = Float.parseFloat(campo_precioXkilo.getText());
            float peso = Float.parseFloat(campo_peso.getText());

            float total = precio * peso;

            String precio_porcino = String.valueOf(total);
            String valorSinPunto = precio_porcino.replaceAll("\\.\\d+","");

            campo_precio.setText(valorSinPunto);
            campo_precioXkilo.setBackground(Color.WHITE);
            btn_agregar.setEnabled(true);
            btn_calcular.setBorder(null);
            btn_calcular.setSize(100, 200);
                
        }
        
        
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String identificacion = campo_identificacion.getText();
        
        ListadoCerdos ventana = new ListadoCerdos(this);
        ventana.setVisible(true);
        setVisible(false);
        
        campo_precio.setText("");
        btn_agregar.setEnabled(false);
        Border borde = new LineBorder(Color.GREEN, 2);
        btn_calcular.setBorder(borde);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        String id = campo_identificacion.getText();
        String precioKilo = campo_precioXkilo.getText();
        float subtotal =Float.parseFloat(campo_total.getText());
        float precio = Float.parseFloat(campo_precio.getText());
        
        float valor = subtotal+precio;
        
        String total = String.valueOf(valor);
        String precioConPunto = String.valueOf(precio);
        String subprecio = precioConPunto.replaceAll("\\.\\d+","");
        
        
        campo_total.setText(total);
        
        
        JLabel cosas = new JLabel("PRECIO X KILO              SUBTOTAL                 ID CERDO");
        JLabel cerdo = new JLabel("->"+precioKilo+"                -                  "+subprecio+"              -              "+id);
        Font letra = new Font("Arial", Font.BOLD, 15 );
        cosas.setFont(letra);
        cosas.setBackground(Color.red);
        cerdo.setFont(letra);
        lista_items.add(cosas);
        lista_items.add(cerdo);
        Items temporal = new Items(precioKilo, subprecio, id);
        this.lista[this.i]=temporal;
        i++;
        for(int i = 0; i< this.lista.length; i++){
            if(this.lista[i]!=null){
                System.out.println(this.lista[i]);
                
            }
        }
        revalidate();
        
        
        
        
        
        System.out.println("----- --------- -----");
        
        
            
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_generarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarVentaActionPerformed
        for(int i = 0; i<this.lista.length; i++){
            if(this.lista[i]!=null){
                ConsumoAPI ejemplo = new ConsumoAPI();
                Map<String, String> insertData = new HashMap<>();
                insertData.put("precio_peso", this.lista[i].getPrecioKilo());
                insertData.put("subtotal", this.lista[i].getSubtotal());
                insertData.put("id_cerdo", this.lista[i].getId_cerdo());
                System.out.println("Consumo INSERT: " + ejemplo.consumoPOST("http://localhost/APIPorcinos/Venta/Insert.php", insertData));
                Date fechaActual = new Date(Calendar.getInstance().getTimeInMillis());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                String fecha = formato.format(fechaActual);
            }
            
        }
    }//GEN-LAST:event_btn_generarVentaActionPerformed
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setTitle("Facturador");
    }
    public void agregandoCerdoFactura(Object cellValue){
        
        
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        String id = cellValue.toString();
        Map<String, String> getData = new HashMap<>();
        getData.put("id_cerdo", id);
        String respuestaAll =ejemplo.consumoGET("http://localhost/APIPorcinos/Cerdos/getCerdo.php", getData);
        JsonObject cerdo = gson.fromJson(respuestaAll, JsonObject.class);
        
        String id_cerdo = cerdo.get("id_cerdo").getAsString();
        String raza = cerdo.get("raza").getAsString();
        String sexo = cerdo.get("sexo").getAsString();
        String peso = cerdo.get("peso").getAsString();
        String fecha = cerdo.get("fecha").getAsString();
        String estado = cerdo.get("estado").getAsString();
        String id_finca = cerdo.get("id_finca").getAsString();
        
        if(estado.equals("ALIBIADO")){
            
            campo_identificacion.setText(id_cerdo);
            campo_peso.setText(peso);
            campo_raza.setText(raza);
            campo_sexo.setText(sexo);
        }else{
            JOptionPane.showMessageDialog(this, "El porcino seleccionado se encuentra en estado "+estado+" y no se puede seleccionar");
        }
        
        System.out.print(id_cerdo);
        
        
        repaint();
        revalidate();
       
    }
    
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
            java.util.logging.Logger.getLogger(Facturador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_generarVenta;
    private javax.swing.JTextField campo_identificacion;
    private javax.swing.JTextField campo_peso;
    private javax.swing.JTextField campo_precio;
    private javax.swing.JTextField campo_precioXkilo;
    private javax.swing.JTextField campo_raza;
    private javax.swing.JTextField campo_serie;
    private javax.swing.JTextField campo_sexo;
    private javax.swing.JTextField campo_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel lista_items;
    private javax.swing.JScrollPane scroll_lista;
    // End of variables declaration//GEN-END:variables
}
