/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import java.io.Serializable;

/**
 *
 * @author shayan
 */
public class LastonairPlayerName implements Serializable{

    public LastonairPlayerName(int maxplayer) {
        this.maxplayer = maxplayer;
        namesA = new String[maxplayer];
        namesB = new String[maxplayer];
        ageA = new String[maxplayer];
        ageB = new String[maxplayer];
        heighA = new String[maxplayer];
        heighB = new String[maxplayer];
        numberA = new String[maxplayer];
        numberB = new String[maxplayer];
        for (int i = 0; i < maxplayer; i++) {
            numberA[i] = String.valueOf(i);
            numberB[i] = String.valueOf(i);
            namesA[i] = "namA " + i;
            namesB[i] = "namB " + i;
            ageA[i] = String.valueOf(i + 10);
            ageB[i] = String.valueOf(i + 20);
            heighA[i] = String.valueOf(i * 2 + 150);
            heighB[i] = String.valueOf(i * 3 + 100);

        }
        countryA = "Iran";
        countryPicA = "pictures\\testPicShayan.png";
        
        countryB = "Iran";
        countryPicB = "pictures\\testPicShayan.png";
        path = "";
    }

    public String[] getNamesA() {
        return namesA;
    }

    public void setNamesA(String[] namesA) {
        this.namesA = namesA;
    }

    public String[] getNamesB() {
        return namesB;
    }

    public void setNamesB(String[] namesB) {
        this.namesB = namesB;
    }

    public String[] getAgeA() {
        return ageA;
    }

    public void setAgeA(String[] ageA) {
        this.ageA = ageA;
    }

    public String[] getAgeB() {
        return ageB;
    }

    public void setAgeB(String[] ageB) {
        this.ageB = ageB;
    }

    public String[] getHeighA() {
        return heighA;
    }

    public void setHeighA(String[] heighA) {
        this.heighA = heighA;
    }

    public String[] getHeighB() {
        return heighB;
    }

    public void setHeighB(String[] heighB) {
        this.heighB = heighB;
    }

    public String[] getNumberA() {
        return numberA;
    }

    public void setNumberA(String[] numberA) {
        this.numberA = numberA;
    }

    public String[] getNumberB() {
        return numberB;
    }

    public void setNumberB(String[] numberB) {
        this.numberB = numberB;
    }

    public String getCountryA() {
        return countryA;
    }

    public void setCountryA(String countryA) {
        this.countryA = countryA;
    }

    public String getCountryPicA() {
        return countryPicA;
    }

    public void setCountryPicA(String countryPicA) {
        this.countryPicA = countryPicA;
    }

    public String getCountryB() {
        return countryB;
    }

    public void setCountryB(String countryB) {
        this.countryB = countryB;
    }

    public String getCountryPicB() {
        return countryPicB;
    }

    public void setCountryPicB(String countryPicB) {
        this.countryPicB = countryPicB;
    }

   

    public int getMaxplayer() {
        return maxplayer;
    }

    public void setMaxplayer(int maxplayer) {
        this.maxplayer = maxplayer;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCoachA() {
        return coachA;
    }

    public void setCoachA(String coachA) {
        this.coachA = coachA;
    }

    public String getCoachB() {
        return coachB;
    }

    public void setCoachB(String coachB) {
        this.coachB = coachB;
    }

    public String getSubstituationIn() {
        return substituationIn;
    }

    public void setSubstituationIn(String substituationIn) {
        this.substituationIn = substituationIn;
    }

    public String getSubstituationOut() {
        return substituationOut;
    }

    public void setSubstituationOut(String substituationOut) {
        this.substituationOut = substituationOut;
    }
    
    String[] namesA, namesB, ageA, ageB, heighA, heighB, numberA, numberB;
    String path, countryA, countryPicA,countryB, countryPicB,coachA,coachB,substituationIn,substituationOut;

    int maxplayer;

}
