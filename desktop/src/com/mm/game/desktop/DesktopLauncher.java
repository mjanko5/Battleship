package com.mm.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mm.game.a.Game;
import com.mm.game.GdxGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
//		new Game();
//		new GdxGame();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new GdxGame(), config);
	}
}
