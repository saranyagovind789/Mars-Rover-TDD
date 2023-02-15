package org.techreturners;

public enum Orientation {
    NORTH('N'),
    EAST('E'),
    SOUTH('S'),
    WEST('W');

    private final char INITIAL;

   Orientation(char initial) {
        this.INITIAL = initial;
    }

    public char getInitial() {
        return INITIAL;
    }
}
