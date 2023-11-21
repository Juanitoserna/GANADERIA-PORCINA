
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
        jButton1 = new javax.swing.JButton();
        jLabelRaza = new javax.swing.JLabel();
        campoRaza = new javax.swing.JTextField();
        jLabelSexo = new javax.swing.JLabel();
        selectSexo = new javax.swing.JComboBox<>();
        jLabelPeso = new javax.swing.JLabel();
        campoPeso = new javax.swing.JTextField();
        jLabelAlerta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(119, 119, 91));

        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabelTitulo.setText("Registrar Cerdos");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabelTitulo)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 191));

        jLabelFinca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFinca.setText("Finca:");

        jLabelId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelId.setText("Id Cerdo:");

        campoId.setBorder(null);

        jButton1.setBackground(new java.awt.Color(119, 119, 91));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelRaza.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelRaza.setText("Raza:");

        jLabelSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelSexo.setText("Sexo:");

        selectSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MACHO", "HEMBRA" }));

        jLabelPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelPeso.setText("Peso:");

        jLabelAlerta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAlerta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAlerta.setText("LOS SIGUIENTES CAMPOS SON OBLIGATORIOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelId)
                                    .addComponent(jLabelRaza)
                                    .addComponent(jLabelSexo)
                                    .addComponent(jLabelPeso)
                                    .addComponent(jLabelFinca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoId)
                                        .addComponent(campoRaza, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                        .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoPeso))
                                    .addComponent(selectFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelId)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(campoId, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRaza)
                    .addComponent(campoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSexo)
                    .addComponent(selectSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeso)
                    .addComponent(campoPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFinca))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        getDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelAlerta;
    private javax.swing.JLabel jLabelFinca;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelRaza;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JComboBox<String> selectFinca;
    private javax.swing.JComboBox<String> selectSexo;
    // End of variables declaration//GEN-END:variables
}
