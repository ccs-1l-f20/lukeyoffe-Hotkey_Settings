import javax.swing.JTabbedPane;

public class mainTabbedPane  extends JTabbedPane{
	private HomePanel homePanel = new HomePanel();
	private ViewEditPanel VEPanel = new ViewEditPanel();
	
	public mainTabbedPane() {
		addTab("Home", homePanel);
		addTab("View/Edit Hotkeys", VEPanel);
	}
	public ViewEditPanel getVEPanel() {
		return VEPanel;
	}

}
