/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square campo;
    private Person persona1;
    private Person persona2;
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
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        campo = new Square();
        campo.makeVisible();
        campo.changeColor("green");
        campo.moveVertical(159);
        campo.changeSize(600);
        campo.moveHorizontal(-400);
        
        sun = new Circle();
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.slowMoveVertical(130);
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-180);
        moon.makeVisible();
        moon.changeSize(40);
        moon.slowMoveHorizontal(70);
        
        
    }
    public void amanecer()
    {
        moon.makeInvisible();
        sun.slowMoveVertical(-130);
        persona1 = new Person();
        persona1.makeVisible();
        persona1.slowMoveHorizontal(-180);
        persona2 = new Person();
        persona2.makeVisible();
        persona2.slowMoveHorizontal(150);
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
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
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
