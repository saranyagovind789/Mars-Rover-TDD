package org.techreturners;

public enum Instruction {
    LEFT('L'),
    RIGHT('R'),
    MOVE('M');

    private final char INITIAL;

    Instruction(char initial) {
        this.INITIAL = initial;
    }

    public char getINITIAL() {
        return INITIAL;
    }
}
