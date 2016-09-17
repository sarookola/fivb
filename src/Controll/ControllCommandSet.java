/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import Comunicate.Server;
import DataBox.FivbControolPack;
import DataBox.Pack;
import DataBox.ScoreHistory;
import base.DisplayInterface;

/**
 *
 * @author shayan
 */
public class ControllCommandSet {

    FivbControolPack controolPack;
    private final Server server;

    ;

   public ControllCommandSet(Server server) {
        this.server = server;
    }

    public FivbControolPack getControolPack() {
        return controolPack;
    }

    public void setControolPack(FivbControolPack controolPack) {
        this.controolPack = controolPack;
    }

    void smallscorein(boolean flagsOn) {

        int imagevis[] = {55, 56, 41};
        int textvis[] = {42, 43, 44, 45, 46, 47, 48, 51};
        int imagePlay[] = {36, 37, 38, 39, 55, 56};
        int objectanim[] = {30, 31, 32, 33, 34, 35, 36, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        if (!flagsOn) {
            controolPack.setItemsImagVisible(55, false);
            controolPack.setItemsImagVisible(56, false);
        }

        updatecontroolPack(controolPack);

        setobjectanimoff(objectanim, imagePlay);
    }

    void smallscoreOut() {
        //To change body of generated methods, choose Tools | Templates.
        int imagevis[] = {55, 56, 41, 30, 31, 32, 33, 34, 35, 49, 50, 51};
        int textvis[] = {40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
        int imagePlay[] = {36, 37, 38, 39};
        int objectanim[] = {};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, false);

        updatecontroolPack(controolPack);

        setobjectanimoff(objectanim, imagePlay);

    }

    private void setstatevisibleAndanim(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, boolean bol) {
        for (int p : imagevis) {
            controolPack.setItemsImagVisible(p, bol);
        }
        for (int p : textvis) {
            controolPack.setItemsTextVisible(p, bol);
        }
        for (int p : imagePlay) {
            controolPack.setimagePlay(p, bol);
        }
        for (int p : objectanim) {
            controolPack.setObjectanim(p, bol);
        }
    }

    private void setVisMothion(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, int[] motionDims, boolean bol) {
        for (int p : imagevis) {
            controolPack.setItemsImagVisible(p, bol);
        }
        for (int p : textvis) {
            controolPack.setItemsTextVisible(p, bol);
        }
        for (int p : imagePlay) {
            controolPack.setimagePlay(p, bol);
        }

        for (int i = 0; i < objectanim.length; i++) {

            controolPack.setObjectanim(objectanim[i], motionDims[i], bol);
        }
    }

    private void setVisNo(int[] imagevis, int[] textvis, int[] imagePlay, int[] objectanim, boolean bol) {
        for (int p : imagevis) {
            controolPack.setItemsImagVisible(p, bol);
        }
        for (int p : textvis) {
            controolPack.setItemsTextVisible(p, bol);
        }
        for (int p : imagePlay) {
            controolPack.setimagePlay(p, bol);
        }
        for (int p : objectanim) {
            controolPack.setObjectanim(p, 0, bol);               //zxdgxzdffdsfzdszg
        }
    }

    private void setobjectanimoff(int[] objectanim, int[] Imageanim) {
        for (int p : objectanim) {
            controolPack.setObjectanim(p, false);
        }
        for (int p : Imageanim) {
            controolPack.setimagePlay(p, false);
        }
    }

    private void updatecontroolPack(FivbControolPack controolPack) {
        outUpdate(controolPack);
    }

    void crunchscore_show() {
        servAllHide();
        controolPack.setimagePlay(53, false);
        controolPack.setItemsImagVisible(53, false);
        int imagevis[] = {52, 54, 63, 64};
        int textvis[] = {60, 61, 65, 66, 67, 68};
        int imagePlay[] = {52};
        int objectanim[] = {54, 55, 60, 61, 63, 64, 65, 66, 67, 68};
        if (controolPack.getService() == 2) {
            imagevis[1] = 55;
        }
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);

        updatecontroolPack(controolPack);
        for (int i = 0; i < 4; i++) {
            controolPack.setimagePlay(52 + i, false);
        }
        setobjectanimoff(objectanim, imagePlay);
    }

