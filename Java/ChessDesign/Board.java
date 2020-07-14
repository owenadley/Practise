public class Board {
    
    Spot[][] board;

    public Board() {
        Spot[][] board;
    }

    public Spot getBox(int x, int y) {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("index out of bounds");
        }

        return board[x][y];
    }

    public void setBoard() {

        // black pieces
        boxes[0][1] = new Spot(0, 1, new Pawn(false));
        boxes[1][1] = new Spot (1, 1, new Pawn(false));
        boxes[2][1] = new Spot(2, 1, new Pawn(false));
        boxes[3][1] = new Spot (3, 1, new Pawn(false));
        boxes[4][1] = new Spot(4, 1, new Pawn(false));
        boxes[5][1] = new Spot (5, 1, new Pawn(false));
        boxes[6][1] = new Spot(6, 1, new Pawn(false));
        boxes[7][1] = new Spot (7, 1, new Pawn(false));

        boxes[0][0] = new Spot(0, 0, new Rook(false));
        boxes[7][0] = new Spot (7, 0, new Rook(false));
    }

}