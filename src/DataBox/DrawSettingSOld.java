/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import base.DrawSettingDims;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author shayan
 */
public class DrawSettingSOld implements Serializable {
//    Rectangle2D rectangle;

    String text1;
    String image;
    boolean imagevisiblity;
    boolean textvisiblity;
    boolean textFvisiblity;
    boolean imageSequency;
    int sequencCount;
    DrawSettingDims drawinGObject[];
    Color back;
    int linkTo;
    List<Integer> childs;

    public DrawSettingSOld() {
        this.text1 = "Empty2";
        image = "pictures\\back01.jpg";
        drawinGObject = new DrawSettingDims[1];
        drawinGObject[0] = new DrawSettingDims();
        imagevisiblity = true;
        textvisiblity = true;
        imageSequency = false;
        textFvisiblity=false;
        childs = new LinkedList<Integer>();
    }

    public void addChild(int index) {
        if(index>0 )
        childs.add(index);
    }

    public boolean removeChild(int childIndex) {
        boolean x = false;
        for (int next = 0; next < childs.size(); next++) {
            if (next == childIndex) {
                childs.remove(next);
                return true;
            }
        }
        return x;
    }

    public int[] getchilds() {
        int x[] = new int[childs.size()];
        return x;
    }

    public List<Integer> getChilds() {
        return childs;
    }

    public DrawSettingSOld(String text1) {
        this.text1 = text1;
        image = "pictures\\back01.jpg";
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public boolean isImageSequency() {
        return imageSequency;
    }

    public void setImageSequency(boolean imageSequency) {
        this.imageSequency = imageSequency;
    }

    public int getSequencCount() {
        return sequencCount;
    }

    public void setSequencCount(int sequencCount) {
        this.sequencCount = sequencCount;
    }

    public DrawSettingDims[] getDrawinGObject() {
        return drawinGObject;
    }

    public void setDrawinGObject(int x) {
        this.drawinGObject = new DrawSettingDims[x];
        for (int i = 0; i < x; i++) {
            drawinGObject[i] = new DrawSettingDims();
        }
    }

    public void setBack(Color back) {
        this.back = back;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImagevisiblity(boolean imagevisiblity) {
        this.imagevisiblity = imagevisiblity;
    }

    public void setTextvisiblity(boolean textvisiblity) {
        this.textvisiblity = textvisiblity;
    }

    public String getText1() {
        return text1;
    }

    public Color getBack() {
        return back;
    }

    public String getImage() {
        return image;
    }

    public boolean isImagevisiblity() {
        return imagevisiblity;
    }

    public boolean isTextvisiblity() {
        return textvisiblity;
    }

    public Image getImagePic() {
        Image im = null;
        try {
            im = ImageIO.read(new File(image));
        } catch (IOException ex) {
            Logger.getLogger(DrawSettingSOld.class.getName()).log(Level.SEVERE, null, ex);
        }
        return im;
    }

    public int getParent() {
        return linkTo;
    }

    public void setParent(int parent) {
        this.linkTo = parent;
    }

    public boolean isTextFvisiblity() {
        return textFvisiblity;
    }

    public void setTextFvisiblity(boolean textFvisiblity) {
        this.textFvisiblity = textFvisiblity;
    }

    public int getLinkTo() {
        return linkTo;
    }

    public void setLinkTo(int linkTo) {
        this.linkTo = linkTo;
    }

}
