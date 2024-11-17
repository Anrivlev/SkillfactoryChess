package ru.anrivlev.chess;

public class Queen extends ChessPiece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
        int lineDif = Math.abs(line - toLine);
        int columnDif = Math.abs(column - toColumn);
        return (lineDif == columnDif && lineDif != 0) ||
                (column == toColumn && line != toLine) ||
                (line == toLine && column != toColumn);
    }

    @Override
    public String getSymbol() {
        return "Q";
    }
}
