package Administrador;

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
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CampoFoto = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        perfil = new javax.swing.JButton();
        Campo_Nombre = new javax.swing.JLabel();
        boton = new javax.swing.JPanel();
        C_Porcinos = new javax.swing.JButton();
        C_Crecimiento = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        C_Crecimiento1 = new javax.swing.JButton();
        Vista_info = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO ADMINISTRADOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        CampoFoto.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N

        javax.swing.GroupLayout CampoFotoLayout = new javax.swing.GroupLayout(CampoFoto);
        CampoFoto.setLayout(CampoFotoLayout);
        CampoFotoLayout.setHorizontalGroup(
            CampoFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CampoFotoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CampoFotoLayout.setVerticalGroup(
            CampoFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        perfil.setBackground(new java.awt.Color(255, 255, 255));
        perfil.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        perfil.setForeground(new java.awt.Color(0, 0, 0));
        perfil.setText("PERFIL");
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });

        Campo_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Campo_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Campo_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Campo_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Campo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(CampoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(perfil)
                        .addGap(78, 78, 78))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CampoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Campo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perfil)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        boton.setBackground(new java.awt.Color(0, 0, 0));
        boton.setForeground(new java.awt.Color(0, 0, 0));

        C_Porcinos.setBackground(new java.awt.Color(255, 255, 255));
        C_Porcinos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C_Porcinos.setForeground(new java.awt.Color(0, 0, 0));
        C_Porcinos.setText("Control de Porcionos");
        C_Porcinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_PorcinosActionPerformed(evt);
            }
        });

        C_Crecimiento.setBackground(new java.awt.Color(255, 255, 255));
        C_Crecimiento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C_Crecimiento.setForeground(new java.awt.Color(0, 0, 0));
        C_Crecimiento.setText("Control de Crecimiento ");
        C_Crecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_CrecimientoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Cerrar Session");

        C_Crecimiento1.setBackground(new java.awt.Color(255, 255, 255));
        C_Crecimiento1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        C_Crecimiento1.setForeground(new java.awt.Color(0, 0, 0));
        C_Crecimiento1.setText("Registro Posicultores");
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
                .addGroup(botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(botonLayout.createSequentialGroup()
                        .addGroup(botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(botonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_Porcinos, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(botonLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(C_Crecimiento))
                            .addGroup(botonLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(C_Crecimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        botonLayout.setVerticalGroup(
            botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(C_Porcinos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Crecimiento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(C_Crecimiento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18))
        );

        Vista_info.setBackground(new java.awt.Color(255, 255, 255));
        Vista_info.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Vista_infoLayout = new javax.swing.GroupLayout(Vista_info);
        Vista_info.setLayout(Vista_infoLayout);
        Vista_infoLayout.setHorizontalGroup(
            Vista_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Vista_infoLayout.setVerticalGroup(
            Vista_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Vista_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        agregarPanel3();
    }//GEN-LAST:event_perfilActionPerformed
    
  
    
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
        RegistrarPosicultores p = new RegistrarPosicultores();
        p.setSize(550, 440);
        p.setLocation(5, 5);
        Vista_info.removeAll();
        Vista_info.add(p, BorderLayout.CENTER);
        Vista_info.revalidate();
        Vista_info.repaint();
    }
    
    private void agregarPanel2() {
        ControlPorcinos p = new ControlPorcinos();
        p.setSize(550, 440);
        p.setLocation(5, 5);
        Vista_info.removeAll();
        Vista_info.add(p, BorderLayout.CENTER);
        Vista_info.revalidate();
        Vista_info.repaint();
    }
    
    private void agregarPanel3() {
        VistadePerfil p = new VistadePerfil();
        p.setSize(550, 440);
        p.setLocation(5, 5);
        Vista_info.removeAll();
        Vista_info.add(p, BorderLayout.CENTER);
        Vista_info.revalidate();
        Vista_info.repaint();
    }
    
    private void agregarPane4() {
        ControldeCrecimiento p = new ControldeCrecimiento();
        p.setSize(550, 440);
        p.setLocation(5, 5);
        Vista_info.removeAll();
        Vista_info.add(p, BorderLayout.CENTER);
        Vista_info.revalidate();
        Vista_info.repaint();
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
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton perfil;
    // End of variables declaration//GEN-END:variables

   

   

    
}
