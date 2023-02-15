package org.techreturners;

public class PlateauPosition {
    protected int x;
    protected int y;
    public char compass;
    private String errorMessage = "";

    public PlateauPosition(int x, int y, char compass) {
        this.x = x;
        this.y = y;
        this.compass = compass;
    }

    //Getters
    public String getPlateauPosition() {
        return this.x + " " + this.y + " " + this.compass;

    }

    public String getErrorMessage() {
        return errorMessage;
    }

    //Setters

    public void setErrorMessage(String message) {
        errorMessage = message;
    }

    public boolean isCompassValid() {
        boolean isValid = false;
        char[] cardinal = new char[]{'N', 'E', 'S', 'W'};
        for (char c : cardinal) {
            if (compass == c) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
