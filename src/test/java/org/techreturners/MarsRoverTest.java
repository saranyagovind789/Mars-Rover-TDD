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


}
