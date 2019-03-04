package GraphicsUnit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(600,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("Robot LAB ", 35, 35);
      head (window);        //call head method
      upperBody(window);    //upper body
      lowerBody(window);    //lower body
   }

   public void head( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.fillOval(300, 50, 200, 150);
      window.setColor(Color.WHITE);
      window.fillOval(350, 100, 40, 40);
      window.fillOval(430, 100, 40, 40);
   }

   public void upperBody( Graphics window )
   {
      window.setColor(Color.GRAY);
      window.fillRect(300,200,200,200);
      window.fillRect(250,200,40,200);
      window.fillRect(510,200,40,200);
   }

   public void lowerBody( Graphics window )
   {
      window.setColor(Color.GRAY);
      window.fillRect(320,400,75,200);
      window.fillRect(405,400,75,200);      
   }
}
