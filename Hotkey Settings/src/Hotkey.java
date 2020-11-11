import java.util.ArrayList;

public class Hotkey {
	private ArrayList<String> keys;
	private String action;
	private String actionArgument;
	private String actionScope;
	
	public Hotkey() {
		this.keys = new ArrayList<String>();
		this.action = "Not specified";
		this.actionArgument = "Not specified";
		this.actionScope = "Not specified";
	}
	
	public Hotkey(ArrayList<String> keys, String action, String actionArgument, String actionScope) {
		this.keys = keys;
		this.action = action;
		this.actionArgument = actionArgument;
		this.actionScope = actionScope;
	}
	
	public Hotkey(String ahkCode) {
		
	}
	
	public ArrayList<String> getKeys(){
		return keys;
	}
	
	public String getAction() {
		return action;
	}
	
	public String getActionArgument() {
		return actionArgument;
	}
	
	public String getActionScope() {
		return actionScope;
	}
	
	public void setKeys(ArrayList<String> keys){
		this.keys = keys;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public void setActionArgument(String actionArgument) {
		this.actionArgument = actionArgument;
	}
	
	public void setActionScope(String actionScope) {
		this.actionScope = actionScope;
	}
	
	public String toAhk() { //probably the most important method of the application
		return "";
	}
}
