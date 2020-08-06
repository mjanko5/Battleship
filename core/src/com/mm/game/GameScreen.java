package com.mm.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class GameScreen implements Screen{

    //screen
    private Camera cam; //2D perspective
    private Viewport viewport;

    //graphics
    private SpriteBatch sb;
    private Texture background;
    private Texture blueShipTexture;
    private Texture yellowShipTexture;

    //global params
    private final int GLOBAL_WIDTH = 182;
    private final int GLOBAL_HEIGHT = 148;

    //game objects
    private Ship blueShip;
    private Ship yellowShip;


     GameScreen(){
         cam = new OrthographicCamera();
         viewport = new StretchViewport(GLOBAL_WIDTH, GLOBAL_HEIGHT, cam);

         background = new Texture("Grid.png");
         blueShipTexture = new Texture("ship_blue.png");
         yellowShipTexture = new Texture("ship_yellow.png");

         //game objects
         blueShip   = new Ship((float)(GLOBAL_WIDTH * 0.5), (float)(GLOBAL_HEIGHT * 0.75), 10, 10, 2, blueShipTexture);
         yellowShip = new Ship((float)(GLOBAL_WIDTH * 0.5), (float)(GLOBAL_HEIGHT * 0.25), 10, 10, 2, yellowShipTexture);

         sb = new SpriteBatch();
     }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        sb.begin();

        //background
        sb.draw(background, 3, 3, GLOBAL_WIDTH, GLOBAL_HEIGHT);

        //blueShip
        blueShip.draw(sb);

        //yellowShip
        yellowShip.draw(sb);

        //cannonBall
        //

        sb.end();

    }

    @Override
    public void resize(int width, int height) {

         viewport.update(width, height, true);
         sb.setProjectionMatrix(cam.combined);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
