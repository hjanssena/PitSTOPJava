/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pitstop;
import Menu.MenuPrincipal;
import java.util.Scanner;
import java.util.ArrayList;
import java.sql.Date;


public class PitStop {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
    new MenuPrincipal().setVisible(true);    
    }
}
