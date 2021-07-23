package Bingo;

public class Board {
    boolean[][] myBoard = new boolean[5][5];
    boolean[][] finalBoard = new boolean[5][5];

    Board() {
        putInit();
    }

    void putInit() {
        for (int i = 0; i < 2; i++) {
            int x = 0;
            int y = 0;
            x = (int) (Math.random() * 5);
            y = (int) (Math.random() * 5);
            if (x == 2 && y == 2) {
                i--;
                continue;
            } else if (myBoard[x][y]) {
                i--;
                continue;
            } else
                swapBoard(myBoard, x, y);
        }
    }

    void putBomb(int x, int y) {
        swapBoard(myBoard, x, y);
        swapBoard(myBoard, x + 1, y);
        swapBoard(myBoard, x - 1, y);
        swapBoard(myBoard, x, y + 1);
        swapBoard(myBoard, x, y - 1);
    }

    boolean[][] swapBoard(boolean[][] board, int x, int y) {
        if (x < 0 || x > 4 || y < 0 || y > 4)
            return board;
        else {
            board[x][y] = !board[x][y];
            return board;
        }
    }


    void checkBingo(boolean board[][]) {
        for (int i = 0; i < 5; i++) {
            fixBingoX(BingoRules.verticalBingo(i, board));
            fixBingoY(BingoRules.horizontalBingo(i,board));
        }
    }

    void fixBingoX(int i) {
        for (int j = 0; j < 5; j++) {
            finalBoard[i][j] = true;
        }
    }

    void fixBingoY(int i) {
        for (int j = 0; j < 5; j++) {
            finalBoard[j][i] = true;
        }
    }

    void printBoard(boolean board[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (isEmpty(myBoard, i, j))
                    System.out.print("x");
                else
                    System.out.print("o");
            }
            System.out.println();
        }
    }

    private boolean isEmpty(boolean[][] board, int x, int y) {
        if (board[x][y])
            return true;
        else
            return false;
    }

}
