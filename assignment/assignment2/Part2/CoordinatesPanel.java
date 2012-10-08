//********************************************************************
//  CoordinatesPanel.java       Java Foundations
//
//  Represents the primary panel for the Coordinates program.
//********************************************************************

import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class CoordinatesPanel extends JPanel
{


   //-----------------------------------------------------------------
   //  Constructor: Sets up this panel to listen for mouse events.
   //-----------------------------------------------------------------
   public CoordinatesPanel()
   {
      addMouseListener (new CoordinatesListener());
      // setPreferredSize (new Dimension(800, 600));
   }

   //-----------------------------------------------------------------
   //  Draws all of the dots stored in the list.???
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      page.setColor (Color.green);

      page.fillOval (x1, y1, SIZE, SIZE);

      page.drawString ("Coordinates: (" + x1 + ", " + y1 + ")", 5, 15);
   }

   //*****************************************************************
   //  Represents the listener for mouse events.
   //*****************************************************************
   private class CoordinatesListener implements MouseListener
   {
      //--------------------------------------------------------------
      //  Adds the current point to the list of points ??? and redraws
      //  the panel whenever the mouse button is pressed.
      //--------------------------------------------------------------
      public void mousePressed (MouseEvent event)
      {
         x1 = event.getX();
         y1 = event.getY();
         repaint();
      }

      //--------------------------------------------------------------
      //  Provide empty definitions for unused event methods.
      //--------------------------------------------------------------
      public void mouseClicked (MouseEvent event) {}
      public void mouseReleased (MouseEvent event) {}
      public void mouseEntered (MouseEvent event) {}
      public void mouseExited (MouseEvent event) {}
   }
}
