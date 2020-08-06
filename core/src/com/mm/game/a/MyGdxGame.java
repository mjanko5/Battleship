package com.mm.game.a;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import java.awt.Graphics;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Vector3 position;

	@Override
	//insert items, constructers
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("trump.jpg");
	}

	@Override
	//main game loop + drawings
	public void render () {
		try{
			System.out.println("hello");
		} catch (Exception e) {
			e.printStackTrace();
		}

		Gdx.gl.glClearColor(235/255f, 100/255f, 100/255f, 1);
		//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 55, 55);
		batch.end();
	}
	
	@Override
	//dispose music, items, sounds
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
