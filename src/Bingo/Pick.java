package Bingo;

import java.util.Scanner;

public class Pick {
    Scanner scanner = new Scanner(System.in);

    int pickX(){
        int x = Integer.parseInt(scanner.next());
        return x-1;
    }

    int pickY(){
        int y = Integer.parseInt(scanner.next());
        return y-1;
    }

}
