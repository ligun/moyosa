lexer grammar MoyosaLexer;

fragment
BackSlash :
    '\\'
    ;

fragment
LineEscape :
    BackSlash LineTerminator
    ;

fragment
LineTerminator :
    '\r'? '\n' | '\r'
    ;

ADD : '+' ;
SUB : '-' ;
MUL : '*' ;
DIV : '/' ;
MOD : '%' ;

NUMBER :
    [0-9]+ ('.' [0-9]*)? | '.' [0-9]+
    ;

NIL :
    'nil'
    ;

WS :
    ([ \t]+ | LineEscape+) -> skip
    ;
