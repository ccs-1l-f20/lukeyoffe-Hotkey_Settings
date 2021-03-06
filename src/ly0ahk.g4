grammar ly0ahk;
script: (hotkey | hotstring | ignore)+ ;

hotstring: hsKeys hsAction returnLn;
hotkey: hkKeys action returnLn;
ignore: '#NoEnv' NEWLINE
    | '#SingleInstance force' NEWLINE
    | 'SendMode Input' NEWLINE
    | 'SetWorkingDir %A_ScriptDir%' NEWLINE
    | NEWLINE
    ;

hkKeys: mods KEY endkeys NEWLINE;
hsKeys: startkeys KEYS endkeys NEWLINE;
hsAction: SEND arg NEWLINE;
action: (RUN | SEND) arg NEWLINE;
arg: ARG;
mods: (SHIFT | CTRL | ALT)+;
startkeys: DOUBLECOLON;
endkeys: DOUBLECOLON;
returnLn: 'return' NEWLINE;

RETURN: 'return';
RUN: 'Run';
SEND: 'Send';
KEY: [a-zA-Z0-9];
KEYS: [a-zA-Z0-9]+;
DOUBLECOLON: '::';
SHIFT: '+';
CTRL: '^';
ALT: '!';
// ARG: ' ' .*? NEWLINE ;
ARG: ' ' ~[\n\r​]+ ;
NEWLINE:'\r'? '\n';
//WS: [ \t]+ -> skip;