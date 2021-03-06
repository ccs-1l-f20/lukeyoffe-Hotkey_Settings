// Generated from ly0ahk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ly0ahkParser}.
 */
public interface ly0ahkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ly0ahkParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ly0ahkParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#hotstring}.
	 * @param ctx the parse tree
	 */
	void enterHotstring(ly0ahkParser.HotstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#hotstring}.
	 * @param ctx the parse tree
	 */
	void exitHotstring(ly0ahkParser.HotstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#hotkey}.
	 * @param ctx the parse tree
	 */
	void enterHotkey(ly0ahkParser.HotkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#hotkey}.
	 * @param ctx the parse tree
	 */
	void exitHotkey(ly0ahkParser.HotkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(ly0ahkParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(ly0ahkParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#hkKeys}.
	 * @param ctx the parse tree
	 */
	void enterHkKeys(ly0ahkParser.HkKeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#hkKeys}.
	 * @param ctx the parse tree
	 */
	void exitHkKeys(ly0ahkParser.HkKeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#hsKeys}.
	 * @param ctx the parse tree
	 */
	void enterHsKeys(ly0ahkParser.HsKeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#hsKeys}.
	 * @param ctx the parse tree
	 */
	void exitHsKeys(ly0ahkParser.HsKeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#hsAction}.
	 * @param ctx the parse tree
	 */
	void enterHsAction(ly0ahkParser.HsActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#hsAction}.
	 * @param ctx the parse tree
	 */
	void exitHsAction(ly0ahkParser.HsActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ly0ahkParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ly0ahkParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(ly0ahkParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(ly0ahkParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#mods}.
	 * @param ctx the parse tree
	 */
	void enterMods(ly0ahkParser.ModsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#mods}.
	 * @param ctx the parse tree
	 */
	void exitMods(ly0ahkParser.ModsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#startkeys}.
	 * @param ctx the parse tree
	 */
	void enterStartkeys(ly0ahkParser.StartkeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#startkeys}.
	 * @param ctx the parse tree
	 */
	void exitStartkeys(ly0ahkParser.StartkeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#endkeys}.
	 * @param ctx the parse tree
	 */
	void enterEndkeys(ly0ahkParser.EndkeysContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#endkeys}.
	 * @param ctx the parse tree
	 */
	void exitEndkeys(ly0ahkParser.EndkeysContext ctx);
	/**
	 * Enter a parse tree produced by {@link ly0ahkParser#returnLn}.
	 * @param ctx the parse tree
	 */
	void enterReturnLn(ly0ahkParser.ReturnLnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ly0ahkParser#returnLn}.
	 * @param ctx the parse tree
	 */
	void exitReturnLn(ly0ahkParser.ReturnLnContext ctx);
}