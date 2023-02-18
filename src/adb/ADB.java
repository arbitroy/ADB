/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adb;

import javax.swing.JFrame;

/**
 *
 * @author austine
 */
public class ADB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login loginFrame = new Login();
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setSize(500, 500);
        loginFrame.setVisible(true);
    }
    
}
