/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;

import org.jfree.chart.plot.PlotOrientation;

/**
 *
 * @author angel
 */
public class JF_Insertar extends javax.swing.JFrame {

    private JF_PdfS JF_Pdf;
    
    public JF_Insertar() {
        initComponents();
        setLocationRelativeTo(null);
        customizeJTable(jT_ContenidoGrafica);
        JF_Pdf = new JF_PdfS();
        JF_Pdf.setLocationRelativeTo(null);
        JF_Pdf.setVisible(false);
    }

    private void customizeJTable(JTable table) {

        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(91, 75, 56));
        header.setForeground(new Color(255, 253, 245));
        header.setFont(header.getFont().deriveFont(Font.BOLD));
        header.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(91, 75, 56)));

        // Establecer borde inferior de cada fila
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                component.setBackground(new Color(255, 253, 245));
                ((JComponent) component).setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(91, 75, 56)));
                return component;
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDP_Panel = new javax.swing.JDesktopPane();
        jP_PanerGraficacion = new javax.swing.JPanel();
        jL_Login = new javax.swing.JLabel();
        jB_Attach = new javax.swing.JButton();
        jCB_SeleccionarGrafica = new javax.swing.JComboBox<>();
        JL_UserTittle = new javax.swing.JLabel();
        jSP_ContenidoGrafica = new javax.swing.JScrollPane();
        jT_ContenidoGrafica = new javax.swing.JTable();
        jB_Guardar = new javax.swing.JButton();
        jB_Attach1 = new javax.swing.JButton();
        jB_Mostrar = new javax.swing.JButton();
        jMB_Insertar = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jP_PanerGraficacion.setBackground(new java.awt.Color(255, 253, 245));

        jL_Login.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jL_Login.setForeground(new java.awt.Color(91, 75, 56));
        jL_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Login.setText("Graficacion CSV");
        jL_Login.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(91, 75, 56)));

        jB_Attach.setBackground(new java.awt.Color(91, 75, 56));
        jB_Attach.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jB_Attach.setForeground(new java.awt.Color(255, 253, 245));
        jB_Attach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Attach.png"))); // NOI18N
        jB_Attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_AttachActionPerformed(evt);
            }
        });

        jCB_SeleccionarGrafica.setBackground(new java.awt.Color(255, 253, 245));
        jCB_SeleccionarGrafica.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jCB_SeleccionarGrafica.setForeground(new java.awt.Color(91, 75, 56));
        jCB_SeleccionarGrafica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grafica 1", "Grafica 2", "Grafica 3" }));
        jCB_SeleccionarGrafica.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(91, 75, 56)));
        jCB_SeleccionarGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_SeleccionarGraficaActionPerformed(evt);
            }
        });

        JL_UserTittle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JL_UserTittle.setForeground(new java.awt.Color(91, 75, 56));
        JL_UserTittle.setText("Selecciona grafica:");

        jSP_ContenidoGrafica.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 75, 56), 2, true), "Contenido Grafica", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(91, 75, 56))); // NOI18N
        jSP_ContenidoGrafica.setForeground(new java.awt.Color(91, 75, 56));
        jSP_ContenidoGrafica.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jSP_ContenidoGrafica.setOpaque(false);

        jT_ContenidoGrafica.setBackground(new java.awt.Color(255, 253, 245));
        jT_ContenidoGrafica.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jT_ContenidoGrafica.setForeground(new java.awt.Color(91, 75, 56));
        jT_ContenidoGrafica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jT_ContenidoGrafica.setSelectionBackground(new java.awt.Color(163, 137, 106));
        jT_ContenidoGrafica.setSelectionForeground(new java.awt.Color(255, 253, 245));
        jT_ContenidoGrafica.setShowGrid(true);
        jSP_ContenidoGrafica.setViewportView(jT_ContenidoGrafica);

        jB_Guardar.setBackground(new java.awt.Color(91, 75, 56));
        jB_Guardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jB_Guardar.setForeground(new java.awt.Color(255, 253, 245));
        jB_Guardar.setText("Guardar");
        jB_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_GuardarActionPerformed(evt);
            }
        });

        jB_Attach1.setBackground(new java.awt.Color(91, 75, 56));
        jB_Attach1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jB_Attach1.setForeground(new java.awt.Color(255, 253, 245));
        jB_Attach1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        jB_Attach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Attach1ActionPerformed(evt);
            }
        });

        jB_Mostrar.setBackground(new java.awt.Color(91, 75, 56));
        jB_Mostrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jB_Mostrar.setForeground(new java.awt.Color(255, 253, 245));
        jB_Mostrar.setText("Mostrar Grafico");
        jB_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_MostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jP_PanerGraficacionLayout = new javax.swing.GroupLayout(jP_PanerGraficacion);
        jP_PanerGraficacion.setLayout(jP_PanerGraficacionLayout);
        jP_PanerGraficacionLayout.setHorizontalGroup(
            jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jL_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                        .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                                .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCB_SeleccionarGrafica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JL_UserTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jB_Attach, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                                .addComponent(jB_Attach1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jB_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSP_ContenidoGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jP_PanerGraficacionLayout.setVerticalGroup(
            jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                        .addComponent(JL_UserTittle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCB_SeleccionarGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jB_Attach, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSP_ContenidoGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_Attach1)
                    .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jB_Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jDP_Panel.setLayer(jP_PanerGraficacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDP_PanelLayout = new javax.swing.GroupLayout(jDP_Panel);
        jDP_Panel.setLayout(jDP_PanelLayout);
        jDP_PanelLayout.setHorizontalGroup(
            jDP_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_PanerGraficacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDP_PanelLayout.setVerticalGroup(
            jDP_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_PanerGraficacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenu3.setText("File");
        jMB_Insertar.add(jMenu3);

        jMenu4.setText("Edit");
        jMB_Insertar.add(jMenu4);

        setJMenuBar(jMB_Insertar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDP_Panel, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDP_Panel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_AttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_AttachActionPerformed
       
        JFileChooser chooser = new JFileChooser();

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Solo archivos
        chooser.setMultiSelectionEnabled(false); // Deshabilita selección múltiple

        // Filtro para permitir solo archivos CSV
        chooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("CSV Files", "csv"));

        if (chooser.showOpenDialog(null) != JFileChooser.CANCEL_OPTION) {
            File selectedFile = chooser.getSelectedFile();

            if (selectedFile != null) {
                System.out.println("Archivo seleccionado: " + selectedFile.getAbsolutePath());
                cargarCSV(selectedFile);
                JF_Pdf.cargarCSV(selectedFile);
                JF_Pdf.generarGrafico1();
                JF_Pdf.generarGrafico2();
                JF_Pdf.generarGrafico3();

            }
        }
    }//GEN-LAST:event_jB_AttachActionPerformed

    private void cargarCSV(File file) {
        DefaultTableModel model = new DefaultTableModel();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            boolean esPrimeraLinea = true;

            while ((linea = br.readLine()) != null) {
                String[] values = linea.split(","); // Divide por comas

                if (esPrimeraLinea) {
                    model.setColumnIdentifiers(values); // Usa la primera fila como encabezados
                    esPrimeraLinea = false;
                } else {
                    model.addRow(values);
                }
            }

            jT_ContenidoGrafica.setModel(model);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo CSV", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    


    private void generarGrafico1() {
        DefaultTableModel model = (DefaultTableModel) jT_ContenidoGrafica.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();


        // Verificar que hay suficientes datos para graficar
        if (rowCount == 0 || columnCount < 2) {
            JOptionPane.showMessageDialog(null, "No hay suficientes datos para graficar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < rowCount; i++) {
            try {
                String meses = model.getValueAt(i, 0).toString();  // Primer columna (X - Categoría)

                String salario = model.getValueAt(i, 4).toString();

                double salProm = Double.parseDouble(salario); // Segunda columna (Y - Valor)

                dataset.addValue(salProm, "Datos", meses);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Verifica que la segunda columna tenga solo números", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return;
            }
        }

        // Crear el gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                "Grafico de Datos", // Título
                "Meses", // Eje X
                "USD a MXN ", // Eje Y
                dataset);

       
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(600, 400));

        JFrame frame = new JFrame("Grafico");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);

    }

    private void generarGrafico2() {
        DefaultTableModel model = (DefaultTableModel) jT_ContenidoGrafica.getModel();
        int rowCount = model.getRowCount();

        if (rowCount == 0) {
            JOptionPane.showMessageDialog(null, "No hay suficientes datos para graficar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (int i = 0; i < rowCount; i++) {
            try {
                String mes = model.getValueAt(i, 0).toString();  // Columna de Meses

                // Inflación
                String inflacionStr = model.getValueAt(i, 1).toString().replace("%", "").trim();
                double inflacion = Double.parseDouble(inflacionStr);

                // Desempleo
                String desempleoStr = model.getValueAt(i, 2).toString().replace("%", "").trim();
                double desempleo = Double.parseDouble(desempleoStr);

                // Crecimiento PIB
                String pibStr = model.getValueAt(i, 3).toString().replace("%", "").trim();
                double pib = Double.parseDouble(pibStr);

                dataset.addValue(inflacion, "Inflación %", mes);
                dataset.addValue(desempleo, "Desempleo %", mes);
                dataset.addValue(pib, "PIB %", mes);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Verifica que Inflación y Desempleo tengan valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return;
            }
        }

        
        JFreeChart chart = ChartFactory.createLineChart(
                "Inflación, Desempleo y Crecimiento de PIB (%)", // Título
                "Meses", // Eje X
                "Porcentaje", // Eje Y
                dataset);

        ChartPanel chartPanel = new ChartPanel(chart);
        // Mostrar en JPanel
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(600, 400));

        JFrame frame = new JFrame("Grafico");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);

    }

    private void generarGrafico3() {
        DefaultTableModel model = (DefaultTableModel) jT_ContenidoGrafica.getModel();
        int rowCount = model.getRowCount();

        if (rowCount == 0) {
            JOptionPane.showMessageDialog(null, "No hay suficientes datos para graficar", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

       DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        
        for (int i = 0; i < rowCount; i++) {
            try {
                String mes = model.getValueAt(i, 0).toString();  // Columna de Meses
                String exp = model.getValueAt(i, 5).toString();
                double expMill = Double.parseDouble(exp);

                
                dataset.addValue(expMill, "Exportacion Mill.USD", mes);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Verifica que Inflación y Desempleo tengan valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
                return;
            }
        }

        // Crear el gráfico de área
        JFreeChart chart = ChartFactory.createAreaChart(
                "Exportaciones Mensuales", // Título
                "Meses",                   // Eje X
                "Exportación Mill.USD",    // Eje Y
                dataset,                   // Dataset
                PlotOrientation.VERTICAL,  // Orientación del gráfico
                true,                     
                true,                      
                false                      // No URLs
        );

        
        chart.setBackgroundPaint(Color.white);

        
        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(600, 600));

       
        JFrame frame = new JFrame("Gráfico de Área");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centrar la ventana
        frame.setVisible(true);
    

}

    private void jB_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_GuardarActionPerformed
       if(jT_ContenidoGrafica.getRowCount()==0){
           JOptionPane.showMessageDialog(rootPane, "No hay datos a guardar");
       }else{
        
        String rutaProyecto = System.getProperty("user.dir"); // Obtiene la ruta del proyecto
        String rutaPDF = rutaProyecto + "/frame.pdf"; // Guarda el PDF en la raíz del proyecto
        JF_Pdf.setVisible(true);
        JF_Pdf.capturarFrame(JF_Pdf);
           try {
               JF_Pdf.guardarPDFConImagen(JF_Pdf, rutaPDF);
               
           } catch (IOException ex) {
               Logger.getLogger(JF_Insertar.class.getName()).log(Level.SEVERE, null, ex);
           }
           JOptionPane.showMessageDialog(rootPane, "PDF Guardado Con Exito!");
        JF_Pdf.setVisible(false);
    }//GEN-LAST:event_jB_GuardarActionPerformed
    }
    
    private void jB_Attach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Attach1ActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) jT_ContenidoGrafica.getModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);

        jCB_SeleccionarGrafica.setSelectedIndex(0);

    }//GEN-LAST:event_jB_Attach1ActionPerformed

    private void jCB_SeleccionarGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_SeleccionarGraficaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB_SeleccionarGraficaActionPerformed

    private void jB_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_MostrarActionPerformed
        // TODO add your handling code here:

        String seleccion = (String) jCB_SeleccionarGrafica.getSelectedItem(); // Obtener opción seleccionada

        if (seleccion.equals("Grafica 1")) {
            generarGrafico1();
            
        } else if (seleccion.equals("Grafica 2")) {
            generarGrafico2();
        } else if (seleccion.equals("Grafica 3")) {
            generarGrafico3();
        }
    }//GEN-LAST:event_jB_MostrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JF_Insertar.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Insertar.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Insertar.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Insertar.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatLightLaf());

} catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(JF_Insertar.class  

.getName()).log(Level.SEVERE, null, ex);
                }
                new JF_Insertar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_UserTittle;
    private javax.swing.JButton jB_Attach;
    private javax.swing.JButton jB_Attach1;
    private javax.swing.JButton jB_Guardar;
    private javax.swing.JButton jB_Mostrar;
    private javax.swing.JComboBox<String> jCB_SeleccionarGrafica;
    private javax.swing.JDesktopPane jDP_Panel;
    private javax.swing.JLabel jL_Login;
    private javax.swing.JMenuBar jMB_Insertar;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jP_PanerGraficacion;
    private javax.swing.JScrollPane jSP_ContenidoGrafica;
    private javax.swing.JTable jT_ContenidoGrafica;
    // End of variables declaration//GEN-END:variables
}
