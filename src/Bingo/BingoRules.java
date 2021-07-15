package Bingo;

public class BingoRules {
    static int verticalBingo(boolean[][] board) {
        for (int i = 0; i < 5; i++) {
            int count=0;
            for (int j = 0; j < 5; j++){
                if(board[i][j])
                    count++;
                if(count==5)
                    return i;
                else
                    continue;
            }
        }
    }

    static boolean horizontalBingo(boolean[][] board) {
        return true;
    }

    //빙고되면 락걸리는 함수

}
