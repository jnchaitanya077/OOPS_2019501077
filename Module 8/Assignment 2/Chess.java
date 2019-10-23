class Game {
    Piece[][] board;

    // Constructor creates an empty board
    Game() {
        board = new Piece[8][8];
    }
}

class Position {
    int row;
    int column;

    // Constructor using row and column values
    Position(int r, int c) {
        this.row = r;
        this.column = c;
    }

    public String getPosition() {
        return "(" + this.row + "," + this.column + ")";
    }
}

class Piece {
    Position position;

    boolean isValidMove(int row, int column) {
        if (row >= 0 && column >= 0 && row < 8 && column < 8) {
            return true;
        } else {
            return false;
        }
    }
}

final class Chess {
    public static void main(String[] args) {
        // Piece piece = new Piece();

        // Position testPosition = new Position(3, 10);

        // if (piece.isValidMove(testPosition)) {
        // System.out.println("Yes, I can move there.");
        // } else {
        // System.out.println("Nope, can't do!");
        // }

        // Rock rock1 = new Rock(0, 0);
        // // Rock rock2 = new Rock(4, 5);
        // System.out.println("Current Position " + "(" + rock1.row + "," + rock1.column
        // + ")");
        // Position newPosForR1 = new Position(-1, 100);
        // if (rock1.isValidMove(newPosForR1)) {
        // System.out.println("Valid! Can be moving to " + newPosForR1.getPosition());
        // rock1.changePosition(newPosForR1);
        // System.out.println("Current Position " + "(" + rock1.row + "," + rock1.column
        // + ")");
        // } else {
        // System.out.println("InValid! Can't move to " + newPosForR1.getPosition());
        // }

        Queen queen = new Queen(0, 4);
        Position newPosition = new Position(2, 6);

        if (queen.isValidMove(newPosition)) {
            System.out.println("Yes!, can be moved");

        }

    }

}
