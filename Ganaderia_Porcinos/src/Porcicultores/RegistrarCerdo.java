
package Porcicultores;

import clases.Cerdos;
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

public class RegistrarCerdo extends javax.swing.JFrame {
    
    Cerdos listaCerdos[];
    Finca listaFincas[];
    
    public RegistrarCerdo() {
        initComponents();
        initAlterntComponent();
    }
    
    public void initAlterntComponent(){
        setLocationRelativeTo(null);
        agregarDatosSelectFinca();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelFinca = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        selectFinca = new javax.swing.JComboBox<>();
        campoId = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jLabelRaza = new javax.swing.JLabel();
        campoRaza = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        selectSexo = new javax.swing.JComboBox<>();
        jLabelPeso = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        jLabelAlerta = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPrincipal.setBackground(new java.awt.Color(119, 119, 91));
        jPanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Registrar Cerdos");
        jPanelPrincipal.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 380, 60));

        getContentPane().add(jPanelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 191));

        jLabelFinca.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelFinca.setText("Finca:");

        jLabelId.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelId.setText("Id Cerdo:");

        selectFinca.setBackground(new java.awt.Color(255, 255, 191));
        selectFinca.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N

        campoId.setBackground(new java.awt.Color(255, 255, 191));
        campoId.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        campoId.setBorder(null);
        campoId.setFocusable(false);

        jButtonCancelar.setBackground(new java.awt.Color(255, 255, 191));
        jButtonCancelar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButtonCancelar.setText("Cerrar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabelRaza.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelRaza.setText("Raza:");

        campoRaza.setBackground(new java.awt.Color(255, 255, 191));
        campoRaza.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        campoRaza.setBorder(null);
        campoRaza.setFocusable(false);

        jLabelSexo.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelSexo.setText("Sexo:");

        selectSexo.setBackground(new java.awt.Color(255, 255, 191));
        selectSexo.setFont(new java.awt.Font("Arial Narrow", 2, 14)); // NOI18N
        selectSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MACHO", "HEMBRA" }));

        jLabelPeso.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelPeso.setText("Peso:");

        campoPeso.setBackground(new java.awt.Color(255, 255, 191));
        campoPeso.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        campoPeso.setBorder(null);
        campoPeso.setFocusable(false);

        jLabelAlerta.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlerta.setText("CAMPOS SON OBLIGATORIOS");
        jLabelAlerta.setToolTipText("");

        jButtonRegistrar.setBackground(new java.awt.Color(255, 255, 191));
        jButtonRegistrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelRaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabelFinca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoPeso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoRaza, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator5))))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelId, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRaza)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFinca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 370, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        getDatos();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    public void getDatos(){
        ConsumoAPI ejemplo = new ConsumoAPI(); 
        
        String id = campoId.getText();
        String raza = campoRaza.getText();
        String sexo = (String) selectSexo.getSelectedItem();
        String peso = campoPeso.getText();
        String finca = (String) selectFinca.getSelectedItem();
        
        Gson gson = new Gson();
        // GET con Datos
        Map<String, String> getData = new HashMap<>();
        getData.put("id_cerdo", id);
        
        String respuesta = ejemplo.consumoPOST("http://localhost/APIPorcinos/Cerdos/getCerdo.php", getData);
        JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
        
        if (objetoJson.get("status").getAsBoolean()) {
            jLabelAlerta.setText("EL CERDO YA EXISTE");
        }else{
            Border bordeRojo = new LineBorder(Color.RED, 2);
            
            if (id.equals("")) {
                campoId.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (raza.equals("")) {
                campoRaza.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            if (peso.equals("")) {
                campoPeso.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), null));
            }
            
            if (!campoId.equals("")  && !campoPeso.equals("") && !campoRaza.equals("")) {
                Date fechaActual = new Date(Calendar.getInstance().getTimeInMillis());
                SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
                String fecha = formato.format(fechaActual);
                
                Map<String, String> insertData = new HashMap<>();
                insertData.put("id_cerdo",   id);
                insertData.put("raza", raza);
                insertData.put("sexo", sexo);
                insertData.put("peso", peso);
                insertData.put("fecha", fecha);
                insertData.put("id_finca", finca);
                String respuestaInsert = ejemplo.consumoPOST("http://localhost/APIPorcinos/Cerdos/Insert.php", insertData);
                JsonObject objetoInsert = JsonParser.parseString(respuestaInsert).getAsJsonObject();
                System.out.println("Respuesta: "+respuestaInsert);
                if ( objetoInsert.get("status").getAsBoolean()  ) {
                    System.out.println("Se incerto el cerdo");
                    setVisible(false);
                    InterPorcicultores ventana = new InterPorcicultores();
                    ventana.cargarTabla();

                }else{
                    campoId.setText("");
                    campoPeso.setText("");
                    campoRaza.setText("");
                    
                }
            }
            
        }
        
        // POST con Datos
        /*
            
        
        */
        
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
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoRaza;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelAlerta;
    private javax.swing.JLabel jLabelFinca;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelRaza;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> selectFinca;
    private javax.swing.JComboBox<String> selectSexo;
    // End of variables declaration//GEN-END:variables
}
