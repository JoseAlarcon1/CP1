/**
 * Write a description of class LoopDrawing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;

        // comment this out once you have finished

	/******** Put your code here  *********/

  g2.setColor(new Color(0,204,0));
     Rectangle rect = new Rectangle(250, 350, 20, 200);
     g2.fill(rect);
     g2.draw(rect);

     g2.setColor(new Color(0,204,0));
     Ellipse2D.Double leaf = new Ellipse2D.Double(210, 475, 55, 30);
     g2.fill(leaf);
     g2.draw(leaf);

     g2.setColor(Color.red);
     Ellipse2D.Double petal1 = new Ellipse2D.Double(100, 190, 150, 100);
     g2.fill(petal1);
     g2.draw(petal1);

     g2.setColor(Color.red);
     Ellipse2D.Double petal2= new Ellipse2D.Double(210, 250, 100, 150);
     g2.fill(petal2);
     g2.draw(petal2);

     g2.setColor(Color.red);
     Ellipse2D.Double petal3 = new Ellipse2D.Double(270, 190, 150, 100);
     g2.fill(petal3);
     g2.draw(petal3);

     g2.setColor(Color.red);
     Ellipse2D.Double petal4 = new Ellipse2D.Double(210, 85, 100, 150);
     g2.fill(petal4);
     g2.draw(petal4);

     g2.setColor(Color.yellow);
     Ellipse2D.Double disk = new Ellipse2D.Double(213, 200, 100, 100);
     g2.fill(disk);
     g2.draw(disk);


    }
}
