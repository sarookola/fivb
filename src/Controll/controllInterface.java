/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DataBox.Playernamedata;
import DataBox.TeamGorHino;

/**
 *
 * @author shayan
 */
interface controllInterface {

    public void showPlayernameOn(Playernamedata playernamedata);
    public void showPlayernameOff();


    public void updateelastonairteaminfo(TeamGorHino gorHino);

    public void showPlayerinOnlyName(Playernamedata playernamedata);

    public void showPlayerinall(Playernamedata playernamedata);

    public void showPlayerOutOnlyName(Playernamedata playernamedata);

    public void showPlayerOutall(Playernamedata playernamedata);

    public void showPlayerInOutFree();

    public void showCoachOff();

    public void showCoachOn(Playernamedata playernamedata);
    
}
