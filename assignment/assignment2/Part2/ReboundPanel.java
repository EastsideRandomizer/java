//********************************************************************
//  ReboundPanel.java       Java Foundations
//
//  Represents the primary panel for the Rebound program.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReboundPanel extends JPanel
{
   private final int WIDTH = 800, HEIGHT = 600;
   private final int DELAY = 20, IMAGE_SIZE = 35; //delay in milliseconds

   private ImageIcon image;
   private Timer timer;
   private int x, y, moveX, moveY;

   //-----------------------------------------------------------------
   //  Sets up the panel, including the timer for the animation.
   //-----------------------------------------------------------------
   public ReboundPanel()
   {
      timer = new Timer(DELAY, new ReboundListener());

      image = new ImageIcon ("resources/happyFace.gif");

      x = (int)(Math.random()*800);
      y = (int)(Math.random()*600);
      moveX = moveY = 3;

      setPreferredSize (new Dimension(WIDTH, HEIGHT));
      setBackground (Color.black);
      timer.start();
   }

   //-----------------------------------------------------------------
   //  Draws the image in the current location.
   //  When? when Windows requires its heavy weight container to be drawn/redrawn (NOT in my code's control) 
   //        including when its h/w container is first displayed (NOT in my code's control)
   //        including when the ReboundPanel's repaint() method is invoked in code (in my code's control )
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);
      image.paintIcon (this, page, x, y); //"this" is the ReboundPanel instances according to the debugger 
   }

   //*****************************************************************
   //  Represents the action listener for the timer.
   //*****************************************************************
   private class ReboundListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the position of the image and possibly the direction
      //  of movement whenever the timer fires an action event.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         x += moveX;
         y += moveY;

         if (x <= 0 || x >= WIDTH - IMAGE_SIZE)
            moveX = moveX * -1;

         if (y <= 0 || y >= HEIGHT - IMAGE_SIZE)
            moveY = moveY * -1;
    
         //this will eventually call the ReboundPanel's paintComponent method (somewhere in a proper sequence of graphical drawing events
         repaint(); 
      }
   }

    private class ReboundListener implements ActionListener
    {
      //--------------------------------------------------------------
      //  Updates the position of the image and possibly the direction
      //  of movement whenever the timer fires an action event.
      //--------------------------------------------------------------
      public void actionPerformed (ActionEvent event)
      {
         x += moveX;
         y += moveY;
	 
         if (x <= 0 || x >= WIDTH - IMAGE_SIZE)
            X = moveX ;

         if (y <= 0 || y >= HEIGHT - IMAGE_SIZE)
	     Y = moveY ;
    
         //this will eventually call the ReboundPanel's paintComponent method (somewhere in a proper sequence of graphical drawing events
         repaint(); 
      }
    }


}
