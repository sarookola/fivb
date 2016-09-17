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
public class TeamGorHino implements Serializable {
    int ab;
    String[] numberA, nameA, ageA, heightA;
    String country , countryPic,coach,substituationIn,substituationOut;

    public int getAb() {
        return ab;
    }

    public void setAb(int ab) {
        this.ab = ab;
    }

    public String[] getNumberA() {
        return numberA;
    }

    public void setNumberA(String[] numberA) {
        this.numberA = numberA;
    }

    public String[] getNameA() {
        return nameA;
    }

    public void setNameA(String[] nameA) {
        this.nameA = nameA;
    }

    public String[] getAgeA() {
        return ageA;
    }

    public void setAgeA(String[] ageA) {
        this.ageA = ageA;
    }

    public String[] getHeightA() {
        return heightA;
    }

    public void setHeightA(String[] heightA) {
        this.heightA = heightA;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryPic() {
        return countryPic;
    }

    public void setCountryPic(String countryPic) {
        this.countryPic = countryPic;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
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
    
}
