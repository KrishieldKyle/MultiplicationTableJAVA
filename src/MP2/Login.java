
package MP2;



import static MP2.Main.MusicApp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;



public class Login extends JFrame implements ActionListener, KeyListener, MouseListener, MouseMotionListener{
    
    public static String userName="";
    int marker=0;
    JPanel bannerP = new JPanel();
    JLabel banner = new JLabel(new ImageIcon("pics\\banner.png"));
    JPanel mainP = new JPanel();
    JPanel backP = new JPanel();
    JButton okaybtn = new JButton("okay");
    JButton exitbtn = new JButton("exit");
    JButton aboutbtn = new JButton("about");
    JPanel pR = new JPanel();
    JPanel pL = new JPanel();
    JLabel enterName = new JLabel("Enter Your Name");
    JLabel bakodL = new JLabel(new ImageIcon("pics\\pencilsL.png"));
    JLabel bakodR = new JLabel(new ImageIcon("pics\\pencilsR.png"));
    JLabel signs = new JLabel(new ImageIcon("pics\\signs.png"));
    JLabel want = new JLabel(new ImageIcon("pics\\want.png"));
    JTextField logtxt = new JTextField("Ex. Kyle");
    JLabel arrR = new JLabel("->");
    JLabel arrL = new JLabel("<-");
    JLabel under = new JLabel("______________");
    JLabel back = new JLabel(new ImageIcon("pics\\back.png"));
    
