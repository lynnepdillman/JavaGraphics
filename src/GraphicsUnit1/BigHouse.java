package GraphicsUnit1;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
       bigHouse (window);
   }

   public void bigHouse( Graphics window )
   {
      // house main body
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );
      window.setColor(Color.BLUE);
      window.fillRect( 100, 300, 400, 400 );
      // door
      window.setColor(Color.RED);
      window.fillRect( 150, 450, 100, 246 );
      window.setColor(Color.WHITE);
      window.fillRect( 300, 450, 150, 150 );
      // roof polygon
      int[] x = {300,50,550};
      int[] y = {110,300,300};
      window.setColor(Color.YELLOW);
      window.fillPolygon(x, y, x.length);
   }
}
