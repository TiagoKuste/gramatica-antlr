// $ANTLR 3.5.1 C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g 2020-11-18 19:44:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GramaticaLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int DO=4;
	public static final int ELSE=5;
	public static final int END=6;
	public static final int IF=7;
	public static final int INT=8;
	public static final int THEN=9;
	public static final int VAR=10;
	public static final int WHILE=11;
	public static final int WS=12;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GramaticaLexer() {} 
	public GramaticaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GramaticaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g"; }

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:7:7: ( '(' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:7:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:8:7: ( ')' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:8:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:9:7: ( '*' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:9:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:10:7: ( '+' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:11:7: ( '-' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:11:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:12:7: ( '/' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:12:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:13:7: ( ':=' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:13:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:14:7: ( ';' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:14:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:15:7: ( '<' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:15:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:16:7: ( '<=' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:16:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:17:7: ( '<>' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:17:9: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:18:7: ( '=' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:18:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:19:7: ( '>' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:19:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:20:7: ( '>=' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:20:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:85:6: ( 'do' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:85:8: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:86:6: ( 'else' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:86:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:87:6: ( 'if' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:87:8: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:88:6: ( 'while' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:88:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:89:6: ( 'then' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:89:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:90:6: ( 'end' )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:90:8: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:92:6: ( ( '0' .. '9' )+ )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:92:8: ( '0' .. '9' )+
			{
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:92:8: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:93:6: ( ( 'a' .. 'z' )+ )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:93:8: ( 'a' .. 'z' )+
			{
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:93:8: ( 'a' .. 'z' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:95:6: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:95:8: ( ' ' | '\\n' | '\\r' | '\\t' )+
			{
			// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:95:8: ( ' ' | '\\n' | '\\r' | '\\t' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||LA3_0=='\r'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | DO | ELSE | IF | WHILE | THEN | END | INT | VAR | WS )
		int alt4=23;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case '*':
			{
			alt4=3;
			}
			break;
		case '+':
			{
			alt4=4;
			}
			break;
		case '-':
			{
			alt4=5;
			}
			break;
		case '/':
			{
			alt4=6;
			}
			break;
		case ':':
			{
			alt4=7;
			}
			break;
		case ';':
			{
			alt4=8;
			}
			break;
		case '<':
			{
			switch ( input.LA(2) ) {
			case '=':
				{
				alt4=10;
				}
				break;
			case '>':
				{
				alt4=11;
				}
				break;
			default:
				alt4=9;
			}
			}
			break;
		case '=':
			{
			alt4=12;
			}
			break;
		case '>':
			{
			int LA4_11 = input.LA(2);
			if ( (LA4_11=='=') ) {
				alt4=14;
			}

			else {
				alt4=13;
			}

			}
			break;
		case 'd':
			{
			int LA4_12 = input.LA(2);
			if ( (LA4_12=='o') ) {
				int LA4_25 = input.LA(3);
				if ( ((LA4_25 >= 'a' && LA4_25 <= 'z')) ) {
					alt4=22;
				}

				else {
					alt4=15;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'e':
			{
			switch ( input.LA(2) ) {
			case 'l':
				{
				int LA4_26 = input.LA(3);
				if ( (LA4_26=='s') ) {
					int LA4_32 = input.LA(4);
					if ( (LA4_32=='e') ) {
						int LA4_37 = input.LA(5);
						if ( ((LA4_37 >= 'a' && LA4_37 <= 'z')) ) {
							alt4=22;
						}

						else {
							alt4=16;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

				}
				break;
			case 'n':
				{
				int LA4_27 = input.LA(3);
				if ( (LA4_27=='d') ) {
					int LA4_33 = input.LA(4);
					if ( ((LA4_33 >= 'a' && LA4_33 <= 'z')) ) {
						alt4=22;
					}

					else {
						alt4=20;
					}

				}

				else {
					alt4=22;
				}

				}
				break;
			default:
				alt4=22;
			}
			}
			break;
		case 'i':
			{
			int LA4_14 = input.LA(2);
			if ( (LA4_14=='f') ) {
				int LA4_28 = input.LA(3);
				if ( ((LA4_28 >= 'a' && LA4_28 <= 'z')) ) {
					alt4=22;
				}

				else {
					alt4=17;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 'w':
			{
			int LA4_15 = input.LA(2);
			if ( (LA4_15=='h') ) {
				int LA4_29 = input.LA(3);
				if ( (LA4_29=='i') ) {
					int LA4_35 = input.LA(4);
					if ( (LA4_35=='l') ) {
						int LA4_39 = input.LA(5);
						if ( (LA4_39=='e') ) {
							int LA4_42 = input.LA(6);
							if ( ((LA4_42 >= 'a' && LA4_42 <= 'z')) ) {
								alt4=22;
							}

							else {
								alt4=18;
							}

						}

						else {
							alt4=22;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case 't':
			{
			int LA4_16 = input.LA(2);
			if ( (LA4_16=='h') ) {
				int LA4_30 = input.LA(3);
				if ( (LA4_30=='e') ) {
					int LA4_36 = input.LA(4);
					if ( (LA4_36=='n') ) {
						int LA4_40 = input.LA(5);
						if ( ((LA4_40 >= 'a' && LA4_40 <= 'z')) ) {
							alt4=22;
						}

						else {
							alt4=19;
						}

					}

					else {
						alt4=22;
					}

				}

				else {
					alt4=22;
				}

			}

			else {
				alt4=22;
			}

			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=21;
			}
			break;
		case 'a':
		case 'b':
		case 'c':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'v':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=22;
			}
			break;
		case '\t':
		case '\n':
		case '\r':
		case ' ':
			{
			alt4=23;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:10: T__13
				{
				mT__13(); 

				}
				break;
			case 2 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:16: T__14
				{
				mT__14(); 

				}
				break;
			case 3 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:22: T__15
				{
				mT__15(); 

				}
				break;
			case 4 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:28: T__16
				{
				mT__16(); 

				}
				break;
			case 5 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:34: T__17
				{
				mT__17(); 

				}
				break;
			case 6 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:40: T__18
				{
				mT__18(); 

				}
				break;
			case 7 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:46: T__19
				{
				mT__19(); 

				}
				break;
			case 8 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:52: T__20
				{
				mT__20(); 

				}
				break;
			case 9 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:58: T__21
				{
				mT__21(); 

				}
				break;
			case 10 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:64: T__22
				{
				mT__22(); 

				}
				break;
			case 11 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:70: T__23
				{
				mT__23(); 

				}
				break;
			case 12 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:76: T__24
				{
				mT__24(); 

				}
				break;
			case 13 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:82: T__25
				{
				mT__25(); 

				}
				break;
			case 14 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:88: T__26
				{
				mT__26(); 

				}
				break;
			case 15 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:94: DO
				{
				mDO(); 

				}
				break;
			case 16 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:97: ELSE
				{
				mELSE(); 

				}
				break;
			case 17 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:102: IF
				{
				mIF(); 

				}
				break;
			case 18 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:105: WHILE
				{
				mWHILE(); 

				}
				break;
			case 19 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:111: THEN
				{
				mTHEN(); 

				}
				break;
			case 20 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:116: END
				{
				mEND(); 

				}
				break;
			case 21 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:120: INT
				{
				mINT(); 

				}
				break;
			case 22 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:124: VAR
				{
				mVAR(); 

				}
				break;
			case 23 :
				// C:\\Users\\Karolina\\Development\\UNISINOS\\gramatica-antlr\\Gramatica.g:1:128: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
