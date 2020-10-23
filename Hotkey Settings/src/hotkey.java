import java.util.ArrayList;

public class hotkey {
	ArrayList<String> keys;
	String action;
	String actionArgument;
	String actionScope;
	
	public hotkey() {
		this.keys = new ArrayList<String>();
		this.action = "";
		this.actionArgument = "";
		this.actionScope = "";
	}
	
	public hotkey(ArrayList<String> keys, String action, String actionArgument, String actionScope) {
		this.keys = keys;
		this.action = action;
		this.actionArgument = actionArgument;
		this.actionScope = actionScope;
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
}
