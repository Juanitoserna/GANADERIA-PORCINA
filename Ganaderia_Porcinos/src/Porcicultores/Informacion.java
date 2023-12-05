
package Porcicultores;

import clases.Cerdos;
import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Informacion extends javax.swing.JPanel {
    
    Cerdos listaCerdos[];
    int cantidadDiponible;
    
    public Informacion() {
        this.cantidadDiponible = 0;
        initComponents();
        cantCerdo();
        fecha();
    }
    
    public void cantCerdo(){
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        String respuestaAll = ejemplo.consumoGET("http://localhost/APIPorcinos/Cerdos/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuestaAll).getAsJsonObject();
        
        JsonArray arreglocerdos = objetoRespuesta.getAsJsonArray("registros").getAsJsonArray();
        listaCerdos = new Cerdos[arreglocerdos.size()];
        
        for (int i = 0; i < arreglocerdos.size(); i++) {
            Cerdos temp = gson.fromJson(arreglocerdos.get(i).getAsJsonObject(), Cerdos.class);
            listaCerdos[i] = temp;
            this.cantidadDiponible += 1;
        }
        String cantidaString = Integer.toString(this.cantidadDiponible);
        jLabelCerdoDis.setText(cantidaString);
    }
    
    public void fecha(){
        // Obtener la fecha y hora actual
        LocalDateTime fechaActual = LocalDateTime.now();

        // Formatear la fecha y hora según tus necesidades
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaActual.format(formato);
        
        jLabelFecha.setText(fechaFormateada);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelPrincpal = new javax.swing.JPanel();
        jLabeltitulo = new javax.swing.JLabel();
        jPanelCant = new javax.swing.JPanel();
        jLabelCant = new javax.swing.JLabel();
        jLabelCerdoDis = new javax.swing.JLabel();
        jPanelFinca = new javax.swing.JPanel();
        jLabelFinca = new javax.swing.JLabel();
        jLabelNombreFinca = new javax.swing.JLabel();
        jPanelPorcicultor = new javax.swing.JPanel();
        jLabelTporcicultor = new javax.swing.JLabel();
        jLabelNombrePorci = new javax.swing.JLabel();
        jLabelApellidoPorci = new javax.swing.JLabel();
        jLabelfecha = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabeltitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabeltitulo.setText("BIENVENIDO PORCICULTOR");

        jPanelCant.setBackground(new java.awt.Color(255, 153, 153));

        jLabelCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelCant.setText("Cerdos Disponibles:");

        jLabelCerdoDis.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelCerdoDis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCerdoDis.setText("0");

        javax.swing.GroupLayout jPanelCantLayout = new javax.swing.GroupLayout(jPanelCant);
        jPanelCant.setLayout(jPanelCantLayout);
        jPanelCantLayout.setHorizontalGroup(
            jPanelCantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCantLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanelCantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelCerdoDis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCant))
                .addGap(12, 12, 12))
        );
        jPanelCantLayout.setVerticalGroup(
            jPanelCantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCantLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCant)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCerdoDis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFinca.setBackground(new java.awt.Color(102, 204, 255));

        jLabelFinca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelFinca.setText("Finca Asignada:");

        jLabelNombreFinca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNombreFinca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreFinca.setText("prueba");

        javax.swing.GroupLayout jPanelFincaLayout = new javax.swing.GroupLayout(jPanelFinca);
        jPanelFinca.setLayout(jPanelFincaLayout);
        jPanelFincaLayout.setHorizontalGroup(
            jPanelFincaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFincaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNombreFinca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelFincaLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabelFinca)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanelFincaLayout.setVerticalGroup(
            jPanelFincaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFincaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFinca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombreFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelPorcicultor.setBackground(new java.awt.Color(153, 255, 153));

        jLabelTporcicultor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelTporcicultor.setText("Nombre Del Porcicultor:");

        jLabelNombrePorci.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombrePorci.setText("nombre");

        jLabelApellidoPorci.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelApellidoPorci.setText("apellido");

        javax.swing.GroupLayout jPanelPorcicultorLayout = new javax.swing.GroupLayout(jPanelPorcicultor);
        jPanelPorcicultor.setLayout(jPanelPorcicultorLayout);
        jPanelPorcicultorLayout.setHorizontalGroup(
            jPanelPorcicultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPorcicultorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPorcicultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPorcicultorLayout.createSequentialGroup()
                        .addComponent(jLabelNombrePorci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addGroup(jPanelPorcicultorLayout.createSequentialGroup()
                        .addComponent(jLabelApellidoPorci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanelPorcicultorLayout.createSequentialGroup()
                        .addComponent(jLabelTporcicultor)
                        .addGap(0, 22, Short.MAX_VALUE))))
        );
        jPanelPorcicultorLayout.setVerticalGroup(
            jPanelPorcicultorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPorcicultorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTporcicultor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombrePorci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelApellidoPorci)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelfecha.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabelfecha.setText("Fecha:");

        jLabelFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelFecha.setText("fecha");

        javax.swing.GroupLayout jPanelPrincpalLayout = new javax.swing.GroupLayout(jPanelPrincpal);
        jPanelPrincpal.setLayout(jPanelPrincpalLayout);
        jPanelPrincpalLayout.setHorizontalGroup(
            jPanelPrincpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincpalLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabeltitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincpalLayout.createSequentialGroup()
                .addGroup(jPanelPrincpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincpalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanelCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanelPorcicultor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincpalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrincpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelPrincpalLayout.setVerticalGroup(
            jPanelPrincpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincpalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabeltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanelPrincpalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelPorcicultor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFinca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("TENER EN CUENTA:");

        jLabel10.setText(" Un porcicultor se encarga de alimentar, cuidar y gestionar la salud de cerdos.");

        jLabel11.setText(" Su día incluye distribuir alimentos, monitorear la salud de los animales y mantener las instalaciones en buenas ");

        jLabel12.setText("condiciones. Además, puede participar en tareas de reproducción");

        jLabel13.setText("y llevar a cabo registros administrativos para asegurar una operación porcina eficiente.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanelPrincpal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincpal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(0, 14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelApellidoPorci;
    private javax.swing.JLabel jLabelCant;
    private javax.swing.JLabel jLabelCerdoDis;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFinca;
    private javax.swing.JLabel jLabelNombreFinca;
    private javax.swing.JLabel jLabelNombrePorci;
    private javax.swing.JLabel jLabelTporcicultor;
    private javax.swing.JLabel jLabelfecha;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanelCant;
    private javax.swing.JPanel jPanelFinca;
    private javax.swing.JPanel jPanelPorcicultor;
    private javax.swing.JPanel jPanelPrincpal;
    // End of variables declaration//GEN-END:variables
}
