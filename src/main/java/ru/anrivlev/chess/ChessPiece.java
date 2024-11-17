package ru.anrivlev.chess;

public abstract class ChessPiece {
    private String color;

    private boolean check;

    ChessPiece(String color) {
        this.color = color;
        this.check = true;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean canMoveToPosition(
            ChessBoard chessBoard, int line, int column, int toLine, int toColumn
    );

    public abstract String getSymbol();

    public void setCheck(boolean check) {
        this.check = check;
    };

    public  boolean isCheck() {
        return check;
    }
}
