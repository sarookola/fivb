/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;


import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author shayan
 */
public class SettingPackOld implements Serializable {

    DrawSettingSOld[] drawSettingS;
    String font;
    int strok;
    int[] screenDim;
    Color backcolor;
    String path;
    int selectedItem;

    public SettingPackOld() {
    }

    public SettingPackOld(int x) {
        drawSettingS = new DrawSettingSOld[x];
        for (int i = 0; i < x; i++) {
            drawSettingS[i] = new DrawSettingSOld();
            drawSettingS[i].setImagevisiblity(false);
             drawSettingS[i].setTextvisiblity(false);
        }
        drawSettingS[60].setText1(">");
        drawSettingS[61].setText1(">");
    }

    public DrawSettingSOld[] getDrawSettingsOld() {
        return drawSettingS;
    }

    public void setDrawinGObjectses(int x) {
        this.drawSettingS = new DrawSettingSOld[x];
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public int[] getScreenDim() {
        return screenDim;
    }

    public void setScreenDim(int[] screenDim) {
        this.screenDim = screenDim;
    }

    public int getStrok() {
        return strok;
    }

    public void setStrok(int strok) {
        this.strok = strok;
    }

    public Color getBackcolor() {
        return backcolor;
    }

    public void setBackcolor(Color backcolor) {
        this.backcolor = backcolor;
    }

    public String getPath() {
        if (path == null) {
            path = "";
        }
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(int selectedItem) {
        this.selectedItem = selectedItem;
    }

}
