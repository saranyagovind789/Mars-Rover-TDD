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
        MarsRover marsRover = new MarsRover("0 0 N", plateau);
    }



}
