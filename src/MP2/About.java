
package MP2;

import static MP2.Main.MusicApp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class About extends JFrame implements WindowFocusListener{
    JPanel main = new JPanel();
    JLabel nameko = new JLabel("Krishield Kyle R. Santoyo");
    JLabel sec = new JLabel("ACT 2I-G1");
    JLabel sub = new JLabel("Programmer: ");
    JLabel ins = new JLabel("INSTRUCTOR: ");
    JLabel maam = new JLabel("Evelyn Samson");
    JLabel laro = new JLabel(new ImageIcon("pics\\laro.gif"));
    JLabel aboutB = new JLabel(new ImageIcon("pics\\aboutB.png"));
    
    About()
    {
        setSize(300,200);
        setVisible(true);
        setTitle("About us");
        setResizable(false);
        setLocationRelativeTo(null);
        main.setBackground(new Color(51,102,0));
        main.setLayout(null);
        nameko.setForeground(new Color(204,204,204));
        sec.setForeground(new Color(204,204,204));
        sub.setForeground(new Color(204,204,204));
        ins.setForeground(new Color(204,204,204));
        maam.setForeground(new Color(204,204,204));
        nameko.setFont(new Font("CHAWP",Font.PLAIN,15));
        sec.setFont(new Font("CHAWP",Font.PLAIN,15));
        sub.setFont(new Font("CHAWP",Font.BOLD,20));
        ins.setFont(new Font("CHAWP",Font.BOLD,20));
        maam.setFont(new Font("CHAWP",Font.PLAIN,15));
        //bounds
        sub.setBounds(10, 10, 200, 20);
        nameko.setBounds(40, 30, 300, 20);
        sec.setBounds(100, 50, 200, 20);
        ins.setBounds(10, 109, 200, 20);
        maam.setBounds(40, 129, 200, 20);
        laro.setBounds(200, 70, 82, 90);
        aboutB.setBounds(0, 0, 300, 200);
        //bounds
        main.updateUI();
        main.revalidate();
        
        main.add(sub);
        main.add(nameko);
        main.add(sec);
        main.add(ins);
        main.add(maam);
        main.add(laro);
        main.add(aboutB);
        
        add(main);
        addWindowFocusListener(this);
    }//constra
    public static void main(String[] args) {
        About about = new About();
    }//main

    @Override
    public void windowGainedFocus(WindowEvent we) {
        
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
        MusicApp(Main.sound);
        dispose();
    }
    
}//class
