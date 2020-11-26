/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.imageumbral;

import java.awt.Point;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;

/**
 *
 * @author eduma
 */
public class Interfaz extends javax.swing.JFrame {

    private JFileChooser fc = new JFileChooser();
    private JOptionPane dialog = new JOptionPane();
    private FileNameExtensionFilter filter = null;
    
    public Interfaz() {
        initComponents();
        nu.pattern.OpenCV.loadShared();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        this.setLocationRelativeTo(null);
        cerrarApp();
    }
    
    public void initFiltros(){
        filter = new FileNameExtensionFilter("Images (*.jpg,*.png)","jpg", "png");
        fc.addChoosableFileFilter(filter);
        fc.setAcceptAllFileFilterUsed(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPrincipal = new javax.swing.JDesktopPane();
        labelTitulo = new javax.swing.JLabel();
        labelCopyFer = new javax.swing.JLabel();
        labelCopyEdu = new javax.swing.JLabel();
        buttonAbrirImagen = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        abrirMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        helpMenu = new javax.swing.JMenu();
        inforMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1150, 800));
        setPreferredSize(new java.awt.Dimension(1150, 800));

        desktopPrincipal.setPreferredSize(new java.awt.Dimension(1150, 800));
        desktopPrincipal.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                desktopPrincipalComponentResized(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("Imagen Umbralizada");
        labelTitulo.setPreferredSize(new java.awt.Dimension(850, 500));

        labelCopyFer.setText("© Fernando Marcelo Alonso");

        labelCopyEdu.setText("    Eduardo Maldonado Fernández");

        buttonAbrirImagen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonAbrirImagen.setText("Open Image");
        buttonAbrirImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAbrirImagenActionPerformed(evt);
            }
        });

        desktopPrincipal.setLayer(labelTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPrincipal.setLayer(labelCopyFer, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPrincipal.setLayer(labelCopyEdu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPrincipal.setLayer(buttonAbrirImagen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCopyEdu, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCopyFer, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonAbrirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPrincipalLayout.createSequentialGroup()
                .addGroup(desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonAbrirImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(529, 529, 529)
                .addComponent(labelCopyFer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCopyEdu)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        abrirMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        abrirMenuItem.setText("Open");
        abrirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(abrirMenuItem);
        fileMenu.add(jSeparator1);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");

        inforMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        inforMenuItem.setText("About");
        inforMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inforMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(inforMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inforMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inforMenuItemActionPerformed
        dialog.showMessageDialog(null,"Mediante esta aplicación:\n1. Usted puede seleccionar una imagen '.jpg' o '.png' en el menu File en la opción Open o con el botón 'Open Image'.\n2. Una vez escogida la imagen, se muestra por una ventana interna.\n3. Para umbralizar la imagen, seleccione el menu Filter de la ventana interna de la imagen original y su opción Threshold.\n4. Para guardar la imagen umbralizada, seleccionamos el menu File la opción Save en la ventana interna umbralizada. ","Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_inforMenuItemActionPerformed

    private void abrirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMenuItemActionPerformed
        initFiltros();
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            cerrarVentanas();
            IntFrameImagen ventanaImagen = new IntFrameImagen(fc.getSelectedFile().getName(),fc.getSelectedFile(),desktopPrincipal);
            ventanaImagen.setVisible(true);
            ventanaImagen.setTitle(fc.getSelectedFile().getName());
            ventanaImagen.setLocation(new Point(50, 80));
            desktopPrincipal.add(ventanaImagen);
        }
    }//GEN-LAST:event_abrirMenuItemActionPerformed

    private void desktopPrincipalComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_desktopPrincipalComponentResized
        JInternalFrame [] ventanas = desktopPrincipal.getAllFrames();
        double anchoPr = desktopPrincipal.getWidth();
        double alturaPr = desktopPrincipal.getHeight();
        for(JInternalFrame vent : ventanas){
            Point PointVen = vent.getLocation();
            double anchoV = vent.getWidth();
            double alturaV = vent.getHeight();
            Point newPosition = new Point((int)PointVen.getX(), (int)PointVen.getY());
            if(PointVen.getY() < 0){
                newPosition.setLocation(newPosition.getX(),0);
            }else{
                if(PointVen.getY()+alturaV > alturaPr){
                    newPosition.setLocation(PointVen.getX(),(alturaPr - alturaV));
                }
            }
            if(PointVen.getX() < 0){
                newPosition.setLocation(0, newPosition.getY());
            }else{
                if(PointVen.getX()+anchoV > anchoPr){
                    newPosition.setLocation((anchoPr - anchoV), PointVen.getY());
                }   
            }
            vent.setLocation(newPosition);
        }
    }//GEN-LAST:event_desktopPrincipalComponentResized

    private void buttonAbrirImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAbrirImagenActionPerformed
        initFiltros();
        if(fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            cerrarVentanas();
            IntFrameImagen ventanaImagen = new IntFrameImagen(fc.getSelectedFile().getName(),fc.getSelectedFile(),desktopPrincipal);
            ventanaImagen.setVisible(true);
            ventanaImagen.setTitle(fc.getSelectedFile().getName());
            ventanaImagen.setLocation(new Point(50, 80));
            desktopPrincipal.add(ventanaImagen);
        }
    }//GEN-LAST:event_buttonAbrirImagenActionPerformed
    
    private void cerrarApp(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                confirmarCerrar();
            }
        });
    }
    
    private void confirmarCerrar(){
        int conf = dialog.showConfirmDialog(null, "¿Deseas salir y cerrar la aplicación?", "Cierre del programa", JOptionPane.OK_CANCEL_OPTION);
        if(conf ==JFileChooser.APPROVE_OPTION){
            dispose();
        }
    }
   
    private void cerrarVentanas(){
        JInternalFrame [] ventanas = desktopPrincipal.getAllFrames();
        for(JInternalFrame ventana : ventanas){
            ventana.dispose();
        }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirMenuItem;
    private javax.swing.JButton buttonAbrirImagen;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem inforMenuItem;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labelCopyEdu;
    private javax.swing.JLabel labelCopyFer;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
