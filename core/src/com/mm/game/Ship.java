package com.mm.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Ship {

    //ship characteristics
    float movementSpeed;


    //position & dimension
    float xPos, yPos;
    float width, height;

    //graphics
    Texture shipTexture;

    public Ship(float xPos, float yPos,
                float width, float height,
                float movementSpeed, Texture shipTexture) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        this.movementSpeed = movementSpeed;
        this.shipTexture = shipTexture;
    }

    public void draw(Batch batch){
        batch.draw(shipTexture, xPos, yPos, width, height);

    }
}
