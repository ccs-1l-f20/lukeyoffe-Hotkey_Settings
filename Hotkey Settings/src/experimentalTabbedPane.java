import javax.swing.JTabbedPane;

public class experimentalTabbedPane  extends JTabbedPane{
	private HomePanel homePanel = new HomePanel();
	private ViewEditPanel VEPanel = new ViewEditPanel();
	
	public experimentalTabbedPane() {
		addTab("Home", homePanel);
		addTab("View/Edit Hotkeys", VEPanel);
	}

}
