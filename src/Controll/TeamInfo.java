/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import DataBox.LastonairPlayerName;
import DataBox.Playernamedata;
import DataBox.TeamGorHino;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author shayan
 */
public class TeamInfo extends javax.swing.JPanel {

    /**
     * Creates new form TeamInfo
     */
    public TeamInfo(controllInterface cInterface, LastonairPlayerName lastonair, int ab) {
        initComponents();
        this.lastonair = lastonair;
        this.cInterface = cInterface;
        this.ab = ab;
        substitution = false;
        playerNameOnair = false;
        coachOnair = false;
        init2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelPic = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextFieldcountry = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanelsubstitution = new javax.swing.JPanel();
        jToggleButtonsubstitution = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanelsubstitution1 = new javax.swing.JPanel();
        jTextFieldsubin = new javax.swing.JTextField();
        jTextFieldsubout = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldcoatch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanelForPlayers = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelPic.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPic.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanelPic.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Pics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldcountry.setText("jTextField1");

        jButton2.setText("ReadFile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jToggleButtonsubstitution.setText("Substitution");
        jToggleButtonsubstitution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonsubstitutionActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Coach");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextFieldsubin.setText("SUBSTITUATION IN");
        jTextFieldsubin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsubinActionPerformed(evt);
            }
        });

        jTextFieldsubout.setText("SUBSTITUATION OUT");
        jTextFieldsubout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsuboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelsubstitution1Layout = new javax.swing.GroupLayout(jPanelsubstitution1);
        jPanelsubstitution1.setLayout(jPanelsubstitution1Layout);
        jPanelsubstitution1Layout.setHorizontalGroup(
            jPanelsubstitution1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsubstitution1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldsubin, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
            .addGroup(jPanelsubstitution1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelsubstitution1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextFieldsubout, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
        );
        jPanelsubstitution1Layout.setVerticalGroup(
            jPanelsubstitution1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsubstitution1Layout.createSequentialGroup()
                .addComponent(jTextFieldsubin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelsubstitution1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelsubstitution1Layout.createSequentialGroup()
                    .addGap(0, 33, Short.MAX_VALUE)
                    .addComponent(jTextFieldsubout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanelsubstitutionLayout = new javax.swing.GroupLayout(jPanelsubstitution);
        jPanelsubstitution.setLayout(jPanelsubstitutionLayout);
        jPanelsubstitutionLayout.setHorizontalGroup(
            jPanelsubstitutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsubstitutionLayout.createSequentialGroup()
                .addGroup(jPanelsubstitutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButtonsubstitution, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelsubstitution1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelsubstitutionLayout.setVerticalGroup(
            jPanelsubstitutionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsubstitutionLayout.createSequentialGroup()
                .addComponent(jToggleButtonsubstitution)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jToggleButton1))
            .addComponent(jPanelsubstitution1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Country");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Coach");

        jTextFieldcoatch.setText("jTextField1");

        jButton3.setText("update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanelPic, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldcoatch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelsubstitution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldcoatch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addComponent(jPanelsubstitution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanelForPlayers.setLayout(new java.awt.GridLayout(0, 1));
        jPanel1.add(jPanelForPlayers, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser(new File("."));
        File f = new File(lastonair.getPath());
        chooser.setCurrentDirectory(f);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            imagePanel.drawImage(chooser.getSelectedFile());
            lastonair.setPath(chooser.getSelectedFile().getPath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        updateLastonair();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        loadteamData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jToggleButtonsubstitutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonsubstitutionActionPerformed
        // TODO add your handling code here:
        playerInOutFree();
    }//GEN-LAST:event_jToggleButtonsubstitutionActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if (jToggleButton1.isSelected()) {
            jPanelsubstitution.setBackground(Color.gray);
            showCoachon();
        } else {
            jPanelsubstitution.setBackground(Color.RED);
            showCoachoff();
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextFieldsubinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsubinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsubinActionPerformed

    private void jTextFieldsuboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsuboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsuboutActionPerformed

    private void loadteamData() {
        LastonairPlayerName l2 = lastonair;
        JFileChooser chooser = new JFileChooser(new File("."));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            l2 = new FileManipulatTeamName().readTeamName((chooser.getSelectedFile().getPath()), lastonair, ab);
        }

        initData(l2);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelForPlayers;
    private javax.swing.JPanel jPanelPic;
    private javax.swing.JPanel jPanelsubstitution;
    private javax.swing.JPanel jPanelsubstitution1;
    private javax.swing.JTextField jTextFieldcoatch;
    private javax.swing.JTextField jTextFieldcountry;
    private javax.swing.JTextField jTextFieldsubin;
    private javax.swing.JTextField jTextFieldsubout;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButtonsubstitution;
    // End of variables declaration//GEN-END:variables
  ImagePanel imagePanel;
    LastonairPlayerName lastonair;
    PlayerName[] playerNamesl;
    controllInterface cInterface;
    int ab;
    boolean substitution, coachOnair, playerNameOnair;

    private void init2() {
        imagePanel = new ImagePanel();
        if (ab == 0) {
            imagePanel.setAddress(lastonair.getCountryPicA());
            jTextFieldcountry.setText(lastonair.getCountryA());
            jTextFieldcoatch.setText(lastonair.getCoachA());

        } else {
            imagePanel.setAddress(lastonair.getCountryPicB());
            jTextFieldcountry.setText(lastonair.getCountryB());
            jTextFieldcoatch.setText(lastonair.getCoachB());
        }
        jTextFieldsubin.setText(lastonair.getSubstituationIn());
        jTextFieldsubout.setText(lastonair.getSubstituationOut());
        jPanelPic.add(imagePanel);
        playerNamesl = new PlayerName[lastonair.getAgeA().length];
        for (int i = 0; i < playerNamesl.length; i++) {
            playerNamesl[i] = new PlayerName(this, ab, i);
            jPanelForPlayers.add(playerNamesl[i]);
        }
          imagePanel.reloadImage();
        updateUI();
    }

    public LastonairPlayerName getLastonair() {
        return lastonair;
    }

    public void setLastonair(LastonairPlayerName lastonair) {
        this.lastonair = lastonair;
    }

    private void setnameSelected(boolean b) {
        for (int i = 0; i < playerNamesl.length; i++) {
            PlayerName playerNamesl1 = playerNamesl[i];
            playerNamesl1.setselectname(false);

        }
    }

    private void updateLastonair() {
        String ageA[] = new String[lastonair.getMaxplayer()];
        String nameA[] = new String[lastonair.getMaxplayer()];
        String numberA[] = new String[lastonair.getMaxplayer()];
        String heightA[] = new String[lastonair.getMaxplayer()];
        for (int i = 0; i < lastonair.getMaxplayer(); i++) {
            numberA[i] = playerNamesl[i].getnumber();
            nameA[i] = playerNamesl[i].getnamePlayer();
            ageA[i] = playerNamesl[i].getAge();
            heightA[i] = playerNamesl[i].getHeightPlayer();
            playerNamesl[i].updateNumber();
        }
        TeamGorHino gorHino = new TeamGorHino();
        gorHino.setAb(ab);
        gorHino.setAgeA(ageA);
        gorHino.setCoach(jTextFieldcoatch.getText());
        gorHino.setCountry(jTextFieldcountry.getText());
        gorHino.setCountryPic(imagePanel.getAddress());
        gorHino.setSubstituationIn(jTextFieldsubin.getText());
        gorHino.setSubstituationOut(jTextFieldsubout.getText());
        gorHino.setHeightA(heightA);
        gorHino.setNameA(nameA);
        gorHino.setNumberA(numberA);
        cInterface.updateelastonairteaminfo(gorHino);

    }

    private void initData(LastonairPlayerName l2) {
        if (ab == 0) {
            jTextFieldcountry.setText(l2.getCountryA());
            imagePanel.setAddress(l2.getCountryPicA());
            for (int i = 0; i < l2.getMaxplayer(); i++) {
                playerNamesl[i].setnumber(l2.getNumberA()[i]);
                playerNamesl[i].setnamePlayer(l2.getNamesA()[i]);
                playerNamesl[i].setAge(l2.getAgeA()[i]);
                playerNamesl[i].setHeightPlayer(l2.getHeighA()[i]);

            }
        } else {
            jTextFieldcountry.setText(l2.getCountryB());
            imagePanel.setAddress(l2.getCountryPicB());
            for (int i = 0; i < l2.getMaxplayer(); i++) {
                playerNamesl[i].setnumber(l2.getNumberB()[i]);
                playerNamesl[i].setnamePlayer(l2.getNamesB()[i]);
                playerNamesl[i].setAge(l2.getAgeB()[i]);
                playerNamesl[i].setHeightPlayer(l2.getHeighB()[i]);

            }
        }
        imagePanel.redrawImage();
        updateUI();
    }

    private Playernamedata getpalyernamedata(PlayerName playername) {
        Playernamedata playernamedata = new Playernamedata();
        playernamedata.setNamePlayer(playername.getnamePlayer());
        playernamedata.setAge(playername.getAge());
        playernamedata.setNumber(playername.getnumber());
        playernamedata.setHeightPlayer(playername.getHeightPlayer());
        playernamedata.setCountry(jTextFieldcountry.getText());
        playernamedata.setCountryPic(imagePanel.getAddress());
        playernamedata.setCoach(jTextFieldcoatch.getText());
        playernamedata.setCountryPicGuest(lastonair.getCountryPicB());
         playernamedata.setCountryPicHost(lastonair.getCountryPicA());
        return playernamedata;
    }

    private Playernamedata getpalyernamedatasubin(PlayerName playername) {
        Playernamedata playernamedata = getpalyernamedata(playername);
        playernamedata.setCountry(jTextFieldsubin.getText());
        return playernamedata;
    }

    private Playernamedata getpalyernamedatasubout(PlayerName playername) {
        Playernamedata playernamedata = getpalyernamedata(playername);
        playernamedata.setCountry(jTextFieldsubout.getText());
        return playernamedata;
    }

    void playernameShow(PlayerName playername) {
        if (!playerNameOnair) {
            Playernamedata playernamedata = getpalyernamedata(playername);
            cInterface.showPlayernameOn(playernamedata);
            playerNameOnair = true;
        }
    }

    void playernameHide() {
        if (playerNameOnair) {
            cInterface.showPlayernameOff();
            setnameSelected(false);
            playerNameOnair = false;
        }
    }

    void playerInShow(PlayerName playername) {
        Playernamedata playernamedata = getpalyernamedatasubin(playername);
        if (substitution) {
            cInterface.showPlayerinOnlyName(playernamedata);
            jPanelsubstitution.setBackground(Color.GREEN);
        } else {
            substitution = true;
            jToggleButtonsubstitution.setSelected(true);
            jPanelsubstitution.setBackground(Color.GREEN);
            cInterface.showPlayerinall(playernamedata);
        }

    }

    void playerOutShow(PlayerName playername) {
        Playernamedata playernamedata = getpalyernamedatasubout(playername);
        if (substitution) {
            cInterface.showPlayerOutOnlyName(playernamedata);
            jPanelsubstitution.setBackground(Color.red);
        } else {
            substitution = true;
            jToggleButtonsubstitution.setSelected(true);
            jPanelsubstitution.setBackground(Color.red);
            cInterface.showPlayerOutall(playernamedata);
        }
    }

    public void playerInOutFree() {
        if (substitution) {
            cInterface.showPlayerInOutFree();
            substitution = false;
            jPanelsubstitution.setBackground(Color.GRAY);
            jToggleButtonsubstitution.setSelected(false);
            for (int i = 0; i < playerNamesl.length; i++) {
                PlayerName playerNamesl1 = playerNamesl[i];
                playerNamesl1.setBackground(Color.GRAY);
            }
        }
    }

    void showCoachoff() {
        if (coachOnair) {
            coachOnair = false;
            jToggleButton1.setSelected(false);
            jPanelsubstitution.setBackground(Color.GRAY);
            cInterface.showCoachOff();
        }

    }

    private void showCoachon() {
        coachOnair = true;
        Playernamedata playernamedata = getpalyernamedata(playerNamesl[0]);
        jPanelsubstitution.setBackground(Color.RED);
        cInterface.showCoachOn(playernamedata);
    }

    void Name_coach_sub_Off() {
        playerInOutFree();
        showCoachoff();
        playernameHide();
    }
}
