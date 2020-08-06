package com.mm.game.a;

import java.awt.*;

public class Game extends Canvas{   //ApplicationAdapter {

    public int width = 640;
    public int height = 450;
    public String title = "Game zone";

    public Game(){
        new Window(width,height,title,this);
    }

    public void start(){
        System.out.println("starting this game");
    }

//    public void run(){
//        System.out.println("running this game");
//    }
}
