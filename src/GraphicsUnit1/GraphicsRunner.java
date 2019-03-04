package GraphicsUnit1;

import javax.swing.JFrame;
import java.awt.Color;

public class GraphicsRunner extends JFrame
{
    private static final int WIDTH  = 800;
    private static final int HEIGHT = 800;

    public GraphicsRunner() {
	super("Graphics Runner");
	setSize(WIDTH,HEIGHT);

	//getContentPane().add(new SmileyFace());	
	//add other classes to run them 
	//BigHouse, Robot, or ShapePanel 
        //getContentPane().add(new BigHouse());
        //getContentPane().add(new Robot());
        getContentPane().add(new ShapePanel());
        
	setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String args[]) {
	GraphicsRunner run = new GraphicsRunner();
    }
}
