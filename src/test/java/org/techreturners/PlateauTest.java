package org.techreturners;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlateauTest {



    @Test
    public void checkUserCanCreateAPlateauSizeFiveByFive() {
        //Arrange
        Plateau plateau = new Plateau(5, 5);
        String expectedResult = "The plateau dimensions are 5 squares in the x direction and 5 squares in the y direction.";
        //Act
        String actual = plateau.getDimensions();
        //Assert
        Assertions.assertEquals(expectedResult, actual);

    }

}
