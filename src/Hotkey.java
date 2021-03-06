import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

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
	public Hotkey(Hashtable<String, String> info) {
		String keyString = info.get("keys");
		this.keys = new ArrayList<String>(Arrays.asList(keyString.split(",")));
		this.action = info.get("action");
		this.actionArgument = info.get("actionArgument");
	}
	
	public Hotkey(String ahkCode) {
		int i = 1;
		while(!(ahkCode.substring(i - 1, i).equals("&"))) {
			i++;
		}
		ArrayList<String> keys = new ArrayList<String>(Arrays.asList(ahkCode.substring(2, i - 2).split(",")));
//		for(String key : keys)
//			key.trim();
		this.keys = keys;
		int begin = i;
		i += 2;
		while(!(ahkCode.substring(i - 1, i).equals("&"))) {
			i++;
		}
		this.action = ahkCode.substring(begin, i - 1);
		begin = i;
		i += 2;
		while(!(ahkCode.substring(i - 1, i).equals("&"))) {
			i++;
		}
		this.actionArgument = ahkCode.substring(begin, i - 1);
		begin = i;
		i += 2;
		while(!(ahkCode.substring(i - 1, i).equals("&"))) {
			i++;
		}
		this.actionScope = ahkCode.substring(begin, i - 1);
		
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
	
	public ArrayList<String> toAhk() {
		ArrayList<String> code = new ArrayList<String>();
		String line1 = "";
		String line2 = "";
		String modifiers = "";
		String otherKeys = "";
		for(String key : keys) {
			switch(key) {
			case "ctrl":
				modifiers += "^";
				break;
			case "alt":
				modifiers += "!";
				break;
			case "shift":
				modifiers += "+";
				break;
			default:
				otherKeys += key;
			}
		}
		switch(action) {
		case "Hotstring":
			line1 = "::" + otherKeys + "::";
			line2 = "Send " + actionArgument;
			
			break;
//		case "Send keys to another application":
//			line1 += modifiers;
//			break;
		case "Open an application/website/file":
			line1 = modifiers + otherKeys + "::";
			line2 = "Run " + actionArgument;
			break;
		}
		code.add(line1);
		code.add(line2);
		code.add("return");
		return code;
	}
	public String toString() {
		String AL = "[";
		for(int i = 0; i < keys.size(); i++) {
			AL += keys.get(i) + ",";
		}
		AL = AL.substring(0, AL.length() - 1);
		AL += "]";
		return AL + "&" + action + "&" + actionArgument + "&"+ actionScope + "&";
	}
}
