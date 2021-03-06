import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class EditKeysFrame extends JFrame implements ActionListener, KeyListener{ //check out:https://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html

	//private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private int frameWidth = 400; //(int) (screenSize.getWidth()/3);
	private int frameHeight = 400; //(int) (screenSize.getWidth()/3);
	private JButton recButton = new JButton();
	private JButton resetButton = new JButton();
	private JLabel instructionsLabel = new JLabel();
	private HotkeyPanel hkp;
	private Boolean keyListenerAdded = false;
	
	
	public EditKeysFrame(HotkeyPanel hkp) {
		this.hkp = hkp;
		//JFrame setup
		//add(layeredPane, BorderLayout.CENTER);
		//add(leftPanel, BorderLayout.WEST);
		setSize(frameWidth, frameHeight);
		this.getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Edit keys");
		//pack(); //compresses the frame to be only just large enough to fit everything
		setLayout(new GridLayout(0, 1, 10, 10));
		setVisible(true);
		setLocationRelativeTo(null);
		add(instructionsLabel);
		add(recButton);
		add(resetButton);
//		add(shiftButton);
		
		instructionsLabel.setText("<html>When you are ready, press the button below to record the keys that make up your hotkey.<br/>"
				+ "They will show up in real-time on the main window.<br/>If you want to clear the current keys, press the Reset button"
				+ "<br/>If you are using key modifiers (ctrl, alt, or shift are all that are currently supported), type those in first."
				+ "<br/>When you are done, simply close this window.");
		recButton.setText("Start recording");
		recButton.addActionListener(this);
		resetButton.addActionListener(this);
		resetButton.setText("Reset");
		recButton.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
		resetButton.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
		//add(MLP);
//		add(ETP);
		


	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == recButton) {
			if(!keyListenerAdded) {
				recButton.setFocusTraversalKeysEnabled(false);
				recButton.addKeyListener(this);
				keyListenerAdded = true;
				recButton.setText("Close");
			}
			else {
				dispose();
			}

		}
		else if(e.getSource() == resetButton) {
			hkp.getHotkey().getKeys().clear();
			hkp.getKeyLabel().setText("Keys: " + hkp.getHotkey().getKeys().toString());
		}
	}


	@Override
	public void keyTyped(KeyEvent e) {
//		hkp.getHotkey().getKeys().add(String.valueOf(e.getKeyChar()));
//		hkp.getKeyLabel().setText("Keys: " + hkp.getHotkey().getKeys().toString().toLowerCase());
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		if(hkp.getHotkey().getAction().equals("Hotstring")) {
			if(hkp.getHotkey().getKeys().size() == 0) {
				hkp.getHotkey().getKeys().add(KeyEvent.getKeyText(e.getKeyCode()).toLowerCase());
			}
			else {
				hkp.getHotkey().getKeys().set(0, hkp.getHotkey().getKeys().get(0) + KeyEvent.getKeyText(e.getKeyCode()).toLowerCase());
			}
			
		}
		else {
			hkp.getHotkey().getKeys().add(KeyEvent.getKeyText(e.getKeyCode()).toLowerCase());
		}
		
		hkp.getKeyLabel().setText("Keys: " + hkp.getHotkey().getKeys().toString().toLowerCase());
		
	}
}
