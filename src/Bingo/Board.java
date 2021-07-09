package Bingo;

import java.util.Arrays;

public class Board {
    boolean[][] myBoard = new boolean[5][5];

    Board(){
        putInit();
    }

    void putInit() {
        int x = 0;
        int y = 0;
        for(int i) {
            x = (int) (Math.random() * 5);
            y = (int) (Math.random() * 5);
            if(x==2 && y==2)
                continue;
            else
                swapBoard(myBoard,x,y);
        }
    }

    void putBomb(int x, int y) {
        swapBoard(myBoard,x,y);
        swapBoard(myBoard,x+1,y);
        swapBoard(myBoard,x-1,y);
        swapBoard(myBoard,x,y+1);
        swapBoard(myBoard,x,y-1);
    }

    boolean[][] swapBoard(boolean[][] board, int x, int y){
        board[x][y] = !board[x][y];
        return board;
    }

    boolean checkBingo (boolean board[][]){

    }

    void printBoard() {
        for (int i = 0; i < this.myBoard.length; i++) {
            System.out.println(Arrays.toString(myBoard[i]));
        }
    }



}
