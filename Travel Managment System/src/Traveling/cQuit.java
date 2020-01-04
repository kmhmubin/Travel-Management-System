/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traveling;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author INVALID
 */
class cQuit {
    private JFrame frame;
    public void quit(){
        frame = new JFrame ("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you Sure you want to Exit","Tramvel Managment System",JOptionPane.YES_NO_OPTION )== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
}
