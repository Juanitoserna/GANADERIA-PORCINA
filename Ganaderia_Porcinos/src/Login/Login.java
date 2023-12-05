package Login;

import Administrador.VistaAdministrador;
import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.awt.Color;
import java.awt.Image;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        //creando variables para el consumo y de la libreria GSON
        ConsumoAPI consumo = new ConsumoAPI();
        Gson gson = new Gson();
        
        //haciendo el consumo de la poke api
        String respuesta = consumo.consumoGET("http://localhost/APIPorcinos/Administrador/Obtener.php");
        //convirtiendo la respuesta en un objeto para acceder a sus key
        JsonObject objetoRespuesta = JsonParser.parseString(respuesta).getAsJsonObject();
        //convirtiendo el objeto en un array
        JsonArray results = objetoRespuesta.get("registros").getAsJsonArray();
        System.out.println("Datos: "+results);
        
        Image imgUsuario = getToolkit().createImage(ClassLoader.getSystemResource("imagenes/user.png"));

        imgUsuario = imgUsuario.getScaledInstance(50, 40, Image.SCALE_SMOOTH);
        jLabelusuario.setIcon(new ImageIcon(imgUsuario));
        
        Image imgCandado = getToolkit().createImage(ClassLoader.getSystemResource(""));
        imgCandado = imgCandado.getScaledInstance(50,40, Image.SCALE_SMOOTH);
        jLabelCandado.setIcon(new ImageIcon(imgCandado));
        
        Image imgCandado2 = getToolkit().createImage(ClassLoader.getSystemResource(""));
        imgCandado2 = imgCandado2.getScaledInstance(30,20, Image.SCALE_SMOOTH);
        jLabelCandado2.setIcon(new ImageIcon(imgCandado2));
    }
    
    public void validarIngreso(){
        // CONDICIONES PARA MOSTRAR QUE LO LABEL ESTAN VACIOS
        if(campoUsuario.getText().equals("")){
            jLabelAlertU.setText("Este campo debe ser diligenciado");
            jLabelAlertU.setForeground(Color.RED);
        }
        if (campo_pass.getText().equals("")) {
            jLabelAlertP.setText("Este campo debe ser diligenciado");
            jLabelAlertP.setForeground(Color.red);
        }
        // CONDICIONES PARA QUITAR LOS LABEL DE ALERTA
        if(!campoUsuario.getText().equals("")){
            jLabelAlertU.setText("");
        }
        if (!campo_pass.getText().equals("")) {
            jLabelAlertP.setText("");
        }
        
        
        
        if (!campoUsuario.getText().equals("")&&!campo_pass.getText().equals("")) {
            
            ConsumoAPI consumo = new ConsumoAPI();
            jLabelAlertU.setText("");
            jLabelAlertP.setText("");
            
            String usuario = campoUsuario.getText();
            String password = campo_pass.getText();
            //validar que exista el usuario
            //GET con Datos
            Map<String, String> getData = new HashMap<>();
            getData.put("correo_usuario", usuario);
            getData.put("password_usuario", password);
            
            String respuesta = consumo.consumoPOST("http://localhost/APIPorcinos/Usuario/getUsuario.php", getData);
            System.out.println(respuesta);
            //convirtiendo la respuesta en un objeto para acceder a sus key
            JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
            
            if (objetoJson.get("status").getAsBoolean() && objetoJson.get("tipo_user").getAsString().equals("administrador") ) {
                VistaAdministrador ventanaAdmin = new VistaAdministrador();
                ventanaAdmin.setVisible(true);
                setVisible(false);
                System.out.println("Abriendo interfaz administrador");
            }else if (objetoJson.get("status").getAsBoolean() && objetoJson.get("tipo_user").getAsString().equals("porcicultor") ) {
                System.out.println("Abriendo interfaz porcicultor");
            }else{
                System.out.println("Mesnaje de error datos incorrectos usuario no encontrado");
            }
            
        }
    }
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelimg = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabelusuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        jLabelCandado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campo_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelCandado2 = new javax.swing.JLabel();
        jLabelAlertU = new javax.swing.JLabel();
        jLabelAlertP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerdoFondo.jpg"))); // NOI18N
        jLabelimg.setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(246, 245, 244));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel1.setText("USUARIO:");

        ampoUsuario.setBackground(new java.awt.Color(246, 245, 244));
        ampoUsuario.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        ampoUsuario.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        jLabel2.setText("CONTRASEÑA:");

        campo_contra.setBackground(new java.awt.Color(246, 245, 244));
        campo_contra.setFont(new java.awt.Font("Arial Narrow", 2, 18)); // NOI18N
        campo_contra.setBorder(null);

        jButton1.setBackground(new java.awt.Color(246, 245, 244));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBorder(null);
        jButton1.setFocusable(false);

        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("¿ Olvidaste tu contraseña?");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2023-11-27 164406 (1).png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(540, 470));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2023-12-04 at 6.19.41 PM.jpeg"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(250, 160));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()

                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCandado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator3)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ampoUsuario)
                                .addComponent(campo_contra)
                                .addComponent(jSeparator1))
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabelCandado2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()

                .addGap(190, 190, 190)
                .addComponent(jLabelusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabelCandado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(ampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCandado2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addComponent(campo_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3))
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validarIngreso();
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JTextField campo_pass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabelAlertP;
    private javax.swing.JLabel jLabelAlertU;

    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabelCandado;
    private javax.swing.JLabel jLabelCandado2;
    private javax.swing.JLabel jLabelusuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
