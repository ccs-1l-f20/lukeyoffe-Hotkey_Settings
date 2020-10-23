import javax.swing.BoxLayout;
import javax.swing.JLayeredPane;

public class MainLayeredPane extends JLayeredPane{
	
	private HomePanel homePanel = new HomePanel();
	private ViewEditPanel VEPanel = new ViewEditPanel();
	
	public MainLayeredPane() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setVisible(true);
		add(homePanel);
		add(VEPanel);
		setLayer(homePanel, 1);
		setLayer(VEPanel, 0);
	}
	
	public void bringHomeToTop() {
		setLayer(homePanel, 1);
		setLayer(VEPanel, 0);
	}
	
	public void bringViewEditToTop() {
		setLayer(homePanel, 0);
		setLayer(VEPanel, 1);
	}
	
	
	
	

}
