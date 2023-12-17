package Interface.Game;

import Interface.GamingConsole;

public class Mario implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("jump into pit");
    }

    @Override
    public void right() {
        System.out.println("Move right");
    }

    @Override
    public void left() {
        System.out.println("Move left");
    }
}
