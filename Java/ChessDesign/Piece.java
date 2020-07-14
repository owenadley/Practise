public abstract class Piece {
 
    private boolean isWhite;
    private boolean isKilled;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isWhite() {
        return this.isWhite;
    }

    public boolean isKilled() {
        return this.isKilled;
    }

    public void setKilled(boolean isKilled) {
        this.isKilled = isKilled;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public abstract boolean canMove(Board board, Spot start, Spot end);

}

public class King extends Piece {

    public King (boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // movement logic
    }
}

public class King extends Piece {
    public Knight (boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        // movement logic
    }
}

public class Queen extends Piece {

    public Queen(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot start, Spot end) {
        
    }

}