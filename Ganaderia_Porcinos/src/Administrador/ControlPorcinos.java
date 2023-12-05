package Administrador;

import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.regex.Pattern;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ControlPorcinos extends javax.swing.JPanel {
    
    
    public ControlPorcinos() {
        initComponents();
        cargarDatos();
        configurarBuscador();
    }
    
    private void configurarBuscador() {
        campoBuscar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarDatos();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarDatos();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Este método se usa generalmente para detectar cambios en atributos de estilo,
                // pero no es necesario para este caso.
            }
        });
    }

    private void filtrarDatos() {
        String textoBusqueda = campoBuscar.getText().toLowerCase().trim();
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaCerdos.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
        tablaCerdos.setRowSorter(sorter);

        if (!textoBusqueda.isEmpty()) {
            try {
                RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + Pattern.quote(textoBusqueda));
                sorter.setRowFilter(rowFilter);
            } catch (java.util.regex.PatternSyntaxException ex) {
                // Manejar la excepción si la expresión regular no es válida
                System.err.println("Error en la expresión regular: " + ex.getMessage());
            }
        } else {
            sorter.setRowFilter(null);
        }
    }

   

    public void cargarDatos(){
        ConsumoAPI consumo = new ConsumoAPI();
        Gson gson = new Gson();
        
        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Identificacion");
        modeloTabla.addColumn("Raza");
        modeloTabla.addColumn("Sexo");
        modeloTabla.addColumn("Peso");
        modeloTabla.addColumn("Fecha");
        modeloTabla.addColumn("Estado");
        modeloTabla.addColumn("Finca");
        
        String respuesta = consumo.consumoGET("http://localhost/APIPorcinos/Cerdos/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray results = objetoRespuesta.get("registros").getAsJsonArray();
        
        
        
        for (int i = 0; i < results.size(); i++) {
            JsonObject registro = results.get(i).getAsJsonObject();

            String id_cerdo = obtenerValorSeguro(registro, "id_cerdo");
            String raza = obtenerValorSeguro(registro, "raza");
            String sexo = obtenerValorSeguro(registro, "sexo");
            String peso = obtenerValorSeguro(registro, "peso");
            String fecha = obtenerValorSeguro(registro, "fecha");
            String estado = obtenerValorSeguro(registro, "estado");
            String id_finca = obtenerValorSeguro(registro, "id_finca");

            modeloTabla.addRow(new Object[]{id_cerdo, raza, sexo, peso, fecha, estado, id_finca});
        }  
        
       
        
        tablaCerdos.setModel(modeloTabla);
    }
    
    private String obtenerValorSeguro(JsonObject objeto, String clave){
        if(objeto.has(clave) && !objeto.get(clave).isJsonNull()){
            return objeto.get(clave).getAsString();     
        }else{
            return "";
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCerdos = new javax.swing.JTable();
        campoBuscar = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 191));
        setPreferredSize(new java.awt.Dimension(578, 469));

        jPanel2.setBackground(new java.awt.Color(255, 255, 191));

        jLabel4.setBackground(new java.awt.Color(51, 51, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TODOS LOS CERDOS REGISTRADOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        tablaCerdos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaCerdos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Raza", "Sexo", "Peso", "Fecha", "Estado", "Eliminar", "Editar"
            }
        ));
        jScrollPane1.setViewportView(tablaCerdos);

        campoBuscar.setBackground(new java.awt.Color(255, 255, 191));
        campoBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        campoBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCerdos;
    // End of variables declaration//GEN-END:variables
}
