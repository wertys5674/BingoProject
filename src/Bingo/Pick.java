package Bingo;

import java.util.Scanner;

public class Pick {
    Scanner scanner = new Scanner(System.in);

    int pickX(){
        //XXX: x&y 5 초과하면 에러발생
        int x = Integer.parseInt(scanner.next());
        return x-1;
    }

    int pickY(){
        int y = Integer.parseInt(scanner.next());
        return y-1;
    }

}
