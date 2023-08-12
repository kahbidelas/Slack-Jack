package org.academiadecodigo.bootcamp;


import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.w3c.dom.css.Rect;
import sun.java2d.SunGraphics2D;

public class Background implements MouseHandler {

    Rectangle rectangle;

    Picture picture1;
    Picture picture2;
    Picture picture3;
    Picture picture4;

    Picture picture5;

    public Background() throws InterruptedException {

        Mouse mouse = new Mouse(this);
        rectangle = new Rectangle(10,10,1024,615);
        rectangle.setColor(Color.DARK_GRAY);
        rectangle.draw();
        rectangle.fill();


        picture1 = new Picture(10, 10,"resources/slackjack1.jpg");//gif para keyboard
        picture2 = new Picture(10, 10,"resources/slackjack2.jpg");//gif para keyboard
        picture3 = new Picture(10, 10,"resources/slackjack3.jpg");//gif para mouse
        picture4 = new Picture(10, 10,"resources/slackjack4.jpg");//gif para mouse
        picture5 = new Picture(810, 10,"resources/playquit.jpg");//gif para mouse

        picture5.draw();

        while(true) {

            picture3.draw();
            Thread.sleep(300);
            picture3.delete();

            picture4.draw();
            Thread.sleep(300);
            picture4.delete();
        }
    }
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("Mouse X: " + mouseEvent.getX());
        System.out.println("Mouse Y: " + mouseEvent.getY());
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        // Nothing
    }
}
