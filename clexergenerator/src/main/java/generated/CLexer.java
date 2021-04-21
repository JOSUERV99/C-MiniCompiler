// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: clexergenerator/CLexerSpec.flex

package generated;

import types.Token;
import types.OperatorToken;
import types.KeywordToken;
import types.LiteralToken;
import types.IdentifierToken;
import types.IllegalTokenException;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class CLexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\1\1\1\2\1\3\1\4\1\5\1\6\22\0"+
    "\1\7\1\10\3\0\1\10\1\11\1\12\2\13\1\10"+
    "\1\14\1\13\1\15\1\13\1\10\1\16\11\17\2\13"+
    "\1\20\1\21\1\22\1\13\1\0\5\23\1\24\21\25"+
    "\1\26\2\25\1\13\1\1\1\13\1\10\1\25\1\0"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\25\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\25\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\1\55\1\56\1\13\1\57\2\13\6\0\1\4\u01a2\0"+
    "\2\4\326\0\u0100\4";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\3\1\1\3\3\2\4\2\3"+
    "\20\5\1\3\3\0\1\4\6\5\1\6\5\5\1\6"+
    "\14\5\10\4\32\5\5\4\12\5\1\4\15\5";

  private static int [] zzUnpackAction() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\60\0\140\0\220\0\300\0\360\0\60"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0"+
    "\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540\0\u0570"+
    "\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0"+
    "\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0240"+
    "\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\60\0\u0ab0\0\u0ae0\0\u0b10"+
    "\0\u0b40\0\u0b70\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90"+
    "\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u0de0\0\u0e10"+
    "\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60\0\u0f90"+
    "\0\u0fc0\0\u0ff0\0\u1020\0\u1050\0\u1080\0\u10b0\0\u10e0\0\u1110"+
    "\0\u1140\0\u05a0\0\u1170\0\u11a0\0\u11d0\0\u1200\0\u1230\0\u1260"+
    "\0\u1290\0\u12c0\0\u12f0\0\u1320\0\u1350\0\u0240\0\u1380\0\u13b0"+
    "\0\u13e0\0\u1410\0\u1440\0\u1470\0\u14a0\0\u14d0\0\u1500\0\u1530"+
    "\0\u1560\0\u1590\0\u15c0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\2\3\1\2\1\3\1\4\1\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\5"+
    "\1\16\4\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\17\1\27\1\17\1\30\4\17\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\3\17\1\37\63\0\1\3"+
    "\75\0\1\10\47\0\1\10\7\0\1\10\36\0\1\40"+
    "\3\0\2\40\1\0\50\40\15\0\1\10\4\0\1\10"+
    "\53\0\1\10\3\0\2\10\35\0\3\41\4\0\17\41"+
    "\1\42\25\41\1\42\2\41\1\42\3\41\4\0\7\41"+
    "\2\43\40\41\20\0\1\5\1\10\57\0\1\10\1\5"+
    "\53\0\2\17\3\0\34\17\17\0\2\17\3\0\26\17"+
    "\1\44\5\17\17\0\2\17\3\0\23\17\1\45\10\17"+
    "\17\0\2\17\3\0\4\17\1\46\6\17\1\47\5\17"+
    "\1\50\12\17\17\0\2\17\3\0\10\17\1\51\10\17"+
    "\1\52\12\17\17\0\2\17\3\0\16\17\1\46\1\17"+
    "\1\53\10\17\1\54\2\17\17\0\2\17\3\0\4\17"+
    "\1\55\11\17\1\56\2\17\1\57\12\17\17\0\2\17"+
    "\3\0\21\17\1\44\12\17\17\0\2\17\3\0\11\17"+
    "\1\60\6\17\1\61\13\17\17\0\2\17\3\0\21\17"+
    "\1\62\12\17\17\0\2\17\3\0\10\17\1\63\23\17"+
    "\17\0\2\17\3\0\13\17\1\64\1\65\10\17\1\66"+
    "\2\17\1\67\3\17\17\0\2\17\3\0\23\17\1\70"+
    "\6\17\1\71\1\17\17\0\2\17\3\0\20\17\1\72"+
    "\13\17\17\0\2\17\3\0\21\17\1\73\12\17\17\0"+
    "\2\17\3\0\13\17\1\74\20\17\22\0\1\10\35\0"+
    "\1\10\12\0\1\75\63\0\1\76\1\77\56\0\1\100"+
    "\1\101\3\0\2\102\2\0\6\103\23\0\3\41\4\0"+
    "\7\41\2\104\40\41\16\0\2\17\3\0\25\17\1\105"+
    "\6\17\17\0\2\17\3\0\10\17\1\106\23\17\17\0"+
    "\2\17\3\0\24\17\1\107\7\17\17\0\2\17\3\0"+
    "\4\17\1\57\27\17\17\0\2\17\3\0\20\17\1\110"+
    "\13\17\17\0\2\17\3\0\11\17\1\111\22\17\17\0"+
    "\2\17\3\0\26\17\1\112\5\17\17\0\2\17\3\0"+
    "\26\17\1\113\5\17\17\0\2\17\3\0\25\17\1\114"+
    "\6\17\17\0\2\17\3\0\16\17\1\115\15\17\17\0"+
    "\2\17\3\0\21\17\1\116\12\17\17\0\2\17\3\0"+
    "\23\17\1\60\10\17\17\0\2\17\3\0\25\17\1\60"+
    "\6\17\17\0\2\17\3\0\20\17\1\117\13\17\17\0"+
    "\2\17\3\0\12\17\1\120\12\17\1\121\6\17\17\0"+
    "\2\17\3\0\21\17\1\122\12\17\17\0\2\17\3\0"+
    "\12\17\1\123\20\17\1\124\17\0\2\17\3\0\4\17"+
    "\1\125\16\17\1\126\10\17\17\0\2\17\3\0\14\17"+
    "\1\127\17\17\17\0\2\17\3\0\26\17\1\130\5\17"+
    "\17\0\2\17\3\0\22\17\1\131\11\17\17\0\2\17"+
    "\3\0\14\17\1\132\7\17\1\133\7\17\17\0\2\17"+
    "\3\0\14\17\1\134\1\17\1\135\15\17\17\0\2\17"+
    "\3\0\14\17\1\136\17\17\25\0\1\75\7\0\1\137"+
    "\41\0\2\77\4\0\1\75\7\0\1\137\41\0\2\140"+
    "\3\0\2\102\2\0\5\103\1\141\41\0\2\101\3\0"+
    "\2\102\2\0\5\103\1\141\41\0\2\102\3\0\2\102"+
    "\51\0\2\103\7\0\6\103\23\0\3\41\4\0\7\41"+
    "\2\104\4\41\1\142\7\41\1\143\23\41\16\0\2\17"+
    "\3\0\21\17\1\60\12\17\17\0\2\17\3\0\4\17"+
    "\1\144\27\17\17\0\2\17\3\0\10\17\1\60\23\17"+
    "\17\0\2\17\3\0\24\17\1\61\1\145\6\17\17\0"+
    "\2\17\3\0\4\17\1\146\27\17\17\0\2\17\3\0"+
    "\5\17\1\136\26\17\17\0\2\17\3\0\17\17\1\60"+
    "\14\17\17\0\2\17\3\0\10\17\1\147\23\17\17\0"+
    "\2\17\3\0\24\17\1\130\7\17\17\0\2\17\3\0"+
    "\4\17\1\61\27\17\17\0\2\17\3\0\12\17\1\60"+
    "\21\17\17\0\2\17\3\0\14\17\1\150\17\17\17\0"+
    "\2\17\3\0\26\17\1\147\5\17\17\0\2\17\3\0"+
    "\23\17\1\61\10\17\17\0\2\17\3\0\20\17\1\151"+
    "\13\17\17\0\2\17\3\0\10\17\1\152\23\17\17\0"+
    "\2\17\3\0\25\17\1\153\6\17\17\0\2\17\3\0"+
    "\26\17\1\154\5\17\17\0\2\17\3\0\25\17\1\155"+
    "\6\17\17\0\2\17\3\0\10\17\1\156\23\17\17\0"+
    "\2\17\3\0\10\17\1\157\23\17\17\0\2\17\3\0"+
    "\21\17\1\160\12\17\17\0\2\17\3\0\14\17\1\161"+
    "\17\17\17\0\2\17\3\0\7\17\1\60\24\17\17\0"+
    "\2\17\3\0\4\17\1\162\27\17\17\0\2\17\3\0"+
    "\16\17\1\107\15\17\25\0\1\75\51\0\2\140\3\0"+
    "\2\102\2\0\6\103\41\0\2\103\4\0\1\75\2\0"+
    "\6\103\41\0\1\76\1\77\4\0\1\75\51\0\2\17"+
    "\3\0\15\17\1\60\16\17\17\0\2\17\3\0\14\17"+
    "\1\163\17\17\17\0\2\17\3\0\26\17\1\164\5\17"+
    "\17\0\2\17\3\0\23\17\1\160\10\17\17\0\2\17"+
    "\3\0\24\17\1\165\7\17\17\0\2\17\3\0\10\17"+
    "\1\134\23\17\17\0\2\17\3\0\21\17\1\166\12\17"+
    "\17\0\2\17\3\0\14\17\1\167\17\17\17\0\2\17"+
    "\3\0\6\17\1\61\25\17\17\0\2\17\3\0\6\17"+
    "\1\170\25\17\17\0\2\17\3\0\7\17\1\171\24\17"+
    "\17\0\2\17\3\0\20\17\1\60\13\17\17\0\2\17"+
    "\3\0\12\17\1\123\21\17\17\0\2\17\3\0\25\17"+
    "\1\74\6\17\17\0\2\17\3\0\20\17\1\172\13\17"+
    "\17\0\2\17\3\0\16\17\1\61\15\17\17\0\2\17"+
    "\3\0\25\17\1\173\6\17\17\0\2\17\3\0\11\17"+
    "\1\60\22\17\17\0\2\17\3\0\6\17\1\60\25\17"+
    "\17\0\2\17\3\0\13\17\1\60\20\17\17\0\2\17"+
    "\3\0\10\17\1\166\23\17\17\0\2\17\3\0\26\17"+
    "\1\107\5\17\17\0\2\17\3\0\10\17\1\57\23\17"+
    "\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5616];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\1\11\27\1\3\0\32\1\1\11"+
    "\76\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[123];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
	/*class content*/


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public CLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) throws IllegalTokenException {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new IllegalTokenException(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  throws IllegalTokenException {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException, IllegalTokenException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new IllegalTokenException("Illegal character <" + yytext() + ">" + "[Line:" + yyline + ",Column:" + yycolumn + "]");
            }
            // fall through
          case 7: break;
          case 2:
            { /* do nothing */
            }
            // fall through
          case 8: break;
          case 3:
            { return new OperatorToken(yyline, yycolumn, yytext());
            }
            // fall through
          case 9: break;
          case 4:
            { return new LiteralToken(yyline, yycolumn, yytext());
            }
            // fall through
          case 10: break;
          case 5:
            { return new IdentifierToken(yyline, yycolumn, yytext());
            }
            // fall through
          case 11: break;
          case 6:
            { return new KeywordToken(yyline, yycolumn, yytext());
            }
            // fall through
          case 12: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
