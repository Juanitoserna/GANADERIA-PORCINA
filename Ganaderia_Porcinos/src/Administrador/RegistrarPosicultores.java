package Administrador;

import clases.ConsumoAPI;
import clases.Finca;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class RegistrarPosicultores extends javax.swing.JPanel {

    Finca listaFincas[];

    public RegistrarPosicultores() {
        initComponents();
        initAlterntComponent();
    }
    
    public void initAlterntComponent(){
        agregarDatosSelectFinca();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLocaleChooser1 = new com.toedter.components.JLocaleChooser();
        jPanel5 = new javax.swing.JPanel();
        campo_Apellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_Experiencia = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_Nombre = new javax.swing.JTextField();
        campo_Correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campo_Telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        campo_id = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        selectFinca = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        campo_Password = new javax.swing.JPasswordField();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(578, 469));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setFocusable(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(550, 440));

        campo_Apellido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_Apellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBackground(java.awt.Color.white);

        campo_Experiencia.setBackground(new java.awt.Color(255, 255, 191));
        campo_Experiencia.setColumns(20);
        campo_Experiencia.setRows(5);
        campo_Experiencia.setText("\n");
        campo_Experiencia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(campo_Experiencia);

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setText("Apellido");

        campo_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_Nombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        campo_Correo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_Correo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(java.awt.Color.white);
        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel7.setText("Contraseña");

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel8.setText("Correo");

        campo_Telefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_Telefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel9.setBackground(java.awt.Color.white);
        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel9.setText("Telefono");

        campo_id.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        registrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        registrar.setText("Registrar");
        registrar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        registrar.setFocusPainted(false);
        registrar.setFocusable(false);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        selectFinca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectFinca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectFinca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel10.setText("N°identificador");

        campo_Password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        campo_Password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(campo_Nombre)
                                    .addGap(22, 22, 22))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7))
                                    .addGap(121, 121, 121)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8)
                                .addComponent(campo_Apellido)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campo_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(campo_id)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(campo_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_Correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(selectFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campo_Correo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(campo_Password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
     
    
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
       getDatos();
    }//GEN-LAST:event_registrarActionPerformed
    
    
    
    public void getDatos(){
        ConsumoAPI ejemplo = new ConsumoAPI(); 
        
        String id_porcicultor = campo_Password.getText();
        String nombre = campo_Nombre.getText();
        String apellido = campo_Apellido.getText();
        String correo = campo_Correo.getText();
        String passw = campo_id.getText();
        String contacto = campo_Telefono.getText();
        String experiencia = campo_Experiencia.getText();
        String finca = (String) selectFinca.getSelectedItem();
        
        Gson gson = new Gson();
        // GET con Datos
        Map<String, String> getData = new HashMap<>();
        getData.put("id_porcicultor", id_porcicultor);
        
        String respuesta = ejemplo.consumoPOST("http://localhost/APIPorcinos/Porcicultor/getPorcicultor.php", getData);
        JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
        
        if (objetoJson.get("status").getAsBoolean()) {
            System.out.print("EL CERDO YA EXISTE");
        }else{
            Border bordeRojo = new LineBorder(Color.RED, 2);
            
            if (id_porcicultor.equals("")) {
                campo_id.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (nombre.equals("")) {
                campo_Nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (apellido.equals("")) {
                campo_Apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (correo.equals("")) {
                campo_Correo.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (passw.equals("")) {
                campo_Password.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (contacto.equals("")) {
                campo_Telefono.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (experiencia.equals("")) {
                campo_Experiencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            
            if (!campo_Password.equals("")  && !campo_Nombre.equals("") && !campo_Apellido.equals("") && !campo_Correo.equals("") && !campo_id.equals("") && !campo_Telefono.equals("") && !campo_Experiencia.equals("")) {
                
                Map<String, String> insertData = new HashMap<>();
                insertData.put("id_porcicultor", id_porcicultor);
                insertData.put("nombre", nombre);
                insertData.put("apellido", apellido);
                insertData.put("correo", correo);
                insertData.put("passw", passw);
                insertData.put("contacto", contacto);
                insertData.put("experiencia", experiencia);
                insertData.put("id_finca", finca);
                String respuestaInsert = ejemplo.consumoPOST("http://localhost/APIPorcinos/Porcicultor/Insert.php", insertData);
                JsonObject objetoInsert = JsonParser.parseString(respuestaInsert).getAsJsonObject();
                System.out.println("Respuesta: "+respuestaInsert);
                if ( objetoInsert.get("status").getAsBoolean()  ) {
                    System.out.println("Se incerto el cerdo");
                }else{
                    limpiarCampos(); 
                }
            }
            
        }
        
        // POST con Datos
        /*
            
        
        */
        

    }
    
    private void limpiarCampos() {
        campo_id.setText("");
        campo_Nombre.setText("");
        campo_Apellido.setText("");
        campo_Correo.setText("");
        campo_Password.setText("");
        campo_Telefono.setText("");
        campo_Experiencia.setText("");
    }
    
    public void agregarDatosSelectFinca(){
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIPorcinos/Finca/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arregloFincas = objetoRespuesta.getAsJsonArray("registros").getAsJsonArray();
        this.listaFincas = new Finca[arregloFincas.size()];
        
        for (int i = 0; i < arregloFincas.size(); i++) {
            Finca temp = gson.fromJson(arregloFincas.get(i).getAsJsonObject(), Finca.class);
            listaFincas[i] = temp;
        }
        
        // Crear un modelo de datos para el JComboBox
        DefaultComboBoxModel<String> modeloComboBox = new DefaultComboBoxModel<>();

        // Agregar elementos al modelo
        for (Finca finca : listaFincas) {
            modeloComboBox.addElement(finca.getId_finca()); // Supongo que "getNombre" es el método que devuelve el nombre de la finca
        }

        // Establecer el modelo en el JComboBox
        selectFinca.setModel(modeloComboBox);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_Apellido;
    private javax.swing.JTextField campo_Correo;
    private javax.swing.JTextArea campo_Experiencia;
    private javax.swing.JTextField campo_Nombre;
    private javax.swing.JPasswordField campo_Password;
    private javax.swing.JTextField campo_Telefono;
    private javax.swing.JTextField campo_id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.components.JLocaleChooser jLocaleChooser1;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrar;
    private javax.swing.JComboBox<String> selectFinca;
    // End of variables declaration//GEN-END:variables
}
