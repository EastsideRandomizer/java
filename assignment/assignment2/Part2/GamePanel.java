//********************************************************************
//  ReboundPanel.java       Java Foundations
//
//  Represents the primary panel for the Rebound program.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GamePanel extends JPanel
{
    private final int WIDTH = 800, HEIGHT = 600;
    private final int IMAGE_SIZE = 35;
    private ImageIcon image;
    private Timer timer;
    private int x, y;
    private int x1 = 0, y1 = 0;
    private int hit = 0 , miss  = 0;
    private final int MINIMUM = 500;
    
    
    //-----------------------------------------------------------------
    //  Sets up the panel, including the timer for the smiley face to fly around the page
    //-----------------------------------------------------------------
    public GamePanel()
    {
	/* sets the delay to be roughly around 0.5s to 1s */ 
       int delay = MINIMUM + (int)(Math.random()*MINIMUM); 
       
       addMouseListener (new CoordinatesListener());
       timer = new Timer(delay, new ReboundListener());
       image = new ImageIcon ("resources/happyFace.gif");
       
      x = (int) ( IMAGE_SIZE +  Math.random()*(WIDTH - 2* IMAGE_SIZE) );
      y = (int)( IMAGE_SIZE +  Math.random()*(HEIGHT - 2* IMAGE_SIZE) );
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
	page.setColor (Color.white);
	page.drawString ("Score: ( hit: " + hit + ", miss: " + miss + ")", 5, 15);
	image.paintIcon (this, page, x, y);
    }

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
	    
	    /* registers a hit if the smiley face is hit */
	    if (( x1 <= (x+IMAGE_SIZE) && x1 >= (x)  ) && ( y1 <= (y+IMAGE_SIZE) && y1 >= (y)  )){
		hit++;
	    }
	    else{
		miss++;
	    }
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
    
    private class ReboundListener implements ActionListener
    {
	//--------------------------------------------------------------
	//  Updates the position of the image and possibly the direction
	//  of movement whenever the timer fires an action event.
	//--------------------------------------------------------------
	public void actionPerformed (ActionEvent event)
	{
	    /* changes the smiley face's location randomly */
	    x = (int) ( IMAGE_SIZE +  Math.random()*(WIDTH - 2* IMAGE_SIZE) );
	    y = (int)( IMAGE_SIZE +  Math.random()*(HEIGHT - 2* IMAGE_SIZE) );
	    //this will eventually call the ReboundPanel's paintComponent method (somewhere in a proper sequence of graphical drawing events
	    repaint(); 
	}
    }   
}
