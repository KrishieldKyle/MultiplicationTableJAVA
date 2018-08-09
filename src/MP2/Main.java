
package MP2;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main extends JFrame implements ActionListener, KeyListener, MouseMotionListener{
    
    public static File sound = new File("click.wav");
    public static File bgsound = new File("Dreamy.wav");
    JPanel bannerP = new JPanel();
    JLabel banner = new JLabel(new ImageIcon("pics\\banner.png"));
    JPanel mainP = new JPanel();
    JPanel backP = new JPanel();
    JPanel pR = new JPanel();
    JPanel pL = new JPanel();
    JLabel bakodL = new JLabel(new ImageIcon("pics\\pencilsL.png"));
    JLabel bakodR = new JLabel(new ImageIcon("pics\\pencilsR.png"));
    JLabel signs = new JLabel(new ImageIcon("pics\\signs.png"));
    JLabel wel = new JLabel("Welcome ");
    JLabel not = new JLabel("if this is not you, ");
    JButton click = new JButton("Click HERE");
    JButton aboutbtn = new JButton("about");
    JButton howbtn = new JButton("How to Play");
    JTextField table[] = new JTextField[200];
    JPanel tableP = new JPanel();
    JButton exitbtn = new JButton("exit");
    JButton check = new JButton("Check Answer");
    JButton okay = new JButton("OK");
    JButton show = new JButton("Show Answer");
    JButton assess = new JButton("My Score");
    JButton auto = new JButton("Auto Fill-up");
    JButton reset = new JButton("Reset Answers");
    JButton goback = new JButton("go back");
    JButton start = new JButton("Start a new one");
    JLabel row = new JLabel("number of rows: ");
    JLabel col = new JLabel("number of columns: ");
    JTextField rowtxt = new JTextField("");
    JTextField coltxt = new JTextField("");
    JTextField we = new JTextField("");
    JLabel your = new JLabel("Your assessment");
    JLabel correct = new JLabel("Number of Correct answer(s): ");
    JLabel wrong = new JLabel("Number of wrong answer(s): ");
    JLabel unans = new JLabel("Number of unanswered question(s): ");
    JLabel cell = new JLabel("Number of question(s): ");
    JLabel confe = new JLabel(new ImageIcon("pics\\confe.gif"));
    JLabel confe2 = new JLabel(new ImageIcon("pics\\confe2.gif"));
    JLabel confe3 = new JLabel(new ImageIcon("pics\\confe2.gif"));
    JLabel confe4 = new JLabel(new ImageIcon("pics\\confe2.gif"));
    JLabel confe5= new JLabel(new ImageIcon("pics\\confe2.gif"));
    JLabel confe6 = new JLabel(new ImageIcon("pics\\confe2.gif"));
    JLabel confe7 = new JLabel(new ImageIcon("pics\\confe2.gif"));
    JLabel back = new JLabel(new ImageIcon("pics\\back.png"));
    UIManager UI=new UIManager();
    JTextField scoretxt = new JTextField("");
    JPanel legend = new JPanel();
    JPanel showlegend = new JPanel();
    JPanel checklegend = new JPanel();
    JTextField invalet=new JTextField("ABC");
    JLabel boldB = new JLabel("BOLD BLACK");
    JLabel boldR = new JLabel("BOLD RED");
    JTextField pink = new JTextField("123");
    JTextField white = new JTextField("123");
    JLabel boldRlbl = new JLabel("-  Wrong");
    JLabel boldBlbl = new JLabel("-  Correct ");
    JTextField boldwhite = new JTextField("");
    JLabel boldlbl = new JLabel("-  Unanswered");
    JLabel invaletlbl = new JLabel("-       Invalid Input");
    JLabel pinklbl = new JLabel("-  Replaced Answer");
    JLabel bluelbl = new JLabel("-  Unanswered");
    JLabel whitelbl = new JLabel("-  Correct Answer");
    JTextField blue = new JTextField("123");
    int n1=0,n2=0;
    int ano=0;
    int ctr=0;
    int over=0;
    int wrongctr=0;
    int unansctr=0;
    boolean key=true;
    boolean key2=true;
    String Colstr="";
    String Rowstr="";
    Main()
    {
        //CustomCursor();
        setVisible(true);
        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        wel.setText("Welcome "+ Login.userName);
        setTitle(wel.getText());
        bannerP.setBackground(Color.darkGray);
        backP.setBackground(Color.darkGray);
        pR.setBackground(Color.darkGray);
        pL.setBackground(Color.darkGray);
        mainP.setBackground(new Color(51,102,0));
        mainP.setBorder(new TitledBorder(""));
        mainP.setLayout(null);
        mainP.setPreferredSize(new Dimension(870,540));
        wel.setFont(new Font("CHAWP",Font.BOLD,20));
        wel.setForeground(new Color(204,204,204));
        not.setFont(new Font("CHAWP",Font.PLAIN,10));
        not.setForeground(new Color(204,204,204));
        click.setFont(new Font("CHAWP",Font.PLAIN,10));
        click.setForeground(new Color(204,204,204));
        click.setPreferredSize(new Dimension(100,20));
        click.setBackground(new Color(51,102,0));
        aboutbtn.setFont(new Font("CHAWP",Font.PLAIN,15));
        aboutbtn.setForeground(new Color(204,204,204));
        aboutbtn.setBackground(new Color(51,102,0));
        howbtn.setFont(new Font("CHAWP",Font.PLAIN,15));
        howbtn.setForeground(new Color(204,204,204));
        howbtn.setBackground(new Color(51,102,0));
        tableP.setPreferredSize(new Dimension(530,400));
        tableP.setBackground(new Color(51,102,0));
        tableP.setBorder(new TitledBorder(""));
        exitbtn.setBackground(new Color(51,102,0));
        exitbtn.setForeground(new Color(204,204,204));
        exitbtn.setPreferredSize(new Dimension(70,40));
        exitbtn.setFont(new Font("CHAWP",Font.PLAIN,15));
        rowtxt.setFont(new Font("CHAWP",Font.BOLD,15));
        coltxt.setFont(new Font("CHAWP",Font.BOLD,15));
        coltxt.setBackground(new Color(51,102,0));
        coltxt.setForeground(new Color(204,204,204));
        coltxt.setCaretColor(new Color(204,204,204));
        rowtxt.setBackground(new Color(51,102,0));
        rowtxt.setForeground(new Color(204,204,204));
        rowtxt.setCaretColor(new Color(204,204,204));
        row.setFont(new Font("CHAWP",Font.PLAIN,15));
        row.setForeground(new Color(204,204,204));
        col.setFont(new Font("CHAWP",Font.PLAIN,15));
        col.setForeground(new Color(204,204,204));
        coltxt.setHorizontalAlignment(JLabel.CENTER);
        rowtxt.setHorizontalAlignment(JLabel.CENTER);
        okay.setForeground(new Color(153,153,0));
        okay.setBackground(new Color(255,255,0));
        okay.setFont(new Font("CHAWP",Font.PLAIN,20));
        okay.setForeground(new Color(204,204,204));
        check.setFont(new Font("CHAWP",Font.PLAIN,20));
        show.setFont(new Font("CHAWP",Font.PLAIN,20));
        assess.setFont(new Font("CHAWP",Font.PLAIN,20));
        check.setBackground(new Color(51,102,0));
        show.setBackground(new Color(51,102,0));
        assess.setBackground(new Color(51,102,0));
        check.setForeground(new Color(204,204,204));
        show.setForeground(new Color(204,204,204));
        assess.setForeground(new Color(204,204,204));
        auto.setForeground(new Color(204,204,204));
        reset.setForeground(new Color(204,204,204));
        auto.setFont(new Font("CHAWP",Font.PLAIN,15));
        reset.setFont(new Font("CHAWP",Font.PLAIN,15));
        reset.setBackground(new Color(51,102,0));
        auto.setBackground(new Color(51,102,0));
        goback.setBackground(new Color(51,102,0));
        goback.setFont(new Font("CHAWP",Font.PLAIN,15));
        goback.setForeground(new Color(204,204,204));
        start.setBackground(new Color(51,102,0));
        start.setFont(new Font("CHAWP",Font.PLAIN,15));
        start.setForeground(new Color(204,204,204));
        your.setFont(new Font("CHAWP",Font.PLAIN,50));
        your.setForeground(new Color(204,204,204));
        correct.setFont(new Font("CHAWP",Font.PLAIN,15));
        correct.setForeground(new Color(204,204,204));
        wrong.setFont(new Font("CHAWP",Font.PLAIN,15));
        wrong.setForeground(new Color(204,204,204));
        unans.setFont(new Font("CHAWP",Font.PLAIN,15));
        unans.setForeground(new Color(204,204,204));
        cell.setFont(new Font("CHAWP",Font.PLAIN,15));
        cell.setForeground(new Color(204,204,204));
        //legend
        legend.setBackground(new Color(51,102,0));
        legend.setLayout(null);
        legend.setVisible(false);
        showlegend.setBackground(new Color(51,102,0));
        showlegend.setLayout(null);
        checklegend.setBackground(new Color(51,102,0));
        checklegend.setLayout(null);
        pink.setBackground(new Color(255,153,153));
        pink.setForeground(Color.black);
        pink.setFont(new Font("Century Gothic",Font.BOLD,20));
        pink.setEditable(false);
        white.setForeground(Color.black);
        white.setFont(new Font("Century Gothic",Font.BOLD,20));
        white.setEditable(false);
        boldB.setForeground(Color.black);
        boldB.setFont(new Font("Century Gothic",Font.BOLD,15));
        boldR.setForeground(Color.red);
        boldR.setFont(new Font("Century Gothic",Font.BOLD,15));
        invalet.setForeground(Color.black);
        invalet.setFont(new Font("Century Gothic",Font.PLAIN,20));
        invalet.setBorder(BorderFactory.createLineBorder(Color.red));
        invalet.setEditable(false);
        invalet.setBackground(Color.white);
        boldRlbl.setFont(new Font("Century Gothic",Font.PLAIN,15));
        boldBlbl.setFont(new Font("Century Gothic",Font.PLAIN,15));
        invaletlbl.setFont(new Font("Century Gothic",Font.PLAIN,15));
        pinklbl.setFont(new Font("Century Gothic",Font.PLAIN,15));
        boldRlbl.setForeground(new Color(204,204,204));
        boldBlbl.setForeground(new Color(204,204,204));
        invaletlbl.setForeground(new Color(204,204,204));
        pinklbl.setForeground(new Color(204,204,204));
        blue.setForeground(new Color(102,102,255));
        blue.setForeground(Color.black);
        blue.setFont(new Font("Century Gothic",Font.BOLD,20));
        blue.setEditable(false);
        bluelbl.setForeground(new Color(204,204,204));
        bluelbl.setFont(new Font("Century Gothic",Font.PLAIN,15));
        whitelbl.setForeground(new Color(204,204,204));
        whitelbl.setFont(new Font("Century Gothic",Font.PLAIN,15));
        blue.setBackground(new Color(102,102,255));
        boldwhite.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        boldwhite.setEditable(false);
        boldlbl.setFont(new Font("Century Gothic",Font.PLAIN,15));
        boldlbl.setForeground(new Color(204,204,204));
        
        //legend
        check.setVisible(false);
        show.setVisible(false);
        assess.setVisible(false);
        auto.setVisible(false);
        reset.setVisible(false);
        confe.setVisible(false);
        show.setVisible(false);
        //bounds
        wel.setBounds(20,20,350,25);
        not.setBounds(20,30,150,10);
        click.setBounds(115,30,60,10);
        aboutbtn.setBounds(780,500,55,18);
        howbtn.setBounds(400,500,99,18);
        tableP.setBounds(300,60,550,420);
        exitbtn.setBounds(30,500,38,18);
        row.setBounds(45,117,200,20);
        rowtxt.setBounds(208,110,50,25);
        col.setBounds(45,147,200,20);
        coltxt.setBounds(208,140,50,25);
        okay.setBounds(208,170,50,25);
        check.setBounds(50,230,200,30);
        show.setBounds(50,270,200,30);
        legend.setBounds(40,310,230,168);
        assess.setBounds(50,310,200,30);
        auto.setBounds(360,33,109,18);
        reset.setBounds(630,33,121,18);
        confe.setBounds(45,200,200,200);
        back.setBounds(0,0,870,540);
        invalet.setBounds(10,20,45,20);
        invaletlbl.setBounds(70,20,150,20);
        //checklegend
        checklegend.setBounds(40,380,230,100);
        boldB.setBounds(10,20,100,20);
        boldBlbl.setBounds(120,20,100,20);
        boldR.setBounds(10,70,100,20);
        boldRlbl.setBounds(120,70,100,20);
        
        
        boldB.setBounds(10,20,100,20);
        boldBlbl.setBounds(110,20,100,20);
        boldR.setBounds(10,45,100,20);
        boldRlbl.setBounds(110,45,100,20);
        boldwhite.setBounds(10,70,45,20);
        boldlbl.setBounds(110,70,150,20);
        checklegend.setVisible(false);
        //checklegend
        //showlegend
        showlegend.setBounds(40,380,230,100);
        white.setBounds(10,20,45,20);
        whitelbl.setBounds(70,20,150,20);
        pink.setBounds(10,45,45,20);
        pinklbl.setBounds(70,45,150,20);
        blue.setBounds(10,70,45,20);
        bluelbl.setBounds(70,70,150,20);
        showlegend.setVisible(false);
        //showlegend
        //signs.setBounds(10,300,100,100);
        //bounds
        //border
        //okay.setBorder(BorderFactory.createEtchedBorder());
        click.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        okay.setBorder(BorderFactory.createLoweredSoftBevelBorder());
        okay.setFocusPainted(false);
        okay.setOpaque(false);
        okay.setBorderPainted(false);
        aboutbtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        aboutbtn.setOpaque(false);
        aboutbtn.setBorderPainted(false);
        aboutbtn.setFocusPainted(false);
        exitbtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        exitbtn.setOpaque(false);
        exitbtn.setBorderPainted(false);
        exitbtn.setFocusPainted(false);
        check.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        check.setOpaque(false);
        check.setBorderPainted(false);
        check.setFocusPainted(false);
        show.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        show.setOpaque(false);
        show.setBorderPainted(false);
        show.setFocusPainted(false);
        assess.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        assess.setOpaque(false);
        assess.setBorderPainted(false);
        assess.setFocusPainted(false);
        howbtn.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        howbtn.setOpaque(false);
        howbtn.setBorderPainted(false);
        howbtn.setFocusPainted(false);
        reset.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        reset.setOpaque(false);
        reset.setBorderPainted(false);
        reset.setFocusPainted(false);
        auto.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        auto.setOpaque(false);
        auto.setBorderPainted(false);
        auto.setFocusPainted(false);
        start.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        start.setOpaque(false);
        start.setBorderPainted(false);
        start.setFocusPainted(false);
        goback.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        goback.setOpaque(false);
        goback.setBorderPainted(false);
        goback.setFocusPainted(false);
        mainP.setBorder(BorderFactory.createLineBorder(new Color(187,155,88), 10));
        tableP.setBorder(BorderFactory.createEtchedBorder());
        tableP.setOpaque(false);
        coltxt.setOpaque(false);
        rowtxt.setOpaque(false);
        scoretxt.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        scoretxt.setOpaque(false);
        scoretxt.setEditable(false);
        coltxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
        rowtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
        white.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        pink.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        blue.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        legend.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(),"LEGEND", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("CHAWP",Font.PLAIN,15), new Color(204,204,204)));
        legend.setOpaque(false);
        showlegend.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(100),"SHOW ANSWER LEGEND", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("CHAWP",Font.PLAIN,15), new Color(204,204,204)));
        showlegend.setOpaque(false);
        checklegend.setBorder(BorderFactory.createTitledBorder(new EtchedBorder(100),"CHECK ANSWER LEGEND", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("CHAWP",Font.PLAIN,15), new Color(204,204,204)));
        checklegend.setOpaque(false);
        //border
        
        //for
          for(int x=0; x<121; x++)
          {
              table[x] = new JTextField("");
              table[0].setText("X");
              table[0].setEditable(false);
              table[0].setEnabled(false);
              table[x].setFont(new Font("Century Gothic",Font.PLAIN,20));
              table[0].setFont(new Font("CHAWP",Font.BOLD,40));
              table[x].setHorizontalAlignment(JLabel.CENTER);
              
              //table[x].setBackground(new Color(51,102,0));
          }
        //for
        bannerP.add(banner);
        pR.add(bakodR);
        pL.add(bakodL);
        mainP.add(tableP);
        mainP.add(aboutbtn);
        mainP.add(wel);
        mainP.add(exitbtn);
        mainP.add(row);
        mainP.add(col);
        mainP.add(rowtxt);
        mainP.add(coltxt);
        mainP.add(okay);
        mainP.add(check);
        mainP.add(show);
        mainP.add(assess);
        mainP.add(howbtn);
        mainP.add(auto);
        mainP.add(reset);
        mainP.add(confe);
        mainP.add(back);
        //mainP.add(legend);
            legend.add(boldB);
            legend.add(boldR);
            legend.add(invalet);
            legend.add(pink);
            legend.add(boldBlbl);
            legend.add(boldRlbl);
            legend.add(invaletlbl);
            legend.add(pinklbl);
            legend.add(bluelbl);
            legend.add(blue);
        mainP.add(checklegend);
            checklegend.add(boldB);
            checklegend.add(boldBlbl);
            checklegend.add(boldRlbl);
            checklegend.add(boldR);
            checklegend.add(boldwhite);
            checklegend.add(boldlbl);
        mainP.add(showlegend);
            showlegend.add(pink);
            showlegend.add(pinklbl);
            showlegend.add(bluelbl);
            showlegend.add(blue);
            showlegend.add(white);
            showlegend.add(whitelbl);
        backP.add(mainP,BorderLayout.CENTER);
        
        add(pL,BorderLayout.WEST);
        add(pR,BorderLayout.EAST);
        add(backP);
        add(bannerP,BorderLayout.NORTH);
       //actionlistener
       click.addActionListener(this);
       aboutbtn.addActionListener(this);
       exitbtn.addActionListener(this);
       okay.addActionListener(this);
       check.addActionListener(this);
       show.addActionListener(this);
       auto.addActionListener(this);
       reset.addActionListener(this);
       assess.addActionListener(this);
       howbtn.addActionListener(this);
       start.addActionListener(this);
       goback.addActionListener(this);
       //actionlistener
       //motion
       aboutbtn.addMouseMotionListener(this);
       exitbtn.addMouseMotionListener(this);
       okay.addMouseMotionListener(this);
       check.addMouseMotionListener(this);
       show.addMouseMotionListener(this);
       auto.addMouseMotionListener(this);
       reset.addMouseMotionListener(this);
       assess.addMouseMotionListener(this);
       howbtn.addMouseMotionListener(this);
       start.addMouseMotionListener(this);
       goback.addMouseMotionListener(this);
       //coltxt.addMouseMotionListener(this);
       //rowtxt.addMouseMotionListener(this);
       addMouseMotionListener(this);
       //motion
       //tooltip
       aboutbtn.setToolTipText("Meet your Programmer");
       exitbtn.setToolTipText("Exit?");
       okay.setToolTipText("Generate Table");
       check.setToolTipText("Check your Answers");
       show.setToolTipText("Reveal Answers");
       auto.setToolTipText("Fill-up with Random numbers");
       reset.setToolTipText("Erase Answers");
       assess.setToolTipText("See your Assessment");
       howbtn.setToolTipText("Need Help?");
       start.setToolTipText("Create New?");
       goback.setToolTipText("Back?");
       rowtxt.setToolTipText("Input 1-10 only");
       coltxt.setToolTipText("Input 1-10 only");
       
       //tooltip
       
       //coltxt.addKeyListener(this);
       //rowtxt.addKeyListener(this);
       for(int x=1; x<121; x++)
       {
           table[x].addKeyListener(this);
           table[x].addMouseMotionListener(this);
       }
       
       this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                MusicApp(sound);
                int y = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Exit?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pics\\iyak.gif"));
                if(y==0)
                {
                    MusicApp(sound);
                    System.exit(0);
                }
                MusicApp(sound);
            }
        });
       
    }//constr
    public static void main(String[] args) {
        Login login = new Login();
    }//main
    @Override
    public void actionPerformed(ActionEvent e) {
         
        Object src = new Object();
        src = e.getSource();
     
        if(src.equals(exitbtn))
        {
            MusicApp(sound);
            int x = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Exit?", "EXIT", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pics\\iyak.gif"));
            if(x==0)
            {
                MusicApp(sound);
                System.exit(0);
            }
           MusicApp(sound);
        }//exit
        if(src.equals(aboutbtn))
        {
            MusicApp(sound);
            About about = new About();
            about.setVisible(true);
            about.setAlwaysOnTop(true);
        }//about
        if(src.equals(okay))
        {
            MusicApp(sound);
            try{
                for(int q=1; q<121; q++)
            {
                table[q].setText("");
                table[q].setFont(new Font("Century Gothic",Font.PLAIN,20));
                table[q].setForeground(Color.black);
                table[q].setVisible(true);
                table[q].setEditable(true);
            }
            int mark=0;
            tableP.removeAll();
            Rowstr = rowtxt.getText().replaceAll(" ", "");
            Colstr = coltxt.getText().replaceAll(" ", "");
            int cols = Integer.parseInt(Rowstr);
            int rows = Integer.parseInt(Colstr);
            
            rowtxt.setText(Rowstr);
            coltxt.setText(Colstr);
            if(cols>10 || rows>10 || cols<1 || rows<1)
            {
                JOptionPane.showMessageDialog(null, "Please Input Range from 1-10 ONLY", "RANGE LIMIT", JOptionPane.INFORMATION_MESSAGE);
                MusicApp(sound);
                this.revalidate();
                check.setVisible(false);
                assess.setVisible(false);
                auto.setVisible(false);
                reset.setVisible(false);
                confe.setVisible(false);
                legend.setVisible(false);
                show.setVisible(false);
                tableP.removeAll();
                tableP.revalidate();
                tableP.updateUI();
                mark=1;
            }
            if(cols>10 || cols<1)
            {
                rowtxt.setBorder(BorderFactory.createLineBorder(Color.red));
            }
            else
            {
                rowtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
            }
             if(rows>10 || rows<1)
            {
                coltxt.setBorder(BorderFactory.createLineBorder(Color.red));
            }
            else
            {
                coltxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
            }
            if(mark==0)
            {
            n1 = Integer.parseInt(Rowstr);
            n2 = Integer.parseInt(Colstr);
            n1+=1;
            n2+=1;
            key=true;
            coltxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
            rowtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
            confe.setVisible(false);
            check.setVisible(false);
            assess.setVisible(false);
            auto.setVisible(true);
            reset.setVisible(true);
            legend.setVisible(true);
            checklegend.setVisible(false);
            showlegend.setVisible(false);
            show.setVisible(false);
            rows+=1;
            cols+=1;
            ctr=0;
            over=0;
            wrongctr=0;
            unansctr=0;
            this.revalidate();
            tableP.updateUI();
            int times=rows*cols;
            tableP.setLayout(new GridLayout(rows,cols,5,5));
            for(int x=0; x<times; x++)
            {
                tableP.add(table[x]);
                table[x].setBackground(Color.white);
                table[x].setForeground(Color.black);
                table[x].setCaretColor(Color.black);
                
                this.revalidate();
            }
            for(int s=1; s<times; s++)
            {
                table[s].setFont(new Font("Century Gothic",Font.PLAIN,20));
            }
            times=0;
            //color
            int r = cols;
            for(int y=1; y<rows; y++)
            {
                table[r].setBorder(BorderFactory.createLineBorder(Color.white));
                for(int x=1; x<cols; x++ )
                {
                    table[r+x].setBackground(Color.white);
                    table[x].setBorder(BorderFactory.createLineBorder(Color.white));  
                    table[r+x].setBorder(BorderFactory.createLineBorder(Color.black));
                    table[x].setBackground(new Color(51,51,51));
                    table[r].setBackground(new Color(51,51,51));
                    table[r].setForeground(Color.white);
                    table[x].setForeground(Color.white);
                    table[r].setCaretColor(Color.white);
                    table[x].setCaretColor(Color.white);
                    table[x].setFont(new Font("Century Gothic",Font.BOLD,20));
                    table[r].setFont(new Font("Century Gothic",Font.BOLD,20));
                    table[r+x].setVisible(false);
                    tableP.updateUI();
                    this.revalidate();
                    tableP.updateUI();
                }//for
                r=r+cols;
            }
            rows=0;
            cols=0;
            //color
            }//else
            }catch(NumberFormatException a)
            {
                if(coltxt.getText().equals("") && rowtxt.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "No input", "NOTICE", JOptionPane.INFORMATION_MESSAGE);
                    MusicApp(sound);
                    coltxt.setBorder(BorderFactory.createLineBorder(Color.red));
                    rowtxt.setBorder(BorderFactory.createLineBorder(Color.red));
                    check.setVisible(false);
                    assess.setVisible(false);
                    auto.setVisible(false);
                    reset.setVisible(false);
                    tableP.removeAll();
                    tableP.revalidate();
                    tableP.updateUI();
                }
                else if(coltxt.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Input number of COLUMNS", "COLUMN", JOptionPane.INFORMATION_MESSAGE);
                    MusicApp(sound);
                    coltxt.setBorder(BorderFactory.createLineBorder(Color.red));
                    rowtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
                    check.setVisible(false);
                    assess.setVisible(false);
                    auto.setVisible(false);
                    reset.setVisible(false);
                    tableP.removeAll();
                    tableP.revalidate();
                    tableP.updateUI();
                }
                else if(rowtxt.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Please Input number of ROWS", "ROW", JOptionPane.INFORMATION_MESSAGE);
                    MusicApp(sound);
                    rowtxt.setBorder(BorderFactory.createLineBorder(Color.red));
                    coltxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
                    check.setVisible(false);
                    assess.setVisible(false);
                    auto.setVisible(false);
                    reset.setVisible(false);
                    tableP.removeAll();
                    tableP.revalidate();
                    tableP.updateUI();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please Input NUMBERS ONLY", "NUMBERS", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pics\\ABC.png"));
                    MusicApp(sound);
                    int len = rowtxt.getText().length();
                    for(int w=0; w<len; w++)
                    {
                        if(rowtxt.getText().charAt(w) == '0' || rowtxt.getText().charAt(w) == '1' || rowtxt.getText().charAt(w) == '2' || rowtxt.getText().charAt(w) == '3' || rowtxt.getText().charAt(w) == '4' || rowtxt.getText().charAt(w) == '5' || 
                                rowtxt.getText().charAt(w) == '6' || rowtxt.getText().charAt(w) == '7' || rowtxt.getText().charAt(w) == '8' || rowtxt.getText().charAt(w) == '9')
                        {
                            rowtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
                        }
                        else
                        {
                            rowtxt.setBorder(BorderFactory.createLineBorder(Color.red));
                            break;
                        }
                    }
                    int len2= coltxt.getText().length();
                    for(int w=0; w<len2; w++)
                    {
                        if(coltxt.getText().charAt(w) == '0' || coltxt.getText().charAt(w) == '1' || coltxt.getText().charAt(w) == '2' || coltxt.getText().charAt(w) == '3' || coltxt.getText().charAt(w) == '4' || coltxt.getText().charAt(w) == '5' || 
                                coltxt.getText().charAt(w) == '6' || coltxt.getText().charAt(w) == '7' || coltxt.getText().charAt(w) == '8' || coltxt.getText().charAt(w) == '9')
                        {
                            coltxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
                        }
                        else
                        {
                            coltxt.setBorder(BorderFactory.createLineBorder(Color.red));
                            break;
                        }
                    }
                    check.setVisible(false);
                    auto.setVisible(false);
                    assess.setVisible(false);
                    reset.setVisible(false);
                    tableP.removeAll();
                    tableP.revalidate();
                    tableP.updateUI();
                }
            }//catch
        }//okay
        if(src.equals(check))
        {
            MusicApp(sound);
            for(int y=1; y<121; y++)
            {
                if(!"".equals(table[y].getText()))
                {
                    table[y].setText(table[y].getText().replaceAll(" ", ""));
                }
            }
            try{
            int cols = Integer.parseInt(Rowstr);
            int rows = Integer.parseInt(Colstr);
            int adding = cols*rows;
            rows+=1;
            cols+=1;
            int r = cols;
            int times=rows*cols;
            int sum[]= new int[times];
            ctr=0;
            wrongctr=0;
            unansctr=0;
            over=0;
            for(int y=1; y<times; y++)
            {
                if(!"".equals(table[y].getText()))
                {
                    String pasa = table[y].getText().replaceAll(" ", "");
                    sum[y] = Integer.parseInt(pasa);
                    table[y].setText(pasa);
                }
            }
                //next
                for(int y=1; y<rows; y++)
                    {
                    table[r].setBorder(BorderFactory.createLineBorder(Color.white));     
                    for(int x=1; x<cols; x++)
                        {
                        table[x].setBorder(BorderFactory.createLineBorder(Color.white));
                        }
                     r=r+cols;
                    }//for
                    r = cols;
                //next
                int no=0;
                for(int y=1; y<rows; y++)
                {
                for(int x=1; x<cols; x++)
                    {
                        if(sum[x]*sum[r]==sum[r+x] && !"".equals(table[r+x].getText()) && !"".equals(table[x].getText()) && !"".equals(table[r].getText()))
                        {
                        table[r+x].setFont(new Font("Century Gothic",Font.BOLD,20));
                        table[r+x].setForeground(Color.black);
                        ctr++;
                        no=1;
                        }
                        else
                        {
                            table[r+x].setFont(new Font("Century Gothic",Font.PLAIN,20));
                            table[r+x].setForeground(Color.black);
                            if(!"".equals(table[r+x].getText()) && !"".equals(table[x].getText()) && !"".equals(table[r].getText()))
                            {
                                table[r+x].setFont(new Font("Century Gothic",Font.BOLD,20));
                                table[r+x].setForeground(Color.red);
                                wrongctr++;
                                no=1;
                            }
                        }
                        if("".equals(table[r+x].getText()) && !"".equals(table[r].getText()) && !"".equals(table[x].getText()))
                        {
                            unansctr++;
                            no=1;
                        }
                    }//for
                r=r+cols;
                }
                if(no==0)
                {
                    JOptionPane.showMessageDialog(null, "No ANSWERS to be CHECK", "CHECK ANSWER", JOptionPane.INFORMATION_MESSAGE);
                    MusicApp(sound);
                }
                else
                {
                checklegend.setVisible(true);
                showlegend.setVisible(false);
                key2=false;
                }
            ano=1;
            over=ctr+wrongctr+unansctr;
            assess.setVisible(false);
            r = cols;
            int ctrs=0;
            for(int y=1; y<rows; y++)
                {
                for(int x=1; x<cols; x++)
                    {
                    if(!"".equals(table[r].getText()) && !"".equals(table[x].getText()))
                        {
                            ctrs++;
                        }
                    }
                    r=r+cols;
                }//for
            if(ctrs==adding)
            {
                assess.setVisible(true);
            }
            }catch(NumberFormatException c)
            {
                JOptionPane.showMessageDialog(null, "Please Input NUMBERS ONLY", "NUMBERS", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pics\\ABC.png"));
                MusicApp(sound);
            }
        }//check
        if(src.equals(show))
        {
            MusicApp(sound);
            try{
            int cols = Integer.parseInt(Rowstr);
            int rows = Integer.parseInt(Colstr);
            int ilan = cols+rows;
            int rr=0,cc=0,marker=0;
            rows+=1;
            cols+=1;
            int r = cols;
            int times=rows*cols;
            int sum[]= new int[times];
            int add=0;
            for(int g=1; g<times; g++)
            {
                table[g].setText(table[g].getText().replaceAll(" ", ""));
            }
           
            for(int y=1; y<times; y++)
            {
                if(!"".equals(table[y].getText()) && table[y].getText().charAt(0) !='*')
                {
                    String pasa = table[y].getText();
                    sum[y] = Integer.parseInt(pasa);
                }
            }
            r = cols;
                for(int y=1; y<rows; y++)
                {
                     if("".equals(table[r].getText()))
                       {
                           rr=1;
                           break;
                       }
                    for(int x=1; x<cols; x++ )
                    {
                       if("".equals(table[x].getText()))
                       {
                           cc=1;
                           break;
                       }
                    }//for
                    r=r+cols;
                }//checking
                if(rr==0 && cc==0)
                {
                    marker=1;
                }
                if(marker==1)
                {
                String ask="*";
                r = cols;
                ctr=0;
                wrongctr=0;
                unansctr=0;
                over=0;
                check.setVisible(false);
                show.setVisible(false);
                reset.setVisible(false);
                auto.setVisible(false);
                assess.setVisible(true);
                coltxt.setEditable(false);
                rowtxt.setEditable(false);
                okay.setVisible(false);
                key=false;
                //adding
                r= cols;
                for(int y=1; y<rows; y++)
                {
                for(int x=1; x<cols; x++)
                    {
                        if(sum[x]*sum[r]==sum[r+x] && !"".equals(table[r+x].getText()) && !"".equals(table[x].getText()) && !"".equals(table[r].getText()))
                        {
                        ctr++;
                        }
                        else
                        {
                            if(!"".equals(table[r+x].getText()) && !"".equals(table[x].getText()) && !"".equals(table[r].getText()))
                            {
                                wrongctr++;
                            }
                        }
                        if("".equals(table[r+x].getText()) && !"".equals(table[r].getText()) && !"".equals(table[x].getText()))
                        {
                            unansctr++;
                        }
                    }//for
                r=r+cols;
                }
                ano=2;
                checklegend.setVisible(false);
                showlegend.setVisible(true);
                over=ctr+wrongctr+unansctr;
                //adding
                r= cols;
                for(int y=1; y<rows; y++)
                {
                    table[r].setEditable(false);
                    for(int x=1; x<cols; x++ )
                    {
                        table[x].setEditable(false);
                        table[r+x].setEditable(false);
                        if(!"".equals(table[r+x].getText()) && sum[x]*sum[r]!=sum[r+x])
                        {
                            add=sum[x]*sum[r];
                            table[r+x].setText(add+"");
                            table[r+x].setFont(new Font("Century Gothic",Font.BOLD,20));
                            table[r+x].setForeground(Color.black);
                            table[r+x].setBackground(new Color(255,153,153));
                        }
                        else if("".equals(table[r+x].getText()))
                        {
                            add=sum[x]*sum[r];
                            table[r+x].setText(add+"");
                            table[r+x].setFont(new Font("Century Gothic",Font.BOLD,20));
                            table[r+x].setForeground(Color.black);
                            table[r+x].setBackground(new Color(102,102,255));
                        }
                        else
                        {
                            add=sum[x]*sum[r];
                            table[r+x].setText(add+"");
                            table[r+x].setFont(new Font("Century Gothic",Font.BOLD,20));
                            table[r+x].setForeground(Color.black);
                            table[r+x].setBackground(Color.white);
                        }
                    }//for
                    r=r+cols;
                }
                }//marker
                else
                {
                    JOptionPane.showMessageDialog(null, "Please provide NUMBERS in the black box", "COMPLETE THE BLACK BOX", JOptionPane.INFORMATION_MESSAGE);
                    MusicApp(sound);
                }
            }catch(NumberFormatException c)
            {
                JOptionPane.showMessageDialog(null, "Please Input NUMBERS ONLY", "NUMBERS", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("pics\\ABC.png"));
                MusicApp(sound);
            }
        }//show
        if(src.equals(auto))
        {
            MusicApp(sound);
            int cols = Integer.parseInt(Rowstr);
            int rows = Integer.parseInt(Colstr);
            rows+=1;
            cols+=1;
            int r = cols;
            for(int y=1; y<rows; y++)
            {
                int randomR =(int)(Math.random()*(11));
                table[r].setText(randomR+"");
                for(int x=1; x<cols; x++ )
                {
                    int randomX =(int)(Math.random()*(11));
                    table[x].setText(randomX+"");
                    table[r+x].setVisible(true);
                    show.setVisible(true);
                    check.setVisible(true);
                    tableP.updateUI();
                    tableP.revalidate();
                }//for
                r=r+cols;
            }
            r = cols;
            for(int y=1; y<rows; y++)
                    { 
                    table[r].setBorder(BorderFactory.createLineBorder(Color.white));     
                    for(int x=1; x<cols; x++)
                        {
                        table[x].setBorder(BorderFactory.createLineBorder(Color.white));
                        }
                     r=r+cols;
                    }//for
            rows=0;
            cols=0;
        }//auto
        if(src.equals(reset))
        {
            MusicApp(sound);
            int cols = Integer.parseInt(Rowstr);
            int rows = Integer.parseInt(Colstr);
            int times=cols*rows;
            rows+=1;
            cols+=1;
            int mark=0;
            int r = cols;
            for(int y=1; y<rows; y++)
            {
                for(int x=1; x<cols; x++ )
                {
                    if(table[r+x].getText().equals(""))
                    {
                        mark++;
                    }
                    else
                    {
                   table[r+x].setText("");
                   table[r+x].setFont(new Font("Century Gothic",Font.PLAIN,20));
                   table[r+x].setForeground(Color.black);
                   table[r+x].setBorder(BorderFactory.createLineBorder(Color.black));
                   table[r+x].setBackground(Color.white);
                    }
                }//for
                r=r+cols;
            }
            if(mark==times)
            {
                JOptionPane.showMessageDialog(null, "All Answers are Empty", "RESET ANSWER", JOptionPane.INFORMATION_MESSAGE);
                MusicApp(sound);
            }
            rows=0;
            cols=0;
        }//reset
        if(src.equals(assess))
        {
            MusicApp(sound);
            JLabel score = new JLabel(ctr+"");
            JLabel overtxt = new JLabel(over+"");
            JLabel unanstxt = new JLabel(unansctr+"");
            JLabel wrongtxt = new JLabel(wrongctr+"");
            tableP.removeAll();
            tableP.updateUI();
            tableP.setLayout(null);
            confe.setVisible(true);
            legend.setVisible(false);
            tableP.add(your);
            tableP.add(score);
            tableP.add(overtxt);
            tableP.add(unanstxt);
            tableP.add(wrongtxt);
            tableP.add(confe2);
            tableP.add(confe3);
            tableP.add(confe4);
            tableP.add(confe5);
            tableP.add(confe6);
            tableP.add(confe7);
            tableP.add(scoretxt);
            tableP.add(correct);
            tableP.add(wrong);
            tableP.add(unans);
            tableP.add(cell);
            tableP.add(goback);
            tableP.add(start);
            checklegend.setVisible(false);
            showlegend.setVisible(false);
            score.setFont(new Font("CHAWP",Font.PLAIN,20));
            score.setForeground(new Color(204,204,204));
            wrongtxt.setFont(new Font("CHAWP",Font.PLAIN,20));
            wrongtxt.setForeground(new Color(204,204,204));
            unanstxt.setFont(new Font("CHAWP",Font.PLAIN,20));
            unanstxt.setForeground(new Color(204,204,204));
            overtxt.setFont(new Font("CHAWP",Font.PLAIN,20));
            overtxt.setForeground(new Color(204,204,204));
            goback.setBounds(10, 390, 100, 20);
            start.setBounds(380, 390, 140, 20);
            your.setBounds(50, 30, 700, 100);
            correct.setBounds(20, 130, 700, 100);
            wrong.setBounds(20, 160, 700, 100);
            unans.setBounds(20, 190, 700, 100);
            cell.setBounds(20, 220, 700, 100);
            score.setBounds(330, 130, 700, 100);
            wrongtxt.setBounds(330, 160, 700, 100);
            unanstxt.setBounds(330, 190, 700, 100);
            overtxt.setBounds(330, 220, 700, 100);
            confe2.setBounds(10, 230, 217, 100);
            confe3.setBounds(240, 230, 190, 100);
            confe4.setBounds(400, 230, 130, 100);
            confe5.setBounds(10, 130, 217, 100);
            confe6.setBounds(240, 130, 190, 100);
            confe7.setBounds(400, 130, 130, 100);
            for(int q=1; q<121; q++)
            {
                table[q].setEditable(false);
            }
            key=false;
            check.setVisible(false);
            show.setVisible(false);
            auto.setVisible(false);
            reset.setVisible(false);
            assess.setVisible(false);
            row.setVisible(false);
            col.setVisible(false);
            rowtxt.setVisible(false);
            coltxt.setVisible(false);
            okay.setVisible(false);
            tableP.updateUI();
        }//assess
        if(src.equals(howbtn))
        {
            MusicApp(sound);
            Howtoplay how = new Howtoplay();
            how.setVisible(true);
            how.setAlwaysOnTop(true);
        }
        if(src.equals(goback))
        {
            MusicApp(sound);
            tableP.removeAll();
            int cols = Integer.parseInt(Rowstr);
            int rows = Integer.parseInt(Colstr);
            rowtxt.setText(Rowstr);
            coltxt.setText(Colstr);
            coltxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
            rowtxt.setBorder(BorderFactory.createLineBorder(new Color(204,204,204)));
            confe.setVisible(false);
            check.setVisible(false);
            assess.setVisible(true);
            //auto.setVisible(true);
            //reset.setVisible(true);
            row.setVisible(true);
            col.setVisible(true);
            //show.setVisible(true);
            rowtxt.setVisible(true);
            coltxt.setVisible(true);
            legend.setVisible(true);
            rowtxt.setEditable(false);
            coltxt.setEditable(false);
            //okay.setVisible(true);
            if(ano==1)
            {
                checklegend.setVisible(true);
            }
            else if(ano==2)
            {
                showlegend.setVisible(true);
            }
            rows+=1;
            cols+=1;
            this.revalidate();
            tableP.updateUI();
            int times=rows*cols;
            tableP.setLayout(new GridLayout(rows,cols,5,5));
            for(int x=0; x<times; x++)
            {
                tableP.add(table[x]);
                this.revalidate();
            }
            times=0;
            //color
            int r = cols;
            for(int y=1; y<rows; y++)
            {
                table[r].setBorder(BorderFactory.createLineBorder(Color.white));
                for(int x=1; x<cols; x++ )
                {
                    table[x].setBorder(BorderFactory.createLineBorder(Color.white));  
                    table[x].setBackground(new Color(51,51,51));
                    table[r].setBackground(new Color(51,51,51));
                    table[r].setForeground(Color.white);
                    table[x].setForeground(Color.white);
                    table[r].setCaretColor(Color.white);
                    table[x].setCaretColor(Color.white);
                    this.revalidate();
                    tableP.updateUI();
                }//for
                r=r+cols;
            }
            rows=0;
            cols=0;
            //color
        }
        if(src.equals(start))
        {
            MusicApp(sound);
            row.setVisible(true);
            col.setVisible(true);
            rowtxt.setVisible(true);
            coltxt.setVisible(true);
            okay.setVisible(true);
            legend.setVisible(false);
            for(int q=1; q<121; q++)
            {
                table[q].setEditable(true);
            }
            coltxt.setEditable(true);
            rowtxt.setEditable(true);
            key=true;
            key2=true;
            rowtxt.setText("");
            coltxt.setText("");
            confe.setVisible(false);
            show.setVisible(false);
            checklegend.setVisible(false);
            showlegend.setVisible(false);
            tableP.removeAll();
            tableP.updateUI();
        }
    }//action
    public void CustomCursor()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image img = toolkit.getImage("pics\\cursor2.png");
        Point point = new Point(0, 0);
        Cursor cursor = toolkit.createCustomCursor(img, point, "pics\\cursor2");
        setCursor(cursor);
    }

    
    @Override
    public void keyTyped(KeyEvent ke) {
        
            int r = n1;
            if(key==true)
            {
            for(int y=1; y<n2; y++)
            {
                for(int x=1; x<n1; x++ )
                {
                    if(table[r+x].equals(ke.getSource()))
                    {
                    table[r+x].setForeground(Color.black);
                    table[r+x].setFont(new Font("Century Gothic",Font.PLAIN,20));
                    table[r+x].setBackground(Color.white);
                    }
                }//for
                r=r+n1;
            }
            }//key
    }//keytyped
    @Override
    public void keyPressed(KeyEvent ke) {
        
        int r = n1;
        
            for(int y=1; y<n2; y++)
            {
                for(int x=1; x<n1; x++ )
                {
                    if(!"".equals(table[r].getText()) && !"".equals(table[x].getText()))
                    {
                    table[r+x].setVisible(true);
                    tableP.updateUI();
                    tableP.revalidate();
                    }
                    else
                    {
                    table[r+x].setVisible(false);
                    table[r+x].setBorder(BorderFactory.createLineBorder(Color.black));
                    table[r+x].setForeground(Color.black);
                    table[r+x].setBackground(Color.white);
                    table[r+x].setFont(new Font("Century Gothic",Font.PLAIN,20));
                    table[r+x].setText("");
                    tableP.updateUI();
                    tableP.revalidate();
                    }
                }//for
                r=r+n1;
            }
        if(key==true)
        {
            r = n1;
           int mark1=0, mark2=0;
            for(int y=1; y<n2; y++)
            {
                if(!"".equals(table[r].getText()))
                    {
                        mark2=1;
                    }
                    else
                    {
                    mark2=0;
                    break;
                    }
                for(int x=1; x<n1; x++ )
                {
                    if(!"".equals(table[x].getText()))
                    {
                        mark1=1;
                    }
                    else
                    {
                    mark1=0;
                    break;
                    }
                }//for
                r=r+n1;
            }
            if(mark1==1 && mark2==1)
            {
                show.setVisible(true);
            }
            else
            {
                show.setVisible(false);
            }
            if(mark1==1 && mark2==1 && key2==false)
            {
                assess.setVisible(true);
            }
            else
            {
                assess.setVisible(false);
                key2=true;
            }
        }//key
    }//keypressed
    @Override
    public void keyReleased(KeyEvent ke) {
       
            int r = n1;
            r = n1;
            for(int y=1; y<n2; y++)
            {
                String str1 = table[r].getText().replaceAll(" ", "");
                table[r].setText(str1);
                for(int x=1; x<n1; x++ )
                {
                    String str2 = table[x].getText().replaceAll(" ", "");
                    table[x].setText(str2);
                    String str3 = table[r+x].getText().replaceAll(" ", "");
                    table[r+x].setText(str3);
                }//for
                r=r+n1;
            }
            r = n1;
            for(int y=1; y<n2; y++)
            {
                if(table[r].equals(ke.getSource()))
                {
                    int len = table[r].getText().length();
                    for(int w=0; w<len; w++)
                    {
                        if(table[r].getText().charAt(w) == '0' || table[r].getText().charAt(w) == '1' || table[r].getText().charAt(w) == '2' || table[r].getText().charAt(w) == '3' || table[r].getText().charAt(w) == '4' || table[r].getText().charAt(w) == '5' || 
                                table[r].getText().charAt(w) == '6' || table[r].getText().charAt(w) == '7' || table[r].getText().charAt(w) == '8' || table[r].getText().charAt(w) == '9' || table[r].getText().charAt(w) == ' ' || table[r].getText().charAt(w) == '-')
                        {
                            table[r].setBorder(BorderFactory.createLineBorder(Color.white));
                            
                        }
                        else
                        {
                            table[r].setBorder(BorderFactory.createLineBorder(Color.red));
                            
                            break;
                        }
                        
                    }//forlen
                    if(table[r].getText().equals(""))
                        {
                            table[r].setBorder(BorderFactory.createLineBorder(Color.white));
                        }
                }
                for(int x=1; x<n1; x++ )
                {
                    if(table[x].equals(ke.getSource()))
                    {
                        int len = table[x].getText().length();
                        for(int w=0; w<len; w++)
                        {
                            if(table[x].getText().charAt(w) == '0' || table[x].getText().charAt(w) == '1' || table[x].getText().charAt(w) == '2' || table[x].getText().charAt(w) == '3' || table[x].getText().charAt(w) == '4' || table[x].getText().charAt(w) == '5' || 
                                    table[x].getText().charAt(w) == '6' || table[x].getText().charAt(w) == '7' || table[x].getText().charAt(w) == '8' || table[x].getText().charAt(w) == '9' || table[x].getText().charAt(w) == ' ' || table[x].getText().charAt(w) == '-')
                            {
                                table[x].setBorder(BorderFactory.createLineBorder(Color.white));
                            }
                            else
                            {
                                table[x].setBorder(BorderFactory.createLineBorder(Color.red));
                                break;
                                
                            }
                            
                        }//forlen
                        if(table[x].getText().equals(""))
                                {
                                table[x].setBorder(BorderFactory.createLineBorder(Color.white));
                                }
                    }
                }//forX
                r=r+n1;
            }//forR
            
            r = n1;
            for(int y=1; y<n2; y++)
            {
                for(int x=1; x<n1; x++ )
                {
                    if(table[r+x].equals(ke.getSource()))
                    {
                        int len = table[r+x].getText().length();
                        for(int w=0; w<len; w++)
                        {
                            if(table[r+x].getText().charAt(w) == '0' || table[r+x].getText().charAt(w) == '1' || table[r+x].getText().charAt(w) == '2' || table[r+x].getText().charAt(w) == '3' || table[r+x].getText().charAt(w) == '4' || table[r+x].getText().charAt(w) == '5' || 
                                    table[r+x].getText().charAt(w) == '6' || table[r+x].getText().charAt(w) == '7' || table[r+x].getText().charAt(w) == '8' || table[r+x].getText().charAt(w) == '9' || table[r+x].getText().charAt(w) == ' ' || table[r+x].getText().charAt(w) == '-')
                            {
                                table[r+x].setBorder(BorderFactory.createLineBorder(Color.black));
                            }
                            else
                            {
                                table[r+x].setBorder(BorderFactory.createLineBorder(Color.red));
                                break;
                            }
                        }//forlen
                        if(table[r+x].getText().equals(""))
                        {
                            table[r+x].setBorder(BorderFactory.createLineBorder(Color.black));
                        }
                    }
                }//forX
                r=r+n1;
            }//forR
            r = n1;
            for(int y=1; y<n2; y++)
            {
                for(int x=1; x<n1; x++ )
                {
                    if(!"".equals(table[r].getText()) && !"".equals(table[x].getText()))
                    {
                    table[r+x].setVisible(true);
                    
                    tableP.updateUI();
                    tableP.revalidate();
                    }
                    else
                    {
                    table[r+x].setVisible(false);
                    table[r+x].setForeground(Color.black);
                    table[r+x].setFont(new Font("Century Gothic",Font.PLAIN,20));
                    table[r+x].setBorder(BorderFactory.createLineBorder(Color.black));
                    table[r+x].setText("");
                    tableP.updateUI();
                    tableP.revalidate();
                    }
                }//for
                r=r+n1;
            }
            
           if(key==true)
        {
           r = n1;
           int mark1=0, mark2=0;
            for(int y=1; y<n2; y++)
            {
                if(!"".equals(table[r].getText()))
                    {
                        mark2=1;
                    }
                    else
                    {
                    mark2=0;
                    break;
                    }
                for(int x=1; x<n1; x++ )
                {
                    if(!"".equals(table[x].getText()))
                    {
                        mark1=1;
                    }
                    else
                    {
                    mark1=0;
                    break;
                    }
                }//for
                r=r+n1;
            }
            if(mark1==1 && mark2==1)
            {
                show.setVisible(true);
            }
            else
            {
                show.setVisible(false);
            }
            if(mark1==1 && mark2==1 && key2==false)
            {
                assess.setVisible(true);
            }
            else
            {
                assess.setVisible(false);
                key2=true;
            }
          r=n1; 
          int mark3=0,mark4=0;
          
            for(int y=1; y<n2; y++)
            {
                
                for(int x=1; x<n1; x++ )
                {
                    if(!"".equals(table[x].getText()) && !"".equals(table[r].getText()))
                    {
                        mark3=1;
                        break;
                    }
                    
                }//for
                r=r+n1;
            }//for
            r=n1;
             for(int y=1; y<n2; y++)
            {
                if(!"".equals(table[r].getText()))
                    {
                       mark4=1;
                       break;
                    }
                for(int x=1; x<n1; x++ )
                {
                   
                }//for
                r=r+n1;
            }//for
             if(mark3==1 && mark4==1)
            {
                check.setVisible(true);
            }
            else
            {
                check.setVisible(false);
            }
       }//key
    }//keyrelease

    @Override
    public void mouseDragged(MouseEvent me) {
        
        
    }
    @Override
    public void mouseMoved(MouseEvent me) {
        
            int r = n1;
            String first="", second="";
            for(int y=1; y<n2; y++)
            {
                for(int x=1; x<n1; x++ )
                {
                     if(me.getSource().equals(table[r+x]))
                    {
                        first=table[r].getText();
                        second=table[x].getText();
                        table[r+x].setToolTipText(first+" X "+second+"?");
                    }
                }//for
                r=r+n1;
            }
            if(me.getSource().equals(aboutbtn))
            {
                aboutbtn.setForeground(Color.white);
            }
        else
            {
                aboutbtn.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(howbtn))
            {
                howbtn.setForeground(Color.white);
            }
        else
            {
                howbtn.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(exitbtn))
            {
                exitbtn.setForeground(Color.white);
            }
        else
            {
                exitbtn.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(okay))
            {
                okay.setForeground(Color.white);
            }
        else
            {
                okay.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(check))
            {
                check.setForeground(Color.white);
            }
        else
            {
                check.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(show))
            {
                show.setForeground(Color.white);
            }
        else
            {
                show.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(assess))
            {
                assess.setForeground(Color.white);
            }
        else
            {
                assess.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(auto))
            {
                auto.setForeground(Color.white);
            }
        else
            {
                auto.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(reset))
            {
                reset.setForeground(Color.white);
            }
        else
            {
                reset.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(goback))
            {
                goback.setForeground(Color.white);
            }
        else
            {
                goback.setForeground(new Color(204,204,204));
            }
        if(me.getSource().equals(start))
            {
                start.setForeground(Color.white);
            }
        else
            {
                start.setForeground(new Color(204,204,204));
            }
    }//mouseMove
    public static void MusicApp(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
        }catch(LineUnavailableException | UnsupportedAudioFileException | IOException e)
        {
            
        }
    }
}//class
