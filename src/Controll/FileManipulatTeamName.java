/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DataBox.LastonairPlayerName;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shayan
 */
public class FileManipulatTeamName {

    LastonairPlayerName readTeamName(String path, LastonairPlayerName teamData, int aOrB) {
        FileReader fileReader = null;
        BufferedReader reader = null;
        //  int arraySize = teamData.getMaxplayer();
      //  String stnames[] = {"", "", "", ""};
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(path), "UTF8"));
            int i = 0;
            if (aOrB == 0) {
                teamData.setCountryA(reader.readLine().substring(1));
                do {
                    teamData.getNumberA()[i] = reader.readLine()+".";
                    teamData.getNamesA()[i] = reader.readLine();
                    teamData.getAgeA()[i] = reader.readLine();
                    teamData.getHeighA()[i] = reader.readLine()+"cm";
                    i++;
                } while (reader.readLine() != null & i < teamData.getMaxplayer());

            } else {
                teamData.setCountryB(reader.readLine());
                do {
                    teamData.getNumberB()[i] = reader.readLine()+".";
                    teamData.getNamesB()[i] = reader.readLine();
                    teamData.getAgeB()[i] = reader.readLine();
                    teamData.getHeighB()[i] = reader.readLine()+"cm";
                    i++;
                } while (reader.readLine() != null & i < teamData.getMaxplayer());
            }
        } catch (IOException ex) {
            Logger.getLogger(FileManipulatTeamName.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            try {
//                fileReader.close();
                reader.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManipulatTeamName.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return teamData;
    }

}
