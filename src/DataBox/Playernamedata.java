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
public class Playernamedata implements Serializable{
    String number , namePlayer , heightPlayer,age , country,coach;    
    String countryPic,countryPicGuest,countryPicHost;

    public Playernamedata() {
        countryPic= "pictures\\NoPic.png";
         countryPicGuest= "pictures\\NoPic.png";
          countryPicHost= "pictures\\NoPic.png";
    }
    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getHeightPlayer() {
        return heightPlayer;
    }

    public void setHeightPlayer(String heightPlayer) {
        this.heightPlayer = heightPlayer;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getCountryPicGuest() {
        return countryPicGuest;
    }

    public void setCountryPicGuest(String countryPicGuest) {
        this.countryPicGuest = countryPicGuest;
    }

    public String getCountryPicHost() {
        return countryPicHost;
    }

    public void setCountryPicHost(String countryPicHost) {
        this.countryPicHost = countryPicHost;
    }


  
    
}
