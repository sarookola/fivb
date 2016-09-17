/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author shayan
 */
public class CounterCom  {
   BufferedImage imageBack,countercolon,countnum[]=new BufferedImage[4];
    Font font = null ;
    DrawTextOn drawTextOn = null;
    BufferedImage countseq[] = new BufferedImage[100];
    Rectangle countrec;
    double timeEnd = 2000 , timeStart=0 , timenow=1000;
    JPanel panel ;

    public void setFont(Font font) {
        this.font = font;
        drawTextOn.setFont2(font);
    }



    public CounterCom(JPanel panel) {
        this.panel=panel;
         font = new Font("BMitra", Font.PLAIN, 40);
         drawTextOn=new DrawTextOn(panel);
         drawTextOn.setFont2(font);
         drawTextOn.setStrok(4);
        try {
            imageBack = (BufferedImage) ImageIO.read(new File("pictures\\backcounter.jpg"));
            countercolon = (BufferedImage) ImageIO.read(new File("pictures\\countercolon.png"));
            for (int i = 0; i < 100; i++) {
              
              countseq[i] =   (BufferedImage) ImageIO.read(new File(String.format("..\\pictures\\Counterseq\\counter-"+"%04d"+".png" , i)));
            }
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i <4; i++) {
   countnum[i]=countseq[0];
           }
    }
    
    
    
    

     public void drawCounter(Graphics2D g2d,double x,double y , double w  ,double  h ) {
              Rectangle r = panel.getBounds();
        
        drawTextOn.setG2D(g2d);
        
              
        
        int cy=(int) (y*r.getHeight()),cheight=(int) (r.height*h),
                cx=(int) (r.width*x) , cwidth=(int) (r.width*w/4);
        
//        drawTextOn.drawBack(r, .08, .18,.84 , .44, Color.blue, 150);

               g2d.setColor(new Color(0, 0, 200, 150));
               g2d.fillRect((int)(cx), (int)(cy-cheight*.05), (int)(r.width*w), (int)(cheight*1.1));
               
               if(timeEnd!=timeStart)
               {
//                   System.out.println("="+(Math.abs(timeEnd-timenow)/Math.abs(timeEnd-timeStart)*20));
                   g2d.setColor(new Color(200, (int)(Math.abs(timeEnd-timenow)/Math.abs(timeEnd-timeStart)*20), 0, 250));
//                   System.out.println("="+(Math.abs(timeEnd-timenow)/Math.abs(timeEnd-timeStart)));
                g2d.fillRect((int)(cx), (int)(cy-cheight*.05+(int)((Math.abs(timeEnd-timenow)/Math.abs(timeEnd-timeStart))*cheight*1.1)), (int)(r.width*w),(int)(Math.abs((Math.abs(timenow-timeStart)/Math.abs(timeEnd-timeStart)))*cheight*1.1));
                String st = String.valueOf(Math.abs(timenow-timeEnd)/10);
                drawTextOn.drawText(r, x, y-h/5 ,w,h/4, st,0, Color.white, Color.black);
               }
               

         
         

             g2d.drawImage(countnum[3],cx,cy,cwidth,cheight, panel);
              g2d.drawImage(countnum[2],cx+(int)(1.1*r.width*w/4),cy,cwidth,cheight, panel);
               g2d.drawImage(countnum[1],cx+(int)(1.9*r.width*w/4),cy,cwidth,cheight, panel);
               g2d.drawImage(countnum[0],cx+(int)(3*r.width*w/4),cy,cwidth,cheight, panel);
               
                        g2d.drawImage(countercolon,(int) (cx+cwidth*.55),cy,cwidth,cheight, panel);
         g2d.drawImage(countercolon,(int) (cx+cwidth*2.45),cy,cwidth,cheight, panel);
               
               
    }

    
    

    public void setTime(int[] count){
        int x = count[0]+count[1]*10+count[2]*100+count[3]*600;
        if(x<=Math.abs(timeEnd-timeStart)&count[0]<10 &count[1]<10&count[2]<10&count[3]<10&count[0]>=0&count[1]>=0&count[2]>=0&count[3]>=0){
        countnum[0]=countseq[(count[0]*10)];
        countnum[1]=countseq[(count[1]*10)+count[0]];
        countnum[2]=countseq[(count[2]*10)+count[1]];
         countnum[3]=countseq[(count[3]*10)+count[2]];
         timenow=x;
        }
        else {
            System.out.println("wrong value");
        }
    }

    public void setTimeEnd(int[] timeEnd) {
       this.timeEnd = timeEnd[0]+ timeEnd[2]*100+ timeEnd[1]*10+ timeEnd[3]*600;
    }
     public void settimeStart(int[] timeStart) {
       this.timeStart = timeStart[0]+ timeStart[2]*100+ timeStart[1]*10+ timeStart[3]*600;
    }

}
