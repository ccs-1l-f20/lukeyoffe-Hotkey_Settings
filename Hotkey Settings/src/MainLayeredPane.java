import javax.swing.JLayeredPane;
import javax.swing.OverlayLayout;
//no longer being used
public class MainLayeredPane extends JLayeredPane{
	
	private HomePanel homePanel = new HomePanel();
	private ViewEditPanel VEPanel = new ViewEditPanel();
	
	public MainLayeredPane() {
		setLayout(new OverlayLayout(this));
		setVisible(true);
		add(homePanel);
		homePanel.setAlignmentY(0f);
		add(VEPanel);
		VEPanel.setAlignmentY(0f);
		setLayer(homePanel, 1);
		setLayer(VEPanel, 0);
	}
	
	public void bringHomeToTop() {
		setLayer(homePanel, MODAL_LAYER);
		setLayer(VEPanel, DEFAULT_LAYER);
	}
	
	public void bringViewEditToTop() {
		setLayer(homePanel, DEFAULT_LAYER);
		setLayer(VEPanel, MODAL_LAYER);
	}
	
	
	
	

}
