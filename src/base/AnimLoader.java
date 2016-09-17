/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.zo.studio.eightquestion.LoadEightQuestion;

/**
 *
 * @author shayan
 */
public class AnimLoader extends Thread{
    ImageLoder imageLoder;
    int sleepTime ,  currentFrame;
    //LoadEightQuestion picanswersPanel;
    BufferedImage image ;
    boolean repeat;
/**
     * 
     * @param imageLoder
     * @param sleepTime
     * @param currentFrame 

    public AnimLoader(BufferedImage image ,LoadEightQuestion picAnswersPanel,ImageLoder imageLoder, boolean repeat, int currentFrame) {
        this.image = image;
        this.imageLoder = imageLoder;
        this.repeat = repeat;
        this.currentFrame = currentFrame;
        this.picanswersPanel=picAnswersPanel;
    }
         */
    @Override
    public void run() {
        while (true) {

            if (currentFrame > imageLoder.imageSeqLength) {
                if (repeat) {
                    currentFrame = 0;
                } else {
                    this.stop();
                }
            }
            image = imageLoder.getImage(currentFrame++);
//                picanswersPanel.repaint();

           
        }

    }
}
