package kaveen.fakeinfo;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class minAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		UserInterface.frame.setState(Frame.ICONIFIED);

	}

}
