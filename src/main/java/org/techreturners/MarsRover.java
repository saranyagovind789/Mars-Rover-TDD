package org.techreturners;

public class MarsRover {
    private final PlateauPosition ROVER_POSITION;
    private final Plateau plateau;

    //Constructor
    public MarsRover(String initialPosition, Plateau plateau) {
        String[] position = initialPosition.split(" ");
        this.ROVER_POSITION = new PlateauPosition(
                Integer.parseInt(position[0]),
                Integer.parseInt(position[1]),
                position[2].toCharArray()[0]);

        this.plateau = plateau;
    }



        //Parse instructions to navigate the Mars Rover
    public PlateauPosition ParseInstructions(String instructions) {
        char[] arrInstructions = instructions.toUpperCase().toCharArray();
        try {
            if (!ROVER_POSITION.isCompassValid()) {
                throw new RuntimeException("Not a valid compass direction.");
            }
            for (char arrInstruction : arrInstructions) {
                if (arrInstruction == Instruction.LEFT.getINITIAL()) {
                    LeftTurn(ROVER_POSITION.compass);
                }
                if (arrInstruction == Instruction.RIGHT.getINITIAL()) {
                    RightTurn(ROVER_POSITION.compass);
                }
                if (arrInstruction == Instruction.MOVE.getINITIAL()) {
                    moveForward(ROVER_POSITION.compass);
                }
            }
        } catch (Exception exception) {
            ROVER_POSITION.setErrorMessage(exception.getMessage());
        }
        return ROVER_POSITION;
    }


    private void moveForward(char compass) {
        boolean isInRange = true;
        switch (compass) {
            case 'N':
                if (this.ROVER_POSITION.y + 1 > plateau.getYDimension()) {
                    isInRange = false;
                } else {
                    this.ROVER_POSITION.y++;
                }
                break;
            case 'E':
                if (this.ROVER_POSITION.x + 1 > plateau.getXDimension()) {
                    isInRange = false;
                } else {
                    this.ROVER_POSITION.x++;
                }
                break;
            case 'S':
                if (this.ROVER_POSITION.y - 1 < 0) {
                    isInRange = false;
                } else {
                    this.ROVER_POSITION.y--;
                }
                break;
            case 'W':
                if (this.ROVER_POSITION.x - 1 < 0) {
                    isInRange = false;
                } else {
                    this.ROVER_POSITION.x--;
                }
                break;
            default:
                System.out.println("Compass point not found.");
                break;
        }
        if (!isInRange) {
            throw new RuntimeException("Cannot move off Plateau. Last move aborted. Rover coordinates: " + this.ROVER_POSITION.x + " " + this.ROVER_POSITION.y + " " + this.ROVER_POSITION.compass);
        }
    }


    //Turn left
    private void LeftTurn(char compass) {

        switch (compass) {
            case 'N':
                this.ROVER_POSITION.compass = Orientation.WEST.getInitial();
                break;
            case 'W':
                this.ROVER_POSITION.compass = Orientation.SOUTH.getInitial();
                break;
            case 'S':
                this.ROVER_POSITION.compass = Orientation.EAST.getInitial();
                break;
            case 'E':
                this.ROVER_POSITION.compass = Orientation.NORTH.getInitial();
                break;
            default:
                System.out.println("Compass point not found.");
                break;
        }
    }


    //Turn right
    private void RightTurn(char compass) {

        switch (compass) {
            case 'N':
                this.ROVER_POSITION.compass = Orientation.EAST.getInitial();
                break;
            case 'E':
                this.ROVER_POSITION.compass = Orientation.SOUTH.getInitial();
                break;
            case 'S':
                this.ROVER_POSITION.compass = Orientation.WEST.getInitial();
                break;
            case 'W':
                this.ROVER_POSITION.compass = Orientation.NORTH.getInitial();
                break;
            default:
                System.out.println("Compass point not found");
                break;
        }
    }

}
