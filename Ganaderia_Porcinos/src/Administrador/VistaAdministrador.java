package Administrador;

import Login.Login;
import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.BorderLayout;






public class VistaAdministrador extends javax.swing.JFrame {
    
    
   
    public VistaAdministrador() {
        initComponents();
        cargarDatos();
        interfazCentral();
    }
    
    public void interfazCentral(){
        setLocationRelativeTo(null);
    }

  

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CampoFoto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        perfil = new javax.swing.JButton();
        Campo_Nombre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        boton = new javax.swing.JPanel();
        C_Porcinos = new javax.swing.JButton();
        C_Crecimiento = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        C_Crecimiento1 = new javax.swing.JButton();
        Vista_info = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 191));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 55)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BIENVENIDO");
        jLabel3.setFocusable(false);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 430, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/campo.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 109));

        jPanel3.setBackground(new java.awt.Color(255, 255, 191));

        CampoFoto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N

        javax.swing.GroupLayout CampoFotoLayout = new javax.swing.GroupLayout(CampoFoto);
        CampoFoto.setLayout(CampoFotoLayout);
        CampoFotoLayout.setHorizontalGroup(
            CampoFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        CampoFotoLayout.setVerticalGroup(
            CampoFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        perfil.setBackground(new java.awt.Color(255, 255, 191));
        perfil.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        perfil.setText("PERFIL");
        perfil.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 191)));
        perfil.setFocusable(false);
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        Campo_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Campo_Nombre.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        Campo_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Campo_Nombre.setText("Nombre Usuario");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X");
        jLabel9.setPreferredSize(new java.awt.Dimension(30, 30));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Campo_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(CampoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(CampoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        boton.setBackground(new java.awt.Color(255, 255, 191));

        C_Porcinos.setBackground(new java.awt.Color(255, 255, 191));
        C_Porcinos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        C_Porcinos.setText("Lista de Cerdos");
        C_Porcinos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 191)));
        C_Porcinos.setFocusable(false);
        C_Porcinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_PorcinosActionPerformed(evt);
            }
        });

        C_Crecimiento.setBackground(new java.awt.Color(255, 255, 191));
        C_Crecimiento.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        C_Crecimiento.setText("Lista de Posicultores");
        C_Crecimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 191)));
        C_Crecimiento.setFocusable(false);
        C_Crecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CrecimientoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 191));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton3.setText("Cerrar Session");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 191)));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        C_Crecimiento1.setBackground(new java.awt.Color(255, 255, 191));
        C_Crecimiento1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        C_Crecimiento1.setText("Registro Posicultores");
        C_Crecimiento1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(255, 255, 191)));
        C_Crecimiento1.setFocusable(false);
        C_Crecimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_Crecimiento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonLayout = new javax.swing.GroupLayout(boton);
        boton.setLayout(botonLayout);
        botonLayout.setHorizontalGroup(
            botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C_Crecimiento1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C_Crecimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(botonLayout.createSequentialGroup()
                        .addComponent(C_Porcinos, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        botonLayout.setVerticalGroup(
            botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonLayout.createSequentialGroup()
                .addComponent(C_Porcinos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(C_Crecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(C_Crecimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        Vista_info.setBackground(new java.awt.Color(255, 255, 255));

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextPane1.setText("Sistema de Gestión Ganadera: Funciones Destacadas\n\nNuestro avanzado sistema de gestión ganadera ofrece una variedad de funciones diseñadas para simplificar y mejorar la eficiencia en la administración de granjas porcícolas. Entre las principales capacidades, destacan: \n \n1. Creación de Posicultores: \n2. Visualización de Listado de Cerdos Registrados:\n3.Listado de Posicultores:\n\nEn resumen, nuestro sistema de gestión ganadera está diseñado para proporcionar una solución integral que simplifica la administración de granjas porcícolas al permitir la creación de posicultores, ofrecer listados detallados de cerdos registrados y posicultores.");
        jScrollPane1.setViewportView(jTextPane1);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina principal.jpg"))); // NOI18N

        javax.swing.GroupLayout Vista_infoLayout = new javax.swing.GroupLayout(Vista_info);
        Vista_info.setLayout(Vista_infoLayout);
        Vista_infoLayout.setHorizontalGroup(
            Vista_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Vista_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        Vista_infoLayout.setVerticalGroup(
            Vista_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Vista_infoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Vista_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Vista_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Vista_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void C_PorcinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_PorcinosActionPerformed
        agregarPanel2();
    }//GEN-LAST:event_C_PorcinosActionPerformed

    private void C_CrecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_CrecimientoActionPerformed
        agregarPane4();
    }//GEN-LAST:event_C_CrecimientoActionPerformed
    
    private void C_Crecimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_Crecimiento1ActionPerformed
        agregarPanel();
    }//GEN-LAST:event_C_Crecimiento1ActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        dispose();
    }//GEN-LAST:event_jLabel9MousePressed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        agregarPanel3();
    }//GEN-LAST:event_perfilActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
  
    
    public void cargarDatos(){
        ConsumoAPI consumo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuesta = consumo.consumoGET("http://localhost/APIPorcinos/Administrador/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray results = objetoRespuesta.get("registros").getAsJsonArray();
        
        if (results.size() > 0) {
            JsonObject primerRegistro = results.get(0).getAsJsonObject();
            String nombre = primerRegistro.get("nombre").getAsString();
            Campo_Nombre.setText(nombre);
        }
    }
    
    private void agregarPanel() {
        RegistrarPosicultores p1 = new RegistrarPosicultores();
        p1.setSize(550, 440);
        p1.setLocation(5, 5);
        setLocationRelativeTo(null);
        Vista_info.removeAll();
        Vista_info.revalidate();
        Vista_info.repaint();
        Vista_info.setLayout(new BorderLayout());
        Vista_info.add(p1, BorderLayout.CENTER);


    }
    
    private void agregarPanel2() {
        ControlPorcinos p2 = new ControlPorcinos();
        p2.setSize(550, 440);
        p2.setLocation(5, 5);
        Vista_info.removeAll();
        Vista_info.revalidate();
        Vista_info.repaint();
        Vista_info.setLayout(new BorderLayout());
        Vista_info.add(p2, BorderLayout.CENTER);
    }
    
    private void agregarPanel3() {
        VistadePerfil p3 = new VistadePerfil();
        p3.setSize(550, 440);
        p3.setLocation(5, 5);
        Vista_info.removeAll();
        Vista_info.revalidate();
        Vista_info.repaint();
        Vista_info.setLayout(new BorderLayout());
        Vista_info.add(p3, BorderLayout.CENTER);
    }
    
    private void agregarPane4() {
        RegistrodePosicultores p4 = new RegistrodePosicultores();
        p4.setSize(550, 440);
        p4.setLocation(5, 5);
        Vista_info.removeAll();
        Vista_info.revalidate();
        Vista_info.repaint();
        Vista_info.setLayout(new BorderLayout());
        Vista_info.add(p4, BorderLayout.CENTER);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C_Crecimiento;
    private javax.swing.JButton C_Crecimiento1;
    private javax.swing.JButton C_Porcinos;
    private javax.swing.JPanel CampoFoto;
    private javax.swing.JLabel Campo_Nombre;
    private javax.swing.JPanel Vista_info;
    private javax.swing.JPanel boton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton perfil;
    // End of variables declaration//GEN-END:variables

   

   

    
}
