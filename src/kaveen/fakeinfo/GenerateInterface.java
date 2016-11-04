package kaveen.fakeinfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GenerateInterface {
	public static JButton name, address, birthday, phone, email, emailaccess, height, weight, bloodtype, generate;
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
		name.setEnabled(true);
		
		name.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = namef.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		
		
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
		address.setEnabled(true);
		address.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = addressf.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		
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
		birthday.setEnabled(true);
		birthday.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = birthdayf.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
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
		phone.setEnabled(true);
		phone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = phonef.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		
		phonef = new JTextField(10);
		phonef.setFont(font);
		phonef.setForeground(Color.GRAY);
		phonef.setBackground(Color.BLACK);
		phonef.setBounds(85, 134, 150, 26);
		phonef.setEditable(false);
		
		email = new JButton("Email");
		email.setFont(font);
		email.setForeground(Color.GRAY);
		email.setBackground(Color.BLACK);
		email.setBounds(10, 162, email.getPreferredSize().width, email.getPreferredSize().height);
		email.setEnabled(true);
		email.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString =emailf.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		emailf = new JTextField(10);
		emailf.setFont(font);
		emailf.setForeground(Color.GRAY);
		emailf.setBackground(Color.BLACK);
		emailf.setBounds(74, 162, 161, 26);
		emailf.setEditable(false);
		
		emailaccess = new JButton("Access");
		emailaccess.setFont(font);
		emailaccess.setForeground(Color.GRAY);
		emailaccess.setBackground(Color.BLACK);
		emailaccess.setBounds(10, 190, emailaccess.getPreferredSize().width, emailaccess.getPreferredSize().height);
		emailaccess.setEnabled(true);
		emailaccess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = emailaccessf.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		emailaccessf = new JTextField(10);
		emailaccessf.setFont(font);
		emailaccessf.setForeground(Color.GRAY);
		emailaccessf.setBackground(Color.BLACK);
		emailaccessf.setBounds(75, 190, 160, 26);
		emailaccessf.setEditable(false);
		
		height = new JButton("Height");
		height.setFont(font);
		height.setForeground(Color.GRAY);
		height.setBackground(Color.BLACK);
		height.setBounds(10, 218, height.getPreferredSize().width, height.getPreferredSize().height);
		height.setEnabled(true);
		height.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = heightf.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		weight = new JButton("Weight");
		weight.setFont(font);
		weight.setForeground(Color.GRAY);
		weight.setBackground(Color.BLACK);
		weight.setBounds(88, 218, weight.getPreferredSize().width, weight.getPreferredSize().height);
		weight.setEnabled(true);
		weight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = weightf.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		bloodtype = new JButton("Blood");
		bloodtype.setFont(font);
		bloodtype.setForeground(Color.GRAY);
		bloodtype.setBackground(Color.BLACK);
		bloodtype.setBounds(169, 218, bloodtype.getPreferredSize().width, bloodtype.getPreferredSize().height);
		bloodtype.setEnabled(true);
		bloodtype.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String myString = bloodtypef.getText();
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				
			}
		});
		
		heightf = new JTextField(10);
		heightf.setFont(font);
		heightf.setForeground(Color.GRAY);
		heightf.setBackground(Color.BLACK);
		heightf.setBounds(10, 248, 70, 26);
		heightf.setEditable(false);
		
		weightf = new JTextField(10);
		weightf.setFont(font);
		weightf.setForeground(Color.GRAY);
		weightf.setBackground(Color.BLACK);
		weightf.setBounds(88, 248, 74, 26);
		weightf.setEditable(false);
		
		bloodtypef = new JTextField(10);
		bloodtypef.setFont(font);
		bloodtypef.setForeground(Color.GRAY);
		bloodtypef.setBackground(Color.BLACK);
		bloodtypef.setBounds(169, 248, 67, 26);
		bloodtypef.setEditable(false);
		
		generate = new JButton("Generate");
		Font font2 = new Font(generate.getFont().getName(), Font.BOLD, 30);
		generate.setFont(font2);
		generate.setForeground(Color.GRAY);
		generate.setBackground(Color.BLACK);
		generate.setBounds(290, 121, generate.getPreferredSize().width, generate.getPreferredSize().height);
		generate.addActionListener(new generatebasicAction());
		
		JButton copyall = new JButton("Copy All");
		copyall.setFont(font);
		copyall.setForeground(Color.GRAY);
		copyall.setBackground(Color.BLACK);
		copyall.setBounds(240, 248, copyall.getPreferredSize().width, copyall.getPreferredSize().height);
		copyall.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (namef.getText().isEmpty()) {
					 
				} else {
				String myString = "Name: " + namef.getText() + " Address: " + addressf.getText() + " Birthday: " + birthdayf.getText() + " Phone#: " + phonef.getText() + " Email: " + emailf.getText() + " Height: " + heightf.getText() + " Weight: " + weightf.getText() + " Blood Type: " + bloodtypef.getText() ;
				StringSelection stringSelection = new StringSelection(myString);
				Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
				clpbrd.setContents(stringSelection, null);
				JOptionPane.showMessageDialog(null, "Copied " + myString );
				}
			}
			
		});
		
		
		//Add everything
		UserInterface.pane.add(copyall);
		UserInterface.pane.add(generate);
		UserInterface.pane.add(bloodtypef);
		UserInterface.pane.add(weightf);
		UserInterface.pane.add(heightf);
		UserInterface.pane.add(bloodtype);
		UserInterface.pane.add(weight);
		UserInterface.pane.add(height);
		UserInterface.pane.add(emailaccessf);
		UserInterface.pane.add(emailaccess);
		UserInterface.pane.add(emailf);
		UserInterface.pane.add(email);
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
