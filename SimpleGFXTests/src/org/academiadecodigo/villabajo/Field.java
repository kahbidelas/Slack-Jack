package org.academiadecodigo.villabajo;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.mouse.Mouse;
import org.academiadecodigo.simplegraphics.mouse.MouseEvent;
import org.academiadecodigo.simplegraphics.mouse.MouseHandler;

public class Field implements MouseHandler {

    private static final int PADY = 30;
    private Rectangle field;

    private PlayOption bet25;
    private PlayOption bet50;
    private PlayOption bet10;
    private PlayOption bet5;
    private PlayOption bet2;
    private PlayOption bet1;
    private PlayOption hit;
    private PlayOption stand;

    private Rectangle deck;

    private Rectangle logo;
    private Rectangle money;

    public Field() {

        field = new Rectangle(10, 10, 1024, 615);
        field.setColor(Color.GREEN);

        deck = new Rectangle(900,45, 100, 150);
        deck.setColor(Color.GRAY);
        Text d = new Text(935, 105, "DECK");


        bet50 = new PlayOption(95, 450, 50, 25, Color.RED);
        Text b50 = new Text(105,455, "50€");
        bet25 = new PlayOption(25, 450, 50, 25, Color.RED);
        Text b25 = new Text(35, 455, "25€");
        bet10 = new PlayOption(95, 400, 50, 25, Color.RED);
        Text b10 = new Text(105, 405, "10€");
        bet5 = new PlayOption(25, 400, 50, 25, Color.RED);
        Text b5 = new Text(40, 405, "5€");
        bet2 = new PlayOption(95, 350, 50, 25, Color.RED);
        Text b2 = new Text(110,355, "2€");
        bet1 = new PlayOption(25, 350, 50, 25, Color.RED);
        Text b1 = new Text(40, 355, "1€");
        hit = new PlayOption(900, 465, 100, 50, Color.RED);
        Text h = new Text(940, 485, "HIT");
        stand = new PlayOption(900, 540, 100, 50, Color.RED);
        Text s = new Text(928, 555, "STAND");

        logo = new Rectangle(10,10,150,150);
        logo.setColor(Color.BLACK);
        Text l = new Text(65, 65, "LOGO");
        l.setColor(Color.WHITE);

        money = new Rectangle(10,500, 150, 125);
        money.setColor(Color.BLUE);
        Text m = new Text(35, 565, "Your money is: ");

        this.show();
        deck.fill();
        d.draw();
        bet5.show();
        b5.draw();
        bet10.show();
        b10.draw();
        bet2.show();
        b2.draw();
        bet1.show();
        b1.draw();
        hit.show();
        h.draw();
        stand.show();
        s.draw();
        bet25.show();
        b25.draw();
        bet50.show();
        b50.draw();

        logo.fill();
        l.draw();
        money.fill();
        m.draw();

        mouseInit();
    }

    public void show() {
        field.fill();
    }
    public void mouseInit() {

        Mouse mouse = new Mouse(this);

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

        if( mouseEvent.getX() >= this.stand.initX()) {
            if( mouseEvent.getX() <= this.stand.finalX()) {
                if( mouseEvent.getY() >= (this.stand.initY()) + PADY) {
                    if( mouseEvent.getY() <= (this.stand.finalY() + PADY) ) {
                        System.out.println("Mouse X: " + mouseEvent.getX());
                        System.out.println("Mouse Y: " + mouseEvent.getY());
                        System.out.println("STAND Rectangle");
                    }
                }
            }
        }

        if( mouseEvent.getX() >= this.hit.initX()) {
            if( mouseEvent.getX() <= this.hit.finalX()) {
                if( mouseEvent.getY() >= (this.hit.initY()) + PADY) {
                    if( mouseEvent.getY() <= (this.hit.finalY() + PADY) ) {
                        System.out.println("Mouse X: " + mouseEvent.getX());
                        System.out.println("Mouse Y: " + mouseEvent.getY());
                        System.out.println("HIT Rectangle");
                    }
                }
            }
        }

        if( mouseEvent.getX() >= this.bet1.initX()) {
            if( mouseEvent.getX() <= this.bet1.finalX()) {
                if( mouseEvent.getY() >= (this.bet1.initY()) + PADY) {
                    if( mouseEvent.getY() <= (this.bet1.finalY() + PADY) ) {
                        System.out.println("Mouse X: " + mouseEvent.getX());
                        System.out.println("Mouse Y: " + mouseEvent.getY());
                        System.out.println("Bet 1€ Rectangle");
                    }
                }
            }
        }

        if( mouseEvent.getX() >= this.bet2.initX()) {
            if( mouseEvent.getX() <= this.bet2.finalX()) {
                if( mouseEvent.getY() >= (this.bet2.initY()) + PADY) {
                    if( mouseEvent.getY() <= (this.bet2.finalY() + PADY) ) {
                        System.out.println("Mouse X: " + mouseEvent.getX());
                        System.out.println("Mouse Y: " + mouseEvent.getY());
                        System.out.println("Bet 2€ Rectangle");
                    }
                }
            }
        }

        if( mouseEvent.getX() >= this.bet5.initX()) {
            if( mouseEvent.getX() <= this.bet5.finalX()) {
                if( mouseEvent.getY() >= (this.bet5.initY()) + PADY) {
                    if( mouseEvent.getY() <= (this.bet5.finalY() + PADY) ) {
                        System.out.println("Mouse X: " + mouseEvent.getX());
                        System.out.println("Mouse Y: " + mouseEvent.getY());
                        System.out.println("Bet 5€ Rectangle");
                    }
                }
            }
        }

        if( mouseEvent.getX() >= this.bet10.initX()) {
            if( mouseEvent.getX() <= this.bet10.finalX()) {
                if( mouseEvent.getY() >= (this.bet10.initY()) + PADY) {
                    if( mouseEvent.getY() <= (this.bet10.finalY() + PADY) ) {
                        System.out.println("Mouse X: " + mouseEvent.getX());
                        System.out.println("Mouse Y: " + mouseEvent.getY());
                        System.out.println("Bet 10€ Rectangle");
                    }
                }
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {
        // Don't know what this is for
    }
}
