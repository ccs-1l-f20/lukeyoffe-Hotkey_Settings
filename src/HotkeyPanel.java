import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class HotkeyPanel extends JPanel implements ActionListener {
	private Hotkey hk;
	private JLabel actionInfo = new JLabel();
	private JLabel keyInfo = new JLabel();
	private JLabel argumentInfo = new JLabel();
//	private JLabel scopeInfo = new JLabel();
	private JButton editKeys = new JButton();
	private JButton editAction = new JButton();
	private JButton editArg = new JButton();
	//private JButton editScope = new JButton();
	private JButton deleteButton = new JButton();
	private JButton saveButton = new JButton();
	private JButton[] editButtons = {editKeys, editAction, editArg};
	private Boolean deleted = false;
	//private ViewEditPanel vep;
	private JPanel buttonPanel = new JPanel();
	private JPanel editButtonPanel = new JPanel();
	private JPanel deleteButtonPanel = new JPanel();
	private ViewEditPanel vep;
	private JPanel labelPanel = new JPanel();
	private String[] actions = {"Hotstring", /*"Send keys to another application",*/ "Open an application/website/file"}; // Other ideas: spam a key every so often for x seconds
	private JComboBox<String[]> actionList = new JComboBox(actions);												 	  //add current highlighted text to be an arg
	
	public HotkeyPanel(Hotkey hk, ViewEditPanel vep) {
		this.vep = vep;
		this.hk = hk;
		setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(500, 100));
		setLayout(new GridLayout(1, 2, 0, 0));
		add(labelPanel);
		add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(2, 1, 5, 5));
		editButtonPanel.setLayout(new GridLayout(1, 4, 5, 5));
		deleteButtonPanel.setLayout(new GridLayout(1, 1, 5, 5));
		deleteButtonPanel.add(saveButton);
		deleteButtonPanel.add(deleteButton);
		labelPanel.setLayout(new GridLayout(4, 1, 0, 5));
		labelPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		labelPanel.add(keyInfo);
		labelPanel.add(actionInfo);
		labelPanel.add(argumentInfo);
		keyInfo.setText("Keys: " + hk.getKeys().toString());
		actionInfo.setText("Action: " + hk.getAction());
		argumentInfo.setText("Argument: " + hk.getActionArgument());
		buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		labelPanel.setBackground(Color.white);
		buttonPanel.setBackground(Color.white);
		for(JButton b : editButtons) {
			editButtonPanel.add(b);
			b.setBackground(Color.yellow);
			b.addActionListener(this);
			b.addActionListener(vep);
		}
		buttonPanel.add(editButtonPanel);
		buttonPanel.add(deleteButtonPanel);
		
		editKeys.setText("Edit keys");
		editAction.setText("Edit action");
		editArg.setText("Edit argument");
		deleteButton.setText("Delete");
		deleteButton.setBackground(Color.red);
		saveButton.setText("Save changes");
		saveButton.addActionListener(vep);
		saveButton.addActionListener(this);
		deleteButton.addActionListener(vep);
		deleteButton.addActionListener(this);
		
	}
	
	public Boolean deletedState() {
		return deleted;
	}
	
	public Hotkey getHotkey() {
		return hk;
	}
	
	public JLabel getKeyLabel() {
		return keyInfo;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == editAction) {
			JOptionPane.showMessageDialog(null, actionList, "Action", JOptionPane.QUESTION_MESSAGE);
			actionInfo.setText("Action: " + actionList.getSelectedItem().toString());
			hk.setAction(actionList.getSelectedItem().toString());
		}
		else if(e.getSource() == editKeys) {
			new EditKeysFrame(this);
		}
		else if(e.getSource() == editArg) {
			String argInfo = JOptionPane.showInputDialog("Action argument:");
			argumentInfo.setText("Argument: \"" + argInfo + "\"");
			hk.setActionArgument(argInfo);
		}
		else if(e.getSource() == deleteButton) {
			deleted = true;
		    ArrayList<String> lines = new ArrayList<String>();
		    String line = null;
	        try {
	            File f1 = new File(System.getProperty("user.dir") + "/file.ahk");
	            lines.add("#NoEnv\r\n" + 
	            		"#SingleInstance force\r\n" +
	            		"SendMode Input\r\n" + 
	            		"SetWorkingDir %A_ScriptDir%");
	            for(int h = 0; h < vep.HKPAL.size(); h++) {
	            	Hotkey chk = vep.HKPAL.get(h).getHotkey();
	            	for (int i = 0; i < chk.toAhk().size(); i++){
	            		if(chk != hk) {
			            	lines.add(chk.toAhk().get(i));
	            		}

		            }
	            }
	            FileWriter fw = new FileWriter(f1);
	            BufferedWriter out = new BufferedWriter(fw);
	            for(String s : lines) {
	                 out.write(s);
	                 out.newLine();
	            }
	            out.flush();
	            out.close();
	        } 
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        String ahkPath = "C:\\Program Files\\AutoHotkey\\AutoHotkey.exe";
	        String scriptPath = System.getProperty("user.dir") + "/file.ahk";
	        try {
				Runtime.getRuntime().exec(new String[] {ahkPath, scriptPath});
			} catch (IOException e1) {
				e1.printStackTrace();
			}
//	        Thread.currentThread();
//	        try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e1) {
//				e1.printStackTrace();
//			}
		}
		else if(e.getSource() == saveButton) {
		    ArrayList<String> lines = new ArrayList<String>();
		    String line = null;
	        try {
	            File f1 = new File(System.getProperty("user.dir") + "/file.ahk");
//	            FileReader fr = new FileReader(f1);
//	            BufferedReader br = new BufferedReader(fr);
//	            while ((line = br.readLine()) != null) {
//	                lines.add(line);
//	            }
//	            lines.add(";" + hk);
	            lines.add("#NoEnv\r\n" + 
	            		"#SingleInstance force\r\n" +
	            		"SendMode Input\r\n" + 
	            		"SetWorkingDir %A_ScriptDir%");
	            for(int h = 0; h < vep.HKPAL.size(); h++) {
	            	Hotkey chk = vep.HKPAL.get(h).getHotkey();
	            	for (int i = 0; i < chk.toAhk().size(); i++){
		            	lines.add(chk.toAhk().get(i));
		            }
	            }
	            
//	            fr.close();
//	            br.close();

	            FileWriter fw = new FileWriter(f1);
	            BufferedWriter out = new BufferedWriter(fw);
	            for(String s : lines) {
	                 out.write(s);
	                 out.newLine();
	            }
	            out.flush();
	            out.close();
	        } 
	        catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        String ahkPath = "C:\\Program Files\\AutoHotkey\\AutoHotkey.exe";
	        String scriptPath = System.getProperty("user.dir") + "/file.ahk";
	        try {
				Runtime.getRuntime().exec(new String[] {ahkPath, scriptPath});
			} catch (IOException e1) {
				e1.printStackTrace();
			}
//	        Thread.currentThread();
//	        try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e1) {
//				e1.printStackTrace();
//			}

		}
		
	}

}
