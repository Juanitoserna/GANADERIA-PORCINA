
package Porcicultores;

import clases.Cerdos;
import clases.ConsumoAPI;
import clases.Peso;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class AgregarPesoCerdo extends javax.swing.JPanel {
    Cerdos cerdo;
    Peso lista [];
    DefaultTableModel tableModel;
    String id;
    
    public AgregarPesoCerdo(Cerdos cerdo) {
        this.cerdo = cerdo;
        this.id = id;
        initComponents();
        initAlterntComponent();
        tableModel =  (DefaultTableModel) this.tablaCerdo.getModel();
    }
    
    public void initAlterntComponent(){
        String peso_anterior = Float.toString(cerdo.getPeso());
        campoPesoAnterior.setText(peso_anterior);
        String id_cerdo = cerdo.getId_cerdo();
        
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        // GET con Datos
        Map<String, String> getData = new HashMap<>();
        getData.put("id_cerdo", id_cerdo);
        String respuesta = ejemplo.consumoPOST("http://localhost/APIPorcinos/Peso/Obtener.php", getData);
        
        JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
        System.out.println(respuesta);
        
        // Verifica si la clave "registros" está presente en el JSON
        if (objetoJson.has("registros") && objetoJson.get("registros").isJsonArray()) {
            JsonArray arreglocerdos = objetoJson.getAsJsonArray("registros");

            // Verifica si la lista no está vacía
            if (arreglocerdos.size() > 0) {
                lista = new Peso[arreglocerdos.size()];

                for (int i = 0; i < arreglocerdos.size(); i++) {
                    Peso temp = gson.fromJson(arreglocerdos.get(i).getAsJsonObject(), Peso.class);
                    lista[i] = temp;
                    this.id = temp.getCerdo(); // Actualiza la variable id usando el último valor
                    System.out.println("entro aqui");
                }
            } else {
                System.out.println("La lista 'arreglocerdos' está vacía.");
            }
        } else {
            System.out.println("La clave 'registros' no está presente en el JSON.");
        }
        tableModel =  (DefaultTableModel) this.tablaCerdo.getModel();
        System.out.println("id" + this.id);
        // Llenar la tabla con los datos del arreglo
        llenarTabla();
        setVisible(true);
        
    }
    public void llenarTabla(){
        tableModel.setNumRows(0);
        for (int i=0; i<lista.length; i++) {
            int id = lista[i].getId();
            String cerdo = lista[i].getCerdo();
            Float peso = lista[i].getPeso();
            
            Object[] temporal = new Object[]{ id, cerdo, peso};
            tableModel.addRow(temporal);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelForm = new javax.swing.JPanel();
        jLabelForm = new javax.swing.JLabel();
        jLabelAnterior = new javax.swing.JLabel();
        campoPesoAnterior = new javax.swing.JTextField();
        jLabelNuevo = new javax.swing.JLabel();
        campoPesoNuevo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        Alert = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCerdo = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTitulo.setBackground(new java.awt.Color(119, 119, 91));

        jLabelTitulo.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabelTitulo.setText("CONTROL DEL PESO DEL CERDO");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(60, 60, 60))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        add(jPanelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-11, 0, 630, -1));

        jPanelForm.setBackground(new java.awt.Color(255, 255, 191));

        jLabelForm.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabelForm.setText("AGREGAR PESO");

        jLabelAnterior.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelAnterior.setText("Peso anterior:");

        campoPesoAnterior.setBackground(new java.awt.Color(255, 255, 191));
        campoPesoAnterior.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        campoPesoAnterior.setBorder(null);

        jLabelNuevo.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabelNuevo.setText("Nuevo Peso:");

        campoPesoNuevo.setBackground(new java.awt.Color(255, 255, 191));
        campoPesoNuevo.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        campoPesoNuevo.setBorder(null);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnAgregar.setBackground(new java.awt.Color(255, 255, 191));
        btnAgregar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        Alert.setForeground(new java.awt.Color(255, 0, 0));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jLabelForm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAnterior)
                            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoPesoAnterior, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoPesoNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Alert, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jSeparator3))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabelForm)
                .addGap(18, 18, 18)
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(Alert, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanelFormLayout.createSequentialGroup()
                        .addComponent(jLabelAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoPesoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelNuevo)
                        .addGap(3, 3, 3)
                        .addComponent(campoPesoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        add(jPanelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 58, 240, 340));

        jPanelTabla.setBackground(new java.awt.Color(255, 255, 191));

        tablaCerdo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID:", "Cerdo:", "Pesos:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCerdo);
        if (tablaCerdo.getColumnModel().getColumnCount() > 0) {
            tablaCerdo.getColumnModel().getColumn(0).setResizable(false);
            tablaCerdo.getColumnModel().getColumn(1).setResizable(false);
            tablaCerdo.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
        );

        add(jPanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 58, -1, 340));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ConsumoAPI ejemplo = new ConsumoAPI();
        
        String campo_nuevo = campoPesoNuevo.getText();
        String campo_anterior = campoPesoAnterior.getText();
        if (campo_nuevo.equals("")) {
            Alert.setText("Este campo deve ser diligenciado");
        }else{
           float peso_nuevo = Float.parseFloat(campo_nuevo); 
           float peso_anterior = Float.parseFloat(campo_anterior); 
            if (peso_nuevo <= peso_anterior) {
                Alert.setText("El peso ingresado no es valido");
            }else{
                // POST con Datos
                Map<String, String> updateData = new HashMap<>();
                updateData.put("id_cerdo", this.id );
                updateData.put("peso", campo_nuevo);
                System.out.println("Consumo UPDATE: " + ejemplo.consumoPOST("http://localhost/APIPorcinos/Cerdos/UpdatePeso.php", updateData));
                
                // POST con Datos
                Map<String, String> insertData = new HashMap<>();
                insertData.put("id_cerdo", this.id);
                insertData.put("nuevo_peso", campo_nuevo);
                System.out.println("Consumo INSERT: " + ejemplo.consumoPOST("http://localhost/APIPorcinos/Peso/Insert.php", insertData));
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alert;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField campoPesoAnterior;
    private javax.swing.JTextField campoPesoNuevo;
    private javax.swing.JLabel jLabelAnterior;
    private javax.swing.JLabel jLabelForm;
    private javax.swing.JLabel jLabelNuevo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelForm;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tablaCerdo;
    // End of variables declaration//GEN-END:variables
}
