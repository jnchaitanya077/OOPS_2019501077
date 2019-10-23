class Rock extends Piece {
    int row;
    int column;

    Rock(int r, int c) {
        this.row = r;
        this.column = c;
    }

    boolean isValidMove(Position newPosition) {
        if (super.isValidMove(newPosition.row, newPosition.column)) {
            if (newPosition.column == this.column || newPosition.row == this.row) {
                return true;
            } else {
                System.out.println("Warning ! Rock can move only in  Stright.(left,right,front,back)");
                return false;
            }

        } else {
            System.out.println("Sorry, you're running out of the board.");
            return false;
        }
    }

    String getPosition() {
        return "(" + this.row + "," + this.column + ")";
    }
}

class Queen extends Piece {
    int row;
    int column;

    Queen(int r, int c) {
        this.row = r;
        this.column = c;
    }

    boolean isValidMove(Position p) {

        if (super.isValidMove(p.row, p.column)) {

            if (p.column == this.column || p.row == this.row) {// Stright
                return true;
            }

            if (Math.abs(p.row - this.row) == Math.abs(p.column - this.column)) {
                return true;
            }
            System.out.println("WARNING! QUEEN  cant't be moved to this position.");
            return false;
        }
        return false;
    }

    void changePosition(Position p) {
        this.row = p.row;
        this.column = p.column;

    }
}
