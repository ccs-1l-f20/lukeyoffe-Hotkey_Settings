// Generated from c:\Users\Luke Yoffe\eclipse-workspace\Hotkey Settings with ANTLR\src\ly0ahk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ly0ahkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, RETURN=5, RUN=6, SEND=7, KEY=8, KEYS=9, 
		DOUBLECOLON=10, SHIFT=11, CTRL=12, ALT=13, ARG=14, NEWLINE=15;
	public static final int
		RULE_script = 0, RULE_hotstring = 1, RULE_hotkey = 2, RULE_ignore = 3, 
		RULE_hkKeys = 4, RULE_hsKeys = 5, RULE_hsAction = 6, RULE_action = 7, 
		RULE_arg = 8, RULE_mods = 9, RULE_startkeys = 10, RULE_endkeys = 11, RULE_returnLn = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "hotstring", "hotkey", "ignore", "hkKeys", "hsKeys", "hsAction", 
			"action", "arg", "mods", "startkeys", "endkeys", "returnLn"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#NoEnv'", "'#SingleInstance force'", "'SendMode Input'", "'SetWorkingDir %A_ScriptDir%'", 
			"'return'", "'Run'", "'Send'", null, null, "'::'", "'+'", "'^'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "RETURN", "RUN", "SEND", "KEY", "KEYS", 
			"DOUBLECOLON", "SHIFT", "CTRL", "ALT", "ARG", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ly0ahk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ly0ahkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ScriptContext extends ParserRuleContext {
		public List<HotkeyContext> hotkey() {
			return getRuleContexts(HotkeyContext.class);
		}
		public HotkeyContext hotkey(int i) {
			return getRuleContext(HotkeyContext.class,i);
		}
		public List<HotstringContext> hotstring() {
			return getRuleContexts(HotstringContext.class);
		}
		public HotstringContext hotstring(int i) {
			return getRuleContext(HotstringContext.class,i);
		}
		public List<IgnoreContext> ignore() {
			return getRuleContexts(IgnoreContext.class);
		}
		public IgnoreContext ignore(int i) {
			return getRuleContext(IgnoreContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(29);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SHIFT:
				case CTRL:
				case ALT:
					{
					setState(26);
					hotkey();
					}
					break;
				case DOUBLECOLON:
					{
					setState(27);
					hotstring();
					}
					break;
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case NEWLINE:
					{
					setState(28);
					ignore();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << DOUBLECOLON) | (1L << SHIFT) | (1L << CTRL) | (1L << ALT) | (1L << NEWLINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HotstringContext extends ParserRuleContext {
		public HsKeysContext hsKeys() {
			return getRuleContext(HsKeysContext.class,0);
		}
		public HsActionContext hsAction() {
			return getRuleContext(HsActionContext.class,0);
		}
		public ReturnLnContext returnLn() {
			return getRuleContext(ReturnLnContext.class,0);
		}
		public HotstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hotstring; }
	}

	public final HotstringContext hotstring() throws RecognitionException {
		HotstringContext _localctx = new HotstringContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hotstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			hsKeys();
			setState(34);
			hsAction();
			setState(35);
			returnLn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HotkeyContext extends ParserRuleContext {
		public HkKeysContext hkKeys() {
			return getRuleContext(HkKeysContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ReturnLnContext returnLn() {
			return getRuleContext(ReturnLnContext.class,0);
		}
		public HotkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hotkey; }
	}

	public final HotkeyContext hotkey() throws RecognitionException {
		HotkeyContext _localctx = new HotkeyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hotkey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			hkKeys();
			setState(38);
			action();
			setState(39);
			returnLn();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(ly0ahkParser.NEWLINE, 0); }
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ignore);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(T__0);
				setState(42);
				match(NEWLINE);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__1);
				setState(44);
				match(NEWLINE);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(T__2);
				setState(46);
				match(NEWLINE);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__3);
				setState(48);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HkKeysContext extends ParserRuleContext {
		public ModsContext mods() {
			return getRuleContext(ModsContext.class,0);
		}
		public TerminalNode KEY() { return getToken(ly0ahkParser.KEY, 0); }
		public EndkeysContext endkeys() {
			return getRuleContext(EndkeysContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ly0ahkParser.NEWLINE, 0); }
		public HkKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hkKeys; }
	}

	public final HkKeysContext hkKeys() throws RecognitionException {
		HkKeysContext _localctx = new HkKeysContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hkKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			mods();
			setState(53);
			match(KEY);
			setState(54);
			endkeys();
			setState(55);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HsKeysContext extends ParserRuleContext {
		public StartkeysContext startkeys() {
			return getRuleContext(StartkeysContext.class,0);
		}
		public TerminalNode KEYS() { return getToken(ly0ahkParser.KEYS, 0); }
		public EndkeysContext endkeys() {
			return getRuleContext(EndkeysContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ly0ahkParser.NEWLINE, 0); }
		public HsKeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hsKeys; }
	}

	public final HsKeysContext hsKeys() throws RecognitionException {
		HsKeysContext _localctx = new HsKeysContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hsKeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			startkeys();
			setState(58);
			match(KEYS);
			setState(59);
			endkeys();
			setState(60);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HsActionContext extends ParserRuleContext {
		public TerminalNode SEND() { return getToken(ly0ahkParser.SEND, 0); }
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ly0ahkParser.NEWLINE, 0); }
		public HsActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hsAction; }
	}

	public final HsActionContext hsAction() throws RecognitionException {
		HsActionContext _localctx = new HsActionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_hsAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(SEND);
			setState(63);
			arg();
			setState(64);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ArgContext arg() {
			return getRuleContext(ArgContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ly0ahkParser.NEWLINE, 0); }
		public TerminalNode RUN() { return getToken(ly0ahkParser.RUN, 0); }
		public TerminalNode SEND() { return getToken(ly0ahkParser.SEND, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==RUN || _la==SEND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
			arg();
			setState(68);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgContext extends ParserRuleContext {
		public TerminalNode ARG() { return getToken(ly0ahkParser.ARG, 0); }
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(ARG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModsContext extends ParserRuleContext {
		public List<TerminalNode> SHIFT() { return getTokens(ly0ahkParser.SHIFT); }
		public TerminalNode SHIFT(int i) {
			return getToken(ly0ahkParser.SHIFT, i);
		}
		public List<TerminalNode> CTRL() { return getTokens(ly0ahkParser.CTRL); }
		public TerminalNode CTRL(int i) {
			return getToken(ly0ahkParser.CTRL, i);
		}
		public List<TerminalNode> ALT() { return getTokens(ly0ahkParser.ALT); }
		public TerminalNode ALT(int i) {
			return getToken(ly0ahkParser.ALT, i);
		}
		public ModsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mods; }
	}

	public final ModsContext mods() throws RecognitionException {
		ModsContext _localctx = new ModsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mods);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHIFT) | (1L << CTRL) | (1L << ALT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHIFT) | (1L << CTRL) | (1L << ALT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartkeysContext extends ParserRuleContext {
		public TerminalNode DOUBLECOLON() { return getToken(ly0ahkParser.DOUBLECOLON, 0); }
		public StartkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startkeys; }
	}

	public final StartkeysContext startkeys() throws RecognitionException {
		StartkeysContext _localctx = new StartkeysContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_startkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DOUBLECOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndkeysContext extends ParserRuleContext {
		public TerminalNode DOUBLECOLON() { return getToken(ly0ahkParser.DOUBLECOLON, 0); }
		public EndkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endkeys; }
	}

	public final EndkeysContext endkeys() throws RecognitionException {
		EndkeysContext _localctx = new EndkeysContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(DOUBLECOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnLnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ly0ahkParser.RETURN, 0); }
		public TerminalNode NEWLINE() { return getToken(ly0ahkParser.NEWLINE, 0); }
		public ReturnLnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnLn; }
	}

	public final ReturnLnContext returnLn() throws RecognitionException {
		ReturnLnContext _localctx = new ReturnLnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnLn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(RETURN);
			setState(82);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21W\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\65\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\6\13L\n\13\r\13\16\13M\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\b\t\3\2\r\17\2Q\2\37"+
		"\3\2\2\2\4#\3\2\2\2\6\'\3\2\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f;\3\2\2\2\16"+
		"@\3\2\2\2\20D\3\2\2\2\22H\3\2\2\2\24K\3\2\2\2\26O\3\2\2\2\30Q\3\2\2\2"+
		"\32S\3\2\2\2\34 \5\6\4\2\35 \5\4\3\2\36 \5\b\5\2\37\34\3\2\2\2\37\35\3"+
		"\2\2\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#$\5"+
		"\f\7\2$%\5\16\b\2%&\5\32\16\2&\5\3\2\2\2\'(\5\n\6\2()\5\20\t\2)*\5\32"+
		"\16\2*\7\3\2\2\2+,\7\3\2\2,\65\7\21\2\2-.\7\4\2\2.\65\7\21\2\2/\60\7\5"+
		"\2\2\60\65\7\21\2\2\61\62\7\6\2\2\62\65\7\21\2\2\63\65\7\21\2\2\64+\3"+
		"\2\2\2\64-\3\2\2\2\64/\3\2\2\2\64\61\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2"+
		"\2\66\67\5\24\13\2\678\7\n\2\289\5\30\r\29:\7\21\2\2:\13\3\2\2\2;<\5\26"+
		"\f\2<=\7\13\2\2=>\5\30\r\2>?\7\21\2\2?\r\3\2\2\2@A\7\t\2\2AB\5\22\n\2"+
		"BC\7\21\2\2C\17\3\2\2\2DE\t\2\2\2EF\5\22\n\2FG\7\21\2\2G\21\3\2\2\2HI"+
		"\7\20\2\2I\23\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2N\25\3\2\2\2OP\7\f\2\2P\27\3\2\2\2QR\7\f\2\2R\31\3\2\2\2ST\7\7\2\2T"+
		"U\7\21\2\2U\33\3\2\2\2\6\37!\64M";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}