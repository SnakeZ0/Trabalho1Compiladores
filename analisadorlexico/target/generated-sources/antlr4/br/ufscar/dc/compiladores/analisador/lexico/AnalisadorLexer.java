// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.analisador.lexico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AnalisadorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, IDENT=4, CADEIA=5, COMENTARIO=6, 
		WS=7, OP_REL=8, OP_ARIT=9, DELIM=10, ABREPAR=11, FECHAPAR=12, VIR=13, 
		CADEIA_LITERAL_NAO_FECHADA=14, COMENTARIO_NAO_FECHADO=15, ERRO=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "ESC_SEQ", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "VIR", "CADEIA_LITERAL_NAO_FECHADA", 
			"COMENTARIO_NAO_FECHADO", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "':'", "'('", 
			"')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "IDENT", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "ABREPAR", "FECHAPAR", "VIR", "CADEIA_LITERAL_NAO_FECHADA", 
			"COMENTARIO_NAO_FECHADO", "ERRO"
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


	public AnalisadorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AnalisadorLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u00be\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000Z\b\u0000"+
		"\u0001\u0001\u0003\u0001]\b\u0001\u0001\u0001\u0004\u0001`\b\u0001\u000b"+
		"\u0001\f\u0001a\u0001\u0002\u0003\u0002e\b\u0002\u0001\u0002\u0004\u0002"+
		"h\b\u0002\u000b\u0002\f\u0002i\u0001\u0002\u0001\u0002\u0004\u0002n\b"+
		"\u0002\u000b\u0002\f\u0002o\u0003\u0002r\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004~\b\u0004\n\u0004\f\u0004\u0081\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u008a\b\u0006\n\u0006\f\u0006\u008d\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u009e"+
		"\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ad"+
		"\b\u000e\n\u000e\f\u000e\u00b0\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00b6\b\u000f\n\u000f\f\u000f\u00b9\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0000\r\u0006\u000f"+
		"\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d\u000e"+
		"\u001f\u000f!\u0010\u0001\u0000\n\u0002\u0000++--\u0002\u0000AZaz\u0003"+
		"\u000009AZaz\u0002\u0000\"\"\\\\\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r"+
		"\r  \u0003\u0000*+--//\u0002\u0000\"\"\'\'\u0004\u0000\n\n\"\"\'\'\\\\"+
		"\u0003\u0000\n\n\r\r}}\u00d4\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0001Y\u0001\u0000\u0000\u0000\u0003\\\u0001\u0000"+
		"\u0000\u0000\u0005d\u0001\u0000\u0000\u0000\u0007s\u0001\u0000\u0000\u0000"+
		"\tz\u0001\u0000\u0000\u0000\u000b\u0084\u0001\u0000\u0000\u0000\r\u0087"+
		"\u0001\u0000\u0000\u0000\u000f\u0091\u0001\u0000\u0000\u0000\u0011\u009d"+
		"\u0001\u0000\u0000\u0000\u0013\u009f\u0001\u0000\u0000\u0000\u0015\u00a1"+
		"\u0001\u0000\u0000\u0000\u0017\u00a3\u0001\u0000\u0000\u0000\u0019\u00a5"+
		"\u0001\u0000\u0000\u0000\u001b\u00a7\u0001\u0000\u0000\u0000\u001d\u00a9"+
		"\u0001\u0000\u0000\u0000\u001f\u00b3\u0001\u0000\u0000\u0000!\u00bc\u0001"+
		"\u0000\u0000\u0000#$\u0005d\u0000\u0000$%\u0005e\u0000\u0000%&\u0005c"+
		"\u0000\u0000&\'\u0005l\u0000\u0000\'(\u0005a\u0000\u0000()\u0005r\u0000"+
		"\u0000)Z\u0005e\u0000\u0000*+\u0005a\u0000\u0000+,\u0005l\u0000\u0000"+
		",-\u0005g\u0000\u0000-.\u0005o\u0000\u0000./\u0005r\u0000\u0000/0\u0005"+
		"i\u0000\u000001\u0005t\u0000\u000012\u0005m\u0000\u00002Z\u0005o\u0000"+
		"\u000034\u0005i\u0000\u000045\u0005n\u0000\u000056\u0005t\u0000\u0000"+
		"67\u0005e\u0000\u000078\u0005i\u0000\u000089\u0005r\u0000\u00009Z\u0005"+
		"o\u0000\u0000:;\u0005l\u0000\u0000;<\u0005i\u0000\u0000<=\u0005t\u0000"+
		"\u0000=>\u0005e\u0000\u0000>?\u0005r\u0000\u0000?@\u0005a\u0000\u0000"+
		"@Z\u0005l\u0000\u0000AB\u0005l\u0000\u0000BC\u0005e\u0000\u0000CD\u0005"+
		"i\u0000\u0000DZ\u0005a\u0000\u0000EF\u0005e\u0000\u0000FG\u0005s\u0000"+
		"\u0000GH\u0005c\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005e\u0000\u0000"+
		"JK\u0005v\u0000\u0000KZ\u0005a\u0000\u0000LM\u0005f\u0000\u0000MN\u0005"+
		"i\u0000\u0000NO\u0005m\u0000\u0000OP\u0005_\u0000\u0000PQ\u0005a\u0000"+
		"\u0000QR\u0005l\u0000\u0000RS\u0005g\u0000\u0000ST\u0005o\u0000\u0000"+
		"TU\u0005r\u0000\u0000UV\u0005i\u0000\u0000VW\u0005t\u0000\u0000WX\u0005"+
		"m\u0000\u0000XZ\u0005o\u0000\u0000Y#\u0001\u0000\u0000\u0000Y*\u0001\u0000"+
		"\u0000\u0000Y3\u0001\u0000\u0000\u0000Y:\u0001\u0000\u0000\u0000YA\u0001"+
		"\u0000\u0000\u0000YE\u0001\u0000\u0000\u0000YL\u0001\u0000\u0000\u0000"+
		"Z\u0002\u0001\u0000\u0000\u0000[]\u0007\u0000\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001\u0000\u0000\u0000^`\u0002"+
		"09\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0004\u0001\u0000\u0000\u0000"+
		"ce\u0007\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fh\u000209\u0000gf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jq\u0001\u0000\u0000\u0000km\u0005.\u0000\u0000ln\u000209\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000qk\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\u0006\u0001\u0000\u0000\u0000"+
		"sw\u0007\u0001\u0000\u0000tv\u0007\u0002\u0000\u0000ut\u0001\u0000\u0000"+
		"\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000x\b\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z\u007f"+
		"\u0005\"\u0000\u0000{~\u0003\u000b\u0005\u0000|~\b\u0003\u0000\u0000}"+
		"{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0005\"\u0000\u0000\u0083\n\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\\\u0000\u0000\u0085\u0086\u0005\"\u0000\u0000\u0086"+
		"\f\u0001\u0000\u0000\u0000\u0087\u008b\u0005{\u0000\u0000\u0088\u008a"+
		"\b\u0004\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001"+
		"\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005}\u0000\u0000\u008f\u0090\u0006\u0006"+
		"\u0000\u0000\u0090\u000e\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0005"+
		"\u0000\u0000\u0092\u0093\u0006\u0007\u0001\u0000\u0093\u0010\u0001\u0000"+
		"\u0000\u0000\u0094\u009e\u0005>\u0000\u0000\u0095\u0096\u0005>\u0000\u0000"+
		"\u0096\u009e\u0005=\u0000\u0000\u0097\u009e\u0005<\u0000\u0000\u0098\u0099"+
		"\u0005<\u0000\u0000\u0099\u009e\u0005=\u0000\u0000\u009a\u009b\u0005<"+
		"\u0000\u0000\u009b\u009e\u0005>\u0000\u0000\u009c\u009e\u0005=\u0000\u0000"+
		"\u009d\u0094\u0001\u0000\u0000\u0000\u009d\u0095\u0001\u0000\u0000\u0000"+
		"\u009d\u0097\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000"+
		"\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u0012\u0001\u0000\u0000\u0000\u009f\u00a0\u0007\u0006\u0000\u0000"+
		"\u00a0\u0014\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005:\u0000\u0000\u00a2"+
		"\u0016\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005(\u0000\u0000\u00a4\u0018"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005)\u0000\u0000\u00a6\u001a\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005,\u0000\u0000\u00a8\u001c\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ae\u0007\u0007\u0000\u0000\u00aa\u00ad\u0003\u000b"+
		"\u0005\u0000\u00ab\u00ad\b\b\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000"+
		"\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0005\n\u0000\u0000\u00b2\u001e\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b7\u0005{\u0000\u0000\u00b4\u00b6\b\t\u0000\u0000\u00b5\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0007\u0004\u0000\u0000\u00bb \u0001\u0000\u0000\u0000\u00bc\u00bd\t"+
		"\u0000\u0000\u0000\u00bd\"\u0001\u0000\u0000\u0000\u0010\u0000Y\\adio"+
		"qw}\u007f\u008b\u009d\u00ac\u00ae\u00b7\u0002\u0001\u0006\u0000\u0001"+
		"\u0007\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}