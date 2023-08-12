package org.academiadecodigo.villabajo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class PlayOption{

    Rectangle playOption;

    public PlayOption(double initX, double initY, double width, double height, Color color) {
        playOption = new Rectangle(initX, initY, width, height);
        playOption.setColor(color);
    }

    public int initX() {
        return playOption.getX();
    }

    public int initY() {
        return playOption.getY();
    }

    public int finalX() {
        return playOption.getX() + playOption.getWidth();
    }

    public int finalY() {
        return playOption.getY() + playOption.getWidth();
    }

    public void show() {
        playOption.fill();
    }


}
