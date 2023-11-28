
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
        String id = cerdo.getId_cerdo();
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        // GET con Datos
        Map<String, String> getData = new HashMap<>();
        getData.put("id_cerdo", id);
        
        String respuesta = ejemplo.consumoPOST("http://localhost/APIPorcinos/Peso/Obtener.php", getData);
        JsonObject objetoJson = JsonParser.parseString(respuesta).getAsJsonObject();
        System.out.println(respuesta);
        
        JsonArray arreglocerdos = objetoJson.getAsJsonArray("registros").getAsJsonArray();
        lista = new Peso [arreglocerdos.size()];
        
        for (int i = 0; i < arreglocerdos.size(); i++) {
            Peso temp = gson.fromJson(arreglocerdos.get(i).getAsJsonObject(), Peso.class);
            System.out.println("temp2 " + temp.getCerdo());
            lista[i] = temp;
            System.out.println("temp" + lista[i].getCerdo());
            this.id = lista[i].getCerdo();
        }
        tableModel =  (DefaultTableModel) this.tablaCerdo.getModel();
        
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
        btnAgregar = new javax.swing.JButton();
        Alert = new javax.swing.JLabel();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCerdo = new javax.swing.JTable();

        jPanelTitulo.setBackground(new java.awt.Color(119, 119, 91));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setText("CONTROL DEL PESO DEL CERDO");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTituloLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(14, 14, 14))
        );

        jPanelForm.setBackground(new java.awt.Color(255, 255, 191));

        jLabelForm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelForm.setText("AGREGAR PESO");

        jLabelAnterior.setText("Peso anterior:");

        campoPesoAnterior.setEnabled(false);

        jLabelNuevo.setText("Nuevo Peso:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        Alert.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanelFormLayout = new javax.swing.GroupLayout(jPanelForm);
        jPanelForm.setLayout(jPanelFormLayout);
        jPanelFormLayout.setHorizontalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Alert, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelFormLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoPesoAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(jLabelAnterior)
                                .addComponent(jLabelNuevo)
                                .addComponent(campoPesoNuevo)))
                        .addGroup(jPanelFormLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(jLabelForm))
                        .addGroup(jPanelFormLayout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(btnAgregar))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelFormLayout.setVerticalGroup(
            jPanelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelForm)
                .addGap(25, 25, 25)
                .addComponent(jLabelAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoPesoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoPesoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Alert)
                .addGap(9, 9, 9)
                .addComponent(btnAgregar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanelTabla.setBackground(new java.awt.Color(255, 204, 153));

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
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        ConsumoAPI ejemplo = new ConsumoAPI();
        System.out.println("id" + this.id);
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
    private javax.swing.JTable tablaCerdo;
    // End of variables declaration//GEN-END:variables
}
