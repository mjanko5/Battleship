package com.mm.game.a;
import java.awt.*;
import javax.swing.JFrame;


public class Window extends Canvas{

    public Window (int width, int height, String title, Game game){
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.add(game);
        frame.setVisible(true);
        frame.setResizable(false);

        game.start();
    }

}
