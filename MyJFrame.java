/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.myjframe;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Emmanuel
 */

public class MyJFrame {

    public static void main(String[] args) {
        JFrame MyJFrame = new JFrame("MyJFrame");
        
        JLabel MyJLabel = new JLabel("Hola mundo");
        MyJFrame.add(MyJLabel);
        MyJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyJFrame.setSize(200, 150);
        MyJFrame.setVisible(true);
    }
}
