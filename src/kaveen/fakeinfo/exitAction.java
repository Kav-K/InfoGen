package kaveen.fakeinfo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exitAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		UserInterface.frame.dispose();
		
       
	}

}