    void crunchscore_Hide() {
        int imagevis[] = {50, 51, 52, 54, 55, 63, 64, 30, 31, 32, 33, 48, 49, 80, 81, 82, 83, 84, 85, 86, 87, 88,
            90, 91, 92, 93, 94, 95, 96, 97, 98, 122, 123, 124, 125, 126, 127};

        int textvis[] = {60, 61, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 34, 35, 36, 37,
            100, 101, 102, 103, 104, 105, 106, 107, 108, 110, 111, 112, 113, 114, 115, 116, 117, 118, 120, 121};
        int imagePlay[] = {};
        int objectanim[] = {54, 55, 60, 61, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 122, 123, 124, 125, 126, 127};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, false);
        controolPack.setItemsImagVisible(53, true);
        controolPack.setimagePlay(53, true);
        updatecontroolPack(controolPack);
        controolPack.setimagePlay(53, false);

    }

    void changeService(int x) {
//        if (controolPack.getVis_Anim_Bool(126).isItemsImagVisible() || controolPack.getVis_Anim_Bool(126).isItemsImagVisible()||controolPack.getVis_Anim_Bool(54).isItemsImagVisible() || controolPack.getVis_Anim_Bool(55).isItemsImagVisible()) {
        servAllHide();

        if (x == 1) {
            controolPack.setItemsImagVisible(54, true);
            controolPack.setObjectanim(54, true);
        } else {
            controolPack.setItemsImagVisible(55, true);
            controolPack.setObjectanim(55, true);
        }
//        }
    }

    private void outUpdate(FivbControolPack controolPack) {
        server.writeSocket(new Pack(1, controolPack));
    }

    void crunchscore_Add_Top_Show() {
        int imagevis[] = {32};
        int textvis[] = {36};
        int imagePlay[] = {};
        int objectanim[] = {32, 36};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void crunchscore_Add_Top_Hide() {
        controolPack.setItemsImagVisible(32, false);
        controolPack.setItemsTextVisible(36, false);
        int imagevis[] = {33};
        int textvis[] = {37};
        int imagePlay[] = {};
        int objectanim[] = {33, 37};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void crunchscore_Add_Bot_Show() {
        int imagevis[] = {30};
        int textvis[] = {34};
        int imagePlay[] = {};
        int objectanim[] = {30, 34};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void crunchscore_Add_Bot_Hide() {
        controolPack.setItemsImagVisible(30, false);
        controolPack.setItemsTextVisible(34, false);
        int imagevis[] = {31};
        int textvis[] = {35};
        int imagePlay[] = {};
        int objectanim[] = {31, 35};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void crunch_expand() {

        int imageinvis[] = {51, 52, 53, 54, 55, 30, 31, 32, 33, 122, 123, 124, 125, 126, 127};
        int textinvis[] = {67, 68, 34, 35, 36, 37};
        int imagestop[] = {51, 52, 53};
        int objectstop[] = {67, 68};
        setstatevisibleAndanim(imageinvis, textinvis, imagestop, objectstop, false);

        int imagevis[] = {50};
        int textvis[] = {69, 70, 71, 72, 73, 74, 75, 76, 77, 78};
        int imagePlay[] = {50};
        int objectanim[] = {69, 70, 71, 72, 73, 74, 75, 76, 77, 78};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);

        if (controolPack.getService() == 1) {
            controolPack.setItemsImagVisible(124, true);
            controolPack.setObjectanim(124, true);
        } else {
            controolPack.setItemsImagVisible(125, true);
            controolPack.setObjectanim(125, true);
        }
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void crunch_contract() {

        int imageinvis[] = {50, 52, 53, 30, 31, 32, 33, 122, 123, 124, 125, 126, 127};
        int textinvis[] = {67, 68, 34, 35, 36, 37, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78};
        int imagestop[] = {50, 52, 53};
        int objectstop[] = {67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 122, 123, 124, 125, 126, 127};
        setstatevisibleAndanim(imageinvis, textinvis, imagestop, objectstop, false);

        int imagevis[] = {51};
        int textvis[] = {67, 68};
        int imagePlay[] = {51};
        int objectanim[] = {67, 68};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        if (controolPack.getService() == 1) {
            controolPack.setItemsImagVisible(54, true);
            controolPack.setObjectanim(54, true);
        } else {
            controolPack.setItemsImagVisible(55, true);
            controolPack.setObjectanim(55, true);
        }
        updatecontroolPack(controolPack);

        setobjectanimoff(objectanim, imagePlay);
        controolPack.setObjectanim(54, false);
        controolPack.setObjectanim(55, false);

    }

    void crunch_PbP_contract() {
        int imageinvis[] = {48, 80, 81, 82, 83, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 97, 98, 122, 123};
        int textinvis[] = {100, 101, 102, 103, 104, 105, 106, 107, 108, 110, 111, 112, 113, 114, 115, 116, 117, 118, 120, 121};
        int imagestop[] = {48};
        int objectstop[] = {80, 81, 82, 83, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 97, 98,
            100, 101, 102, 103, 104, 105, 106, 107, 108, 110, 111, 112, 113, 114, 115, 116, 117, 118,
            120, 121, 122, 123};
        setstatevisibleAndanim(imageinvis, textinvis, imagestop, objectstop, false);

        int imagevis[] = {49};
        int textvis[] = {67, 68};
        int imagePlay[] = {49};
        int objectanim[] = {67, 68};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        if (controolPack.getService() == 1) {
            controolPack.setItemsImagVisible(54, true);
            controolPack.setObjectanim(54, true);
        } else {
            controolPack.setItemsImagVisible(55, true);
            controolPack.setObjectanim(55, true);
        }
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
        controolPack.setObjectanim(54, false);
        controolPack.setObjectanim(55, false);

    }

    void crunch_PbP_expand() {
        int imageinvis[] = {49, 51, 52, 53, 54, 55, 30, 31, 32, 33, 122, 123, 124, 125, 126, 127};
        int textinvis[] = {67, 68, 34, 35, 36, 37};
        int imagestop[] = {51, 52, 53};
        int objectstop[] = {67, 68};
        setstatevisibleAndanim(imageinvis, textinvis, imagestop, objectstop, false);

        int imagevis[] = {48};//,80,81,82,83,84,85,86,87,88,90,91,92,93,94,95,96,97,98};
        int textvis[] = {120, 121};//100,101,102,103,104,105,106,107,108,110,111,112,113,114,115,116,117,118};
        int imagePlay[] = {48};
        int objectanim[] = {80, 81, 82, 83, 84, 85, 86, 87, 88, 90, 91, 92, 93, 94, 95, 96, 97, 98,
            100, 101, 102, 103, 104, 105, 106, 107, 108, 110, 111, 112, 113, 114, 115, 116, 117, 118,
            120, 121};
        setstatevisibleAndanim(imagevis, textvis, imagePlay, objectanim, true);
        for (int i = 0; i < 9; i++) {
            if (!controolPack.getScoreHistory().getscore1(i).equals(" ")) {
                controolPack.setItemsImagVisible(88 - i, true);
                controolPack.setItemsTextVisible(108 - i, true);
            }
            if (!controolPack.getScoreHistory().getscore2(i).equals(" ")) {
                controolPack.setItemsImagVisible(98 - i, true);
                controolPack.setItemsTextVisible(118 - i, true);
            }
        }
        if (controolPack.getService() == 1) {
            controolPack.setItemsImagVisible(122, true);
            controolPack.setObjectanim(122, true);
        } else {
            controolPack.setItemsImagVisible(123, true);
            controolPack.setObjectanim(123, true);
        }

        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void repeatService(int x) {
//        if (controolPack.getVis_Anim_Bool(126).isItemsImagVisible() || controolPack.getVis_Anim_Bool(126).isItemsImagVisible()||controolPack.getVis_Anim_Bool(54).isItemsImagVisible() || controolPack.getVis_Anim_Bool(55).isItemsImagVisible()) {
        servAllHide();
        if (x == 1) {
            controolPack.setItemsImagVisible(126, true);
            controolPack.setObjectanim(126, true);
        } else {
            controolPack.setItemsImagVisible(127, true);
            controolPack.setObjectanim(127, true);
        }
//        }

    }

    public void servAllHide() {
        int imageinvis[] = {54, 55, 122, 123, 124, 125, 126, 127};
        int textinvis[] = {};
        int imagestop[] = {};
        int objectstop[] = {54, 55, 122, 123, 124, 125, 126, 127};
        setstatevisibleAndanim(imageinvis, textinvis, imagestop, objectstop, false);
    }

    void PlayerNameshowOn() {
        controolPack.setItemsImagVisible(157, false);
        int imagevis[] = {151, 156, 162};
        int textvis[] = {152, 153, 154, 155, 163, 164, 165};
        int imagePlay[] = {156};
        int objectanim[] = {151, 152, 153, 154, 155, 162, 163, 164, 165};
        int motionDims[] = {01, 01, 01, 01, 01, 01, 01, 01, 01};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
//        setVisNo(imagevis1, textvis1, imagePlay1, objectanim1, false);
    }

    void PlayerNamesOff() {
        controolPack.setItemsImagVisible(156, false);
        int imagevis[] = {151, 157, 162};
        int textvis[] = {152, 153, 154, 155, 163, 164, 165};
        int imagePlay[] = {156};
        int objectanim[] = {151, 152, 153, 154, 155, 162, 163, 164, 165};
        int motionDims[] = {02, 02, 02, 02, 02, 02, 02, 02, 02};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void showsubInname() {
        controolPack.setItemsImagVisible(159, false);
        controolPack.setItemsImagVisible(161, false);
        int imagevis[] = {160};
        int textvis[] = {163, 164, 165};
        int imagePlay[] = {};
        int objectanim[] = {160, 163, 164, 165};
        int motionDims[] = {01, 01, 01, 01};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void showsubInAll() {
        controolPack.setItemsImagVisible(159, false);
        controolPack.setItemsImagVisible(161, false);
        int imagevis[] = {158, 160, 162};
        int textvis[] = {163, 164, 165};
        int imagePlay[] = {158};
        int objectanim[] = {160, 162, 163, 164, 165};
        int motionDims[] = {01, 01, 01, 01, 01};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void showsubOutname() {
        controolPack.setItemsImagVisible(159, false);
        controolPack.setItemsImagVisible(160, false);
        int imagevis[] = {161};
        int textvis[] = {163, 164, 165};
        int imagePlay[] = {};
        int objectanim[] = {161, 163, 164, 165};
        int motionDims[] = {01, 01, 01, 01};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);

    }

    void showsubOutAll() {
        controolPack.setItemsImagVisible(159, false);
        controolPack.setItemsImagVisible(160, false);
        int imagevis[] = {158, 161, 162};
        int textvis[] = {163, 164, 165};
        int imagePlay[] = {158};
        int objectanim[] = {161, 162, 163, 164, 165};
        int motionDims[] = {01, 01, 01, 01, 01};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
//        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void showsubAllOff() {
        controolPack.setItemsImagVisible(158, false);
        int imagevis[] = {159};
        int textvis[] = {};
        int imagePlay[] = {159};
        int objectanim[] = {160, 161, 162, 163, 164, 165};
        int motionDims[] = {02, 02, 02, 02, 02, 02};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void score_Set_showOn() {
        controolPack.setItemsImagVisible(184, false);
        int imagevis[] = {183, 190, 191};
        int textvis[] = {192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 206, 207, 208, 209, 210, 211, 212, 214};
        int imagePlay[] = {183};
        int objectanim[] = {190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 206, 207, 208, 209, 210, 211, 212, 214};
        int motionDims[] = {001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void score_Set_showOff() {
        controolPack.setItemsImagVisible(183, false);
        int imagevis[] = {184};//,190,191};
        int textvis[] = {};//192,193,194,195,196,197,198,199,200,201,202,203,206,207,208,209,210,211,212,214};
        int imagePlay[] = {184};
        int objectanim[] = {190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 206, 207, 208, 209, 210, 211, 212, 214};
        int motionDims[] = {002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void score_Result_showOn() {
        controolPack.setItemsImagVisible(182, false);
        int imagevis[] = {181, 190, 191};
        int textvis[] = {192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 208, 209, 210, 211, 212, 213};
        int imagePlay[] = {181};
        int objectanim[] = {190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 208, 209, 210, 211, 212, 213};
        int motionDims[] = {001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001, 001};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
    }

    void score_Result_showOff() {
        controolPack.setItemsImagVisible(181, false);
        int imagevis[] = {182};//,190,191};
        int textvis[] = {};//192,193,194,195,196,197,198,199,200,201,202,203,204,205,208,209,210,211,212,213};
        int imagePlay[] = {182};
        int objectanim[] = {190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 208, 209, 210, 211, 212, 213};
        int motionDims[] = {002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002, 002};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void coatchNameShowOn() {
        controolPack.setItemsImagVisible(157, false);
        int imagevis[] = {156, 162};
        int textvis[] = {163, 164, 165};
        int imagePlay[] = {156};
        int objectanim[] = {162, 163, 164, 165};
        int motionDims[] = {01, 01, 01, 01};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
//        setVisNo(imagevis1, textvis1, imagePlay1, objectanim1, false);
    }

    void coatchNameShowOff() {
        controolPack.setItemsImagVisible(156, false);
        int imagevis[] = {157};
        int textvis[] = {};
        int imagePlay[] = {157};
        int objectanim[] = {162, 163, 164, 165};
        int motionDims[] = {02, 02, 02, 02, 02};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
//        int imagevis1[] = {};
//        int textvis1[] = {};
//        int imagePlay1[] = {};
//        int objectanim1[] = {};
        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }

    void PlayByPlayVerticalshowOn() {
        controolPack.setItemsImagVisible(222, false);
        
          for (int i = 0; i < 9; i++) {
            if (!controolPack.getScoreHistory().getscore1(i).equals(" ")) {
                controolPack.setItemsImagVisible(231 - i, true);
                controolPack.setItemsTextVisible(251 - i, true);
            }
            if (!controolPack.getScoreHistory().getscore2(i).equals(" ")) {
                controolPack.setItemsImagVisible(241 - i, true);
                controolPack.setItemsTextVisible(261 - i, true);
            }
        }
        int imagevis[] = {221, 267, 268};
        int textvis[] = { 252, 262, 263, 264, 265, 266};//252,262
        int imagePlay[] = {221};
        int objectanim[] = {223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 267, 268, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268};
        int motionDims[] = {000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 000, 001, 001, 001, 001};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);

      
        if (controolPack.getService() == 1) {
            controolPack.setItemsImagVisible(269, true);
            
            controolPack.setObjectanim(269, 1, true);
        } else {
            controolPack.setItemsImagVisible(269, true);
            controolPack.setObjectanim(269, 2, true);
        }
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);
        controolPack.setObjectanim(269, 2, false);
    }

    void PlayByPlayVerticalshowOff() {
        int imagevis2[] = {221, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242};
        int textvis2[] = {243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264};
        int imagePlay2[] = {221};
        int objectanim2[] = {};
        int motionDims2[] = {};

        setVisNo(imagevis2, textvis2, imagePlay2, objectanim2, false);
        //controolPack.setItemsImagVisible(221, false);
        int imagevis[] = {222};
        int textvis[] = {};
        int imagePlay[] = {222};
        int objectanim[] = {265, 266, 267, 268, 269};
        int motionDims[] = {02,  02,   02,  02,  03};

        setVisMothion(imagevis, textvis, imagePlay, objectanim, motionDims, true);
        updatecontroolPack(controolPack);
        setobjectanimoff(objectanim, imagePlay);

        setVisNo(imagevis, textvis, imagePlay, objectanim, false);
    }
}
