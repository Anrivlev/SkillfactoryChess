package ru.anrivlev.chess;

public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;

        int columnDif = Math.abs(toColumn - column);
        int lineDif = Math.abs(toLine - line);
        if (this.getColor().equals("White")) {
            if (column == toColumn) {
                if (line == 1 && toLine == 3) {
                    return chessBoard.board[2][column] == null && chessBoard.board[3][column] == null;
                } else if (toLine - line == 1) {
                    return chessBoard.board[toLine][column] == null;
                }
            } else if (columnDif == 1 && lineDif == 1) {
                return chessBoard.board[toLine][toColumn] != null;
            }
        } else if (this.getColor().equals("Black")) {
            if (column == toColumn) {
                if (line == 6 && toLine == 4) {
                    return chessBoard.board[5][column] == null && chessBoard.board[4][column] == null;
                } else if (line - toLine == 1) {
                    return chessBoard.board[toLine][column] == null;
                }
            } else if (columnDif == 1 && lineDif == 1) {
                return chessBoard.board[toLine][toColumn] != null;
            }
        } else throw new RuntimeException("Неизвестный цвет фигуры");
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
