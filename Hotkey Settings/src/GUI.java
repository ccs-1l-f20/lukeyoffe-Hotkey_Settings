import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GUI implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JButton createFileButton;
	private JButton writeToFileButton;
	private JLabel label;
	//private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private int frameWidth = 960; //(int) (screenSize.getWidth()/3);
	private int frameHeight = 540; //(int) (screenSize.getWidth()/3);
	
	
	public GUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		createFileButton = new JButton("Create File");
		writeToFileButton = new JButton("Write to file");
		label = new JLabel("Click the button on the left to create an empty AHK file");
		
		frame.setSize(frameWidth, frameHeight);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Hotkey Settings");
		//frame.pack(); //compresses the frame to be only just large enough to fit everything
		frame.setVisible(true);
		

		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
		//panel.setLayout(new GridLayout());
		panel.add(createFileButton/*, BorderLayout.SOUTH*/);
		panel.add(label);
		panel.add(writeToFileButton);
		
		createFileButton.addActionListener(this);
		writeToFileButton.addActionListener(this);
		//createFileButton.setLocation((int) 0.4 * frameWidth, (int) 0.8 * frameHeight);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object action = e.getSource();
		File f = new File(System.getProperty("user.dir") + "/file.ahk");
		if(action == createFileButton) {
			if (!f.exists()) {
				label.setText("Created file " + f.getName());
			 
				try {
					f.createNewFile();
				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println("File creation failed");
				}
			}
			else {
				label.setText(f.getName() + " already exists");
			  
			}
		}
		
		else if(action == writeToFileButton) {
			try {
		    	FileWriter myWriter = new FileWriter(System.getProperty("user.dir") + "/file.ahk");
				myWriter.write("^!u:: Send ü");
				myWriter.close();
			} catch (IOException e1) {
				System.out.println("Unable to write to file");
				e1.printStackTrace();
			}
		}
	    
	    
	}

}
