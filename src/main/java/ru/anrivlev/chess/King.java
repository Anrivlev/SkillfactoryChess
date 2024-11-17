package ru.anrivlev.chess;

import java.util.Objects;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine > 7 || toColumn > 7 || toLine < 0 || toColumn < 0) return false;
        int lineDif = Math.abs(line - toLine);
        int columnDif = Math.abs(column - toColumn);
        return (lineDif != 0 || columnDif != 0) &&
                lineDif <= 1 && columnDif <= 1 &&
                !this.isUnderAttack(chessBoard, toLine, toColumn);
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ChessPiece chessPiece = board.board[i][j];
                if (!Objects.equals(chessPiece.getColor(), this.getColor()) &&
                        chessPiece.canMoveToPosition(
                                board,
                                i, j, line, column
                        )) return true;
            }
        }
        return false;
    }
}
