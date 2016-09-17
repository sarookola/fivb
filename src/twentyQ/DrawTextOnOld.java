/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyQ;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author shayan
 */
public class DrawTextOnOld {

    JPanel panel;
    Graphics2D g2D;

    Font font2;
    int strok;

    public void setFont2(Font font2) {
        this.font2 = font2;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }



    public void setStrok(int strok) {
        this.strok = strok;
    }

    public void setG2D(Graphics2D g2D) {
        this.g2D = g2D;
    }



    public DrawTextOnOld(JPanel panel ) {
        this.panel = panel;
        
    }
/**
     * 
     * @param rectangle
     * @param xRelative
     * @param yRelative
     * @param widthRelative
     * @param heightRelative
     * @param strok
     * @param text1
     * @param font2
     * @param strokC
     * @param textC 
     */
    public void drawText(Rectangle2D rectangle, double xRelative,double yRelative , double widthRelative , double heightRelative, String text1, Color textC, Color strokC ) //outlined
    {
        if(text1.trim().equals("")) text1 = " ";

            FontRenderContext frc = new FontRenderContext(null, true, true);

            TextLayout textLayout = new TextLayout(text1, font2, frc);
            Rectangle2D tlBounce = textLayout.getBounds();
           
            
            double scaleHeight = rectangle.getHeight()*heightRelative / (textLayout.getAscent() + textLayout.getDescent());
            double scaleWidth = rectangle.getWidth()*widthRelative / tlBounce.getWidth();
 if(scaleHeight>scaleWidth) scaleHeight=scaleWidth;
            if(scaleHeight<scaleWidth) scaleWidth=scaleHeight;
            
            float ascent_descent = textLayout.getAscent();
            
            double yOffset = scaleHeight * (ascent_descent) ;
             double x = (xRelative*1.01) * rectangle.getWidth() ;
             double xoffset = (rectangle.getWidth()*widthRelative - scaleWidth*tlBounce.getWidth())/2;
            double y = yRelative * rectangle.getHeight()+yOffset;
            
            AffineTransform textAt = new AffineTransform(scaleWidth*.9 , 0, 0, scaleHeight, x+xoffset, yRelative*rectangle.getHeight() + yOffset);


            Shape outline = textLayout.getOutline(textAt);


            g2D.setColor(strokC);
            BasicStroke wideStroke = new BasicStroke(strok);
            g2D.setStroke(wideStroke);
            g2D.draw(outline);

            g2D.setColor(textC);
            g2D.fill(outline);

    }
    public void drawText2(Rectangle2D rectangle, double xRelative,double yRelative , double widthRelative , double heightRelative, String text1, Color textC, Color strokC ) //outlined
    {
        

            FontRenderContext frc = new FontRenderContext(null, true, true);

            TextLayout textLayout = new TextLayout(text1, font2, frc);
            Rectangle2D tlBounce = textLayout.getBounds();
           
            
            double scaleHeight = rectangle.getHeight()*heightRelative / (textLayout.getAscent() + textLayout.getDescent());
            double scaleWidth = rectangle.getWidth()*widthRelative / tlBounce.getWidth();

            float ascent_descent = textLayout.getAscent();
            
            double yOffset = scaleHeight * (ascent_descent) * .9;
             double x = (xRelative*1.01) * rectangle.getWidth() ;
            double y = yRelative * rectangle.getHeight()+.5*yOffset;
            
            AffineTransform textAt = new AffineTransform(scaleWidth*.9 , 0, 0, scaleHeight*.9, x, yRelative*rectangle.getHeight() + yOffset);


            Shape outline = textLayout.getOutline(textAt);


            g2D.setColor(strokC);
            BasicStroke wideStroke = new BasicStroke(strok);
            g2D.setStroke(wideStroke);
            g2D.draw(outline);

            g2D.setColor(textC);
             g2D.fill(outline);

    }

    public void drawTextWithBack(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative, String text1, Color strokC, Color textC, Color back,int alpha) {
//        g2D.setColor(back);
//        g2D.fillRect((int) (xRelative * rectangle.getWidth()), (int) (yRelative * rectangle.getHeight()), (int) (rectangle.getWidth() * widthRelative), (int) (heightRelative * rectangle.getHeight()));
        drawBack( rectangle,  xRelative, yRelative, widthRelative, heightRelative,back,alpha);
        drawText(rectangle, xRelative, yRelative, widthRelative, heightRelative, text1, strokC, textC);

    }

    public void drawBack(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative,Color back,int alpha) {
        g2D.setPaint( new Color(back.getRed(),back.getGreen(),back.getBlue(),alpha));
        g2D.fillRect((int) (xRelative * rectangle.getWidth()), (int) (yRelative * rectangle.getHeight()), (int) (rectangle.getWidth() * widthRelative), (int) (heightRelative * rectangle.getHeight()));
    }
        public void drawImage(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative,Image image) {
             int height = (int) (rectangle.getHeight()*heightRelative) ;
            int width = (int) (rectangle.getWidth()*widthRelative) ;      
            int x = (int) (xRelative * rectangle.getWidth()) ;
            int y = (int) (yRelative * rectangle.getHeight());
            
        g2D.drawImage(image, x, y, width, height, panel);

    }
          public void drawBorder(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative,Color color,int border) {
             int height = (int) (rectangle.getHeight()*heightRelative) ;
            int width = (int) (rectangle.getWidth()*widthRelative) ;      
            int x = (int) (xRelative * rectangle.getWidth()) ;
            int y = (int) (yRelative * rectangle.getHeight());
            g2D.setColor(color);
            g2D.draw3DRect( x, y, width, height, true);


    }

}
