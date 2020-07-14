public class Game {
    
    public enum GameStatus {
        ACTIVE,
        BLACKWIN,
        WHITEWIN
    }


    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;


    private void ini(Player p1, Player p2) {
        players[0] = p1;
        players[1] = p2;

        board.setBoard();

        if (p1.isWhite()) {
            this.currentTurn = p1;
        } else {
            this.currentTurn = p2;
        }
    }


    private boolean makeMove(Move move, Player player) {

        Piece piece = move.getStart().getPiece();
        if (piece == null) {
            return false;
        }

        if (!piece.canMove(board, move.getStart(), move.getEnd())) {
            return false;
        }

        piece 
    }
}