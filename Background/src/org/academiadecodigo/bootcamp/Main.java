package org.academiadecodigo.bootcamp;

public class Main {
    public static void main(String[] args) {

        try {
            Background background = new Background();
        } catch( InterruptedException e) {
            System.out.println(e);
        }
    }
}
