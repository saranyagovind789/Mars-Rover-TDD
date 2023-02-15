package org.techreturners;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {

    private Plateau plateau;

    @BeforeEach
    public void setUpPlateau() {
        plateau = new Plateau(5, 5);
    }

    @Test
    public void checkMarsRoverCanMoveOneGridPointIfFacingNorth() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        String expectedResult = "1 3 N";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("M");
        // Assert
        Assertions.assertEquals(expectedResult, actual.getPlateauPosition());

    }

    @Test
    public void checkMarsRoverCanTurnClockwiseFromNorthToEast() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        char expectedResult = 'E';
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("R");
        // Assert
        Assertions.assertEquals(expectedResult, actual.compass);

    }


    @Test
    public void checkMarsRoverCanTurnAntiClockwiseFromNorthToWest() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        char expectedResult = 'W';
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("L");
        //Assert
        Assertions.assertEquals(expectedResult, actual.compass);

    }

    @Test
    public void checkMarsRoverCanTurnRightThenMoveOneSquare() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        String expectedResult = "2 2 E";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("RM");
        //Assert
        Assertions.assertEquals(expectedResult, actual.getPlateauPosition());
    }

    @Test
    public void checkMarsRoverCanNotMoveOffThePlateauBeyondZeroX() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        String expectedResult = "Cannot move off Plateau. Last move aborted. Rover coordinates: 0 2 W";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("LMM");
        //Assert
        Assertions.assertEquals(expectedResult, actual.getErrorMessage());
    }

    @Test
    public void checkMarsRoverCanNotMoveOffThePlateauBeyondZeroY() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        String expectedResult = "Cannot move off Plateau. Last move aborted. Rover coordinates: 0 2 W";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("LMMMM");
        //Assert
        Assertions.assertEquals(expectedResult, actual.getErrorMessage());
    }

    @Test
    public void checkMarsRoverCanNotMoveOffThePlateauBeyondFiveX() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        String expectedResult = "Cannot move off Plateau. Last move aborted. Rover coordinates: 5 2 E";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("RMMMMM");
        //Assert
        Assertions.assertEquals(expectedResult, actual.getErrorMessage());
    }

    @Test
    public void checkMarsRoverCanNotMoveOffThePlateauBeyondFiveY() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        String expectedResult = "Cannot move off Plateau. Last move aborted. Rover coordinates: 1 5 N";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("MMMMM");
        //Assert
        Assertions.assertEquals(expectedResult, actual.getErrorMessage());
    }


    @Test
    public void checkMarsRoverCanMoveLMLMLMLMM() {
        //Arrange
        MarsRover marsRover = new MarsRover("1 2 N", plateau);
        String expectedResult = "1 3 N";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("LMLMLMLMM");
        //Assert
        Assertions.assertEquals(expectedResult, actual.getPlateauPosition());
    }

    @Test
    public void checkMarsRoverCanMoveMMRMMRMRRM() {
        //Arrange
        MarsRover marsRover = new MarsRover("3 3 E", plateau);
        String expectedResult = "5 1 E";
        //Act
        PlateauPosition actual = marsRover.ParseInstructions("MMRMMRMRRM");
        //Assert
        Assertions.assertEquals(expectedResult, actual.getPlateauPosition());
    }



}
