parser grammar MoyosaParser;
options { tokenVocab=MoyosaLexer; }

additiveExpression :
    left=NUMBER op=(ADD | SUB) right=NUMBER
    ;
