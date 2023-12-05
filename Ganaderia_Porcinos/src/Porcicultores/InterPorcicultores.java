package Porcicultores;
import clases.Cerdos;
import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.BorderLayout;



public class InterPorcicultores extends javax.swing.JFrame {
    Cerdos listaCerdos[];
    int cantidadDiponible;
    public InterPorcicultores() {
        this.cantidadDiponible = 0;
        initComponents();
        initAlternComponents();
       
    }
    
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        cantCerdo();
    }
    
    public void cantCerdo(){
        Informacion informacion = new Informacion();
        informacion.setSize(630, 390);
        setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(informacion, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        setLocationRelativeTo(null); 
   }
   
 
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        nombreUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        controlCerdos = new javax.swing.JButton();
        btnControlCrecimiento = new javax.swing.JButton();
        jLabelNombreUsuario = new javax.swing.JLabel();
        menuTitulo = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(255, 255, 191));
        menu.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 1, 10, 1, new java.awt.Color(119, 119, 91)));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        nombreUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nombreUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreUser.setText("Nombre Usuario");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        controlCerdos.setBackground(new java.awt.Color(255, 255, 191));
        controlCerdos.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        controlCerdos.setText("Control de Cerdos");
        controlCerdos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(119, 119, 91)));
        controlCerdos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        controlCerdos.setFocusable(false);
        controlCerdos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        controlCerdos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlCerdosActionPerformed(evt);
            }
        });

        btnControlCrecimiento.setBackground(new java.awt.Color(255, 255, 191));
        btnControlCrecimiento.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnControlCrecimiento.setText("Control de Crecimiento");
        btnControlCrecimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(119, 119, 91)));
        btnControlCrecimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnControlCrecimiento.setFocusable(false);
        btnControlCrecimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnControlCrecimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlCrecimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlCerdos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnControlCrecimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addComponent(icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreUser)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addComponent(jLabelNombreUsuario)
                                .addGap(48, 48, 48)))
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlCerdos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnControlCrecimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTitulo.setBackground(new java.awt.Color(255, 255, 255));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoimg.png"))); // NOI18N
        img.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 5, new java.awt.Color(119, 119, 91)));

        javax.swing.GroupLayout menuTituloLayout = new javax.swing.GroupLayout(menuTitulo);
        menuTitulo.setLayout(menuTituloLayout);
        menuTituloLayout.setHorizontalGroup(
            menuTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuTituloLayout.setVerticalGroup(
            menuTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 140, Short.MAX_VALUE)
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));
        contenido.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 10, 1, new java.awt.Color(119, 119, 91)));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnControlCrecimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlCrecimientoActionPerformed
        PanelControlCrecimiento panelControlCrecimiento = new PanelControlCrecimiento(this);
        panelControlCrecimiento.setSize(630, 390);
        setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(panelControlCrecimiento, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btnControlCrecimientoActionPerformed

    private void controlCerdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlCerdosActionPerformed
        PanelControlCerdos panelControlCerdos = new PanelControlCerdos();
        panelControlCerdos.setSize(630, 390);
        setLocation(0,0);
        
        contenido.removeAll();
        contenido.add(panelControlCerdos, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_controlCerdosActionPerformed
    
    public void agregarPesoCerdo(Cerdos cerdo){
        AgregarPesoCerdo panelAgregar = new AgregarPesoCerdo(cerdo);
        panelAgregar.setSize(630, 390);
        setLocation(0, 0);
        
        contenido.removeAll();
        contenido.add(panelAgregar, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        setLocationRelativeTo(null);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterPorcicultores().setVisible(true);
            }
        });
    }
    
    public void cargarTabla(){
        PanelControlCerdos panelControlCerdos = new PanelControlCerdos();
        panelControlCerdos.setSize(630, 390);
        setLocation(0,0);
        panelControlCerdos.llenarTabla();
        
        contenido.removeAll();
        contenido.add(panelControlCerdos, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        setLocationRelativeTo(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnControlCrecimiento;
    private javax.swing.JPanel contenido;
    private javax.swing.JButton controlCerdos;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabelNombreUsuario;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuTitulo;
    private javax.swing.JLabel nombreUser;
    // End of variables declaration//GEN-END:variables
}
