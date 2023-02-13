package org.techreturners;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class PlateauTest {
    Plateau plateau = new Plateau(5,5);
    @Test
    public void checkIfInsideUpperXMaxTrue(){
        Plateau plateau = new Plateau(5,5);
        assertEquals(plateau.isInsideUpperXMax(5), true);
    }

    @Test
    public void checkIfInsideUpperXMaxFalse(){
        Plateau plateau = new Plateau(5,5);
        assertFalse(plateau.isInsideUpperXMax(6));
    }

    @Test
    public void checkIfInsideUpperYMaxTrue(){
        Plateau plateau = new Plateau(5,5);
        assertTrue(plateau.isInsideUpperYMax(4));
    }

    @Test
    public void checkIfInsideUpperYMaxFalse(){
        Plateau plateau = new Plateau(5,5);
        assertFalse(plateau.isInsideUpperYMax(7));
    }

    @Test
    public void checkIfInsideLowerXMaxTrue(){
        Plateau plateau = new Plateau(5,5);
        assertTrue(plateau.isInsideLowerXMax(2));
    }

    @Test
    public void checkIfInsideLowerXMaxFalse(){
        Plateau plateau = new Plateau(5,5);
        assertFalse(plateau.isInsideLowerXMax(-2));
    }

    @Test
    public void checkIfInsideLowerYMaxTrue(){
        Plateau plateau = new Plateau(5,5);
        assertTrue(plateau.isInsideLowerYMax(3));
    }

    @Test
    public void checkIfInsideLowerYMaxFalse(){
        Plateau plateau = new Plateau(5,5);
        assertFalse(plateau.isInsideLowerYMax(-2));
    }
}
