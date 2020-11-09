package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void copy() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Figure copy = bishopBlack.copy(Cell.A5);
        assertThat(copy.position(), is(Cell.A5));
    }

    @Test
    public void wayTestMassiveValidate() throws ImpossibleMoveException {
        Figure bishop = new BishopBlack(Cell.C1);
        Cell[] result = {
                Cell.D2, Cell.E3, Cell.F4, Cell.G5
        };
        assertThat(bishop.way(Cell.G5), is(result));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayTestMassiveNotValidate() throws ImpossibleMoveException {
        Figure bishop = new BishopBlack(Cell.C8);
        Cell[] way = bishop.way(Cell.G3);
    }
}