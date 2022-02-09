package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;

public class LogicTest {

    @Test (expected = OccupiedCellException.class)
    public void testMoveOccupiedCell() throws OccupiedCellException, FigureNotFoundException  {
    Logic logic = new Logic();
    logic.add(new BishopBlack(Cell.C1));
    logic.add(new KingBlack(Cell.E3));
    logic.move(Cell.C1, Cell.F4);
    }

    @Test (expected = FigureNotFoundException.class)
    public void testMoveFigureNotFound() throws FigureNotFoundException, OccupiedCellException {
    Logic logic = new Logic();
    logic.add(new BishopBlack(Cell.C1));
    logic.move(Cell.C2, Cell.D2);
    }

    @Test (expected = ImpossibleMoveException.class)
    public void testMoveImpossibleMove() throws ImpossibleMoveException, OccupiedCellException,
            FigureNotFoundException {
    Logic logic = new Logic();
    logic.add(new BishopBlack(Cell.C1));
    logic.move(Cell.C1, Cell.C2);
    }
}