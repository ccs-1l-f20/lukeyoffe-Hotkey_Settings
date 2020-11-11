import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ViewEditPanel extends JPanel implements ActionListener{ //should probably be a JScrollPane
	private JLabel viewEditMessage = new JLabel();
	private JButton newHK = new JButton();
	private JPanel jp = new JPanel();
	private JScrollPane jsp = new JScrollPane(jp, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	ArrayList<HotkeyPanel> HKPAL = new ArrayList<HotkeyPanel>();
	public ViewEditPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 50, 50));
		add(viewEditMessage);
		add(Box.createRigidArea(new Dimension(0, 10)));
		add(newHK);
		newHK.setBackground(Color.green);
		newHK.setText("Create new hotkey");
		newHK.setAlignmentX(Component.CENTER_ALIGNMENT);
		newHK.addActionListener(this);
		viewEditMessage.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewEditMessage.setFont(new Font("Roboto", Font.PLAIN, 20));
		viewEditMessage.setText("Here you can view, edit, and create new hotkeys.");
		int h = this.getSize().height;
		add(Box.createRigidArea(new Dimension(0, 15)));
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		jp.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
//		jp.add(hkp);
		add(jsp);
		jsp.getVerticalScrollBar().setUnitIncrement(16);
//		jp.add(new HotkeyPanel(new Hotkey()));
//		add(new HotkeyPanel(new Hotkey()));
		//add(Box.createRigidArea(new Dimension(0, 3*h/4)));
		System.out.println(h);
	}
	
	public void addHKP(HotkeyPanel h) {
		jp.add(h);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == newHK) {
			HKPAL.add(new HotkeyPanel(new Hotkey(), this));
			jp.add(HKPAL.get(HKPAL.size() - 1));
			HKPAL.get(HKPAL.size() - 1).setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
			jp.revalidate();
//			jp.repaint();
		}
		for(HotkeyPanel h : HKPAL) {
			if(h.deletedState()) {
				jp.remove(h);
				jp.revalidate();
				jp.repaint();
			}
		}
//		if(hkp.deletedState() == true) {
//			jp.remove(hkp);
//			jp.revalidate();
//			jp.repaint();
//		}
		
	}

}
