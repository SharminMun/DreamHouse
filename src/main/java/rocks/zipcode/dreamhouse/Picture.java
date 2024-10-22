package rocks.zipcode.dreamhouse;

import javax.swing.*;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.changeColor("cyan");
        wall.moveVertical(-100);
        wall.moveHorizontal(-150);
        wall.changeSize(320);
        wall.makeVisible();

        Square wall1 = new Square();
        wall1.changeColor("cyan");
        wall1.moveVertical(-100);
        wall1.moveHorizontal(150);
        wall1.changeSize(320);
        wall1.makeVisible();

        Triangle tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(230, 80);
        tree.moveHorizontal(-5);
        tree.moveVertical(10);
        tree.makeVisible();

        Square trunk = new Square();
        trunk.changeColor("gray");
        trunk.changeSize(15);
        trunk.moveHorizontal(-25);
        trunk.moveVertical(205);
        trunk.makeVisible();

        Square wall2 = new Square();
        wall2.changeColor("pink");
        wall2.moveVertical(90);
        wall2.changeSize(130);
        wall2.makeVisible();

        window = new Square();
        window.changeColor("magenta");
        window.moveHorizontal(20);
        window.moveVertical(110);
        window.makeVisible();

        Square window2 = new Square();
        window2.changeColor("magenta");
        window2.moveHorizontal(80);
        window2.moveVertical(110);
        window2.makeVisible();

        Square door = new Square();
        door.changeColor("blue");
        door.moveHorizontal(40);
        door.moveVertical(170);
        door.changeSize(50);
        door.makeVisible();

        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(50, 180);
        roof.moveHorizontal(75);
        roof.moveVertical(75);
        roof.makeVisible();

        Triangle tree2 = new Triangle();
        tree2.changeColor("green");
        tree2.changeSize(230, 80);
        tree2.moveHorizontal(180);
        tree2.moveVertical(10);
        tree2.makeVisible();

        Square trunk2 = new Square();
        trunk2.changeColor("gray");
        trunk2.changeSize(15);
        trunk2.moveHorizontal(165);
        trunk2.moveVertical(205);
        trunk2.makeVisible();

        Square wall3 = new Square();
        wall3.changeColor("pink");
        wall3.moveVertical(90);
        wall3.moveHorizontal(200);
        wall3.changeSize(130);
        wall3.makeVisible();

        Square window3 = new Square();
        window3.changeColor("magenta");
        window3.moveHorizontal(220);
        window3.moveVertical(110);
        window3.makeVisible();

        Square window4 = new Square();
        window4.changeColor("magenta");
        window4.moveHorizontal(280);
        window4.moveVertical(110);
        window4.makeVisible();

        Square door2 = new Square();
        door2.changeColor("blue");
        door2.moveHorizontal(240);
        door2.moveVertical(170);
        door2.changeSize(50);
        door2.makeVisible();

        Triangle roof2 = new Triangle();
        roof2.changeColor("black");
        roof2.changeSize(50, 180);
        roof2.moveHorizontal(275);
        roof2.moveVertical(75);
        roof2.makeVisible();

        Square wall5 = new Square();
        wall5.changeColor("gray");
        wall5.moveVertical(220);
        wall5.moveHorizontal(-150);
        wall5.changeSize(320);
        wall5.makeVisible();

        Square wall6 = new Square();
        wall6.changeColor("gray");
        wall6.moveVertical(220);
        wall6.moveHorizontal(150);
        wall6.changeSize(320);
        wall6.makeVisible();

        Square wall7 = new Square();
        wall7.changeColor("pink");
        wall7.moveVertical(150);
        wall7.moveHorizontal(130);
        wall7.changeSize(80);
        wall7.makeVisible();

        Triangle roof3 = new Triangle();
        roof3.changeColor("black");
        roof3.changeSize(40, 200);
        roof3.moveHorizontal(180);
        roof3.moveVertical(160);
        roof3.makeVisible();

        Square window5 = new Square();
        window5.changeColor("magenta");
        window5.moveHorizontal(120);
        window5.moveVertical(170);
        window5.makeVisible();

        Square window6 = new Square();
        window6.changeColor("magenta");
        window6.moveHorizontal(190);
        window6.moveVertical(170);
        window6.makeVisible();

        Triangle tree3 = new Triangle();
        tree3.changeColor("green");
        tree3.changeSize(20, 120);
        tree3.moveHorizontal(-5);
        tree3.moveVertical(250);
        tree3.makeVisible();

        Triangle tree4 = new Triangle();
        tree4.changeColor("green");
        tree4.changeSize(20, 140);
        tree4.moveHorizontal(70);
        tree4.moveVertical(245);
        tree4.makeVisible();

        Triangle tree5 = new Triangle();
        tree5.changeColor("green");
        tree5.changeSize(25, 140);
        tree5.moveHorizontal(150);
        tree5.moveVertical(250);
        tree5.makeVisible();

        Triangle tree6 = new Triangle();
        tree6.changeColor("green");
        tree6.changeSize(20, 160);
        tree6.moveHorizontal(250);
        tree6.moveVertical(245);
        tree6.makeVisible();

        Triangle tree7 = new Triangle();
        tree7.changeColor("green");
        tree7.changeSize(20, 145);
        tree7.moveHorizontal(350);
        tree7.moveVertical(250);
        tree7.makeVisible();

        Triangle tree8 = new Triangle();
        tree8.changeColor("green");
        tree8.changeSize(230, 70);
        tree8.moveHorizontal(380);
        tree8.moveVertical(10);
        tree8.makeVisible();

        Square trunk3 = new Square();
        trunk3.changeColor("gray");
        trunk3.changeSize(15);
        trunk3.moveHorizontal(365);
        trunk3.moveVertical(205);
        trunk3.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(340);
        sun.moveVertical(-20);
        sun.changeSize(40);
        sun.makeVisible();

    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
