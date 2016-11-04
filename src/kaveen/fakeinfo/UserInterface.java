package kaveen.fakeinfo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserInterface {
	static Point mouseDownCompCoords;
    public static JFrame frame;
    public static Container pane;
    public static JLabel backgroundlabel, logolabel;
    public static JButton login, register;
	public static void initinterface() {
		frame = new JFrame("Hello");

		mouseDownCompCoords = null;
		frame.setUndecorated(true);
		frame.setVisible(true);
		frame.setSize(500,281);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //background image addition
        BufferedImage background = null;
        
        try {
        	background = ImageIO.read(new URL("http://paper-backgrounds.com/textureimages/2013/10/black-shiny-leather-background-hd-500x281.jpg"));

        } catch (Exception e) {
        	//Replace this later this is just for testing
        	//TODO recovery
        	System.out.println("fail!");
        }
        backgroundlabel = new JLabel(new ImageIcon(background));
        backgroundlabel.setBounds(0, 0, backgroundlabel.getPreferredSize().width, backgroundlabel.getPreferredSize().height);
		//Pane initialization
        pane = frame.getContentPane();
        pane.setLayout(null);
        
        
        
        
        
        //Addition of elements into pane
		
		
		
		
		//Initialize the top buttons (X)
		JButton exitbutton = new JButton("X");
        exitbutton.setForeground(Color.GRAY);
        exitbutton.setBackground(Color.BLACK);
        exitbutton.setBounds(459, 0, exitbutton.getPreferredSize().width,exitbutton.getPreferredSize().height);
        pane.add(exitbutton);
        exitbutton.addActionListener(new exitAction());
		//Initialize the top buttons (-)
        
        JButton minbutton = new JButton("-");
        minbutton.setForeground(Color.GRAY);
        minbutton.setBackground(Color.BLACK);
        minbutton.setBounds(425, 0, minbutton.getPreferredSize().width, minbutton.getPreferredSize().height);
        Font minfont = new Font(minbutton.getFont().getName(), Font.BOLD, 13);
        minbutton.setFont(minfont);
        pane.add(minbutton);
        minbutton.addActionListener(new minAction());
        
        
        //Logo initialization
        BufferedImage logo = null;
        try {
        	logo = ImageIO.read(new URL("http://i.imgur.com/7WIHoNy.png"));
        } catch (Exception e) {
        	System.out.println("Error");
        	//TODO recovery
        }
        logolabel = new JLabel(new ImageIcon(logo));
        logolabel.setBounds(0,100, logolabel.getPreferredSize().width,logolabel.getPreferredSize().height);
		pane.add(logolabel);
		//create login/register buttons
		login = new JButton("Login");
		Font mainfont = new Font(login.getFont().getName(), Font.BOLD, 30);
		login.setForeground(Color.GRAY);
		login.setBackground(Color.BLACK);
		login.setFont(mainfont);
		login.setBounds(330, 110, login.getPreferredSize().width, login.getPreferredSize().height);
		
		register = new JButton("Register");
		Font secfont = new Font(register.getFont().getName(), Font.BOLD, 18);
		register.setForeground(Color.GRAY);
		register.setBackground(Color.BLACK);
		register.setFont(secfont);
		register.setBounds(333, 165, register.getPreferredSize().width, register.getPreferredSize().height);
		login.addActionListener(new loginAction());
		//add login/register buttons to pane
		pane.add(register);
		pane.add(login);
        //add overlying images at  last
		pane.add(logolabel);
        pane.add(backgroundlabel);
     
		
		
        frame.setContentPane(pane);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
		frame.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				mouseDownCompCoords = null;
			}

			public void mousePressed(MouseEvent e) {
				mouseDownCompCoords = e.getPoint();
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});

		frame.addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {
			}

			public void mouseDragged(MouseEvent e) {
				Point currCoords = e.getLocationOnScreen();
				frame.setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
			}
		});
		} catch (Exception e) {
			System.out.println("mouse fail");
		}
	}
	
}