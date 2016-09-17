/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.io.Serializable;

/**
 *
 * @author shayan
 */
public class FivbControolPack implements Serializable {

    Vis_Anim_Bool vis_Anim_Bool[];
    String set1, set2;
    String country1, country2;
    String point1, point2;
    int service, set;
    Color color1, color2;
    String ind1, ind2;
    String crunchAdd_top, crunchAdd_bot;
    String SetScoreTop[], SetScoreBot[];
    String duration[];
    ScoreHistory scoreHistory;
    private boolean framevis;
    Playernamedata playernamedata;

    /**
     *
     * @return
     */
    public FivbControolPack(int objectanimCount) {
        vis_Anim_Bool = new Vis_Anim_Bool[objectanimCount];
        for (int i = 0; i < objectanimCount; i++) {
            vis_Anim_Bool[i] = new Vis_Anim_Bool();
        }

        color1 = Color.red;
        framevis = true;
        crunchAdd_top = "Top";
        crunchAdd_bot = "bot";
        set = 1;
        SetScoreTop = new String[5];
        SetScoreBot = new String[5];
        duration= new String[5];
//        for (int i = 0; i < 4; i++) {
//            SetScoreTop[i] = "0";
//            SetScoreBot[i] = "0";
//        }

        ind1 = "pictures\\CRUNCH_team_indicator_png.png";
        ind2 = "pictures\\CRUNCH_team_indicator_png.png";
        playernamedata = new Playernamedata();
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public String[] getSetScoreTop() {
        return SetScoreTop;
    }

    public void setSetScoreTop(String[] SetScoreTop) {
        this.SetScoreTop = SetScoreTop;
    }

    public String[] getSetScoreBot() {
        return SetScoreBot;
    }

    public void setSetScoreBot(String[] SetScoreBot) {
        this.SetScoreBot = SetScoreBot;
    }

    public String[] getDuration() {
        return duration;
    }

    public void setDuration(String[] duration) {
        this.duration = duration;
    }

    public ScoreHistory getScoreHistory() {
        return scoreHistory;
    }

    public void setScoreHistory(ScoreHistory scoreHistory) {
        this.scoreHistory = scoreHistory;
    }

    public String getSet1() {
        return set1;
    }

    public void setSet1(String set1) {
        this.set1 = set1;
    }

    public String getSet2() {
        return set2;
    }

    public void setSet2(String set2) {
        this.set2 = set2;
    }

    public String getCountry1() {
        return country1;
    }

    public void setCountry1(String country1) {
        this.country1 = country1;
    }

    public String getCountry2() {
        return country2;
    }

    public void setCountry2(String country2) {
        this.country2 = country2;
    }

    public String getPoint1() {
        return point1;
    }

    public void setPoint1(String point1) {
        this.point1 = point1;
    }

    public String getPoint2() {
        return point2;
    }

    public void setPoint2(String point2) {
        this.point2 = point2;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public Color getColro1() {
        return color1;
    }

    public void setColor1(Color colro1) {
        this.color1 = colro1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public String getInd1() {
        return ind1;
    }

    public void setInd1(String ind1) {
        this.ind1 = ind1;
    }

    public String getInd2() {
        return ind2;
    }

    public void setInd2(String ind2) {
        this.ind2 = ind2;
    }

    public String getCrunchAdd_top() {
        return crunchAdd_top;
    }

    public void setCrunchAdd_top(String crunchAdd_top) {
        this.crunchAdd_top = crunchAdd_top;
    }

    public String getCrunchAdd_bot() {
        return crunchAdd_bot;
    }

    public void setCrunchAdd_bot(String crunchAdd_bot) {
        this.crunchAdd_bot = crunchAdd_bot;
    }

    public String getSetScoreTop(int x) {
        return SetScoreTop[x];
    }

    public void setSetScoreTop(int x, String SetScoreTop) {
        this.SetScoreTop[x] = SetScoreTop;
    }

    public String getSetScoreBot(int x) {
        return SetScoreBot[x];
    }

    public void setSetScoreBot(int x, String SetScoreBot) {
        this.SetScoreBot[x] = SetScoreBot;
    }
     public void setSetDuration(int x, String SetDuration) {
        this.duration[x] = SetDuration;
    }
      public String getSetDuration(int x) {
        return duration[x];
    }

    public void setVis_Anim_Bool(Vis_Anim_Bool[] vis_Anim_Bool) {
        this.vis_Anim_Bool = vis_Anim_Bool;
    }

    public Vis_Anim_Bool[] getVis_Anim_Bool() {
        return vis_Anim_Bool;
    }

    public void setItemsImagVisible(int item, boolean vis) {
        vis_Anim_Bool[item].setItemsImagVisible(vis);
    }

    public void setItemsTextVisible(int item, boolean vis) {
        vis_Anim_Bool[item].setItemsTextVisible(vis);
    }

    public void setimagePlay(int item, boolean vis) {
        vis_Anim_Bool[item].setImagePlay(vis);
    }

    public void setObjectanim(int item, int animation, boolean vis) {
        vis_Anim_Bool[item].setObjectanim(vis);
        vis_Anim_Bool[item].setMotionDimIndex(animation);
    }

    public Vis_Anim_Bool getVis_Anim_Bool(int indexOfArray) {
        return vis_Anim_Bool[indexOfArray];
    }

    public void setVis_Anim_Bool(int indexOfArray, Vis_Anim_Bool vis_Anim_Bool) {
        this.vis_Anim_Bool[indexOfArray] = vis_Anim_Bool;
    }

    public void setObjectanim(int p, boolean b) {
        vis_Anim_Bool[p].setMotionDimIndex(0);
        vis_Anim_Bool[p].setObjectanim(b);
    }

    public void setFramevis(boolean framevis) {
        this.framevis = framevis;
    }

    public boolean getFrameVis() {

        return framevis;
    }

    public Playernamedata getPlayernamedata() {
        return playernamedata;
    }

    public void setPlayernamedata(Playernamedata playernamedata) {
        this.playernamedata = playernamedata;
    }

}
