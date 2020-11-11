import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePanel extends JPanel{
	private JLabel welcomeMessage = new JLabel();
	public HomePanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 50, 50));
		
		add(welcomeMessage);
		welcomeMessage.setText("<html>Welcome to Custom Hotkeys v. 0.0!<br/>To get started, click the View/Edit tab above.");		
	}
	
	public void setVisible(Boolean b) {
		this.setVisible(b);;
	}
}
