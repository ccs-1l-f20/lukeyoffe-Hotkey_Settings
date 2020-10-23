import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class LeftPanel extends JPanel implements ActionListener{
	
	//instance variables
	private JButton homeButton = new JButton();
	private JButton viewEditButton = new JButton();
	
	//default (and only) constructor
	public LeftPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
		setBackground(Color.gray);
		add(homeButton);
		add(viewEditButton);
		homeButton.setText("Home");
		viewEditButton.setText("View and edit hotkeys");
		homeButton.addActionListener(this);
		viewEditButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
