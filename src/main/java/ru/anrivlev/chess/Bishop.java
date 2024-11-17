package ru.anrivlev.chess;

public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
        int lineDif = Math.abs(line - toLine);
        int columnDif = Math.abs(column - toColumn);
        if (lineDif == columnDif && lineDif != 0) {
            int stepLine = (toLine - line) > 0 ? 1 : -1;
            int stepColumn = (toColumn - column) > 0 ? 1 : -1;
            for (int i = 1; i < lineDif - 1; i++) {
                if (chessBoard.board[line + i * stepLine][column + i * stepColumn] != null) return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
