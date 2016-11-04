package kaveen.fakeinfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GenerateInterface {
	public static JButton name, address, birthday, phone, email, emailaccess, height, weight, bloodtype;
	public static JTextField namef, addressf, birthdayf, phonef, emailf, emailaccessf, heightf, weightf, bloodtypef;
public static JLabel logolabelsec;
	public static void paint() {
		UserInterface.pane.remove(UserInterface.login);
		UserInterface.pane.remove(UserInterface.register);
		UserInterface.pane.remove(UserInterface.logolabel);
		UserInterface.pane.remove(UserInterface.backgroundlabel);
		BufferedImage logosec = null;
		try {
			logosec = ImageIO.read(new URL("http://i.imgur.com/XBXOxSH.png"));
		} catch (Exception e) {
			System.out.println("Fail");
			//TODO better recovery
		}
		logolabelsec = new JLabel(new ImageIcon(logosec));
		logolabelsec.setBounds(0, 0, logolabelsec.getPreferredSize().width, logolabelsec.getPreferredSize().height);
		//fields and labels addition
		
		name = new JButton("Name");
		//get the font and create the one we want
		Font font = new Font(name.getFont().getName(), Font.BOLD, 12);
		name.setFont(font);
		name.setForeground(Color.GRAY);
		name.setBackground(Color.BLACK);
		name.setBounds(10, 50, name.getPreferredSize().width, name.getPreferredSize().height);
		name.setEnabled(false);
		
		
		namef = new JTextField(10);
		namef.setForeground(Color.GRAY);
		namef.setBackground(Color.BLACK);
		namef.setBounds(75, 50, 160, 26);
		namef.setEditable(false);
		
	 
		
		
		address = new JButton("Address");
		address.setFont(font);
		address.setForeground(Color.GRAY);
		address.setBackground(Color.BLACK);
		address.setBounds(10, 78, address.getPreferredSize().width, address.getPreferredSize().height);
		address.setEnabled(false);
		
		addressf = new JTextField(10);
		addressf.setFont(font);
		addressf.setForeground(Color.GRAY);
		addressf.setBackground(Color.BLACK);
		addressf.setBounds(85, 78, 150, 26);
		addressf.setEditable(false);
		
		
		birthday = new JButton("Birthday");
		birthday.setFont(font);
		birthday.setForeground(Color.GRAY);
		birthday.setBackground(Color.BLACK);
		birthday.setBounds(10, 106, birthday.getPreferredSize().width, birthday.getPreferredSize().height);
		birthday.setEnabled(false);
		
		birthdayf = new JTextField(10);
		birthdayf.setFont(font);
		birthdayf.setForeground(Color.GRAY);
		birthdayf.setBackground(Color.BLACK);
		birthdayf.setBounds(85, 106, 150, 26);
		birthdayf.setEditable(false);
		
		
		phone = new JButton("Phone#");
		phone.setFont(font);
		phone.setForeground(Color.GRAY);
		phone.setBackground(Color.BLACK);
		phone.setBounds(10, 134, phone.getPreferredSize().width, phone.getPreferredSize().height);
		phone.setEnabled(false);
		
		phonef = new JTextField(10);
		phonef.setFont(font);
		phonef.setForeground(Color.GRAY);
		phonef.setBackground(Color.BLACK);
		phonef.setBounds(85, 134, 150, 26);
		phonef.setEditable(false);
		
		
		//Add labels and fields
		UserInterface.pane.add(phonef);
		UserInterface.pane.add(phone);
		UserInterface.pane.add(birthdayf);
		UserInterface.pane.add(birthday);
		UserInterface.pane.add(addressf);
		UserInterface.pane.add(namef);
		UserInterface.pane.add(name);
		UserInterface.pane.add(address);
		
		//label and background addition
	
		UserInterface.pane.add(logolabelsec);
		UserInterface.pane.add(UserInterface.backgroundlabel);
		
		
		
		
		
		
		
		
		
		//final repaint
		UserInterface.pane.repaint();
		UserInterface.frame.repaint();
		
		
	}
	
	
	
	
	
}
