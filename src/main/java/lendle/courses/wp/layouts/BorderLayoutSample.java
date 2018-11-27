/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.layouts;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class BorderLayoutSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        BorderLayout layout=new BorderLayout();
        frame.setLayout(layout);
        
        //1. create five buttons, add them to North, West, South, East, Center
        //2. test the effect of setHgap and setVgap (layout.setHgap() and layout.setVgap())
        JButton b1 = new JButton("1");
        frame.add(b1,"North");
        
        JButton b2 = new JButton("2");
        frame.add(b1,"West");
        JButton b3 = new JButton("3");
        frame.add(b1,"South");
        JButton b4 = new JButton("4");
        frame.add(b1,"East");
        JButton b5 = new JButton("5");
        frame.add(b5);
        layout.setHgap(50);
        layout.setVgap(50);
        
        //////////////////////////////////////////////////////////////////////
        
        frame.setVisible(true);
    }
    
}
