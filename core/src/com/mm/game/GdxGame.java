/*
 Mobile Game
 Based on Brandon Grasley's Tutorials
 */

package com.mm.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;

public class  GdxGame extends Game {

    GameScreen gs;
    //Texture img;

    @Override
    public void create() {
        gs = new GameScreen();
        setScreen(gs);
        //img = new Texture("trump.jpg");
    }
    @Override
    public void dispose() {
        gs.dispose();
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    //runs when app starts
    public void resize(int width, int height) {
        gs.resize(width, height);

    }




}