    Login()
    {
        setTitle("MULTIPLICAION TUTOR");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        this.revalidate();
        bannerP.setBackground(Color.darkGray);
        backP.setBackground(Color.darkGray);
        pR.setBackground(Color.darkGray);
        pL.setBackground(Color.darkGray);
        mainP.setBackground(new Color(51,102,0));
        mainP.setBorder(new TitledBorder(""));
        enterName.setForeground(new Color(204,204,204));
        enterName.setFont(new Font("CHAWP",Font.BOLD,70));
        mainP.setLayout(null);
        mainP.setPreferredSize(new Dimension(870,540));
        logtxt.setBackground(new Color(51,102,0));
        logtxt.setForeground(new Color(204,204,204));
        logtxt.setFont(new Font("CHAWP",Font.PLAIN,60));
        logtxt.setCaretColor(new Color(204,204,204));
        logtxt.setHorizontalAlignment(JLabel.CENTER);
        arrR.setFont(new Font("CHAWP",Font.BOLD,70));
        arrL.setFont(new Font("CHAWP",Font.BOLD,70));
        arrR.setForeground(new Color(204,204,204));
        arrL.setForeground(new Color(204,204,204));
        under.setFont(new Font("Century Gothic",Font.BOLD,70));
        under.setForeground(new Color(204,204,204));
        okaybtn.setBackground(new Color(51,102,0));
        okaybtn.setForeground(new Color(204,204,204));
        okaybtn.setPreferredSize(new Dimension(200,40));
        okaybtn.setFont(new Font("CHAWP",Font.PLAIN,50));
        exitbtn.setBackground(new Color(51,102,0));
        exitbtn.setForeground(new Color(204,204,204));
        exitbtn.setPreferredSize(new Dimension(70,40));
        exitbtn.setFont(new Font("CHAWP",Font.PLAIN,15));
        aboutbtn.setFont(new Font("CHAWP",Font.PLAIN,15));
        aboutbtn.setForeground(new Color(204,204,204));
        aboutbtn.setBackground(new Color(51,102,0));
        //bounds
        enterName.setBounds(100,70,750,100);
        logtxt.setBounds(186,170,500,80);
        under.setBounds(188,177,500,80);
        okaybtn.setBounds(385,270,116,50);
        exitbtn.setBounds(30,500,36,16);
        aboutbtn.setBounds(780,500,55,16);
        //signs.setBounds(10,300,100,100);
        arrR.setBounds(90,200,100,50);
        arrL.setBounds(710,200,100,50);
        back.setBounds(0,0,870,540);
        //bounds
        //border
        okaybtn.setOpaque(false);
        okaybtn.setBorderPainted(false);
        okaybtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        okaybtn.setFocusPainted(false);
        aboutbtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        aboutbtn.setOpaque(false);
        aboutbtn.setBorderPainted(false);
        aboutbtn.setFocusPainted(false);
        exitbtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        exitbtn.setOpaque(false);
        exitbtn.setBorderPainted(false);
        exitbtn.setFocusPainted(false);
        logtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
        logtxt.setBorder(BorderFactory.createLoweredBevelBorder());
        logtxt.setOpaque(false);
        //logtxt.setBorder(BorderFactory.createEtchedBorder());
        logtxt.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        mainP.setBorder(BorderFactory.createLineBorder(new Color(187,155,88), 10));
        //border
        bannerP.add(banner);
        pR.add(bakodR);
        pL.add(bakodL);
        
        
        mainP.add(enterName);
        mainP.add(logtxt);
        mainP.add(okaybtn);
        mainP.add(exitbtn);
        mainP.add(aboutbtn);
        //mainP.add(signs);
        mainP.add(want);
        mainP.add(arrR);
        mainP.add(arrL);
        mainP.add(under);
        mainP.add(back);
        backP.add(mainP,BorderLayout.CENTER);
        add(pL,BorderLayout.WEST);
        add(pR,BorderLayout.EAST);
        
        
        
        add(backP);
        add(bannerP,BorderLayout.NORTH);
        
       //tooltip
       aboutbtn.setToolTipText("Meet your Programmer");
       exitbtn.setToolTipText("Exit?");
       okaybtn.setToolTipText("Enter?");
       logtxt.setToolTipText("Enter Your Name");
       //tooltip
        
        
        
        okaybtn.addActionListener(this);
        exitbtn.addActionListener(this);
        aboutbtn.addActionListener(this);
        logtxt.addKeyListener(this);
        logtxt.addMouseListener(this);
        
        okaybtn.addMouseMotionListener(this);
        exitbtn.addMouseMotionListener(this);
        aboutbtn.addMouseMotionListener(this);
        logtxt.addMouseMotionListener(this);
        logtxt.addMouseMotionListener(this);
        addMouseMotionListener(this);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                MusicApp(Main.sound);
                int y = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Exit?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pics\\iyak.gif"));
                if(y==0)
                {
                    MusicApp(Main.sound);
                    System.exit(0);
                }
                MusicApp(Main.sound);
            }
        });
    }//constr
    public static void main(String[] args) {
        
        try{
            Thread.sleep(3599);
        }catch(Exception e)
        {
            
        }
        Login login = new Login();
        
    }//main
    public void actionPerformed(ActionEvent e) {
         
        Object src = new Object();
        src = e.getSource();
        String copy = logtxt.getText();
        if(src.equals(okaybtn))
        {
            MusicApp(Main.sound);
            if("".equals(copy) || "Ex. Kyle".equalsIgnoreCase(copy))
            {
                arrR.setForeground(Color.red);
                arrL.setForeground(Color.red);
            }
            else
            {
                userName = logtxt.getText();
                Main main = new Main();
                main.setVisible(true);
                dispose();
            }
        }
        else if(src.equals(exitbtn))
        {
            MusicApp(Main.sound);
            int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Exit?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pics\\iyak.gif"));
            if(x==0)
            {
                MusicApp(Main.sound);
                System.exit(0);
            }
            MusicApp(Main.sound);
        }
        if(src.equals(aboutbtn))
        {
            MusicApp(Main.sound);
            About about = new About();
            about.setVisible(true);
            about.setAlwaysOnTop(true);
        }
    }//action
    public void keyTyped(KeyEvent ke) {
        if(ke.getSource().equals(logtxt))
        {
            if(marker==0)
            {
            logtxt.setText("");
            marker=1;
            }
        }
        
    }
    public void keyPressed(KeyEvent ke) {
        if(ke.getSource().equals(logtxt))
        {
            if(marker==0)
            {
            logtxt.setText("");
            marker=1;
            }
        }
    }
    public void mouseClicked(MouseEvent me) {
        if(me.getSource().equals(logtxt))
        {
            if(marker==0)
            {
            logtxt.setText("");
            marker=1;
            }
        }
    }
    public void mousePressed(MouseEvent me) {
        if(me.getSource().equals(logtxt))
        {
            if(marker==0)
            {
            logtxt.setText("");
            marker=1;
            }
        }
    }
    public void keyReleased(KeyEvent ke) {
        
    }
    public void mouseReleased(MouseEvent me) {
        
    }
    public void mouseEntered(MouseEvent me) {
        
    }
    public void mouseExited(MouseEvent me) {
        
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        if(me.getSource().equals(aboutbtn))
            {
                aboutbtn.setForeground(Color.white);
            }
        else
            {
                aboutbtn.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(exitbtn))
            {
                exitbtn.setForeground(Color.white);
            }
        else
            {
                exitbtn.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(okaybtn))
            {
                okaybtn.setForeground(Color.white);
            }
        else
            {
                okaybtn.setForeground(new Color(204,204,204));
            }
    }
    
    
}//class
