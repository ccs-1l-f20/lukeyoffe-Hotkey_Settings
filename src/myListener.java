
import java.util.ArrayList;
import java.util.Hashtable;

public class myListener extends ly0ahkBaseListener {
	private int allInfoIndex = 0;
	private ArrayList<Hashtable<String, String>> allInfo = new ArrayList<Hashtable<String, String>>();
//	private Hashtable<String, Object> info = new Hashtable<String, Object>();
	public ArrayList<Hashtable<String, String>> getAllInfo(){
		return allInfo;
	}
	@Override public void enterScript(ly0ahkParser.ScriptContext ctx) { }

	@Override public void exitScript(ly0ahkParser.ScriptContext ctx) { }

	@Override public void enterHotstring(ly0ahkParser.HotstringContext ctx) {
		allInfo.add(new Hashtable<String, String>());
	}

	@Override public void exitHotstring(ly0ahkParser.HotstringContext ctx) {
		allInfoIndex++;
	}

	@Override public void enterHotkey(ly0ahkParser.HotkeyContext ctx) {
		allInfo.add(new Hashtable<String, String>());
	}

	@Override public void exitHotkey(ly0ahkParser.HotkeyContext ctx) {
		allInfoIndex++;
	}

	@Override public void enterHkKeys(ly0ahkParser.HkKeysContext ctx) {
		String ret = "hkKeys: " + ctx.KEY().getText();
//		ArrayList<String> keys = new ArrayList<String>();
//		keys.add(ctx.endkeys().getText().toString());
		allInfo.get(allInfoIndex).put("keys", ctx.KEY().getText());
//		System.out.print(ret);
	}

	@Override public void exitHkKeys(ly0ahkParser.HkKeysContext ctx) { }

	@Override public void enterHsKeys(ly0ahkParser.HsKeysContext ctx) {
		String ret = "hkKeys: " + ctx.KEYS().getText();
//		ArrayList<String> keys = new ArrayList<String>();
//		keys.add(ctx.endkeys().getText().toString());
		allInfo.get(allInfoIndex).put("keys", ctx.KEYS().getText());
//		System.out.print(ret);
	}

	@Override public void exitHsKeys(ly0ahkParser.HsKeysContext ctx) { }

	@Override public void enterHsAction(ly0ahkParser.HsActionContext ctx) {
		String ret = "action: Hotstring";
		allInfo.get(allInfoIndex).put("action", "Hotstring");
//		System.out.println(ret);
	}

	@Override public void exitHsAction(ly0ahkParser.HsActionContext ctx) { }

	@Override public void enterAction(ly0ahkParser.ActionContext ctx) {
		String out = "hkAction: ";
		out += "Open an application/website/file";
//		else if (ctx.SEND() != null) {
//			out += ctx.SEND().getText();
		allInfo.get(allInfoIndex).put("action", "Open an application/website/file");
//		System.out.println(out);
	}

	@Override public void exitAction(ly0ahkParser.ActionContext ctx) { }

	@Override public void enterArg(ly0ahkParser.ArgContext ctx) {
		String ret = "argument: " + ctx.ARG().getText().substring(1);
		allInfo.get(allInfoIndex).put("actionArgument", ctx.ARG().getText().substring(1));
//		System.out.println(ret);
	}

	@Override public void exitArg(ly0ahkParser.ArgContext ctx) { }

	@Override public void enterMods(ly0ahkParser.ModsContext ctx) {
//		ArrayList<String> keys = new ArrayList<String>();
		String keys = "";
		String out = "";
		if(ctx.SHIFT().toString().length() > 2) {
			out += ctx.SHIFT();
			keys += "shift,";
		}
		if(ctx.CTRL().toString().length() > 2) {
			out += ctx.CTRL();
			keys += "ctrl,";
		}
		if(ctx.ALT().toString().length() > 2) {
			out += ctx.ALT();
			keys += "alt,";
		}
//		keys.add((String) allInfo.get(allInfoIndex).get("keys"));
		keys += allInfo.get(allInfoIndex).get("keys");
		allInfo.get(allInfoIndex).put("keys", keys);
//		System.out.println(out);
	}
	
	@Override public void exitMods(ly0ahkParser.ModsContext ctx) { }
	
	@Override public void enterStartkeys(ly0ahkParser.StartkeysContext ctx) { }
	
	@Override public void exitStartkeys(ly0ahkParser.StartkeysContext ctx) { }
	
	@Override public void enterEndkeys(ly0ahkParser.EndkeysContext ctx) { }
	
	@Override public void exitEndkeys(ly0ahkParser.EndkeysContext ctx) { }

}
