import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class ViewEditPanel extends JPanel implements ActionListener{
	private JLabel viewEditMessage = new JLabel();
	private JButton newHK = new JButton();
//	private JButton saveChanges = new JButton();
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
		add(Box.createRigidArea(new Dimension(0, 15)));
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		jp.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		add(jsp);
		jsp.getVerticalScrollBar().setUnitIncrement(16);
	}
	
	public void addHKP(HotkeyPanel h) {
		jp.add(h);
	}
	
	public void showSaved() {
	    ArrayList<String> lines = new ArrayList<String>();
	    String line = null;
        try {
            File f1 = new File(System.getProperty("user.dir") + "/file.ahk");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            fr.close();
            br.close();
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        for(int i = 5; i < lines.size(); i+= 4) {
        	HKPAL.add(new HotkeyPanel(new Hotkey(lines.get(i)), this));
        	jp.add(HKPAL.get(HKPAL.size() - 1));
			HKPAL.get(HKPAL.size() - 1).setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        	jp.revalidate();
        }
		
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
	}
}
