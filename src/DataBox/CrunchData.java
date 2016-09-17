/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBox;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author shayan
 */
public class CrunchData   implements Serializable{
    List<String> crunch_Add_top;

    public CrunchData() {
        crunch_Add_top = new LinkedList<String>();
    }

    public List<String> getCrunch_Add_top() {
        return crunch_Add_top;
    }
    public void addCrunch_Add_top(String st){
        crunch_Add_top.add(st);
    }
}
