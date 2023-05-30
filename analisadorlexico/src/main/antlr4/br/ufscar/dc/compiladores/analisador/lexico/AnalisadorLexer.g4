lexer grammar AnalisadorLexer;


PALAVRA_CHAVE 
	:	'declare' | 'algoritmo' | 'inteiro' | 'literal' | 'leia' | 'escreva' | 'fim_algoritmo' 	; 
NUMINT	: ('+'|'-')?('0'..'9')+
	;
NUMREAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
IDENT : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;
CADEIA  : '"' ( ESC_SEQ | ~('"'|'\\') )* '"';
fragment
ESC_SEQ	: '\\"';
COMENTARIO
    :   '{' ~[\r\n]* '}' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OP_ARIT	:	'+' | '-' | '*' | '/'
	;
DELIM	:	':'
	;
ABREPAR :	'('
	;
FECHAPAR:	')'
	;
VIR: ',' 
	;
ERRO: .
	;
CADEIA_LITERAL_NAO_FECHADA:  ('\'' | '"') (ESC_SEQ | ~('\n'|'\''|'\\'|'"'))* '\n'
	;
COMENTARIO_NAO_FECHADO: '{' ~('}' | '\n' | '\r')* ('\r' | '\n')
	;
 