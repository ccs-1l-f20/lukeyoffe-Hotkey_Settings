// Generated from ly0ahk.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ly0ahkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, RETURN=5, RUN=6, SEND=7, KEY=8, KEYS=9, 
		DOUBLECOLON=10, SHIFT=11, CTRL=12, ALT=13, ARG=14, NEWLINE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "RETURN", "RUN", "SEND", "KEY", "KEYS", 
			"DOUBLECOLON", "SHIFT", "CTRL", "ALT", "ARG", "NEWLINE"
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


	public ly0ahkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ly0ahk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\6"+
		"\n}\n\n\r\n\16\n~\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\6"+
		"\17\u008c\n\17\r\17\16\17\u008d\3\20\5\20\u0091\n\20\3\20\3\20\2\2\21"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21\3\2\4\5\2\62;C\\c|\7\2\f\f\17\17\u00e4\u00e4\u203b\u203b\u20ae"+
		"\u20ae\2\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3"+
		"\2\2\2\5(\3\2\2\2\7>\3\2\2\2\tM\3\2\2\2\13i\3\2\2\2\rp\3\2\2\2\17t\3\2"+
		"\2\2\21y\3\2\2\2\23|\3\2\2\2\25\u0080\3\2\2\2\27\u0083\3\2\2\2\31\u0085"+
		"\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u0090\3\2\2\2!\"\7%\2\2"+
		"\"#\7P\2\2#$\7q\2\2$%\7G\2\2%&\7p\2\2&\'\7x\2\2\'\4\3\2\2\2()\7%\2\2)"+
		"*\7U\2\2*+\7k\2\2+,\7p\2\2,-\7i\2\2-.\7n\2\2./\7g\2\2/\60\7K\2\2\60\61"+
		"\7p\2\2\61\62\7u\2\2\62\63\7v\2\2\63\64\7c\2\2\64\65\7p\2\2\65\66\7e\2"+
		"\2\66\67\7g\2\2\678\7\"\2\289\7h\2\29:\7q\2\2:;\7t\2\2;<\7e\2\2<=\7g\2"+
		"\2=\6\3\2\2\2>?\7U\2\2?@\7g\2\2@A\7p\2\2AB\7f\2\2BC\7O\2\2CD\7q\2\2DE"+
		"\7f\2\2EF\7g\2\2FG\7\"\2\2GH\7K\2\2HI\7p\2\2IJ\7r\2\2JK\7w\2\2KL\7v\2"+
		"\2L\b\3\2\2\2MN\7U\2\2NO\7g\2\2OP\7v\2\2PQ\7Y\2\2QR\7q\2\2RS\7t\2\2ST"+
		"\7m\2\2TU\7k\2\2UV\7p\2\2VW\7i\2\2WX\7F\2\2XY\7k\2\2YZ\7t\2\2Z[\7\"\2"+
		"\2[\\\7\'\2\2\\]\7C\2\2]^\7a\2\2^_\7U\2\2_`\7e\2\2`a\7t\2\2ab\7k\2\2b"+
		"c\7r\2\2cd\7v\2\2de\7F\2\2ef\7k\2\2fg\7t\2\2gh\7\'\2\2h\n\3\2\2\2ij\7"+
		"t\2\2jk\7g\2\2kl\7v\2\2lm\7w\2\2mn\7t\2\2no\7p\2\2o\f\3\2\2\2pq\7T\2\2"+
		"qr\7w\2\2rs\7p\2\2s\16\3\2\2\2tu\7U\2\2uv\7g\2\2vw\7p\2\2wx\7f\2\2x\20"+
		"\3\2\2\2yz\t\2\2\2z\22\3\2\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2"+
		"~\177\3\2\2\2\177\24\3\2\2\2\u0080\u0081\7<\2\2\u0081\u0082\7<\2\2\u0082"+
		"\26\3\2\2\2\u0083\u0084\7-\2\2\u0084\30\3\2\2\2\u0085\u0086\7`\2\2\u0086"+
		"\32\3\2\2\2\u0087\u0088\7#\2\2\u0088\34\3\2\2\2\u0089\u008b\7\"\2\2\u008a"+
		"\u008c\n\3\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\36\3\2\2\2\u008f\u0091\7\17\2\2\u0090\u008f"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\f\2\2\u0093"+
		" \3\2\2\2\6\2~\u008d\u0090\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}