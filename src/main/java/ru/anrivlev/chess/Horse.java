package ru.anrivlev.chess;

public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
        int lineDif = Math.abs(line - toLine);
        int columnDif = Math.abs(column - toColumn);
        return ((lineDif == 1 && columnDif == 2) || (lineDif == 2 && columnDif == 1));
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
