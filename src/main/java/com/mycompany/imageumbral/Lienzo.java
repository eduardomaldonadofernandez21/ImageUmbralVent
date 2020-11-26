package com.mycompany.imageumbral;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class Lienzo extends JPanel {
    private BufferedImage imagen = null;
    private Mat base = null;
    private Mat img = null;
    private int width; 
    private int height;
    
    public Lienzo(){
        base = img;
        this.setPreferredSize(new Dimension(850,500));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagen == null){
            return;
        }
        if(width < 850){
            g.drawImage(imagen.getScaledInstance(width,height, Image.SCALE_DEFAULT),(850-width)/2,0,null);
        }else{
            g.drawImage(imagen.getScaledInstance(width,height, Image.SCALE_DEFAULT),0,(500-height)/2,null);
        }
    }    
    
    public void umbralizar(Integer umbral) {
// crear dos imágenes en niveles de gris con el mismo
// tamaño que la original
        Mat imagenGris = new Mat(base.rows(),
                                 base.cols(),
                                 CvType.CV_8U);
        Mat imagenUmbralizada = new Mat(base.rows(),
                                        base.cols(),
                                        CvType.CV_8U);
// convierte a niveles de grises la imagen original
        Imgproc.cvtColor(base,
                         imagenGris,
                         Imgproc.COLOR_BGR2GRAY);
// umbraliza la imagen:
// - píxeles con nivel de gris > umbral se ponen a 1
// - píxeles con nivel de gris <= umbra se ponen a 0
        Imgproc.threshold(imagenGris,
                          imagenUmbralizada,
                          umbral,
                          255,
                          Imgproc.THRESH_BINARY);
        img = imagenUmbralizada;
        displayImage();
    }
    
    public void updateImage(File fichero){
        base = Imgcodecs.imread(fichero.getAbsolutePath());
        img = base;
        displayImage();
    }
    
    public void saveImage(File fichero){
        Imgcodecs.imwrite(fichero.getAbsolutePath()+".jpg", img);
    }
    
    private void displayImage (){
        imagen = (BufferedImage)HighGui.toBufferedImage(img);
        resize();
        repaint();
    }
    
    private void resize(){
        if(1024 < imagen.getWidth() || 768 < imagen.getHeight()){
            imagen = null;
            base = null;
            JOptionPane.showMessageDialog(null, "El tamaño máximo para la imagen es 1024x768");
        }
        if(((double)imagen.getWidth()/imagen.getHeight()) < 850/500){
            width = 850;
            height = (int)(850/((double)imagen.getWidth()/imagen.getHeight()));
        }else{
            width = (int)(500*((double)imagen.getWidth()/imagen.getHeight()));
            height = 500;
        }
    }
    
    public boolean isImage(){
        return (imagen != null);
    }
    
    public void restoreImage(){
        img = base;
        displayImage();
    }
}





