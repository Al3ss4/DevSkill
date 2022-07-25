package org.example.labirinto.data;

public class Position {

    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void incrementRow(int amount) {
        row += amount;
    }

    public void incrementColumn(int amount) {
        column += amount;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}
