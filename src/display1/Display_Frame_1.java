/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display1;

import base.DisplayInterface;
import DataBox.SettingPack;
import DataBox.FivbControolPack;
import DataBox.Pack;
import DataBox.TimePack;
import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author shayan
 */
public class Display_Frame_1 extends javax.swing.JFrame implements DisplayInterface {

    private Display_1 display;

    boolean fullscreen = false;
    boolean backOpac = false;
    boolean preview = false;
    String frameName;

    /**
     * Creates new form MainFrame
     *
     * @param client
     */
    
    public Display_Frame_1(boolean prev) {
        preview=prev;       
//    public Display_Frame_1() {

        initComponents();
        init();
        setBounds(0, 0, 400, 300);
        if (fullscreen) {
            setSize(Toolkit.getDefaultToolkit().getScreenSize());
        }
//        setBackground(new Color(0, 0, 0, 0));
        if (backOpac) {
            setBackground(new Color(0, 50, 250, 255));
//            display.setOpaque(backOpac);
        }
//        else {setBackground(new Color(0, 0, 0, 0));}
        /*
         Toolkit toolkit = Toolkit.getDefaultToolkit();

         // get the smallest valid cursor size
         Dimension dim = toolkit.getBestCursorSize(1, 1);

         // create a new image of that size with an alpha channel
         BufferedImage cursorImg = new BufferedImage(dim.width, dim.height, BufferedImage.TYPE_INT_ARGB);

         // get a Graphics2D object to draw to the image
         Graphics2D g2d = cursorImg.createGraphics();

         // set the background 'color' with 0 alpha and clear the image
         g2d.setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
         g2d.clearRect(0, 0, dim.width, dim.height);

         // dispose the Graphics2D object
         g2d.dispose();

         // now create your cursor using that transparent image
         hiddenCursor = toolkit.createCustomCursor(cursorImg, new Point(0,0), "hiddenCursor");
         */

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setUndecorated(!preview);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Display_Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display_Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display_Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display_Frame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display_Frame_1(true).setVisible(true);
            }
        });
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == 'r' | evt.getKeyChar() == 'R')
    ;//   socketConnect();

    }//GEN-LAST:event_formKeyPressed

    private void init() {

        display = new Display_1();        
        this.add(display);
    }

//
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void updateSetting(SettingPack settings) {
        if (!preview) {
            this.setBounds((int) (settings.getDrawSettings()[0].getDrawingDimsByIndex(0)[0].getxRelative()),
                    (int) (settings.getDrawSettings()[0].getDrawingDimsByIndex(0)[0].getyRelative()),
                    (int) (settings.getDrawSettings()[0].getDrawingDimsByIndex(0)[0].getWidthRelative()),
                    (int) (settings.getDrawSettings()[0].getDrawingDimsByIndex(0)[0].getHeightRelative())
            );
        }

        display.updateSetting(settings);


    }


    public void updatecontroolPack(FivbControolPack controolPack) {
        display.upDate(controolPack);
    }

    public int getobjecsArrayLenght() {
//        return 200;
        return display.getObjecsArrayLenght();
    }


    public void Updatetime(String time) {
        display.Updatetime(time);
    }

    @Override
    public void setPanelName(String name) {
       this.frameName=name;
       display.setFrameName(name);
    }

    @Override
    public String getFrameName() {
       return frameName;
    }

    public void setPreview(boolean preview) {
        this.preview = preview;
    }

    public Display_1 getDisplay() {
        return display;
    }

 


    @Override
    public void Updatetime(TimePack timepack) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePack(Pack pack) {
//        System.out.println(x++ + "  Read  ");
//        long x;
        if (pack.getObject() instanceof SettingPack) {
//            System.out.print(" setting");
//              x = new Date().getTime();
            updateSetting((SettingPack) pack.getObject());
//             System.out.println(" setting updated time = " );//+ (new Date().getTime() - x));
//            System.out.print(" updated   ");
        } else if (pack.getObject() instanceof FivbControolPack) {
//            System.out.print(" control");
//             x = new Date().getTime();
            this.setVisible(((FivbControolPack) pack.getObject()).getFrameVis());
            updatecontroolPack((FivbControolPack) pack.getObject());
//            System.out.println(" control updated time = " + (new Date().getTime() - x));
//            System.out.print(" updated   ");
        } else if (pack.getObject() instanceof TimePack) {
//            System.out.print(" time");
//             x = new Date().getTime();
            Updatetime((TimePack) pack.getObject());
//            System.out.println(" time updated time = " + (new Date().getTime() - x));
//            System.out.print(" updated   ");
        }
//        System.out.println("ended");
    }


}