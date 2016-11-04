package kaveen.fakeinfo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import org.json.JSONException;

public class generatebasicAction implements ActionListener {
	public static boolean inuse = false;

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!(inuse)) {
			inuse = true;
			GenerateInterface.generate.setEnabled(false);
			GenerateInterface.generate.setText("Wait..");
			try {
				JSONParse.init();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (JSONException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			try {
				GenerateInterface.addressf.setText(JSONParse.getProperty("address"));
				GenerateInterface.namef.setText(JSONParse.getProperty("name"));
				GenerateInterface.emailf.setText(JSONParse.getProperty("email_u")+"@"+JSONParse.getProperty("email_d"));
				GenerateInterface.bloodtypef.setText(JSONParse.getProperty("blood"));
				GenerateInterface.weightf.setText(JSONParse.getProperty("weight"));
				GenerateInterface.heightf.setText(JSONParse.getProperty("height"));
				GenerateInterface.birthdayf.setText(JSONParse.getProperty("birth_data"));
				GenerateInterface.phonef.setText(JSONParse.getProperty("phone_w"));
				GenerateInterface.emailaccessf.setText(JSONParse.getProperty("email_url"));
				
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						GenerateInterface.generate.setEnabled(true);
						GenerateInterface.generate.setText("Generate");
						inuse=false;
					}
				}, 2*2*1000);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JSONException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}

	}

}
