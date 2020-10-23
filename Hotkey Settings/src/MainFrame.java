import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainFrame extends JFrame{
	
	private JLayeredPane layeredPane  = new JLayeredPane();
	private LeftPanel leftPanel = new LeftPanel();
	private MainLayeredPane MLP = new MainLayeredPane();

	//private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private int frameWidth = 1000; //(int) (screenSize.getWidth()/3);
	private int frameHeight = 500; //(int) (screenSize.getWidth()/3);
	
	
	public MainFrame() {
		
		//JFrame setup
		add(layeredPane, BorderLayout.CENTER);
		add(leftPanel, BorderLayout.WEST);
		setSize(frameWidth, frameHeight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Custom Hotkeys");
		//pack(); //compresses the frame to be only just large enough to fit everything
		setVisible(true);
		//setBackground(Color.cyan); //doesn't do anything, look into this
		add(MLP);
		


	}
}
