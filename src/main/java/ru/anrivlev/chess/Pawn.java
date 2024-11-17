package ru.anrivlev.chess;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
        if (column != toColumn) return false;

        if (this.getColor().equals("White")) {
            if (line == 1 && toLine == 3) return true;
            return toLine - line == 1;
        } else if (this.getColor().equals("Black")) {
            if (line == 6 && toLine == 4) return true;
            return line - toLine == 1;
        } else throw new RuntimeException("Неизвестный цвет фигуры");

    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
