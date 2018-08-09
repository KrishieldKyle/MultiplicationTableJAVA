
package MP2;

import static MP2.Main.MusicApp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Howtoplay extends JFrame implements ActionListener, MouseMotionListener, WindowFocusListener{
   
    JPanel backP = new JPanel();
    JButton nextbtn = new JButton("next");
    JButton backbtn = new JButton("back");
    JLabel back = new JLabel(new ImageIcon("pics\\howB.png"));
    JLabel expla = new JLabel(new ImageIcon("pics\\expla.png"));
    JLabel first = new JLabel(new ImageIcon("pics\\first.gif"));
    JLabel second = new JLabel(new ImageIcon("pics\\second.gif"));
    JLabel third = new JLabel(new ImageIcon("pics\\third.gif"));
    JLabel fourth = new JLabel(new ImageIcon("pics\\fourth.gif"));
    JLabel fifth = new JLabel(new ImageIcon("pics\\fifth.gif"));
    JLabel sixth = new JLabel(new ImageIcon("pics\\sixth.gif"));
    JLabel invalid = new JLabel(new ImageIcon("pics\\invalid.png"));
    JTextField number = new JTextField("");
    int marker=0;
    int over=8;
    Howtoplay()
    {
        setVisible(true);
        setSize(600,500);
        setTitle("How To Play");
        setLocationRelativeTo(null);
        setResizable(false);
        
        backP.setBackground(new Color(51,102,0));
        backP.setLayout(null);
        backbtn.setFont(new Font("CHAWP",Font.PLAIN,15));
        backbtn.setForeground(new Color(204,204,204));
        backbtn.setBackground(new Color(51,102,0));
        nextbtn.setFont(new Font("CHAWP",Font.PLAIN,15));
        nextbtn.setForeground(new Color(204,204,204));
        nextbtn.setBackground(new Color(51,102,0));
        number.setFont(new Font("CHAWP",Font.PLAIN,15));
        number.setForeground(new Color(204,204,204));
        number.setBackground(new Color(51,102,0));
        number.setEditable(false);
        number.setHorizontalAlignment(JLabel.CENTER);
        number.setText(marker+1+" - "+over+"");
        //bounds
        back.setBounds(0, 0, 600, 500);
        expla.setBounds(0, 0, 600, 500);
        nextbtn.setBounds(490, 430, 80, 30);
        number.setBounds(255, 430, 80, 30);
        backbtn.setBounds(15, 430, 80, 30);
        //bounds
        //border
        backP.setBorder(BorderFactory.createLineBorder(new Color(187,155,88), 10));
        //border
        //button
        nextbtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        nextbtn.setOpaque(false);
        nextbtn.setBorderPainted(false);
        nextbtn.setFocusPainted(false);
        number.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        number.setOpaque(false);
        backbtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        backbtn.setOpaque(false);
        backbtn.setBorderPainted(false);
        backbtn.setFocusPainted(false);
        //button
        
        backP.add(nextbtn);
        backP.add(number);
        //backP.add(backbtn);
        backP.add(expla);
        backP.add(back);
        add(backP);
        this.revalidate();
        backbtn.addActionListener(this);
        nextbtn.addActionListener(this);
        
        backbtn.addMouseMotionListener(this);
        nextbtn.addMouseMotionListener(this);
        addMouseMotionListener(this);
        addWindowFocusListener(this);
        backbtn.setToolTipText("Previous Page");
        nextbtn.setToolTipText("Next Page");
    }//contra
    public static void main(String[] args) {
        Howtoplay how = new Howtoplay();
    }
    public void actionPerformed(ActionEvent ae) {
        
        Object src = new Object();
        src = ae.getSource();
        
        if(src.equals(nextbtn))
        {
            MusicApp(Main.sound);
            marker++;
            if(marker==0)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                //backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                expla.setBounds(0, 0, 600, 500);
                backP.add(expla);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==1)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                first.setBounds(0, 0, 600, 500);
                backP.add(first);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==2)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                invalid.setBounds(0, 0, 600, 500);
                backP.add(invalid);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==3)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                second.setBounds(0, 0, 600, 500);
                backP.add(second);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==4)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                third.setBounds(0, 0, 600, 500);
                backP.add(third);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==5)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                fourth.setBounds(0, 0, 600, 500);
                backP.add(fourth);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            if(marker==6)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                fifth.setBounds(0, 0, 600, 500);
                backP.add(fifth);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            if(marker==7)
            {
                //default
                backP.removeAll();
                //backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                sixth.setBounds(0, 0, 600, 500);
                backP.add(sixth);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            
        }//next
        if(src.equals(backbtn))
        {
            MusicApp(Main.sound);
            marker--;
            if(marker==0)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                //backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                expla.setBounds(0, 0, 600, 500);
                backP.add(expla);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==1)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                first.setBounds(0, 0, 600, 500);
                backP.add(first);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==2)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                invalid.setBounds(0, 0, 600, 500);
                backP.add(invalid);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==3)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                second.setBounds(0, 0, 600, 500);
                backP.add(second);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==4)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                third.setBounds(0, 0, 600, 500);
                backP.add(third);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            else if(marker==5)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                fourth.setBounds(0, 0, 600, 500);
                backP.add(fourth);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            if(marker==6)
            {
                //default
                backP.removeAll();
                backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                fifth.setBounds(0, 0, 600, 500);
                backP.add(fifth);
                backP.updateUI();
                backP.revalidate();
                //added
            }
            if(marker==7)
            {
                //default
                backP.removeAll();
                //backP.add(nextbtn);
                backP.add(backbtn);
                backP.add(back);
                backP.add(number);
                number.setText(marker+1+" - "+over+"");
                //default
                //default bounds
                nextbtn.setBounds(490, 430, 80, 30);
                backbtn.setBounds(15, 430, 80, 30);
                back.setBounds(0, 0, 600, 500);
                number.setBounds(255, 430, 80, 30);
                //default bounds
                //added
                sixth.setBounds(0, 0, 600, 500);
                backP.add(sixth);
                backP.updateUI();
                backP.revalidate();
                //added
            }
        }//back
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        if(me.getSource().equals(nextbtn))
            {
                nextbtn.setForeground(Color.white);
            }
        else
            {
                nextbtn.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(backbtn))
            {
                backbtn.setForeground(Color.white);
            }
        else
            {
                backbtn.setForeground(new Color(204,204,204));
            }
    }

   
    @Override
    public void windowGainedFocus(WindowEvent we) {
        
    }

    @Override
    public void windowLostFocus(WindowEvent we) {
        MusicApp(Main.sound);
        dispose();
    }

    
   
}//clas
