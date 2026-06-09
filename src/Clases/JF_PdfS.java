/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Clases;

import com.formdev.flatlaf.FlatLightLaf;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

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
public class JF_PdfS extends javax.swing.JFrame {

    public JF_PdfS() {
        initComponents();
        customizeJTable(jT_ContenidoGraficaPDF);
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
        jSP_ContenidoGrafica = new javax.swing.JScrollPane();
        jT_ContenidoGraficaPDF = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jP_PanerGraficacion.setBackground(new java.awt.Color(255, 253, 245));

        jSP_ContenidoGrafica.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(91, 75, 56), 2, true), "Contenido Grafica", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12), new java.awt.Color(91, 75, 56))); // NOI18N
        jSP_ContenidoGrafica.setForeground(new java.awt.Color(91, 75, 56));
        jSP_ContenidoGrafica.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jSP_ContenidoGrafica.setOpaque(false);

        jT_ContenidoGraficaPDF.setBackground(new java.awt.Color(255, 253, 245));
        jT_ContenidoGraficaPDF.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jT_ContenidoGraficaPDF.setForeground(new java.awt.Color(91, 75, 56));
        jT_ContenidoGraficaPDF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jT_ContenidoGraficaPDF.setSelectionBackground(new java.awt.Color(163, 137, 106));
        jT_ContenidoGraficaPDF.setSelectionForeground(new java.awt.Color(255, 253, 245));
        jT_ContenidoGraficaPDF.setShowGrid(true);
        jSP_ContenidoGrafica.setViewportView(jT_ContenidoGraficaPDF);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jP_PanerGraficacionLayout = new javax.swing.GroupLayout(jP_PanerGraficacion);
        jP_PanerGraficacion.setLayout(jP_PanerGraficacionLayout);
        jP_PanerGraficacionLayout.setHorizontalGroup(
            jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jSP_ContenidoGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jP_PanerGraficacionLayout.setVerticalGroup(
            jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP_PanerGraficacionLayout.createSequentialGroup()
                .addComponent(jSP_ContenidoGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jP_PanerGraficacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jDP_Panel.setLayer(jP_PanerGraficacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDP_PanelLayout = new javax.swing.GroupLayout(jDP_Panel);
        jDP_Panel.setLayout(jDP_PanelLayout);
        jDP_PanelLayout.setHorizontalGroup(
            jDP_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDP_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jP_PanerGraficacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDP_PanelLayout.setVerticalGroup(
            jDP_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jP_PanerGraficacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    public void cargarCSV(File file) {
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

            jT_ContenidoGraficaPDF.setModel(model);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo CSV", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void generarGrafico1() {
        DefaultTableModel model = (DefaultTableModel) jT_ContenidoGraficaPDF.getModel();
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

        JFreeChart chart = ChartFactory.createBarChart(
                "Grafico de Datos", // Título
                "Meses", // Eje X
                "USD a MXN ", // Eje Y
                dataset);

        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(600, 350));

//    jPanel1.setLayout(new BorderLayout());
        jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

        jPanel1.removeAll();
        jPanel1.add(panel, BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();

    }

    public void generarGrafico2() {
        DefaultTableModel model = (DefaultTableModel) jT_ContenidoGraficaPDF.getModel();
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

        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(600, 350));

//    jPanel1.setLayout(new BorderLayout());
        jPanel2.setLayout(new FlowLayout(FlowLayout.LEFT));

        jPanel2.removeAll();
        jPanel2.add(panel, BorderLayout.CENTER);
        jPanel2.revalidate();
        jPanel2.repaint();

    }

    public void generarGrafico3() {
        DefaultTableModel model = (DefaultTableModel) jT_ContenidoGraficaPDF.getModel();
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

        JFreeChart chart = ChartFactory.createAreaChart(
                "Exportaciones Mensuales", // Título
                "Meses", // Eje X
                "Exportación Mill.USD", // Eje Y
                dataset, // Dataset
                PlotOrientation.VERTICAL, // Orientación del gráfico
                true,
                true,
                false // No URLs
        );

        chart.setBackgroundPaint(Color.white);

        ChartPanel panel = new ChartPanel(chart);
        panel.setPreferredSize(new Dimension(600, 300));

        jPanel3.setLayout(new FlowLayout(FlowLayout.LEFT));

        jPanel3.removeAll();
        jPanel3.add(panel, BorderLayout.CENTER);
        jPanel3.revalidate();
        jPanel3.repaint();

    }

    public static BufferedImage capturarFrame(JFrame frame) {
        Dimension size = frame.getSize();
        BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();
        frame.paint(g2d);
        g2d.dispose();
        return image;
    }

    public static void guardarPDFConImagen(JFrame frame, String rutaPDF) throws IOException {

        BufferedImage image = capturarFrame(frame);

// Guardar la imagen como archivo temporal
        File tempFile = new File("captura_frame.png");
        ImageIO.write(image, "PNG", tempFile); // Guardar la imagen en un archivo PNG

// Crear el documento PDF
        PdfDocument pdfDoc = new PdfDocument(new com.itextpdf.kernel.pdf.PdfWriter(rutaPDF));
        Document document = new Document(pdfDoc);

// Cargar la imagen en el documento (iText 7)
        com.itextpdf.io.image.ImageData imageData = ImageDataFactory.create(tempFile.getAbsolutePath());
        Image img = new Image(imageData);

// Obtener el tamaño de la página del PDF
        float pageWidth = pdfDoc.getDefaultPageSize().getWidth();
        float pageHeight = pdfDoc.getDefaultPageSize().getHeight();

// Ajustar la imagen para que ocupe casi toda la página
        img.scaleToFit(pageWidth - 5, pageHeight);

        img.setFixedPosition(0, 200);

        document.add(img);

        document.close();

        tempFile.delete();
    }

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
            java.util.logging.Logger.getLogger(JF_PdfS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_PdfS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_PdfS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_PdfS.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatLightLaf());

                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(JF_PdfS.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
                new JF_PdfS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDP_Panel;
    private javax.swing.JPanel jP_PanerGraficacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jSP_ContenidoGrafica;
    private javax.swing.JTable jT_ContenidoGraficaPDF;
    // End of variables declaration//GEN-END:variables
}
