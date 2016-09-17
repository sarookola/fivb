/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DataBox.CrunchData;
import DataBox.FivbControolPack;
import DataBox.LastonairPlayerName;
import DataBox.SettingPack;
import DataBox.SettingPackOld;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shayan
 */
public class FileManipulat {

    SettingPack settings;

    public void saveObject(String st, Object obj) {
        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(obj);

        try {
            //write converted json data to a file named "file.json"
            FileOutputStream file = new FileOutputStream(st);
            Writer out = new BufferedWriter(
                    new OutputStreamWriter(file, "UTF8"));
//            FileWriter writer = new FileWriter(st);
            out.write(json);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public SettingPack loadSetting(String st, int objecsArrayLenght) {
        SettingPack settings;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                    new FileReader(st));
            settings = gson.fromJson(br, SettingPack.class);
//                convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Here is new json creating");
            settings = new SettingPack(objecsArrayLenght);
        }
        return settings;
    }

    public SettingPack loadSettingObj(String st, int objecsArrayLenght) {
        SettingPack settings;
        settings = new SettingPack(objecsArrayLenght);
        FileInputStream fis;
        try {
            fis = new FileInputStream(st);
            ObjectInputStream ois = new ObjectInputStream(fis);
            settings = (SettingPack) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManipulat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileManipulat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileManipulat.class.getName()).log(Level.SEVERE, null, ex);
        }
        return settings;
    }
        //   

    public FivbControolPack loadControolPack(String st, int objecsArrayLenght) {
        FivbControolPack settings = null;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                    new FileReader(st));
            settings = gson.fromJson(br, FivbControolPack.class);
//                convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            settings = new FivbControolPack(objecsArrayLenght);
            System.out.println("Here is new json creating");

        }
        return settings;
    }

    public Object loadCrunchData(String st) {
        CrunchData settings = null;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                    new FileReader(st));
            settings = gson.fromJson(br, CrunchData.class);
//                convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            settings = new CrunchData();
            System.out.println("Here is new crunch data creating");

        }
        return settings;
    }

     public LastonairPlayerName loadlastonanaiteamInfo(String st) {
        LastonairPlayerName settings = null;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

            settings = gson.fromJson(br, LastonairPlayerName.class);
//                convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            settings = new LastonairPlayerName(20);
            System.out.println("Here is new teamInfo creating");

        }
        return settings;
    }
    public static void main(String args[]) {
//       savesetting("text.txt");
//       loadSetting("text.txt");
//             reader = new BufferedReader( new InputStreamReader(
//                      new FileInputStream(path), "UTF8"));
    }

    SettingPackOld loadSettingold(String st, int objecsArrayLenght) {
        SettingPackOld settings;
        Gson gson = new Gson();
        BufferedReader br = null;

        try {
//            Reader reader = new InputStreamReader(st);                            
//            Gson gson = new GsonBuilder().create();
//                settings = gson.fromJson(reader, SettingPack.class);
//            Person p = gson.fromJson(reader, Person.class);
//            System.out.println(p);
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(st), "UTF8"));

//            br = new BufferedReader(
//                    new FileReader(st));
            settings = gson.fromJson(br, SettingPackOld.class);
//                convert the json string back to object

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Here is new json creating");
            settings = new SettingPackOld(objecsArrayLenght);
        }
        return settings;
    }

}
