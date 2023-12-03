package Interface;

import Interface.Game.ChessGame;
import Interface.Game.Mario;

public class GameRunner {
    public static void main(String[] args){
        GamingConsole game = new ChessGame();
        GamingConsole game1 = new Mario();
        game.up();
        game.down();
        game.left();
        game.right();

        game1.up();
        game1.down();
        game1.left();
        game1.right();

    }
}
