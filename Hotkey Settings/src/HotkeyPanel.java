import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HotkeyPanel extends JPanel implements ActionListener {
	private Hotkey hk;
	private JLabel hkInfo = new JLabel();
	private JButton editButton = new JButton();
	private JButton deleteButton = new JButton();
	private Boolean deleted = false;
	private ViewEditPanel vep;
	private String[] actions = {"Type a key", "Open an application/website", "Change highlighted text"};
	private JComboBox actionList = new JComboBox(actions);
	
	public HotkeyPanel(Hotkey hk, ViewEditPanel vep) {
		this.hk = hk;
		this.vep = vep;
		setBorder(BorderFactory.createLineBorder(Color.black));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(500, 100));
		//setBorder(BorderFactory.createEmptyBorder());
		setLayout(new GridLayout(2, 2, 200, 5));
		add(hkInfo);
		hkInfo.setFont(new Font("Roboto", Font.PLAIN, 14));
		add(editButton);
		add(new JLabel());
		add(deleteButton);
		
		hkInfo.setText("Action: " + hk.getAction());
		editButton.setText("Edit");
		editButton.setBackground(Color.yellow);
		//editButton.setPreferredSize(new Dimension(100, 200));
		deleteButton.setText("Delete");
		deleteButton.setBackground(Color.red);
		deleteButton.addActionListener(vep);
		deleteButton.addActionListener(this);
		editButton.addActionListener(vep);
		editButton.addActionListener(this);
		actionList.addActionListener(this);
		
	}
	
	public Boolean deletedState() {
		return deleted;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editButton) {
			JOptionPane.showMessageDialog(null, actionList, "Action", JOptionPane.QUESTION_MESSAGE);
			hkInfo.setText(actionList.getSelectedItem().toString());
//			hkInfo.setText(actionList.showPopup());
		}
		else if(e.getSource() == deleteButton) {
			deleted = true;
			//System.out.println("Deleting from class HotkeyPanel");
		}
			
		
	}

}
