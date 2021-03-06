import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



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
	
	public void showSaved() throws IOException {
//	    ArrayList<String> lines = new ArrayList<String>();
//	    String line = null;
//        try {
//            File f1 = new File(System.getProperty("user.dir") + "/file.ahk");
//            FileReader fr = new FileReader(f1);
//            BufferedReader br = new BufferedReader(fr);
//            while ((line = br.readLine()) != null) {
//                lines.add(line);
//            }
//            fr.close();
//            br.close();
//        } 
//        catch (Exception ex) {
//            ex.printStackTrace();
//        }
		String inputFile = System.getProperty("user.dir") + "/file.ahk";
        InputStream is = System.in;
        if(inputFile != null)
        	is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
//        CharStream input = null;
//		try {
//			input = CharStreams.fromFileName("file.ahk");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
        ly0ahkLexer lexer = new ly0ahkLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ly0ahkParser parser = new ly0ahkParser(tokens);
        ParseTree tree = parser.script();
        ParseTreeWalker walker = new ParseTreeWalker();
        myListener listener = new myListener();
        walker.walk(listener, tree);
//        System.out.println("----------------------");
//        System.out.println(listener.getAllInfo());
        for(int i = 0; i < listener.getAllInfo().size(); i++) {
        	HKPAL.add(new HotkeyPanel(new Hotkey(listener.getAllInfo().get(i)), this));
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
		int i = 0;
		while(i < HKPAL.size()){
			if(HKPAL.get(i).deletedState()) {
				jp.remove(HKPAL.get(i));
				jp.revalidate();
				jp.repaint();
				HKPAL.remove(i);
			}
			else{
				i++;
			}
		}
	}
}
