package ru.anrivlev.chess;

public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
        return (column == toColumn && line != toLine) ||
                (line == toLine && column != toColumn);
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
