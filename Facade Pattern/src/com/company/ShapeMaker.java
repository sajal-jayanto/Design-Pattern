package com.company;

public class ShapeMaker {
    private Rectangle rectangle;
    private Circle circle;
    private Square square;


    public ShapeMaker(){
        rectangle = new Rectangle();
        circle = new Circle();
        square = new Square();
    }

    public void drowRectangle(){
        rectangle.drow();
    }

    public void drowCircle(){
        circle.drow();
    }

    public void drowSquare(){
        square.drow();
    }

}
