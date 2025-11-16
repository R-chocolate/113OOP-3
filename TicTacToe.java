
class TicTacToe {

    private char[][] board;
    private int moves;

    public TicTacToe() {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        moves = 0;
    }

    public boolean set(int row, int col, char player) {
        if (player != 'X' && player != 'O') {
            return false;
        }
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }
        if (board[row][col] != ' ') {
            return false;
        }
        board[row][col] = player;
        moves++;
        return true;
    }

    public char evaluate() {
        // Check horizontal
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }

        // Check vertical
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return board[0][j];
            }
        }

        // Check diagonal
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }

        // Check if moves == 9
        if (moves == 9) {
            return 'D';
        }

        return 'C';
    }

    public char get(int r, int c) {
        return board[r][c];
    }
}
