package pakki;
 
public class Token {
   
    String lexeme;
    TokenCode tCode;
   
    enum TokenCode { ID, ASSIGN, SEMICOL, INT, ADD, SUB,
        MULT, LPAREN, RPAREN, PRINT, END, ERROR }
}