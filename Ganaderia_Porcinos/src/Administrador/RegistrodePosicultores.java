package Administrador;

import clases.ConsumoAPI;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.regex.Pattern;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;

public class RegistrodePosicultores extends javax.swing.JPanel {

    public RegistrodePosicultores() {
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
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaPocicultor.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabla);
        tablaPocicultor.setRowSorter(sorter);

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
        modeloTabla.addColumn("Id_Pocicultor");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Contacto");
        modeloTabla.addColumn("Correo");
        modeloTabla.addColumn("Experiencia");
        modeloTabla.addColumn("Password");
        modeloTabla.addColumn("Id_Finca");

        
        String respuesta = consumo.consumoGET("http://localhost/APIPorcinos/Porcicultor/Obtener.php");
        JsonObject objetoRespuesta = JsonParser.parseString(respuesta).getAsJsonObject();
        JsonArray results = objetoRespuesta.get("registros").getAsJsonArray();
        
        
        for (int i = 0; i < results.size(); i++) {
            JsonObject registro = results.get(i).getAsJsonObject();

            String id_porcicultor = obtenerValorSeguro(registro,"id_porcicultor");
            String nombre = obtenerValorSeguro(registro, "nombre");
            String apellido = obtenerValorSeguro(registro, "apellido");
            String contacto = obtenerValorSeguro(registro, "contacto");
            String correo = obtenerValorSeguro(registro, "correo");
            String experiencia = obtenerValorSeguro(registro, "experiencia");
            String passw = obtenerValorSeguro(registro, "passw");
            String id_finca = obtenerValorSeguro(registro, "id_finca");

            modeloTabla.addRow(new Object[]{id_porcicultor, nombre, apellido, contacto, correo, experiencia, passw, id_finca});
        }  
        
       
        
        tablaPocicultor.setModel(modeloTabla);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPocicultor = new javax.swing.JTable();
        campoBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(578, 469));

        jPanel1.setBackground(new java.awt.Color(255, 255, 191));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tablaPocicultor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tablaPocicultor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificacion", "Raza", "Sexo", "Peso", "Fecha", "Estado"
            }
        ));
        jScrollPane1.setViewportView(tablaPocicultor);

        campoBuscar.setBackground(new java.awt.Color(255, 255, 191));
        campoBuscar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        campoBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(51, 51, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 191));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 191));
        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LISTADO DE POSICULTORES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(campoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
   

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPocicultor;
    // End of variables declaration//GEN-END:variables

    
}
